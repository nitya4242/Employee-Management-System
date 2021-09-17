package com.Project01New.utility;



	import com.Project01New.DAO.Project01DAOHibernate;
	import com.Project01New.DAO.Project01DAOInterface;

	public class DAOFactory {

		public static Project01DAOInterface createObject() {
			return new Project01DAOHibernate();
		}
	}

