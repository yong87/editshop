<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
findID
<form action="/EditShopWeb/findId.do" method="post">
<input type="email" placeholder="existEmail" name="email">
<input type="text" placeholder="name" name="name">
<input type="submit" value="find">
</form>
findPW
<form action="/EditShopWeb/findPwd.do" method="post">
<input type="email" placeholder="existEmail" name="email">
<input type="text" placeholder="userId" name="userId">
<input type="submit" value="find">
</form>

</body>
</html>