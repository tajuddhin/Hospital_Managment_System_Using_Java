<%@page import="pojo.Patient"%>
<%@page import="pojo.MedicineDb"%>
<%@page import="pojo.Medicine_issue"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<%@include file="mainheader.jsp" %>


<div>
	<div class="container1" style="weidth:1170px">
		<h4><strong>Pharmacy</strong></h4><br>
		<form action="medicine" method="post">
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
			   <tr style="height:20px">
				<td></i><input type="text" style="weidth:10px;" value="${mdata.pid}" name="pid" class="placeicon" placeholder="&#xf002"></td>
				
				<td>${mdata.name }</td>
				<td>${mdata.age }</td>
				<td>${mdata.address }</td>
				<td>${mdata.doa }</td>
				<td>${mdata.typeofbed }</td>
			  </tr>
			  
			 
		</tbody>
		</table><br>
		
		<input type="submit" class="btn btn-dark" style="margin-top:5px; value="Get" margin-bottom:5px; background-color: black; color:white;"><br>
		
		</form><br>
		<h4><strong>Medicines Issued</strong></h4>
		<table style="width:70%" class="center">
		<tbody>
		
			  <tr id="t1">  
				<th>Medicine</th>
				<th>Quantity</th> 
				<th>Rate</th>
				<th>Amount</th>
			  </tr>
			  
			  <%
			  
			  Patient p=(Patient) request.getAttribute("mdata");
			  if(p!=null){
		 Set<Medicine_issue> med=p.getMedicine_issue();
		 for(Iterator iter=med.iterator();iter.hasNext();)
		  {
			 Medicine_issue m=(Medicine_issue)iter.next();
			  
		%>
			  <tr style="height:20px">
				<td ><%=m.getMedicine().getMname() %></td>
				<td><%=m.getQuantity()%></td>
				<td><%=m.getMedicine().getRate()%></td>
				<td><%=m.getQuantity() * m.getMedicine().getRate() %></td>
			  </tr>
			  <%} }%>
		</tbody>
		</table><br>
		<button  class="btn btn-dark" style="margin-top:5px; margin-bottom:5px; background-color: black; color:white;"><a href="Issuemedicine">Issue Medicines</a></button><br>
	</div>
</div>

</body>
</html>