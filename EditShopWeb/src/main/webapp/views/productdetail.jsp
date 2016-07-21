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
            <li><a href="#">sss</a></li>
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
          <c:if test="${sessionScope.user eq null}">
          <ul class="actions vertical">
            <li><a href="/EditShopWeb/views/login.jsp" class="button big fit">Log In</a></li>
            <li><a href="/EditShopWeb/views/signup.jsp" class="button big fit">Sign Up</a></li>
          </ul>
        </c:if>
        <c:if test="${sessionScope.user ne null }">
        ${user.id }님!
          <ul class="actions vertical">
            <li><a href="/EditShopWeb/logout.do" class="button big fit">Log Out</a></li>
          </ul>
          <ul class="actions vertical">
            <li><a href="/EditShopWeb/views/mypage.jsp" class="button big fit">My Info</a></li>
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
          <h1>Product Detail</h1>
          
          <table>
            <tr>
              <td><img src="${product.productSimple.thumbnail }"></td>
              <td>
              <form action="/EditShopWeb/buyProduct.do" method="post">
                <table>
                  <tr>
                    <td>
                    	<input type="hidden" name="productId" value="${product.productId }">
                    	제품 이름
                    </td>
                    <td>
                    	<input type="text" value="${product.languageList.kor.name }" name="name" readonly> 
                    </td>
                  </tr>
                  <tr>
                    <td>productType</td>
                    <td>${product.productSimple.type }</td>
                  </tr>
                  <tr>
                    <td>Product Cost</td>
                    <td>
                    	<input type="text" value="${product.productSimple.price }" name="price" readonly>
                    </td>
                  </tr>
                  <tr>
                    <td>Product Option</td>
                    <td>
                      <select name="option" id="optiontag">
                      	<option value="select" selected>--select--</option>
                      </select>
                    </td>
                  </tr>
                  <tr>
                    <td>
                    	Product Seller
                    	
                    </td>
                    <td><input type="text" name="sellerId" value="${product.sellerId }" readonly></td>
                  </tr>
                  <tr>
                    <td>Buy Count</td>
                    <td><input type="number" value="0" max="10" id="buyCount" maxlength="10" name="sellcnt"></td>
                  </tr>
                  <tr>
                  <c:if test="${sessionScope.user eq null}">
                  	<td colspan="2">
                  		로그인을 하시면 구매하실수 있습니다.
                  	</td>
                  </c:if>
                  <c:if test="${sessionScope.user ne null}">
                  	<td colspan="2">
                  		<input type="button" value="장바구니 담기" onclick="addBucket(${product.productId})">
                  		<input type="submit" value="구매하기">
                  	</td>
                  </c:if>
                  </tr>
                </table>
                </form>
              </td>
            </tr>
            <tr>
              <td colspan="2">Product Infomation</td>
            </tr>
            <tr>
              <td colspan="2">
                <table>
                  <tr>
                    <td><img src="http://placehold.it/250x250" class="infoimg"></td>
                    <td>infomation text</td>
                  </tr>
                  <tr>
                    <td>infomation text</td>
                    <td><img src="http://placehold.it/250x250" class="infoimg"></td>
                  </tr>
                </table>
              </td>
              <tr>
              <td colspan="2">Review</td>
            </tr>
          </table>
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
    
    var imgpaths = '${product.imagepath}';
    var imgsplit = imgpaths.split(',');
    
    var tagImg = document.getElementsByClassName('infoimg');
    var i = 0;
    for(i; i<tagImg.length;i++){
    	tagImg[i].src = imgsplit[i];
    	if(imgsplit[i] == ''){
    		tagImg[i].src = 'http://placehold.it/30x30';
    	}
    }

    var optionvalue = '${product.option}';
    var optionsplit = optionvalue.split(',');
    var optiontag = document.getElementById('optiontag');
		var i = 0;
		for(i;i<optionsplit.length;i++){
			var option = document.createElement('option');
			
			option.text = optionsplit[i].trim();
			option.value = optionsplit[i].trim();
			optiontag.add(option, optiontag[1]);
		}
    
    var addBucket = function(item){
    	var isUser =  '${sessionScope.user}';
    	var buyCount = document.getElementById("buyCount").value;
      console.log(isUser);
    	if(isUser != ''){
					$.ajax({
							url : "/EditShopWeb/addBucket.do"
					   ,type : "get"
					   ,data : {
						   productId : item
						   ,buycount : buyCount
					   }
					   ,success : console.log("ssss") 
					   ,error : function(){
				    			alert("test")
					   }					
					});
        }
    	else{
        alert("로그인을 해주세요.");
    	}
    }
    
    </script>
  </body>
</html> 