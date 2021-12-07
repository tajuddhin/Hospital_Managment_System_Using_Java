<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>ABC Hospital Management System</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/style.css">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"></script>
		
	</head>
	<body>
	<div class="container"><h1>ABC Hospital Management System</h1><br>
			<div class="row">
				<div class="col-sm-4" id="col1">
					<div class="dropdown">
						<button type="button" class="btn btn-primary">Patient <i class="fa fa-angle-down" aria-hidden="true"></i> </button>
							<div class="dropdown-content">
							  <a href="register">Patient Registration</a>
							  <a href="">Update Patient</a>
							  <a href="delete">Delete Patient</a>
								<a href="Viewpatients">View Patients</a>
								<a href="search_patient">Search Patient</a>
								<a href="Finallbill">Patient Billing</a>

							</div>
					</div>
				</div>
				<div class="col-sm-4" id="col2">
					<div class="dropdown">
						<button type="button" class="btn btn-primary">Pharmacy <i class="fa fa-angle-down" aria-hidden="true"></i> </button>
							<div class="dropdown-content">
							  <a href="search_patient">Get Patient Details</a>
							  <a href="medicine">Issue Medicines</a>
							</div>
					</div>
				</div>
				<div class="col-sm-4" id="col3">
					<div class="dropdown">
						<button type="button" class="btn btn-primary">Diagnostics <i class="fa fa-angle-down" aria-hidden="true"></i> </button>
							<div class="dropdown-content">
							  <a href="search_patient">Get Patient Details</a>
							  <a href="Diagnostics">Diagnostics Details</a>
							</div>
					</div>
				</div>
			</div>
			<hr style="border-color:#111113; display: block;border-style: inset; border-width: 1px">

</body>
</html>