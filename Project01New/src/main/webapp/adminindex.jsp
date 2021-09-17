<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>project 1</title>
<%@include  file="component/allCss.jsp"%>
<!--  <style type="text/css">
body{
background -image :url("namastey.jpg");
background-size: cover;


}
</style>
-->


</head>
<body style ="background-image: url('admin1.jpg'); background-repeat:no- repeat">

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="adminindex.jsp"><i class="fas fa-book"></i>LogBook</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <form action = "Globalservlet?choice=adminviewalluser" method="post">
<center>


  
  <button type="submit" class="btn btn-primary">ViewAllUser</button>
  
</center>
</form>

<form action="deleteuser.jsp" method="post">
<center>


  
  <button type="submit" class="btn btn-primary">DeleteUser</button>
  </center>
  </form>


<form action = "Globalservlet?choice=adminviewallcontact" method="post">
  <center>
  <button type="submit" class="btn btn-primary">ViewAllContact</button>
  
</center>

</form>
  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
     
     
   
     
      
    </ul>
   
    <form class="form-inline my-2 my-lg-0">
       <a href="AdminLogin.jsp" class="btn btn-success"><i class="fas fa-user-tag"></i>LogOut</a>
      <!--  <a href="register.jsp"  class="btn btn-danger"><i class="fas fa-user tie"></i>Register</a>   -->
      
    </form>
  </div>
</nav>



<center>
<div class="container back-img">
<h1 style= color:"red">Welcome Admin !!Namastey  </h1>
</div>
</center>
<!--  <input type="submit" value="viewall">
-->


<br>

<br>





</div>
<div style="margin-top: 500px">
<%@ include file="component/footer.jsp"%>
</div>
</body>
</html>

