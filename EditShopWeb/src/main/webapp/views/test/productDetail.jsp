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
	<img src="${product.imagepath }" onclick="detailView('${product.productId}')">
	<br> ${product.status }
	<br> ${product.name }
	<br> ${product.content }
	<br> ${product.languageList.kor.name }
	<br> ${product.languageList.kor.address }
	<br>

	<select id="productCnt">
		<option value="select">select</option>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
	</select>
	<input type="button" value="addBucket"
		onclick="addBucket('${product.productId}')" id="bucketbtn">
	<br>
	<br>${review.content }
	<br>${review.hate }
	<br>${review.like }
	<br>${review.ordernumber }
	<br>${review.point }
	
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	<script type="text/javascript">
		var addBucket = function(items) {
			var cnt = $("#productCnt").val();
			$.ajax({
				url : '/EditShopWeb/addBucket.do',
				type : 'get',
				data : {
					productId : items,
					productCnt : cnt 
				},
				success : function(ask) {
					changeBtn(ask);
				},
				error : function() {
					alert("fail");
				}
			});
		}
		
		var changeBtn = function(ask){
			if(!ask){
				$("#bucketbtn").val("추가하지 못하였습니다.");
			}
			$("#bucketbtn").val("추가하였습니다.");
		}
	</script>
</body>
</html>