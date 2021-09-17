<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/allCss.jsp"%>
</head>
<body style="background-color: #d6d4ce;">


	<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		<a class="navbar-brand" href="index.jsp"><i class="fas fa-book"></i>LogBook</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">

				<!--
     
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp"><i class="fas fa-home"></i>Home <span class="sr-only">(current)</span></a>
      </li>
       <li class="nav-item active">
        <a class="nav-link" href="addContact.jsp"><i class="fas fa-plus-square"></i>Add Contact</a>
      </li>
   
      <li class="nav-item active">
        <a class="nav-link disabled" href="viewContact.jsp"><i class="fas fa-eye"></i>ViewContact</a>
      </li>
      -->

			</ul>

			<form class="form-inline my-2 my-lg-0">
				<a href="login.jsp" class="btn btn-success"><i
					class="fas fa-user-tag"></i>Login</a>
				<!--   <a href="register.jsp"  class="btn btn-danger"><i class="fas fa-user tie"></i>Register</a>
      -->

			</form>
		</div>
	</nav>










	<div class="container-fluid">
		<div class="row p-2">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div class="card-body">
						<h4 class="text-center text-success">Registration Page</h4>
						<form  action="Globalservlet?choice=register"
							onsubmit="return validateform()" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">Enter Name</label> <input
									type="text" class="form-control" id="exampleInputEmail1"
									name="na" onkeyup="validate()" aria-describedby="emailHelp"
									placeholder="Enter name">
								<div id="rr1"></div>

							</div>


							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									type="email" class="form-control" id="exampleInputEmail2"
									name="em" aria-describedby="emailHelp"
									placeholder="Enter email">
							</div>


							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									type="password" class="form-control" id="exampleInputPassword3"
									name="pa" placeholder="Password">
							</div>


							<button type="submit" class="btn btn-primary">Register</button>
						</form>

					</div>
				</div>
			</div>
		</div>
	</div>

	<div style="margin-top: 230px">
		<%@include file="component/footer.jsp"%>
	</div>

	<script type="text/javascript">



 
function validateform(){  
var name=document.myform.na.value;  
var password=document.myform.pa.value;  
  
if (name==null || name==""){  
  alert("Name can't be blank");  
  return false;  
}else if(password.length<6){  
  alert("Password must be at least 6 characters long.");  
  return false;  
  }  
}  
 


</script>




</body>
</html>