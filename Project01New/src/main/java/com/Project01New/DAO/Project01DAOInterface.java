package com.Project01New.DAO;

import java.sql.SQLException;
import java.util.List;

import com.Project01New.entity.Project01Addcontact;
import com.Project01New.entity.Project01User;

public interface Project01DAOInterface {
 int registerprofileDAO(Project01User p1);

boolean loginprofileDAO(Project01User p1);


int addcontactDAO(Project01Addcontact p3);



List<Project01Addcontact> viewallcontactDAO(Project01Addcontact p3) throws SQLException;

int editprofileDAO(Project01Addcontact p5);



List<Project01Addcontact> adminviewallcontactDAO();



int deletecontactDAO(Project01Addcontact p3);

int admindeleteuserDAO(Project01User p3);



List<Project01User> adminviewalluserDAO();

Project01Addcontact  viewcontactDAO2(Project01Addcontact p5) throws SQLException;


 
}
