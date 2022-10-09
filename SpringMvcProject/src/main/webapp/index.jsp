<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<style>
.login
{
background-image:linear-gradient(#e375be,#aaf0c4);
margin-top:15%;
padding:5%;


}

</style>
</head>
<body bgcolor="#e1ddd7">
	<div align="center">
		<form action="login_do">
			<table  class="login">
			<tr>
				<Td colspan="2" align="center">User Login Form</Td>
			</tr>
			<tr>
				<Td> UserName</Td>
				<td> <input type="text" name="userName"></td>
			</tr>
			<tR>
				<Td> Password</Td>
				<td><input type="password" name="userPassword"></td>
			</tR>
			<tr>
				<Td colspan="2" align="center">
				<input type="submit" value="login" >
				<input type="reset" value="clear">
				</Td>
			</table>

		</form>
	</div>
</body>
</html>