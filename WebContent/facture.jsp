<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Paiement</title>
	<link rel="stylesheet" href="login.css">
	<link rel="icon" sizes="40x40" href="imag/group.jpeg">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

<body>
	<form action="verif.jsp" method="post">
		<div class="login-box">
			<h1>Payment<i class="fa fa-cc-visa" aria-hidden="true"></i></h1>

			<div class="textbox">
				<i class="fa fa-envelope" aria-hidden="true"></i>
				<input type="text" placeholder="Email" name="email">
			</div>

			<div class="textbox">
				<i class="fa fa-credit-card-alt" aria-hidden="true"></i>
				<input type="text" placeholder="Compte bancaire" name="compte" >
			</div>

			<input class="button" type="submit" name="login" value="valider">
		</div>
	</form>
</body>

</html>