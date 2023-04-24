package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uemai = request.getParameter("username");
		String upass = request.getParameter("password");
		
		String url = "jdbc:mysql://localhost:3306/nehal";
		String user = "ansari";
		String pwd = "ansari";
		HttpSession session = request.getSession();

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("Driver is loaded ");
			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.print(" Connection established ");

			
			String sq = "select * from user where uemai = ? upass = ? ";
			
			PreparedStatement psmt = con.prepareStatement(sq);
			
			psmt.setString(1, uemai);
			psmt.setString(2, upass);
			RequestDispatcher re = request.getRequestDispatcher("index.jsp");;
	       
			ResultSet rs = psmt.executeQuery();
//			  re = 
			if (rs.next()) {
				session.setAttribute("name",rs.getString("uemai"));
				re = request.getRequestDispatcher("index.jsp");
			}
			else {
				request.setAttribute("status", "failed");
				re = request.getRequestDispatcher("index.jsp");
			}
			re.forward(request, response);
	         
			System.out.print("Query Executed");

			con.close();
		} catch (Exception e) {
			System.out.println("connection failed " + e);
			e.printStackTrace();
		}
//		finally {
//			try {
//				con.close();
//			}catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
	}

}
