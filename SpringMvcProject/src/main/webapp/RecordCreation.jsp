<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
body
{
height:100%;
}

.frm
{
margin-top:50px;
padding:20px;
font-size:120%;
background-image:radial-gradient(#e375be,#aaf0c4);


}
 textarea {
        overflow-y: scroll;
       
        resize: none; 
    }
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="DiaryMain.jsp"></jsp:include>

	<div align="center">
		<form action="RecordCreation" method="post">
			<table class="frm" cellspacing="30" >
				<tr>
					<td colspan="2" align="center">Diary Creation From</td>
				</tr>
				<tr>
					<td>Person Name</td>
					<td><input type="text" name="personName"></td>
				</tr>
				<tr>
					<Td>Email Id</Td>
					<td><input type="email" name="personEmail"></td>
				</tr>
				<tr>
					<td>contact</td>
					<td><input type="number" name="personContact"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><textarea name="personAddress" rows="5" cols="50"></textarea>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Create"> <input type="reset" value="clear">
					</td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>