<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Iterator" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.util.List" %>
    <%@page import="pojo.Medicine_issue" %>
    <%@page import="pojo.MedicineDb" %>
    
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
.log{	`1
font-size:6;
text-align:center;
padding-bottom:20px;

}
table{
widows:20%;
border:1px solid;
text-align:center;
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
<form action="Issuemedicine" method="post">
<div align="center">

	<form action="Issuemedicine" method="post">
		<div>
            <center><h3>Issue Medicines</h3></center><br>
			<label  id='medicine name'>Medicine Name<span style="color: #EF0E4F">*</span></label>   
            <input type="text" name='mname' placeholder="Eg. Tenormin" name="medicine"> &emsp;
            <label >Quantity<span style="color: #EF0E4F">*</span>	</label>   
            <input  type="text"  placeholder="Eg. 10" pattern="[0-9]+" title="Please enter Quantity in numeric" name="quantity" ></br><br>
            <button type="submit" class="btn btn-dark" name="submit" value="Search" style="margin-top:5px;  "margin-bottom:5px; background-color: black; color:white;">save</button></br>
        </div>
	</form><br>
	
	<table style="width:70%" class="center">
	
		<tbody>
			  <tr id="t1">  
				<th>Medicine</th>
				<th>Quantity</th> 
				<th>Rate</th>
				<th>Amount</th>
			  </tr>
			 <%
			 ArrayList l=(ArrayList)request.getAttribute("le");
			 if(l==null){
			 }else{
			 Iterator iter=l.iterator();
			 
			 while(iter.hasNext()) {
				 Medicine_issue med=(Medicine_issue)iter.next();
			
			
				 %>
			
			  <tr style="height:20px">
			  
				<td><%=med.getMedicine().getMname() %></td>
				<td><%=med.getQuantity()%></td>
				<td><%=med.getMedicine().getRate() %></td>
				<td><%= med.getMedicine().getRate() * med.getQuantity() %></td>
			  </tr>
			  <%}} %>
		</tbody>
		</table><br>
		
		 <button type="submit" class="btn btn-dark" name="submit" value="Save" style="margin-top:5px;  "margin-bottom:5px; background-color: black; color:white;">save</button></br>
		
</div>
</form></body>
</html>