<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

product
<c:forEach var="product" items="${products }">
${product.productId }
${product.sellerId }
${product.maxQuantity }
${product.sellCnt }
${product.option }
${product.commission }
${product.imagePath }
${product.status }
${product.name }
${product.content }

</c:forEach>

</body>
</html>