<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.ArrayList" %>
<%@page import="java.util.Iterator"%>
<%@page import="pojo.Patient" %>
<!DOCTYPE html>
<html>
<%@ include file="mainheader.jsp" %>
	<div>
	<div class="content" style="weidth:1170px">
		<h3><strong>View Patients</strong></h3>
		<table style="width:90%" class="center">
		<tbody>
			  <tr id="t1">  
				<th>PatientId</th>
				<th>Name</th> 
				<th>Age</th>
				<th>Address</th>
				<th>DOJ</th>
				<th>Type of Room</th>
			  </tr>
			  
			  
			  <%
			  ArrayList p=(ArrayList)request.getAttribute("patients");
			  if(p==null){
				  %>
				  <h4>No Patients data avalible</h4>
			 <% }
			  else{
			  for(Iterator iter=p.iterator();iter.hasNext();)
			  {
				  Patient patient=(Patient)iter.next();
				  
			 
				  
				  %>
			  <tr>
				<td><%= patient.getPid() %></td>
				<td><%=patient.getName() %></td>
				<td><%=patient.getAge() %></td>
				<td><%=patient.getAddress() %></td>
				<td><%=patient.getDoa() %></td>
				<td><%=patient.getTypeofbed() %></td>
			  </tr>
			<%}
			  }%>
			
		</tbody>
		</table>
	</div>
	</body>
</html>