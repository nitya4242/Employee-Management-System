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
<%@include file="component/navbar.jsp" %>

<div class="container-fluid">
<div class="row p-2">
<div class="col-sm-4 offset-sm-4">
<div class="card"> 
<div class="card-body">
<h4 class="text-center text-success">View Contact Page</h4>
<form action = "Globalservlet?choice=viewallcontact" method="post">

  <div class="form-group">
    <label for="exampleInputEmail1">User Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="uem"  aria-describedby="emailHelp" placeholder=" User Enter email">
    
  </div>
  
 
  <button type="submit" class="btn btn-primary">View All</button>
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