<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<link rel="stylesheet" href="css/signup.css">
</head>
<body>

 <input type="hidden" id="status" value="<%= request.getAttribute("status") %>"> 

<div>           
    <div class="box">
       <!--  <form method="post" action="register" autocomplete="off"> -->
        <form method="post" action="register" onsubmit="return validate()">
            <h2>Sign Up</h2>
            <div class="inputBox">
                <input type="text" class="input-field" name="name" required="required" autocomplete="off">
                <span>Name</span>
                <i></i>
            </div>
                         
            <div class="inputBox">                
                <input type="email" class="input-field" name="email" required="required" autocomplete="off">
                 <span>Email</span>
                 <i></i>
            </div>
             
            <div class="inputBox">
                <input type="text" class="input-mob" name="contact" id="mob" required="required" autocomplete="off">   <!-- <br>   -->
                 <span>MOBILE NO</span>
                 <i></i>
             </div>


            <div class="inputBox">
                <input type="password" name="pass" required="required" autocomplete="off">
                <span>Password</span>
                <i></i>
            </div>

            <div class="links">
                <input type="checkbox" class="check-box" required="required" id="first_m"><span>I agree to the terms and conditions</span>
                <a href="signin.jsp" id="move">Sign In</a>
            </div>
            <input type="submit" value="Register">
        </form>
    </div>   
</div>
       
	
	<!-- SWEET ALERT FOR alert comes when we sucessfully registered -->
	<script src="js/validate.js"></script>
	<script src="js/https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>	  <!-- For validate page -->
		
 <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>	

 
</body>
</html>