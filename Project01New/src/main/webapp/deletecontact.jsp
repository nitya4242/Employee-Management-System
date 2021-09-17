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
<h4 class="text-center text-success">DeleteContact</h4>
<form action = "Globalservlet?choice=deletecontact" method="post">

  <div class="form-group">
    <label for="exampleInputEmail1">EmailAddress</label>
    <input type="email" class="form-control" id="exampleInputEmail1" name="em"  aria-describedby="emailHelp" placeholder="  Enter email">
    
  </div>
  
 
  <button type="submit" class="btn btn-primary">Delete</button>
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