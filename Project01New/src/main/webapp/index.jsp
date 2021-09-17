<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>project 1</title>
<%@include  file="component/allCss.jsp"%>
<style type="text/css">
.back-img{
background: url("img/log.jpg");
width: 100%;
height: 80vh;
background-repeat: no-repeat;
background-size:cover;

}
</style>
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
        <a class="nav-link disabled" href="viewContact.jsp"><i class="fas fa-eye"></i>ViewContact</a>
      </li>
       <li class="nav-item active">
        <a class="nav-link disabled" href="deletecontact.jsp"><i class="fas fa-trash"></i>DeleteContact</a>
      </li>
      
      <!--  <li class="nav-item active">
        <a class="nav-link disabled" href="editcontact.jsp"><i class="fas fa-eye"></i>EditContact</a>
      </li>
      
      --> 
      
    </ul>
   
    <form class="form-inline my-2 my-lg-0">
       <a href="login.jsp" class="btn btn-success"><i class="fas fa-user-tag"></i>LogOut</a>
      <!--  <a href="register.jsp"  class="btn btn-danger"><i class="fas fa-user tie"></i>Register</a>   -->
      
    </form>
  </div>
</nav>











 <div class="container-fluid back-img text-center text-success">
<h1  ><b>Welcome to Log Book</b></h1>
</div>

</div>
<div style="margin-top: 10px">
<%@ include file="component/footer.jsp"%>
</body>
</html>

