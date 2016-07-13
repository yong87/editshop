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
        <h1><a href="#">8Round</a></h1>
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
          
        </section>
        
        <!-- Actions -->
        <section class="useraction">
          <ul class="actions vertical">
            <li><a href="#" class="button big fit">Log In</a></li>
          </ul>
          <ul class="actions vertical">
            <li><a href="#" class="button big fit">Log Out</a></li>
          </ul>
          <ul class="actions vertical">
            <li><a href="#" class="button big fit">My Info</a></li>
          </ul>
        </section>
        
      </section>
      
      <!-- Main -->
      <div id="main">
        
        <!-- Post -->
        <article class="post">
          <header>
            
          </header>
          <!-- new Arrival-->
      	  <h2>가입을 환영합니다.</h2>
          8ROUND에 가입을 환영합니다.<br>
        	 지금 입력하시는 정보는 추가 정보로써 배송시 외에는 사용하지 않습니다.
        	 또한 닉네임과 선호언어를 설정하실수 있습니다.
          <form action="/EditShopWeb/aftercertification.do" method="POST">
            <table>
              <tr>
                <td>닉네임</td>
                <td><input type="text" name="nickname"></td>
              </tr>
              <tr>
                <td>이름</td>
                <td><input type="text" name="name"></td>
              </tr>
              <tr>
                <td>주소</td>
                <td><input type="text" name="address"></td>
              </tr>
              <tr>
                <td>연락처</td>
                <td><input type="text" name="phone"></td>
              </tr>
              <tr>
                <td>선호 언어</td>
                <td>
                  <select name="language">
                    <option>--select--</option>
                    <option value="eng">English</option>
                    <option value="kor">Korean</option>
                    <option value="jpn">Japanese</option>
                    <option value="chn">Chinese</option>
                  </select>
                </td>
              </tr>
              <tr>
                <td colspan="2"><input type="submit" value="가입완료"></td>
              </tr>
            </table>
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
    
    </script>
  </body>
</html> 