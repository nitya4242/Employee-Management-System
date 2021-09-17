package com.Project01New.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Project01New.DAO.Project01DAOInterface;
import com.Project01New.entity.Project01Addcontact;
import com.Project01New.entity.Project01User;
import com.Project01New.utility.DAOFactory;
import com.sun.istack.internal.logging.Logger;

public class Globalservlet extends HttpServlet {
	private Object choice;
	private static Logger log = Logger.getLogger(Globalservlet.class);

//rivate Object register;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Object register = null;
		//Object login = null;
		String ss = request.getParameter("choice");
		
		
		//--------------------------------User register-------------------------------------------------//
		
		if (ss.equals("register")) {

			log.info("entering into the Globalservlet");
			String email = request.getParameter("em");
			String name = request.getParameter("na");
			String password = request.getParameter("pa");
			Project01User p1 = new Project01User();

			p1.setEmail(email);
			p1.setName(name);

			p1.setPassword(password);

			Project01DAOInterface obj = DAOFactory.createObject();
			int i = obj.registerprofileDAO(p1);

			response.setContentType("text/html");// to tell browser wht we are sending there
			PrintWriter out = response.getWriter();// PrintWriter is a class which convert byte to character interger or
													// long to which we want to show our cliet
			out.println("<html><body><br><br>");
			if (i > 0) {
				out.println("<font size=5 color=green ><b>Registration Successfull</b></font>");
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
				rd.forward(request, response);
			} else {
				out.println("<font size=5 color=red ><b>Registration UnSuccessfull</b></font>");
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/register.jsp");
				rd.include(request, response);
			}
			out.println("</body></html>");
			log.info("getting value of i from DAO" + i);

		}
		

		//--------------------------------User Login-------------------------------------------------//

		if (ss.equals("login")) {
			String email = request.getParameter("em");
			String password = request.getParameter("pa");

			Project01User p1 = new Project01User();
			p1.setEmail(email);
			p1.setPassword(password);

			Project01DAOInterface obj = DAOFactory.createObject();
			boolean b = obj.loginprofileDAO(p1);

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<html><body><br><br>");
			if (b) {

				RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
			} else {
				out.println("incorrect id and password");
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");
				rd.include(request, response);
			}

			out.println("</body></html>");
			//log.info("getting value of b fom DAO" + b);

		}
		

		//--------------------------------User Add Contact-------------------------------------------------//
		
		if (ss.equals("addcontact")) {

			log.info("entering into the Globalservlet");
			String useremail = request.getParameter("us");
			String email = request.getParameter("em");
			String name = request.getParameter("na");
			String phoneno = request.getParameter("ph");
			String description = request.getParameter("de");
			Project01Addcontact p3 = new Project01Addcontact();
             
			p3.setUseremail(useremail);
			p3.setEmail(email);
			
			p3.setPhoneno(phoneno);
			p3.setName(name);
			p3.setDescription(description);
          
			Project01DAOInterface obj = DAOFactory.createObject();
			int i = obj.addcontactDAO(p3);

			response.setContentType("text/html");// to tell browser wht we are sending there
			PrintWriter out = response.getWriter();// PrintWriter is a class which convert byte to character interger or
													// long to which we want to show our cliet
			out.println("<html><body><br><br>");
			if (i > 0) {
				out.println("<font size=5 color=green ><b>Contact Added</b></font>");
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
				rd.include(request, response);
			} else {
				out.println("<font size=5 color=red ><b>Error</b></font>");
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
				rd.include(request, response);
			}
			out.println("</body></html>");
			log.info("getting value of i from DAO" + i);

		}
		
		
		
		

