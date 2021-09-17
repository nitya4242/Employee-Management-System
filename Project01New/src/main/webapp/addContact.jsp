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
        <a class="nav-link disabled" href="viewContact.jsp"><i class="fas fa-eye"></i>ViewContact</a>
      </li>
      
      <li class="nav-item active">
        <a class="nav-link disabled" href="deletecontact.jsp"><i class="fas fa-trash"></i>DeleteContact</a>
      </li>
      
    </ul>
    
    <form class="form-inline my-2 my-lg-0">
       <a href="login.jsp" class="btn btn-success"><i class="fas fa-user-tag"></i>Login</a>
       <a href="register.jsp"  class="btn btn-danger"><i class="fas fa-user tie"></i>Register</a>
      
    </form>
  </div>
</nav>

<div class="container-fluid">
<div class="row p-2">
<div class="col-md-6 offset-md-3">
<div class="card"> 
<div class="card-body">
<h4 class="text-center text-success">Add Contact Page</h4>
<form action= "Globalservlet?choice=addcontact" method="post">


 <div class="form-group">
    <label for="exampleInputEmail1">Enter UserEmail</label>
    <input type="email" class="form-control" id="exampleInputEmail1"  name="us" aria-describedby="emailHelp" placeholder="Enter User email">
    
  </div>
  
 <div class="form-group">
    <label for="exampleInputEmail1">Enter Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1"  name="na" aria-describedby="emailHelp" placeholder="Enter name">
    
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="em" aria-describedby="emailHelp" placeholder="Enter email">
    
  </div>
  
   <div class="form-group">
    <label for="exampleInputEmail1">Enter Phone No</label>
    <input type="text" class="form-control" id="exampleInputEmail1" name="ph" aria-describedby="emailHelp" placeholder="Enter PhoneNo">
    
  </div>
  
  
  
   <div class="form-group">
    <label for="exampleInputEmail1">Enter Description</label>
    <input type="text" class="form-control" id="exampleInputEmail1" name="de" aria-describedby="emailHelp" placeholder="Enter description"></textarea>
    
  </div>
  
 <div class="text-center mt-2">
  <button type="submit" class="btn btn-primary">Add</button>
  </div>
</form>

</div>
</div>
</div>
</div>
</div>

</body>
</html>