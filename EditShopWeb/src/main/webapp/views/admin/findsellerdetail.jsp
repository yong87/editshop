<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>8Round</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="/assets/css/main.css" />
    <link rel="stylesheet" href="/assets/css/another.css" />
	</head>
	<body class="single">

    <!-- Wrapper -->
    <div id="wrapper">
      
      <!-- Header -->
      <header id="header">
        <h1><a href="#">8Round</a></h1>
        <nav class="links">
          <ul>
            <li><a href="#" class="catebtn" onclick="menuclick('user')">User Management</a></li>
            <li><a href="#" class="catebtn" onclick="menuclick('seller')">Seller Management</a></li>
            <li><a href="#" class="catebtn" onclick="menuclick('product')">Product Management</a></li>
            <li><a href="#">Schedule Calculate</a></li>
            <li><a href="#">Write Notice</a></li>
            <li><a href="#">Report</a></li>

          </ul>
        </nav>
         <nav class="links subcategory">
          <ul>
            <li>Search User</li>
            <li>Sanction User</li>
          </ul>
        </nav>
        <nav class="links subcategory">
          <ul>
            <li>Request Seller</li>
            <li>Search Seller</li>
            <li>Sanction Seller</li>
          </ul>
        </nav>
        <nav class="links subcategory">
          <ul>
            <li>Request Product</li>
            <li>Request Modify Product</li>
            <li>Sanction Product</li>
            <li>Search Product</li>
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
          <h1>Seller Detail</h1>
          <table>
            <tr>
              <td>ID</td>
              <td>SellerId</td>
            </tr>
            <tr>
              <td>Email</td>
              <td>Seller Email</td>
            </tr>
            <tr>
              <td>Telephone</td>
              <td>010-0000-0000</td>
            </tr>
            <tr>
              <td>Company Name</td>
              <td>company</td>
            </tr>
            <tr>
              <td>Compnay Address</td>
              <td>Address</td>
            </tr>
            <tr>
              <td>Favorite Parcel Service</td>
              <td>sss</td>
            </tr>
            <tr>
              <td>License Number</td>
              <td>00000000000</td>
            </tr>
            <tr>
              <td>Seller Status</td>
              <td>normality</td>
            </tr>
            <tr>
              <td>Sales Product</td>
              <td>10count</td>
            </tr>
          </table>
          <input type="button" value="3Days">
          <input type="button" value="Weeks">
          <input type="button" value="Month">
          <input type="button" value="Forever">
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
    <script src="/assets/js/jquery.min.js"></script>
    <script src="/assets/js/skel.min.js"></script>
    <script src="/assets/js/util.js"></script>
    <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
    <script src="/assets/js/main.js"></script>
    <script src="/assets/js/another.js"></script>
    <script type="text/javascript">
    
    </script>
  </body>
</html> 