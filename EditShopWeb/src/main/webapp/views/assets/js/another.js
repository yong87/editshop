/* menu */
var menuclick = function(v){
  var menu = document.getElementsByClassName("subcategory");   
  if(v == "men"){
    menu[0].classList.toggle("show");
  }
  if(v == "women"){
    menu[1].classList.toggle("show");
  }
  if(v == "acc"){
    menu[2].classList.toggle("show");
  }
  if(v == "etc"){
    menu[3].classList.toggle("show");
  }
  if(v == "user"){
    menu[0].classList.toggle("show");
  }
  if(v == "seller"){
    menu[1].classList.toggle("show");
  }
  if(v == "product"){
    menu[2].classList.toggle("show");
  }
}

window.onclick = function(event){
  console.log()
  if(!event.target.matches(".catebtn")){
    var menu = document.getElementsByClassName("subcategory");
    var i;
    for(i = 0;i<menu.length;i++){
      var openMenu = menu[i];
      if(openMenu.classList.contains('show')){
        openMenu.classList.remove('show');
      }
    }
  }
}

/* slide */
var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
        showSlides(slideIndex += n);
}

function currentSlide(n) {
  showSlides(slideIndex = n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("slides");
  var dots = document.getElementsByClassName("dot");
  if (n > slides.length) {
    slideIndex = 1
  }
  if (n < 1) {
    slideIndex = slides.length
  }
  ;
  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  for (i = 0; i < dots.length; i++) {
    dots[i].className = dots[i].className.replace(" active", "");
  }
  slides[slideIndex - 1].style.display = "block";
  dots[slideIndex - 1].className += " active";
}

