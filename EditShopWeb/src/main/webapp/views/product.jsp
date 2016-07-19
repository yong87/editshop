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
          <div class="title">
            <h1><a href="#">Category Name</a></h1>
            <section class="tiles">
              
              <article class="style1">
                <span class="image">
                  <img src="http://placehold.it/150x150" alt="" />
                </span>
                <a href="generic.html">
                  <h2>ProductName</h2>
                  <div class="contents">
                    <p>ProductInfo</p>
                  </div>
                </a>
              </article>
              <article class="style2">
                <span class="image">
                  <img src="http://placehold.it/150x150" alt="" />
                </span>
                <a href="generic.html">
                  <h2>ProductName</h2>
                  <div class="contents">
                    <p>ProductInfo</p>
                  </div>
                </a>
              </article>
              <article class="style2">
                <span class="image">
                  <img src="http://placehold.it/150x150" alt="" />
                </span>
                <a href="generic.html">
                  <h2>ProductName</h2>
                  <div class="contents">
                    <p>ProductInfo</p>
                  </div>
                </a>
              </article>
            </section>
          </div>
          <div class="title">
            <section class="tiles">
              
              <article class="style1">
                <span class="image">
                  <img src="http://placehold.it/150x150" alt="" />
                </span>
                <a href="generic.html">
                  <h2>ProductName</h2>
                  <div class="contents">
                    <p>ProductInfo</p>
                  </div>
                </a>
              </article>
              <article class="style2">
                <span class="image">
                  <img src="http://placehold.it/150x150" alt="" />
                </span>
                <a href="generic.html">
                  <h2>ProductName</h2>
                  <div class="contents">
                    <p>ProductInfo</p>
                  </div>
                </a>
              </article>
              <article class="style2">
                <span class="image">
                  <img src="http://placehold.it/150x150" alt="" />
                </span>
                <a href="generic.html">
                  <h2>ProductName</h2>
                  <div class="contents">
                    <p>ProductInfo</p>
                  </div>
                </a>
              </article>
            </section>
          </div>
          <div>paging 1.2.3.4.5</div>
          
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