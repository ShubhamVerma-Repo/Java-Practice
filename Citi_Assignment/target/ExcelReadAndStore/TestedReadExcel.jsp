<%@ page language="java" import="java.util.*" import="java.io.*" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border="1">

<tr>
<th>ID</th>
<th>NAME</th>
<th>SURNAME</th>
<th>PASSWORD</th>
<th>ADDRESS</th>
<th>PINCODE</th>
<th>CITY</th>
<th>STATE</th>
<th>COUNTRY</th>
<th>LOCATION</th>
</tr>



<%

try {

	Class.forName("oracle.jdbc.driver.OracleDriver");

	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");
	
	PreparedStatement pst=con.prepareStatement("select * from abc");
	
	ResultSet rs=pst.executeQuery();
	
	while(rs.next())
	{
		%>
		
		<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getString(5) %></td>
		<td><%=rs.getString(6) %></td>
		<td><%=rs.getString(7) %></td>
		<td><%=rs.getString(8) %></td>
		<td><%=rs.getString(9) %></td>
		<td><%=rs.getString(10) %></td>
		</tr>
		
		
		
		<%
		
	}
	
}

catch(Exception e)
{
	System.out.println("exception " +e);
}

%>
</table>
</body>
</html>