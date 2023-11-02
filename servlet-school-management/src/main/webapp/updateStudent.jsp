<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updated" method="post">
StudentId:<input type="number" name="studentId" value="<%=request.getParameter("id")%>"> <br><br>
UpdatedName:<input type="text" name="studentname"><br><br>
UpdatedEmail:<input type="text" name="studentemail"><br><br>
<input type="submit">

</form>
</body>
</html>