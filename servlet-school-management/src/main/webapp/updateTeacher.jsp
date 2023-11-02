<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="updatedTeacher" method="post">
TeacherId:<input type="number" name="teacherId" value="<%=request.getParameter("id")%>"> <br><br>
UpdatedName:<input type="text" name="teachername"><br><br>
UpdatedEmail:<input type="text" name="teacheremail"><br><br>
<input type="submit">

</form>
</body>
</html>