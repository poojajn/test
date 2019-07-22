<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title></title>
<style type="text/css">
<!--
.Estilo1 {
	font-weight: bold
}

.Estilo9 {
	font-size: 14px;
	font-style: italic;
}
-->
</style>
</head>
<body>
<form name="studentRegisterform">

<span class="Estilo1">
<label>
</label>
</span>
<label><div align="center">
				<strong><u>STUDENT REGISTRATION FROM</u></strong>
			</div>
</label>
<table width="531" align="center">
  <th width="226" height="21"><div align="left">
					<span class="Estilo9">STUDENT PROFIL DETAILS:</span>
				</div></th>
  <tr></tr>
  <tr>
				<td>Student’s Legal First Name</td>
  <td width="293"><input type="text" id="sfirstname" required /></td> 
  </tr>
    <tr>
				<td>Student’s Legal Middle Name</td>
  <td><input type="text" id="smiddlename" /></td> 
    </tr>
    <tr>
				<td>Student’s Legal Last Name</td>
  <td><input type="text" id="slastname" /></td> 
    </tr>
   
    <tr>
				<td>Student’s Preferred Name</td>
  <td><input type="text" id="spreferredname" /></td> 
   
			<tr>
				<td>Gender</td>
  <td>Female<input type="radio" name="sgender" id="female" value="F"/> Male
    <input type="radio" name="sgender" id="male" value="M"/></td>
    </tr>
								   <tr>
				<td>DateofBirth</td>
  <td><input type="text" id="sdateofbirth" />(DD/MM/YYYY)</td> 
    </tr>
									   <tr>
				<td>Place Of Birth</td>
  <td><input type="text" id="splaceofbirth" /></td> 
    </tr>
	 <tr>
				<td height="25">Student Race</td>
  <td><select id="sStudentrace">
  <option value="W">White</option>
  <option value="B">Black</option>
  <option value="A">Asian</option>
   </select></td> 
    </tr>
										   <tr>
				<td>Student Live with</td>
  <td><input type="text" id="slivewith" /></td> 
    </tr>
									   <tr>
				<td>Aadhar Card</td>
  <td><input type="text" id="saadharcard" /></td> 
    </tr>
										   <tr>
				<td>Religion</td>
  <td><input type="text" id="sreligion" /></td> 
    </tr>
											   <tr>
				<td>Caste</td>
  <td><input type="text" id="scaste" /></td> 
    </tr>
											   <tr>
				<td>Category</td>
  <td><input type="text" id="scategory" /></td> 
    </tr>
												   <tr>
				<td>RTE Candidate</td>
  <td>Yes<input type="radio" name="sRTEcandidate" id="RTEyes" value="Y"/>No<input
					type="radio" name="sRTEcandidate" id="RTEno" value="N"/></td>
    </tr>	
<tr>
			</tr>	
    <tr>
				<td>Address Line 1</td>
  <td><input type="text" id="saddress1" /></td> 
    </tr>	
	   <tr>
				<td>Address Line 2</td>
  <td><input type="text" id="saddress2" /></td> 
    </tr>
	   <tr>
				<td>Address Line 3</td>
  <td><input type="text" id="saddress3" /></td> 
    </tr>
		   <tr>
				<td>Town/City</td>
  <td><input type="text" id="stownORcity" /></td> 
    </tr>
		   <tr>
				<td>District</td>
  <td><input type="text" id="sdistrict" /></td> 
    </tr>
			   <tr>
				<td>State</td>
  <td><input type="text" id="sstate" /></td> 
    </tr>
				   <tr>
				<td>State</td>
  <td><input type="text" id="sstate" /></td> 
    </tr>
					   <tr>
				<td>Country</td>
  <td><input type="text" id="scountry" /></td> 
    </tr>
						   <tr>
				<td>	Zip code/Postal Code</td>
  <td><input type="text" id="spostalcode" /></td> 
    </tr>
					   <tr>
				<td>Home Phone Number</td>
  <td><input type="text" id="shomephone" /></td> 
    </tr>
						   <tr>
				<td>Mobile Number</td>
  <td><input type="text" id="smobilenumber" /></td> 
    </tr>

</table>
<table width="133" align="center">
 <td width="58"><a href="">Next</a></td>
<td width="63"><input type="button" value="Save" id="ssave" onclick="saveStudentProfile()" /></td>
</table>
</form>
</body>
<title>Insert title here</title>
		<script src="https://code.jquery.com/jquery-3.1.1.js">	
</script>
<script type="text/javascript">


function saveStudentProfile() {
	var gender=document.studentRegisterform.sgender.value;
	var RTEcandidate=document.studentRegisterform.sRTEcandidate.value;
	
	var jsonData={
			"studentFirstName" : $('#sfirstname').val(),
			"studentMiddleName" : $('#smiddlename').val(),
			"studentLastName" : $('#slastname').val(),
			"studentPreferredName" : $('#spreferredname').val(),
			"gender" : gender,
		/* 	"studentDateOfBirth" : new Date($('#sdateofbirth').val()), */
			"studentPlaceOfBirth" : $('#splaceofbirth').val(),
			"studentRace" : $('#sStudentrace').val(),
			"studentLiveWith" : $('#slivewith').val(),
			"studentAadharCard" : $('#saadharcard').val(),
			"studentReligion" : $('#sreligion').val(),
			"studentCaste" : $('#scaste').val(),
			"studentCategory" : $('#scategory').val(),
			"studentRTECandidate" : RTEcandidate,
			"studentAddressLine1" : $('#saddress1').val(),
			
			"studentAddressLine2" : $('#saddress2').val(),
			"studentAddressLine3" : $('#saddress3').val(),
			"studentCityOrTown" : $('#stownORcity').val(),
			"studentDistrict" : $('#sdistrict').val(),
			"studentState" : $('#sstate').val(),
			"studentCountry" : $('#scountry').val(),
			
			"studentPostalOrZipCode" : $('#spostalcode').val(),
			"studentHomePhoneNumber" : $('#shomephone').val(),
			"studentMobileNumber" : $('#smobilenumber').val(),
			
	};

		var stringifyVar = JSON.stringify(jsonData);
		alert(stringifyVar);
		$.ajax({
					url : "../enrollmentProject/save_student_profile",
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

	}

</script>
</html>