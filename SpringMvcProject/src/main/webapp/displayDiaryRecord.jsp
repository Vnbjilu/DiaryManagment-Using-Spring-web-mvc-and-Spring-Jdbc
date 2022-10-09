<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*,vikas.RatanRaman.Diary"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DisplayRecord</title>
<style>
.details {
	margin-top: 10%;
}
</style>
</head>
<body>
	<jsp:include page="DiaryMain.jsp"></jsp:include>
	<table border="1" class="details">
		<tr>
			<th colspan="7" align="center">DiaryRecord Details</th>
		<tr>
			<Th>PersonId</Th>
			<th>Name</th>
			<th>Email</th>
			<th>Contact</th>
			<th>Address</th>
			<th colspan="2">Operation</th>
		</tr>
		<%
		List<Diary> diary=(List<Diary>)request.getAttribute("diary");
		for(Diary tmp:diary)
		{
			
		%>
		<tr>
			<td><%=tmp.getPersonId() %></td>
			<td><%=tmp.getPersonName() %></td>
			<td><%=tmp.getPersonEmail() %></td>
			<td><%=tmp.getPersonContact() %></td>
			<td><%=tmp.getPersonAddress() %></td>
			<td><a href="edit.jsp?id=<%=tmp.getPersonId()%>">Edit</a></td>
			<td><a href="deleteDiary?id<%=tmp.getPersonId()%>" onclick="return confirm('Are you sure?')">Delete</a></td>
		</tr>
		<%
		}
		%>
</body>
</html>