<%@ page language="java" import="java.util.*" import="java.io.*" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body style="background-color: skyblue	">

<%
	try {

	Class.forName("oracle.jdbc.driver.OracleDriver");

	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
	
	PreparedStatement pst1=con.prepareStatement("select sum(totalhrs) from testedexcelstorage");
	
	ResultSet rs1=pst1.executeQuery();
	int noOfTotalHrs=0;
	while(rs1.next())
	{
	noOfTotalHrs=rs1.getInt(1);
	}
	
		PreparedStatement pst2 = con.prepareStatement("select COUNT(*) from testedexcelstorage");

		ResultSet rs2 = pst2.executeQuery();
		String noOfRecords = null;
		while (rs2.next()) {
			noOfRecords = rs2.getString(1);
		} 

			PreparedStatement pst3 = con.prepareStatement("select max(datevalue) from testedexcelstorage");
		
				ResultSet rs3 = pst3.executeQuery();
				String maxColumnEntry = null;
				while (rs3.next()) {
					maxColumnEntry = rs3.getString(1);
				} 
%>




<h1><U><center>LIST OF DATA</center></U></h1><br>


<b>TOTAL RECORDS :</b> <input type="text" disabled="disabled" value="<%=noOfRecords %> ">

<b>TOTAL HOURS :</b> <input type="text" disabled="disabled" value="<%=noOfTotalHrs %> HRS">

<b>MAX RECORDED DATE :</b> <input type="text" disabled="disabled" value="<%=maxColumnEntry %> HRS">


<br><br>
<table class="table table-hover table-bordered">

<thead class="thead-dark">
<tr>
<th>DATE</th>
<th>TEAMMEMBER</th>
<th>PROJECT</th>
<th>MODULE</th>
<th>PHASE</th>
<th>ACTIVITY</th>
<th>DESCRIPTION</th>
<th>TICKETID</th>
<th>TOTALHRS</th>
<th>HRSMIN</th>
</tr>
</thead>


<%


	
	PreparedStatement pst=con.prepareStatement("select * from testedexcelstorage");
	
	ResultSet rs=pst.executeQuery();
	
	while(rs.next())
	{
		%>
		
		<tr>
		<td><%=rs.getDate(1) %></td>
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