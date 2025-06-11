<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.*,java.util.*" %>
    
    
<%
String first_name=request.getParameter("fname");
String last_name=request.getParameter("lname");
String city_name=request.getParameter("cname");
String email=request.getParameter("email");

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
Statement st=conn.createStatement();

//int i=st.executeUpdate("insert into users(fname,lname,cname,email)values('"+first_name+"','"+last_name+"','"+city_name+"','"+email+"')");
String sql = "insert into users values(?,?,?,?);";
PreparedStatement ps = conn.prepareStatement(sql);
ps.setString(1,first_name);
ps.setString(2,last_name);
ps.setString(3,city_name);
ps.setString(4,email);
ps.executeUpdate();
ResultSet rs = st.executeQuery("Select * from users;");
while(rs.next())
{
	out.println(rs.getString(1));
	out.println(rs.getString(2));
	out.println(rs.getString(3));
	out.println(rs.getString(4));
	out.println("<BR>");
	
}
out.println("<BR>");
out.println("Data is successfully inserted!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>
    
 