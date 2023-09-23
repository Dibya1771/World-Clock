package com.register;

import java.io.*;
import java.sql.*;
/*import javax.servlet.RequestDispatcher;*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		String umobile = request.getParameter("contact");
		
		Connection con =null;
		Statement smt=null;
		PrintWriter out = response.getWriter();
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Oracle22");
			smt = con.createStatement();			
			
			String qry = "INSERT INTO user1 VALUES('"+uname+"','"+upwd+"','"+uemail+"','"+umobile+"')";
			int rowcount = smt.executeUpdate(qry);
			
			if(rowcount>0) {
				out.println("<script type=\"text/javascript\" >");
			       out.println("alert('Account Created Successfully. Please Sign-In to continue');");
			       out.print("location='/World_Clock/signin.jsp';");
			       out.println("</script>");
				/* response.sendRedirect("signin.jsp"); */
			}
			else{
				
				 out.println("<script type=\"text/javascript\" >");
				 out.println("alert('Account creation failed. Please try again!!!');");
				 out.print("location='/World_Clock/signup.jsp';");
				 out.println("</script>"); 
			}		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				smt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}		
	}
}
