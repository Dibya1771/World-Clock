<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile</title>
<link rel="stylesheet" type="text/css" href="css/profile.css">
</head>
<body>
<nav class="navbar">
    
        <h1>World Clock</h1>     
        <ul>
            <li><span><a href="logout">Logout</a></span></li>
        </ul>
    </nav>
      <div class="card-container">
         <div class="upper-container">
            <div class="image-container">
               <img src="images/profile.jpg" />
            </div>
         </div>
         <div class="lower-container">
            <div>    
               <h3>Name: <%= session.getAttribute("name") %></h3>
               <h4>Active user</h4>
            </div>
            <div>
               <p>
               Email: <%= session.getAttribute("email") %><br>
               Mobile No.: <%= session.getAttribute("mobile") %><br><br>
        
              <span>Thank you for using our website world clock</span><br>
               </p>             
           </div>
            <div>
               <a href="index.jsp" class="btn">  << Back to Home</a>
            </div>
         </div>
      </div>
</body>
</html>