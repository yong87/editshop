<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${sessionScope.user eq null }">
		<form action="/EditShopWeb/login.do" method="POST">
			<table>
				<tr>
					<td>id</td>
					<td><input type="text" placeholder="id" name="id"></td>
				</tr>
				<tr>
					<td>pw</td>
					<td><input type="password" placeholder="pw" name="pwd"></td>
				</tr>
			</table>
			<input type="submit" value="login">
		</form>
	</c:if>
	<c:if test="${sessionScope.user ne null }">
		${sessionScope.user.id }님
		<a href="/EditShopWeb/logout.do"><button>logout</button></a>
	</c:if>

	product
	<br>
	<c:forEach var="product" items="${productList }">
		<a
			href="/EditShopWeb/productDetail.do?productId=${product.productId }">${product.productId }</a>
		<br>
${product.sellerId }<br>
${product.maxQuantity }<br>
${product.sellcnt }<br>
${product.option }<br>
${product.commission }<br>
		<img src="${product.imagepath }"
			onclick="detailView('${product.productId}')">
		<br>
${product.status }<br>
${product.name }<br>
${product.content }<br>
${product.languageList.kor.name }<br>
${product.languageList.chn.address }<br>

		<br>
	</c:forEach>
	<c:forEach var="review" items="${reviews }">
	${review.content }<br>
	${review.hate }<br>
	${review.like }<br>
	${review.ordernumber }<br>
	${review.point }<br>
		<br>
	</c:forEach>

	<form action="/EditShopWeb/searchProduct.do" method="get">
		<select id="searchType" name="searchType">
			<option value="all">select</option>
			<option value="productName">Product Name</option>
			<option value="productType">Product Type</option>
			<option value="salesName">Sales Name</option>
		</select> <input type="text" placeholder="search" name="search">
		<input type="submit" value="Search">
	</form>


</body>
</html>