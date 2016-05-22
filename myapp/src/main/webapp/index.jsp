<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

  <title>Bootstrap Demo</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>

</head>
<body>

<div>
<a href="register"><button type="button" class="btn btn-success">Register</button></a>
<a href="login"><button type="button" class="btn btn-success">Login</button></a>
</div>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src=<c:url value="/resources/Images/HeartRose.jpg" /> alt="HeartRose" width="450" height="230">
      </div>

      <div class="item">
        <img src=<c:url value="/resources/Images/rose.jpg" /> alt="Rose" width="450" height="230">
      </div>
    
      <div class="item">
        <img src=<c:url value="/resources/Images/roses.jpg" /> alt="Roses" width="450" height="230">
      </div>

    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

<div><br><br></div>

  <div class="row">
    <div class="col-sm-1" style="background-color:lavender;"></div>
    <div class="col-sm-2" style="background-color:lavender;"><a href="productsInfo?name=img1"><img src=<c:url value="/resources/Images/HeartRose.jpg" /> alt="HeartRose" width="150" height="150"></a></div>
    <div class="col-sm-2" style="background-color:lavenderblush;"><a href="productsInfo?name=img2"><img src=<c:url value="/resources/Images/rose.jpg" /> alt="rose" width="150" height="150"></a></div>
    <div class="col-sm-2" style="background-color:lavender;"><a href="productsInfo?name=img3"><img src=<c:url value="/resources/Images/roses.jpg" /> alt="roses" width="150" height="150"></a></div>
  </div>

<div>
<a href="productsInfo?name=all">All Products</a>
</div>

</body>
</html>
