<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/EditShopWeb/join.do" method="post">
	id : <input type="text" name="id" id="id"><input type="button" onclick="checkId()" id="idcheckbtn" value="check"><br>
	pw : <input type="password" name="password"><br>
	re-pw : <input type="password"><br>
	email : <input type="email" name="email"><input type="button" onclick="checkEmail()"><br>
	<input type=submit value="회원가입">
</form>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script> 
<script type="text/javascript">
$(document).ready(function(){
	
});
var checkId = function(){
	$.ajax({
		url : "/EditShopWeb/existuserid.do"
		,type : "get"
		,data : {
			id : $("#id").val()
		}
		,success : function(exist){
			if(!exist){
				existId("사용할수 없는 아이디 입니다.");
			}
			existId("사용할수 있는 아이디입니다.");
		}
		,error : function(){
			alert("test")
		}
	});
}


var existId = function(info){
	alert(info);
	$("#idcheckbtn").append("div"+info+"</div>");
}
</script>
</html>