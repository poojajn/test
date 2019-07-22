<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
		<script src="../javascript/jquery-3.1.1.min.js">	
</script>
<script type="text/javascript">
function save() {
var jsonData={
		"uname" : $('#uname').val(),
		"psw" : $('#psw').val(),
};

	var stringifyVar = JSON.stringify(jsonData);
	alert(stringifyVar);
	$.ajax({
				url : "../login/user",
				type : "POST",
				data : stringifyVar,
				dataType : "json",
				contentType : "application/json; charset=utf-8",
				success : function(response) {
				alert(response.uname);
					
				},
				error : function(xhr, status, err) {
					alert(err);
				}
			});

}

</script>
</head>
<body>
<form>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
 <label><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" id="uname" required>

    <label><b>Password</b></label>
    <input type="text" placeholder="Enter Password" name="psw" id="psw" required>

    <button type="button" id="submit" onclick="save()">Login</button>
</form>
</body>
</html>