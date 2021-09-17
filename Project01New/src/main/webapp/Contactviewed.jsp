<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include  file="component/allCss.jsp"%>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="index.jsp"><i class="fas fa-book"></i>LogBook</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp"><i class="fas fa-home"></i>Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="addContact.jsp"><i class="fas fa-plus-square"></i>Add Contact</a>
      </li>
   
      
      <li class="nav-item active">
        <a class="nav-link disabled" href="deletecontact.jsp"><i class="fas fa-trash"></i>DeleteContact</a>
      </li>
      
    </ul>
  </div>
</nav>
<!--  
if (ss.equals("viewallcontact")) {

	
	String useremail = request.getParameter("uem");
	
	Project01Addcontact/* p3 = new Project01Addcontact();

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
											// long to which we want to show our cliet
	out.println("<html><body><br><br>");
	
	if (ll.size()>0) {
		
		
		out.println("<center><b><h2>Your Contacts are:</center>");
		
		
		for(Project01Addcontact ii:ll)
		{

		out.println("<table border=5");
			
			out.println("<form action=Globalservlet?choice=editservlet method=post>");
			out.println("<tr><td>Name : </td><td><input type=text name=na value="+ii.getName()+"></td></tr>");
			out.println("<tr><td>PhoneNo :</td><td><input type=text name=ph value="+ii.getPhoneno()+"></td></tr>");
			out.println("<tr><td>Email : </td><td><input type=email name=em value="+ii.getEmail()+"></td></tr>");
			out.println("<tr><td>Description :</td><td><input type=text name=de value="+ii.getDescription()+"></td></tr>");
			out.println("<tr><td><input type=submit value=Edit></td></tr>");
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
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/addContact.jsp");
		rd.include(request, response);
	}
	out.println("</body></html>");
	

}
-->







</body>
</html>