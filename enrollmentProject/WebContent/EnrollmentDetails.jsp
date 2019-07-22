<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
		<script src="https://code.jquery.com/jquery-3.1.1.js">	
</script>
<script  src="../enrollmentProject/javascript/enrollmentValidate.js"></script>
<script type="text/javascript">	

function save() {
	var jsonData={
			"studentFirstName" : $('#firstName').val(),
			"studentMiddleName" : $('#middleName').val(),
			"studentLastName" : $('#lastName').val(),
			"address1" : $('#address1').val(),
			"address2" : $('#address2').val(),
			"townOrCityName" : $('#city').val(),
			"districtOrCountryName" : $('#district').val(),
			"state" : $('#state').val(),
			"zipCodeOrPostalCode" : $('#zipCodeOrPostalCode').val(),
	};

		var stringifyVar = JSON.stringify(jsonData);
		alert(stringifyVar);
		$.ajax({
					url : "../enrollmentProject/save_student_enroll",
					type : "POST",
					data : stringifyVar,
					dataType : "json",
					contentType : "application/json; charset=utf-8",
					success : function(response) {
					alert(response.studentFirstName);
						
					},
					error : function(xhr, status, err) {
						alert(err);
					}
				});

	}</script>
</head>
<body>


	<form>
		<label><u>Student enrollment</u></label>
		<table align="center">
			<tr>
				<td width="235">Select list</td>
				<td width="316"><select id="List">
						<option value="1">2016-2017</option>
						<option value="2">2017-2018</option>
				</select></td>
			</tr>
			<tr>
				<td>Class/Grade</td>
				<td><select>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="2">3</option>
						<option value="2">4</option>
						<option value="2">5</option>
				</select></td>
			</tr>
			<tr>
				<td><b><u>Previous Schooling:</u></b></td>
				<td><input type="radio" name="Yes" value="Yes"
					onclick="disable()" id="Yes" checked>Yes<br> <input
					type="radio" name="Yes" value="No" onclick="disable()" id="No">No<br></td>
			</tr>
		</table>
		<table width="565" align="center" id="previousSchoolInfo">

			<tr>
				<td width="235">Previous School Name</td>
				<td width="318"><input type="text" id="pschoolname"></td>
			</tr>
			<tr>
				<td>Category of School</td>
				<td><select>
						<option value="1">Public</option>
						<option value="2">Academic</option>
						<option value="2">Private</option>
				</select></td>
			</tr>
			<tr>
				<td>Previous School Grade</td>
				<td><input type="text" id="Grade"></td>
			</tr>
			<tr>
				<td>Previous Grade Percentile/Marks</td>
				<td><input type="text" id="Percentile/Marks"></td>
			</tr>
		</table>

		<table align="center">
			<tr>
				<td width="236"><u><strong>Student Information:</strong></u></td>
			</tr>

			<tr>
				<td>Student’s Legal First Name</td>
				<td><input type="text" id="firstName"></td>
			</tr>
			</tr>
			<tr>
				<td>Student’s Legal Middle Name</td>
				<td><input type="text" id="middleName"></td>
			</tr>
			</tr>
			<tr>
				<td>Student’s Legal Last Name</td>
				<td><input type="text" id="lastName"></td>
			</tr>
			</tr>
			<tr>
				<td>Student’s Preferred Name</td>
				<td><input type="text" id="preferredName"></td>
			</tr>
			</tr>
			<tr>
				<td>Address Line 1</td>
				<td><input type="text" id="address1"></td>
			</tr>
			</tr>
			<tr>
				<td>Address Line 2</td>
				<td><input type="text" id="address2"></td>
			</tr>
			
			<tr>
				<td>Town/City</td>
				<td><input type="text" id="city"></td>
			</tr>
			</tr>
			<tr>
				<td>District/County</td>
				<td><input type="text" id="district"></td>
			</tr>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" id="state"></td>
			</tr>
			</tr>
			<tr>
				<td>Home Phone</td>
				<td><input type="text" id="homePhone"></td>
			</tr>
			</tr>
			<tr>
				<td>Cell Phone</td>
				<td><input type="text" id="cellPhone"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" id="email"></td>
			</tr>
			<tr>
				<td>zipCode/PostalCode</td>
				<td><input type="text" id="zipCodeOrPostalCode"></td>
			</tr>
		</table>
		<table width="564" align="center">
			<tr>
				<td><u><strong>Emergency Contacts:</strong></u></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><input type="text" id=eName></td>
			</tr>
			<tr>
				<td>Relationship</td>
				<td><input type="text" id=relationship></td>
			</tr>
			<tr>
				<td>Landline</td>
				<td><input type="text" id=landline></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><input type="text" id=mobileNumber></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" id=email></td>
			</tr>

<button type="button" id="submit" onclick="save()">saveDetails</button>
		</table>
</body>
</html>
