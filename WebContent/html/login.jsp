<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang='en'>
<head>
<meta charset="UTF-8">
<title>Hospital Management System</title>
<style>
.header {
  padding: 30px;
  text-align: center;
  background: #42a7f5;
  color: white;
  border: 1px solid #000000;
  font-size: 30px;
}
.log{
font-size:6;
text-align:center;
padding-bottom:20px;

}
table{
widows:20%;
border:1px solid;
text-align:center;
}

</style>
</head >
<body bgcolor="0099CC">
<h1 class="header">Hospital Management System</h1>
</br></br></br></br>
<form action="<%=request.getContextPath()%>/Loginservlet" method="post">
<table  bgcolor="0099CC" border-width=2px align="center">
<tr>
<td colspan=2 class='log'><b>Login</b></td>
</tr>

<tr>
<td>Username</td>
<td><input type="text" placeholder="Enter Username"  size=25 name="userid" required></td>
</tr>

<tr>
<td>Password</td>
<td padding-bottom=10px><input type="Password" placeholder="Enter Password"  size=25 name="pwd" required></td>
</tr>

<tr>
<td><input type="submit" value="Login"></td>
</tr>

</table>
 </form>   
</body>
</html> 
