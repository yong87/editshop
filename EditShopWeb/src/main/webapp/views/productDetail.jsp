<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	${product.productId }
	<br> ${product.sellerId }
	<br> ${product.maxQuantity }
	<br> ${product.sellcnt }
	<br> ${product.option }
	<br> ${product.commission }
	<br>
	<img src="${product.imagepath }"
		onclick="detailView('${product.productId}')">
	<br> ${product.status }
	<br> ${product.name }
	<br> ${product.content }
	<br> ${product.languageList.kor.name }
	<br> ${product.languageList.kor.address }
	<br>

	<input type="button" value="addBucket"
		onclick="addBucket('${product.productId}')" id="bucketbtn">
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	<script type="text/javascript">
		var addBucket = function(items) {
			console.log(items);

			$.ajax({
				url : '/EditShopWeb/addBucket.do',
				type : 'get',
				data : {
					productId : items
				},
				succcess : function(ask) {
					console.log(ask);
				},
				error : function() {
					alert("fail");
				}
			});
		}
	</script>
</body>
</html>