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
  <a class="navbar-brand" href="adminindex.jsp"><i class="fas fa-book"></i>LogBook</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="adminindex.jsp"><i class="fas fa-home"></i>Home <span class="sr-only">(current)</span></a>
      </li>
     
   
      
      
      
      
    </ul>
   
  </div>
</nav>

<div class="container-fluid">
<div class="row p-2">
<div class="col-sm-4 offset-sm-4">
<div class="card"> 
<div class="card-body">
<h4 class="text-center text-success">Edit User</h4>
<form action = "Globalservlet?choice=deleteuser" method="post">

  <div class="form-group">
    <label for="exampleInputEmail1"> Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="em"  aria-describedby="emailHelp" placeholder="  Enter email">
    
  </div>
  
 
  <button type="submit" class="btn btn-primary">Edit</button>
</form>

<!-- <div class="col-md-3">
<div class ="card crd-ho">
<div class="card-body">
<h5>
-->
</div>
</div>
</div>
</div>
</div>

</body>
</html>