		//--------------------------------User View All Contact-------------------------------------------------//
		if (ss.equals("viewallcontact")) {

			
			String useremail = request.getParameter("uem");
			
			Project01Addcontact p3 = new Project01Addcontact();

			p3.setUseremail(useremail);
			
			
          
			Project01DAOInterface obj = DAOFactory.createObject();
			List<Project01Addcontact> ll=null;
			try {
				ll = obj.viewallcontactDAO(p3);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             System.out.println(ll.size());
			response.setContentType("text/html");// to tell browser wht we are sending there
			PrintWriter out = response.getWriter();// PrintWriter is a class which convert byte to character interger or

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Contactviewed.jsp");
			rd.include(request, response);								// long to which we want to show our cliet
			out.println("<html><body><br><br>");

			if (ll.size()>0) {
				
				
				out.println("<center><b><h2>Your Contacts are:</h2></b>");
				
				
				for(Project01Addcontact ii:ll)
				{
		
				out.println("<table border=5");
					
					out.println("<form action=Globalservlet?choice=editservlet method=post>");
					out.println("<tr><td>Name : </td><td><input type=text name=na value="+ii.getName()+"></td></tr>");
					out.println("<tr><td>PhoneNo :</td><td><input type=text name=ph value="+ii.getPhoneno()+"></td></tr>");
					out.println("<tr><td>Email : </td><td><input type=email name=em value="+ii.getEmail()+"></td></tr>");
					out.println("<tr><td>Description :</td><td><input type=text name=de value="+ii.getDescription()+"></td></tr>");
				
					//out.println("<td><input type=submit value=Delete>"+"</td>");
					out.println("</form>");
					
					
					out.println("</table>");
					
					
					
				
			}
		}
	          //out.println("<font size=5 color=green ><b>Contact Added</b></font>");
			  //RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
				//rd.forward(request, response);
				
			 else {
				out.println("<font size=5 color=red ><b>Email not in data</b></font>");
				RequestDispatcher rd1 = getServletContext().getRequestDispatcher("/viewContact.jsp");
				rd.include(request, response);
			}
			out.println("</center></body></html>");
			

		}
		
	
	

		//--------------------------------User Edit Contact-------------------------------------------------//
	
	if (ss.equals("editservlet")) {
	
		
		String email = request.getParameter("em");
		//String name = request.getParameter("na");
		//String phoneno = request.getParameter("ph");
		//String description = request.getParameter("de");
		Project01Addcontact p5 = new Project01Addcontact();

		p5.setEmail(email);
		
		//p5.setPhoneno(phoneno);
		//p5.setName(name);
		//p5.setDescription(description);

		try {
			Project01DAOInterface obj = DAOFactory.createObject();
			Project01Addcontact oo = obj.viewcontactDAO2(p5);

		

		response.setContentType("text/html");// to tell browser wht we are sending there
		PrintWriter out = response.getWriter();// PrintWriter is a class which convert byte to character interger or
												// long to which we want to show our cliet
		out.println("<html><body><br><br>");
		if (oo!=null) {
		out.println("<table border=5");
		
		out.println("<form action=Globalservlet?choice=editservlet method=post>");
		out.println("<tr><td>Name : </td><td><input type=text name=na value="+oo.getName()+"></td></tr>");
		out.println("<tr><td>PhoneNo :</td><td><input type=text name=ph value="+oo.getPhoneno()+"></td></tr>");
		out.println("<tr><td>Email : </td><td><input type=email name=em value="+oo.getEmail()+"></td></tr>");
		out.println("<tr><td>Description :</td><td><input type=text name=de value="+oo.getDescription()+"></td></tr>");
		
		
	
		//out.println("<td><input type=submit value=Delete>"+"</td>");
		out.println("</form>");
		
		
		out.println("</table>");
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Contactviewed.jsp");
			rd.forward(request, response);
		}
		 else {
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
			rd.include(request, response);
		//}
		out.println("</body></html>");
		}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	

	//--------------------------------Admin Login-------------------------------------------------//
	
	if (ss.equals("adminlogin")) {
		String email = request.getParameter("em");
		String password = request.getParameter("pa");

		Project01User p1 = new Project01User();
		p1.setEmail(email);
		p1.setPassword(password);

		Project01DAOInterface obj = DAOFactory.createObject();
		boolean b = obj.loginprofileDAO(p1);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><br><br>");
		if (b) {

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/adminindex.jsp");
			rd.forward(request, response);
		} else {
			
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/AdminLogin.jsp");
			rd.include(request, response);
		}

		out.println("</body></html>");
		//log.info("getting value of b fom DAO" + b);

	}
	
	

	//--------------------------------Admin View All Contact-------------------------------------------------//
	
	if (ss.equals("adminviewallcontact")) {

	    Project01DAOInterface obj = DAOFactory.createObject();
		List<Project01Addcontact> ll=null;
		ll = obj.adminviewallcontactDAO();
         System.out.println(ll.size());
		response.setContentType("text/html");// to tell browser wht we are sending there
		PrintWriter out = response.getWriter();// PrintWriter is a class which convert byte to character interger or

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/admincontactsviewed.jsp");
		rd.include(request, response);							// long to which we want to show our cliet
		out.println("<html><body><br><br>");
		
		if (ll.size()>0) {
			
			out.println("<center><b><h2>Database Contacts are:</h2></b>");
			
			
			for(Project01Addcontact ii:ll)
			{
			out.println("<table border=5");
				
				out.println("<form action=Globalservlet?choice=editservlet method=post>");
				out.println("<tr><td>Name : </td><td><input type=text name=na value="+ii.getName()+"></td></tr>");
				out.println("<tr><td>PhoneNo :</td><td><input type=text name=ph value="+ii.getPhoneno()+"></td></tr>");
				out.println("<tr><td>Email : </td><td><input type=email name=em value="+ii.getEmail()+"></td></tr>");
				out.println("<tr><td>Description :</td><td><input type=text name=de value="+ii.getDescription()+"></td></tr>");
				//out.println("<tr><td><input type=submit value=Edit></td></tr>");
				//out.println("<td><input type=submit value=Delete>"+"</td>");
				out.println("</form>");
				
				/*out.println(ii.getEmail());
				out.println(ii.getPhoneno());
				out.println(ii.getName());
				out.println(ii.getDescription());
				*/
				out.println("</table>");
				
				
				
			//out.println("<button>Delete</button>");
			//RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
				//rd.forward(request, response);
		}
	}
          //out.println("<font size=5 color=green ><b>Contact Added</b></font>");
		  //RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
			//rd.forward(request, response);
			
		 else {
			out.println("<font size=5 color=red ><b>Email not in data</b></font>");
			RequestDispatcher rd1 = getServletContext().getRequestDispatcher("/addContact.jsp");
			rd.include(request, response);
		}
		out.println("</center></body></html>");
				
		

	}
	
	

	//--------------------------------User Delete Contact-------------------------------------------------//
	if (ss.equals("deletecontact")) {
		String email=request.getParameter("em");
		Project01DAOInterface obj = DAOFactory.createObject();
		Project01Addcontact p3=new Project01Addcontact();
		p3.setEmail(email);
		int i=obj.deletecontactDAO(p3);
		
		
		response.setContentType("text/html");// to tell browser wht we are sending there
		PrintWriter out = response.getWriter();// PrintWriter is a class which convert byte to character interger or
												// long to which we want to show our cliet
		out.println("<html><body><br><br>");
		
		if(i>0)
		{
			out.println("<b>Delete Successfull</b>");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/index.jsp");
			rd.include(request, response);
			
		}
		else
		{
			out.println("unable to delete");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/delete.jsp");
			rd.include(request, response);
			
		}
	
	out.println("</body><</html>");
	}

	
	if (ss.equals("deleteuser")) {
		String email=request.getParameter("em");
		Project01DAOInterface obj = DAOFactory.createObject();
		Project01User p3=new Project01User();
		p3.setEmail(email);
		int i=obj.admindeleteuserDAO(p3);
		
		
		response.setContentType("text/html");// to tell browser wht we are sending there
		PrintWriter out = response.getWriter();// PrintWriter is a class which convert byte to character interger or
												// long to which we want to show our cliet
		out.println("<html><body><br><br>");
		
		if(i>0)
		{
			out.println("<b>Delete Successfull</b>");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/adminindex.jsp");
			rd.include(request, response);
			
		}
		else
		{
			out.println("unable to delete");
			RequestDispatcher rd=getServletContext().getRequestDispatcher("/deleteuser.jsp");
			rd.include(request, response);
			
		}
	
	out.println("</body><</html>");
	}

	
	

	//--------------------------------Admin View All User-------------------------------------------------//
	if (ss.equals("adminviewalluser")) {

	    Project01DAOInterface obj = DAOFactory.createObject();
		List<Project01User> ll=null;
		ll = obj.adminviewalluserDAO();
         System.out.println(ll.size());
		response.setContentType("text/html");// to tell browser wht we are sending there
		PrintWriter out = response.getWriter();// PrintWriter is a class which convert byte to character interger or

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/admincontactsviewed.jsp");
		rd.include(request, response);							// long to which we want to show our cliet
		out.println("<html><body><br><br>");
		
		if (ll.size()>0) {
			
			out.println("<center><b><h2>Database Users are:</h2></b>");
			
			
			for(Project01User ii:ll)
			{
			out.println("<table border=5");
				
				out.println("<form action=Globalservlet?choice=editservlet method=post>");
				out.println("<tr><td>Name : </td><td><input type=text name=na value="+ii.getName()+"></td></tr>");
				out.println("<tr><td>Password :</td><td><input type=text name=pa value="+ii.getPassword()+"></td></tr>");
				out.println("<tr><td>Email : </td><td><input type=email name=em value="+ii.getEmail()+"></td></tr>");
				//out.println("<tr><td>Description :</td><td><input type=text name=de value="+ii.getDescription()+"></td></tr>");
				//out.println("<tr><td><input type=submit value=Edit></td></tr>");
				//out.println("<td><input type=submit value=Delete>"+"</td>");
				out.println("</form>");
				
				/*out.println(ii.getEmail());
				out.println(ii.getPhoneno());
				out.println(ii.getName());
				out.println(ii.getDescription());
				*/
				out.println("</table>");
				
				
				
			//out.println("<button>Delete</button>");
			//RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
				//rd.forward(request, response);
		}
	}
          //out.println("<font size=5 color=green ><b>Contact Added</b></font>");
		  //RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
			//rd.forward(request, response);
			
		 else {
			out.println("<font size=5 color=red ><b>Email not in data</b></font>");
			RequestDispatcher rd1 = getServletContext().getRequestDispatcher("/addContact.jsp");
			rd.include(request, response);
		}
		out.println("</center></body></html>");
				
		

	}
	

				
				
				
			
		}
	}
       


			
		
	
		
	

		



	

