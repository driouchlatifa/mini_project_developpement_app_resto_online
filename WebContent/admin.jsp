<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Connexion</title>
	<link rel="stylesheet" href="login.css">
	<link rel="icon" sizes="40x40" href="imag/taste.jpg">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
	<form action="adminAut.java" method="post">
		<div class="login-box">
			<h1>Sign in</h1>

			<div class="textbox">
				<i class="fa fa-user" aria-hidden="true"></i>
				<input type="text" placeholder="Username" name="name">
			</div>

			<div class="textbox">
				<i class="fa fa-lock" aria-hidden="true"></i>
				<input type="password" placeholder="Password" name="pass" >
			</div>

			<input class="button" type="submit" name="login" value="Sign in">
		</div>
	</form>
</body>

</html>