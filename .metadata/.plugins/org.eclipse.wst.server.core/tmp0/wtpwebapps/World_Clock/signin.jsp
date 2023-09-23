<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In form</title>
<link rel="stylesheet" href="css/signup.css">
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">

	    <div class="box2">
        <!-- <form action="login_ac" method="post" autocomplete="off"> -->
        <form action="login_ac" method="post">
            <h2>Sign In</h2>
            <div class="inputBox">
                <input type="text" name="username" required="required">
                <span>Enter Email</span>
                <i></i>
            </div>
            <div class="inputBox">
                <input type="password" name="password" required="required">
                <span>Enter Password</span>
                <i></i>
            </div>
            <div class="links2">
                <input type="checkbox" class="check-box" ><span>Remember password</span>
                <a href="signup.jsp">SignUp</a>
            </div>
            <input type="submit" value="Signin">
        </form>
    </div>



</body>
</html>