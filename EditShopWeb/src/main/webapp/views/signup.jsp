<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }/views/"
	scope="request" />
<!DOCTYPE HTML>
<html>
	<head>
		<title>8Round</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="${cpath }assets/css/main.css" />
    <link rel="stylesheet" href="${cpath }assets/css/another.css" />
	</head>
	<body class="single">

    <!-- Wrapper -->
    <div id="wrapper">
      
      <!-- Header -->
      <header id="header">
        <h1><a href="/EditShopWeb/main.do">8Round</a></h1>
        <nav class="links">
          <ul>
            <li><a href="#" onclick="menuclick('men')" class="catebtn">men</a></li>
            <li><a href="#" onclick="menuclick('women')" class="catebtn">women</a></li>
            <li><a href="#" onclick="menuclick('acc')" class="catebtn">accessory</a></li>
            <li><a href="#" onclick="menuclick('etc')" class="catebtn">etc</a></li>
            <li><a href="#">Community</a></li>
          </ul>
        </nav>
        <nav class="links subcategory">
          <ul>
            <li>sss</li>
            <li>sss</li>
            <li>sss</li>
            <li>sss</li>
          </ul>
        </nav>
        <nav class="links subcategory">
          <ul>
            <li>aaa</li>
            <li>aaa</li>
            <li>aaa</li>
            <li>aaa</li>
          </ul>
        </nav>
        <nav class="links subcategory">
          <ul>
            <li>ddd</li>
            <li>ddd</li>
            <li>ddd</li>
            <li>ddd</li>
          </ul>
        </nav>
        <nav class="links subcategory">
          <ul>
            <li>vvv</li>
            <li>vvv</li>
            <li>vvv</li>
            <li>vvv</li>
          </ul>
        </nav>
        <nav class="main">
          <ul>
            <li class="menu">
              <a class="fa-bars" href="#menu">Menu</a>
            </li>
          </ul>
        </nav>
        
      </header>
      
      <!-- Menu -->
      <section id="menu">
        
        <!-- Search -->
        <section>
        <!-- empty area -->
        </section>
        <!-- Actions -->
        <section class="useraction">
          <c:if test="${sessionScope.user eq null}">
          <ul class="actions vertical">
            <li><a href="/EditShopWeb/views/login.jsp" class="button big fit">Log In</a></li>
            <li><a href="/EditShopWeb/views/signup.jsp" class="button big fit">Sign Up</a></li>
          </ul>
        </c:if>
        <c:if test="${sessionScope.user ne null }">
          <ul class="actions vertical">
            <li><a href="/EditShopWeb/logout.do" class="button big fit">Log Out</a></li>
          </ul>
          <ul class="actions vertical">
            <li><a href="/EditShopWeb/mypage.jsp" class="button big fit">My Info</a></li>
          </ul>
        </c:if>
        </section>
        
      </section>
      
      <!-- Main -->
      <div id="main">
        
        <!-- Post -->
        <article class="post">
          <header>
            
          </header>
          <!-- new Arrival-->
         <h1>Sign Up</h1>
         <form action="/EditShopWeb/join.do" method="POST">
          <table>
            <tr>
              <td>ID</td>
              <td><input type="text" name="id" id="id" placeholder="use your id">
              <input type="button" onclick="checkId()" id="idcheckbtn" value="check">
              </td>
            </tr>
            <tr>
              <td>Email</td>
              <td><input type="email" name="email" placeholder="your@email.com" id="email"></td>
            </tr>
            <tr>
              <td>PW</td>
              <td><input type="password" name="password" placeholder="input your password" id="pwd"></td>
            </tr>
            <tr>
              <td></td>
              <td><input type="password" placeholder="repeat your password" id="rpwd"></td>
            </tr>
          </table>
          <input type="submit" value="가입">
          </form>
        </article>
      </div>
      
      <!-- Footer -->
      <section id="footer">
        <ul class="icons">
          <li><a href="#" class="fa-twitter"><span class="label">Twitter</span></a> </li>
          <li><a href="#" class="fa-facebook"><span class="label">Facebook</span></a> </li>
          <li><a href="#" class="fa-instagram"><span class="label">Instagram</span> </a></li>
          <li><a href="#" class="fa-rss"><span class="label">RSS</span></a></li>
          <li><a href="#" class="fa-envelope"><span class="label">Email</span></a>  </li>
        </ul>
        <p class="copyright">&copy; Untitled. Design: <a  href="http://html5up.net">HTML5 UP</a>. Images: <a  href="http://unsplash.com">Unsplash</a>.</p>
      </section>
      
    </div>
    
    <!-- Scripts -->
    <script src="${cpath }assets/js/jquery.min.js"></script>
    <script src="${cpath }assets/js/skel.min.js"></script>
    <script src="${cpath }assets/js/util.js"></script>
    <script src="${cpath }assets/js/main.js"></script>
    <script src="${cpath }assets/js/another.js"></script>
    <script type="text/javascript">
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
    			if(exist){
    				existId("사용할수 있는 아이디입니다.");
    			}
    		}
    		,error : function(){
    			alert("test")
    		}
    	});
    }


    var existId = function(info){
    	alert(info);
    	$("#idcheckbtn").append("<div>"+info+"</div>");
    }

    
   $(document).keyup(event, function(){
	   console.log(event.keyCode);
		   var isId = document.getElementById("id");
		   var isPwd = document.getElementById("pwd");
		   var isRpwd = document.getElementById("rpwd"); 
		   var isEmail = document.getElementById("email");
	   if(event.keyCode == 13){
		   if(isId.value == ''){
			   isId.focus();
			   return false;
		   }
		   if(isPwd == ''){
			   isPw.focus();
			   return false;
		   }
		   if(isRpwd == ''){
			   isRpwd.focus();
			   return false;
		   }
		   if(isEmail == ''){
			   isEmail.focus;
			   return false;
		   }
	   }
	   
   })
    </script>
  </body>
</html> 