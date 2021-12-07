<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<html>
	<%@include file="styleheader.jsp" %>
	
	<div class="container4" style="weidth:1170px">
		<h4><strong> Patient Registration</strong></h4><br>
		<h4>${msg}</h4>
		<h5><span style="color: #EF0E4F">*</span> These fields are required!</h5>
	
		<fieldset>
		<form  action="register" method="post">
			<table align="center" id="createpatient">
				<tr>
					<td>Patient SSN ID<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text" name="ssnid" pattern="[0-9]+" placeholder="Eg. 1234" required><br><br></td>
				</tr>
				<tr>
					<td>Patient Name<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text"  name="name" placeholder="Eg. Bob" required><br><br></td>
				</tr>
				<tr>
					<td>Patient Age<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="text"  name="age" placeholder="Eg. 35" required><br><br></td>
				</tr>
				<tr>
					<td>Date of Admission<span style="color: #EF0E4F">*</span><br><br></td>
					<td><input type="date" id="doa" name="doa" required><br><br></td>
				</tr>
				<tr>
					<td>Type of bed<span style="color: #EF0E4F">*</span><br><br></td>
					<td><select name="typeofbed" id="typeofbed" required>
							<option selected="selected" disabled="disabled" value="">Please Select</option>
							<option value="generalward">General Ward</option>
							<option value="semisharing">Semi Sharing</option>
							<option value="singleroom">Single Room</option>
						</select><br><br>
					</td>
				</tr>
				<tr>
					<td>Address<span style="color: #EF0E4F">*</span><br><br></td>
					<td><textarea rows="3" name="address"  required></textarea><br><br></td>
				</tr>
				<tr>
					<td>State<span style="color: #EF0E4F">*</span><br><br></td>
					<td><select name="state" id="state" required>
							<option selected="selected" disabled="disabled" value="">Please Select</option>
							<option value="Andhra Pradesh">Andhra Pradesh</option>
							<option value="Telangana">Telangana</option>
							<option value="Tamil Nadu">Tamil Nadu</option>
						</select><br><br>
					</td>
				</tr>
				<tr>
					<td>City<span style="color: #EF0E4F">*</span><br><br></td>
					<td><select name="city" id="city" required>
							<option selected="selected" disabled="disabled" value="">Please Select</option>
							<option value="Visakhapatna">Visakhapatnam</option>
							<option value="Hyderabad">Hyderabad</option>
							<option value="Madurai">Madurai</option>
						</select><br><br>
					</td>
				</tr>
				<tr>
					<td><button type="submit" class="btn btn-secondary">Submit</button></td>
					<td><button type="reset" class="btn btn-secondary">Reset</button></td>
				</tr>
			</table>
		</form>
		</fieldset>
	</div>
</body>

</html>