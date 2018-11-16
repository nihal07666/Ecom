<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>The bike store</title>
</head>
<body>
<div class="container">
<div class="header">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ol class="carousel-indicators">
                <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#myCarousel" data-slide-to="1"></li>
                <li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
            </ol>
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                   <img  src="<c:url value="/Resources/images/img1.jpg" />"/>
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>WELCOME TO EXAMPLE.COM</h1>
                            <p>Here You can browse everything about Bikes</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="img img-circle" src="Resources/images/img2.jpg" alt="Second slide" height="250" width="300">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Best superbikes in town</h1>
                            <p>pure power</p>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img class="img-bordered" src="Resources/images/img3.jpg" alt="Third slide" height="250" width="300">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>The most electrifying form</h1>
                            <p>You cant buy happiness, but you can buy a bike and that's pretty close</p>
                        </div>
                    </div>
                </div>
                 <div class="item">
                    <img class="img-thumbnail" src="images/img4.jpg" alt="forth slide" height="250" width="300">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Any bike can be a "cool" bike</h1>
                            <p>your life,your bike...you own it!!</p>
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
            </a>
            <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right" ></span>
                <span class="sr-only">Next</span>
            </a>
        </div></div></div>


</body>
</html>
