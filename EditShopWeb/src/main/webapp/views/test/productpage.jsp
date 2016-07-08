<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="product" items="${products }">
		<a href="/EditShopWeb/productDetail.do?productId=${product.productId }">${product.productId }</a>
		<br>
${product.sellerId }<br>
${product.maxQuantity }<br>
${product.sellcnt }<br>
${product.option }<br>
${product.commission }<br>
		<img src="${product.imagepath }" onclick="detailView('${product.productId}')">
		<br>
${product.status }<br>
${product.name }<br>
${product.content }<br>
${product.languageList.kor.name }<br>
${product.languageList.chn.address }<br>

		<br>
	</c:forEach>
</body>
</html>