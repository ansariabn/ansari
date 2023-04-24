package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Statement;


public class registor extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

		String uname = request.getParameter("name");
		String uemai = request.getParameter("email");
		String upass = request.getParameter("pass");
		String repass = request.getParameter("re_pass");
		String contact = request.getParameter("contact");
		String term = request.getParameter("agree-term");

//		PrintWriter out = response.getWriter();
//		out.print(uname);
//		out.print(uemai);
//		out.print(upass);
//		out.print(repass);
//		out.print(contact);
//		out.print(term);
		
		String url = "jdbc:mysql://localhost:3306/nehal";
		String user = "ansari";
		String pwd = "ansari";
//		 con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("Driver is loaded ");
			Connection con = DriverManager.getConnection(url, user, pwd);
			System.out.print(" Connection established ");

//			String sql = "Create Database Nehal";
//        String sq = "Create Table nehal(TName varchar(20) not null, Password varchar(20) not null)";
//        String sq2 = "insert into nehal(TName , Password) values (?, ?)";
			
			
			String sq = "insert into user(uname,uemai ,upass ,repass ,contact) values(?, ?, ?, ?, ?)";
			
			PreparedStatement psmt = con.prepareStatement(sq);
			
			psmt.setString(1, uname);
			psmt.setString(2, uemai);
			psmt.setString(3, upass);
			psmt.setString(4, repass);
			psmt.setString(5, contact);
//			psmt.executeQuery();
//			Statement stmt = con.createStatement();
//			 System.out.println(psmt);
	         int count = psmt.executeUpdate();
	         System.out.println(" Ansari nehal "+count);
	         
	         if (count > 0) {
	        	
	        	 request.setAttribute("status", "success");
	        	 System.out.println("ansari " + " status");
	         }
	         else {
	        	 request.setAttribute("status", "failed");
	        	
	         }
	         
	         RequestDispatcher re = null;
	         re = request.getRequestDispatcher("login.jsp");
	         if (upass.equals(repass)) {
	        	 System.out.println("your password is right..");
	        	 
	        	 request.setAttribute("right", "working");
	         }
	         else {
	        	 System.out.println("ur password is wrong..");
	         }
	        
	         re.forward(request, response);
//	            status = rs.next();
//			stmt.executeUpdate(sql);
//        stmt.executeUpdate(sq);
			System.out.print("Query Executed");

//			stmt.close();
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
