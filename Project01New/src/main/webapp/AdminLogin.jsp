<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include  file="component/allCss.jsp"%>
</head>
<body style="background-color:#d6d4ce;">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="index.jsp"><i class="fas fa-book"></i>LogBook</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
    
      
     
      
        
        
      
    
      
     
     <!--  <li class="nav-item active">
        <a class="nav-link" href="addContact.jsp"><i class="fas fa-plus-square"></i>Add Contact</a>
      </li>
      
       -->
      
   
     
      
      
      
      
    </ul>
    
    <form class="form-inline my-2 my-lg-0">
       <!--  <a href="login.jsp" class="btn btn-success"><i class="fas fa-user-tag"></i>Login</a>  -->
     <!--   <a href="register.jsp"  class="btn btn-danger"><i class="fas fa-user tie"></i>Register</a> -->
      
    </form>
  </div>
</nav>
<div class="container-fluid">
<div class="row p-2">
<div class="col-sm-4 offset-sm-4">
<div class="card"> 
<div class="card-body">
<h4 class="text-center text-success"> Admin Login Page</h4>
<form action = "Globalservlet?choice=adminlogin" method="post">

  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="em"  aria-describedby="emailHelp" placeholder="Enter email">
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" name="pa" placeholder="Password">
  </div>
 
  <button type="submit" class="btn btn-primary">Login</button>
</form>

</div>
</div>
</div>
</div>
</div>

<div style="margin-top:250px">
<%@include file="component/footer.jsp" %>
</div>

</body>
</html>