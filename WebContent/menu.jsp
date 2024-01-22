<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="dao.*"%>
    <%@page import="metier.*"%>
    <%@page import="auth.*"%>
    <%@page import="java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="menu.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <title>Menu</title>
    <link rel="icon" sizes="40x40" href="imag/taste.jpg">
    </head>
<body>
<style type="text/css">
    .flip-card {
        background-color: transparent;
        width: 30%;
        height: 250px;
        perspective: 1000px;
        margin: 10px;
        border-radius: 20px;
      }

      .flip-card-inner {
        position: relative;
        width: 100%;
        height: 100%;
        text-align: center;
        transition: transform 0.6s;
        transform-style: preserve-3d;
        box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
      }

      .flip-card:hover .flip-card-inner {
        transform: rotateY(180deg);
      }

      .flip-card-front, .flip-card-back {
        position: absolute;
        width: 100%;
        height: 100%;
        -webkit-backface-visibility: hidden;
        backface-visibility: hidden;
      }
      
      .flip-card-front {
        background-color: #303c45;
        color: black;
      }

      .flip-card-back {
        background-color: #2980b9;
        color: white;
        transform: rotateY(180deg);
      }

      .cardlist{
            display: flex;
            padding: 5%;
            padding-right: 0; 
            margin: 0 5%;
            margin-bottom:5%;
            border-radius: 10px; 
            background-color: lightgrey;
            flex-wrap: wrap;
            justify-content: flex-start;

      }
        .card{
          background-color: white;
          border-radius: 10px;
          color:#333c45;
          padding-left:2%;
          padding-bottom:1%;
          margin-right: 5%;
          margin-bottom: 5%;
          width: 20%;
          height: 50%;
      }
     .auth{
        width:270px;
        height:270px;
     }
      
      .voir{
        border: 2px solid blue;
        background: blue;
        color: white;
        width: 100%;
        font-size: 25px;
        cursor: pointer;
        width: 100;
      }
      .voir a{
        text-decoration : none;
        color: white;
      }
      body{
	background-image: url(imag/th.jfif);
	background-size: cover;
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-position: center center;
	height: 89vh;
}
.btn {
        border: none;
        background: #0000;
        color: #FFFFFF;
        width: 70%;
        font-size: 50px;
        cursor: pointer;
        margin-left:150px;
      }
   
</style>
 
<div class="sidebar">

   <ul>
      <li><a href="index.jsp"><i class="  fa fa-sign-out"></i>Deconnecter</a></li>
    </ul></div>
    <section>
    <div class="cardlist" >
        <%List<Produit> list=SQL.getProduit();%> 
    
    
<%  for(Produit p:list){   %> 
   
      
        <div class="flip-card">
          <div class="flip-card-inner">
            <div class="flip-card-front">
            <img classe="prodcode" src="<%=p.getLien() %>" class="auth" />
            </div>
            <div class="flip-card-back">
            <h2 >Produits<br>N° #<%=p.getCode() %></h2> 
              <p><%=p.getLibelle() %></p> 
              <p>Prix : <%=p.getPrix() %>  DH</p>
              
                 <button class="voir"><span style="color: white"><a href="facture.jsp">acheter</a></span> <i class="fa fa-money"></i> </button>
      
        </div>
        </div>
        </div>
       <% } %>
        </div>
       
</section>  
      
</body>
</html>