/**
 * 
 */
function disable() {
		if (document.getElementById("No").value == "No") {
			document.getElementById("previousSchoolInfo").style.display = "none";
		} else if (document.getElementById("Yes").value == "Yes") {
			document.getElementById("previousSchoolInfo").style.display = "block";
		}

	}
	
/*	
	
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

		}*/