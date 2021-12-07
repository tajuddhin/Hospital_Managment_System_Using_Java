<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="pojo.Patient"%>
<%@page import="pojo.MedicineDb"%>
<%@page import="pojo.Medicine_issue"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.List"%>
<%@page import="pojo.Diagnostics"%>
<%@page import="pojo.Diagnostic_issue"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<%@include file="mainheader.jsp" %>



	<div>
	<div class="container3" style="weidth:1170px">
		<h4><strong>Patient Billing</strong></h4>
		<form action="Finallbill" method="post">
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
			  <tr>
				<td><input type="text" value="${pdata.pid}" name="pid"  placeholder="PatientId"></td>
				<td>${pdata.name}</td>
				<td>${pdata.age}</td>
				<td>${pdata.address}</td>
				<td>${pdata.doa}</td>
				<td>${pdata.typeofbed }</td>
			  </tr>
		</tbody>
		</table>
		<button type="submit" class="btn btn-dark" style="margin-top:5px; margin-bottom:5px; background-color: black; color:white;">Update</button>
		</form>
		
		
		<h4><strong>Pharmacy Charges</strong></h4>
		<table style="width:70%" class="center">
		<tbody>
			  <tr id="t1">  
				<th>Medicine</th>
				<th>Quantity</th>
				<th>Rate</th>
				<th>Amount</th>
			  </tr>
			  <%!int am=0,dm=0; %>
			   <%
			  
			  Patient p=(Patient) request.getAttribute("pdata");
			  if(p!=null){
		 Set<Medicine_issue> med=p.getMedicine_issue();
		  am=0;
		 for(Iterator iter=med.iterator();iter.hasNext();)
		  {
			 Medicine_issue m=(Medicine_issue)iter.next();
			 am=am+(m.getQuantity() * m.getMedicine().getRate());
			  
		%>
			  <tr>
				<td ><%=m.getMedicine().getMname() %></td>
				<td><%=m.getQuantity()%></td>
				<td><%=m.getMedicine().getRate()%></td>
				<td><%=(m.getQuantity() * m.getMedicine().getRate()) %></td>
			  </tr>
			  <%}} %>

		</tbody>
		</table>
		<h5 >Bill for Pharmacy: <%=am %></h5>
		<h4><strong>Diagnostics Charges</strong></h4>
		<table style="width:30%" class="center">
		<tbody>
			  <tr id="t1">  
				<th>Name of the test</th>
				<th>Amount</th>
			  </tr>
			   <%
			   Patient c=(Patient) request.getAttribute("pdata");
			  if(p!=null){
				  Set<Diagnostic_issue> diag=c.getDiagnostic_issue();
				  dm=0;
				  for(Iterator iter=diag.iterator();iter.hasNext();)
				  {
					  Diagnostic_issue d=(Diagnostic_issue)iter.next();
					  dm=dm+(d.getDiagnostics().getChargefortest());
					  
				%>
			  <tr>
				<td><%=d.getDiagnostics().getTname()%></td>
				<td><%= d.getDiagnostics().getChargefortest()%></td>
			  </tr>
			  <%}} %>

		</tbody>
		</table>
		<h5 id="bilfordiag">Bill for Diagnostics:  <%=dm %></h5>
		<h5 id="grandtotal"><b>Grand Total: <%= dm+am %></b></h5>
		<br>
		<button type="button" class="btn btn-dark" style="margin-top:5px; margin-bottom:5px; background-color: black; color:white;">Confirm</button><br>
	</div>
</div>
</body>
</html>