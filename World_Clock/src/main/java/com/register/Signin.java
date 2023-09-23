package com.register;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login_ac")
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection con;
	Statement smt;
	ResultSet rs;

	public void init() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Oracle22");
			smt = con.createStatement();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uemail = request.getParameter("username");
		int upwd = Integer.parseInt(request.getParameter("password"));
		
		String qry = "SELECT * FROM user1 where uemail='"+uemail+"' and upwd='"+upwd+"'";		
		PrintWriter out = response.getWriter();		
		try {

			rs = smt.executeQuery(qry);			
			if (rs.next()) {
				
					HttpSession session = request.getSession(true);
					
					session.setAttribute("name", rs.getString("uname"));
					session.setAttribute("email",rs.getString("uemail"));
					session.setAttribute("mobile", rs.getString("umobile"));
					response.sendRedirect("index.jsp");					
				} else {
					
					  out.println("<script type=\"text/javascript\" >");
				       out.println("alert('Incorrect Username or password. Please Try again');");
				       out.print("location='/World_Clock/signin.jsp';");
				       out.println("</script>");			
				}
				
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}
	public void destroy() {
			try {
				rs.close();
				smt.close();
				con.close();
				
			}catch(Exception eee) {
				eee.printStackTrace();
			}
		}
}
