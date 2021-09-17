package com.Project01New.DAO;

import org.hibernate.Session;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Project01New.entity.Project01Addcontact;
import com.Project01New.entity.Project01User;



public class Project01DAOHibernate implements Project01DAOInterface {
	private SessionFactory sf;

	public Project01DAOHibernate() {
		sf = new Configuration().configure().buildSessionFactory();

	}
	
	

	public int registerprofileDAO(Project01User p1) {
		int i=0;
		Session s=sf.openSession();
	
		Transaction t=s.beginTransaction();
		s.save(p1);
		t.commit();
		i=1;

		return i;
	}



	public boolean loginprofileDAO( Project01User p1) {
		boolean b = false;
		Session s = sf.openSession();
		Query q = s.createQuery("from Project01User p1 where p1.email= :email and p1.password= :password");
		q.setParameter("email", p1.getEmail());
		q.setParameter("password", p1.getPassword());
		ArrayList<Project01User> ff = (ArrayList<Project01User>) q.getResultList();
		if (ff.size() > 0) {
			b = true;
			
		}
		return b;
	}



	public int addcontactDAO(Project01Addcontact p3) {
		
			int i=0;
			Session s=sf.openSession();
		
			Transaction t=s.beginTransaction();
			s.save(p3);
			t.commit();
			i=1;

			return i;
		}



	
	public List<Project01Addcontact>  viewallcontactDAO(Project01Addcontact p3) throws SQLException {
  
  System.out.println(p3.getUseremail());
  
		Session s=sf.openSession();
		
		Query q=s.createQuery("from Project01Addcontact p3 where p3.useremail= :useremail");
		q.setParameter("useremail", p3.getUseremail());

		  List<Project01Addcontact> lst= q.getResultList();
	
		return lst;
		
		
		
		
	
		
	}



	public Project01Addcontact viewcontactDAO2(Project01Addcontact p5) throws SQLException{
		
	//	public List<Project01Addcontact>  viewcontactDAO2(Project01Addcontact p3) throws SQLException {
			  
			  System.out.println(p5.getEmail());
			  int i=0;
					Session s=sf.openSession();
					
					Query q=s.createQuery("from Project01Addcontact p5 where p5.email= :email");
					q.setParameter("email", p5.getEmail());

					 Object obj = q.getSingleResult();
					Project01Addcontact oo=new Project01Addcontact();
				oo.setName(((ResultSet) q).getString(1));
				oo.setPhoneno(((ResultSet) q).getString(2));
				oo.setEmail(((ResultSet) q).getString(3));
				oo.setDescription(((ResultSet) q).getString(4));
					return (Project01Addcontact) oo;
					
					
					
					
					
				
					
				}
		
			
			/*Session s=sf.openSession();
		
			Transaction t=s.beginTransaction();
			

String hql = "UPDATE Project01Addcontact SET name = :name,  phoneno = :phoneno,description=:description WHERE email = :email";
			Query query = s.createQuery(hql);
			/*
			query.setParameter("name", p5.getName());
	
			query.setParameter("phoneno",p5.getPhoneno());
			query.setParameter("description", p5.getDescription());
			query.setParameter("email",p5.getEmail() );
		
			
			int result = query.executeUpdate();
			s.save(p5);
			t.commit();
			s.close();

			
			i=1;

			return i;
		}*/



	public List<Project01Addcontact> adminviewallcontactDAO() {
Session s=sf.openSession();
		
		Query q=s.createQuery("from Project01Addcontact p3 ");
		

		  List<Project01Addcontact> lst= q.getResultList();
	
		return lst;

		
	}




	public int deletecontactDAO(Project01Addcontact p3) {
		int i = 0;
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(p3);
		Query q = s.createQuery("delete from Project01Addcontact p3 where p3.email= :email ");
		q.setParameter("email" ,p3.getEmail());
		
		i = q.executeUpdate();
		t.commit();
		i = 1;
		return i;
	}



	public int admindeleteuserDAO(Project01User p3) {
		int i = 0;
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.delete(p3);
		Query q = s.createQuery("delete from Project01User p3 where p3.email= :email ");
		q.setParameter("email" ,p3.getEmail());
		
		i = q.executeUpdate();
		t.commit();
		i = 1;
		return i;
	}
	
	
	public List<Project01User> adminviewalluserDAO() {
Session s=sf.openSession();
		
		Query q=s.createQuery("from Project01User p3 ");
		

		  List<Project01User> lst= q.getResultList();
	
		return lst;

		
	}



	public int editprofileDAO(Project01Addcontact p5) {
		// TODO Auto-generated method stub
		return 0;
	}
	}




	
	



	
		
	
	


