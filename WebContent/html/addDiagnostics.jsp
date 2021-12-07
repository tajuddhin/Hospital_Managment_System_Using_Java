<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page import="java.util.Iterator" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
     <%@page import="pojo.Diagnostic_issue" %>
    <%@page import="pojo.Diagnostics" %>
<!DOCTYPE html>
<html lang='en'>
<head>
<meta charset="UTF-8">
<title>ABC Hospital Management System</title>
<style>
.header {
  padding: 30px;
  text-align: center;
  background: #42a7f5;
  color: white;
  border: 1px solid #000000;
  font-size: 30px;
}
table, th, td {
	border: 1px solid black;
	text-align : center;
	background-color: white;
}

th, td{
	padding: 5px !important;
}
.log{
font-size:6;
text-align:center;
padding-bottom:20px;

}
#t1 > th{
	color:white;
	text-align : center;
	background-color: #545661
}
</style>
</head>
<body bgcolor="0099CC">
<h1 class="header"> ABC Hospital Management System</h1>
<form action="addDiagnostics" method="post">
<div align="center">
	<form action="addDiagnostics" method="post">
		<div>
            <center><h3>Add Diagnostics</h3></center><br>
			<label name='diagnosis name' id='diagnosis name'>Diagnosis(Test) name<span style="color: #EF0E4F">*</span></label> &nbsp;
            <input type="text"  pattern="[A-Za-z_ ]+" title="Please enter alphabets" placeholder="Eg. ECG" name="tname" ><br><br>
            <button type="submit" name="submit" value="Add" class="btn btn-dark" style="margin-top:5px; margin-bottom:5px; background-color: black; color:white;">Add</button><br>
        </div>
	</form><br>
	<table style="width:30%" class="center">
		<tbody>
			  <tr id="t1">  
				<th>Name of the test</th>
				<th>Amount</th>
			  </tr>
			  
			   <%
			 ArrayList l=(ArrayList)request.getAttribute("lt");
			 if(l==null){
			 }else{
			 Iterator iter=l.iterator();
			 
			 while(iter.hasNext()) {
				 Diagnostic_issue med=(Diagnostic_issue)iter.next();
			
			
				 %>
			  
			  <tr style="height:20px">
				<td><%= med.getDiagnostics().getTname() %></td>
				<td><%= med.getDiagnostics().getChargefortest() %></td>
			  </tr>
			   <%}} %>
		</tbody>
		</table><br>
		<button type="submit" name="submit" value="Update" class="btn btn-dark" style="margin-top:5px; margin-bottom:5px; background-color: black; color:white;">Update</button><br>
</div>
</form></body>
</html>