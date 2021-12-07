<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>

<html>
	<%@include file="styleheader.jsp" %>
	
	<div class="container4" style="weidth:1170px">
		<h4><strong>Search Patientt</strong></h4><br>
		<h4>${delmsg1}</h4>
		<h5><span style="color: #EF0E4F">*</span> These fields are required!</h5>
	
		<fieldset>
		
			<table align="center" id="createpatient">
				<form action="<%=request.getContextPath()%>/search_patient" method="post">

				<tr>
					<td>Patient ID<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text" value="${p.pid}" name="pid" pattern="[0-9]+" title="Please enter valid 9 digit numeric" name="pid" placeholder="Eg. 1234" required><br><br></td>
					<td><button type="submit" name="submit" value="getdata" class="btn btn-secondary btn-sm" style="margin-bottom:20px; margin-left:15px">Get</button></td>
				</tr>
				</form>
				<tr>
					<td>Patient Name<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text" value="${p.name}" name="name" placeholder="Eg. Bob" ><br><br></td>
				</tr>
				<tr>
					<td>Patient Age<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text" value="${p.age}" name="age" placeholder="Eg. 35" ><br><br></td>
				</tr>
				<tr>
					<td>Date of Admission<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="date" value="${p.doa}" id="doa" name="doa" ><br><br></td>
				</tr>
				<tr>
					<td>Type of bed<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text" value="${p.typeofbed}" name="typeofbed"  ><br><br></td>
					
				</tr>
				<tr>
					<td>Address<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text" rows="3" cols="20" name="address" value="${p.address}"><br><br></td>
				</tr>
				<tr>
					
					<td>State<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text" value="${p.state}" name="state"  ><br><br></td>
					
				</tr>
				<tr>
					<td>City<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text" value="${p.city}" name="city" ><br><br></td>
				</tr>

			
			</table>
		
		</fieldset>
	</div>
</body>
</html>