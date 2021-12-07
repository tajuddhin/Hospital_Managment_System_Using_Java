<%@page import="pojo.Diagnostic_issue"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="pojo.Patient"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Set"%>
<%@page import="pojo.Diagnostics"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>

<%@include file="mainheader.jsp" %>


<div class="container2" style="weidth:1170px"><br>
		<h4><strong>Diagnostics</strong></h4>
		<form action="Diagnostics" method="post">
		<table style="width:90%" class="center">
		
		<tbody>
			  <tr id="t1">  
				<th>Patient Id</th>
				<th>Name</th> 
				<th>Age</th>
				<th>Address</th>
				<th>DOJ</th>
				<th>Type of Room</th>
			  </tr>
			  <tr style="height:20px">
				<td></i><input type="text" value="${pdata.pid}" name="pid" class="placeicon" placeholder="&#xf002"></td>
				<td>${pdata.name}</td>
				<td>${pdata.age}</td>
				<td>${pdata.address}</td>
				<td>${pdata.doa}</td>
				<td>${pdata.typeofbed}</td>
			  </tr>
		</tbody>
		</table><br>
		<input type="submit" name="Get" class="btn btn-dark" style="margin-top:5px; margin-bottom:5px; background-color: black; color:white;">
		</form><br>
		
		<h4><strong>Diagnostics Conducted</strong></h4>
		<table style="width:30%" class="center" id="createrowfordiagnostics">
		<tbody>
			  <tr id="t1">  
				<th>Name of the test</th>
				<th>Amount</th>
			  </tr>
			  <%
			   Patient p=(Patient) request.getAttribute("pdata");
			  if(p!=null){
				  Set<Diagnostic_issue> diag=p.getDiagnostic_issue();
				  for(Iterator iter=diag.iterator();iter.hasNext();)
				  {
					  Diagnostic_issue d=(Diagnostic_issue)iter.next();
					  
				%>
			  
			 
			  <tr style="height:20px">
				<td><%=d.getDiagnostics().getTname()%></td>
				<td><%=d.getDiagnostics().getChargefortest()%></td>
			  </tr>
			  <%}} %>
		</tbody>
		</table><br>
		<button type="button" class="btn btn-dark" style="margin-top:5px; margin-bottom:5px; background-color: black; color:white;"><a href="addDiagnostics">Add Diagnostics</a></button>
	</div>
</body>
</html>