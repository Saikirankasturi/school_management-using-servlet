<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="teacherAuthorization" method="post">
Enter Id:<input type="number"  name="id" min="1" oninput="validity.valid||(value='');"> <br><br>
Enter password:<input type="password" name="password"><br><br>
<input type="submit" value="Submit">
</form>
</body>
</html>