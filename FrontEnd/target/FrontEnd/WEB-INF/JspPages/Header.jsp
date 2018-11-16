<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link  href="<c:url value="/Resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>"rel="stylesheet" type="text/css" media="all"/></link>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<!-- Latest compiled Jav	aScript -->
<script src="<c:url value="/Resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>"></script>
</head>
<body>
<div class="container-fluid">
<nav class="navbar navbar-inverse" id="navbar-bg">
<div class="navbar-header">
				<a href="" class="navbar-brand"><%-- <img alt="" src="<c:url value="/Resources/images/BrandImage.jpg"   />"></img> --%></a>&nbsp;&nbsp;&nbsp;
				<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#navbardemo" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
</div>
<div class="collapse navbar-collapse" id="navbardemo">
<ul class="nav navbar-nav">
<li><a href="<c:url value="/"></c:url>"><span class="glyphicon glyphicon-home"></span>Home</a></li>
<li><a href="all/getallproducts"> Browse all products</a>
<li><a href="aboutus">AboutUs</a></li>
<li><a href="ContactUs">Contact Us</a>
<li><a href="<c:url value='/admin/getproductform'></c:url>"><span class="glyphicon glyphicon-plus"></span>Add Product</a></li>
<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Select By Category<span class="caret"></span></a>&nbsp;&nbsp;&nbsp;&nbsp;
					
				<ul class="dropdown-menu">
				<li><a href="#">Super Bikes</a></li>
				<li><a href="#">Choppers</a><li>
				<li><a href="#">Dirt bikes</a></li>
				</ul>
</li>
<li><a href="#"><span class="glyph glyphicon-user"></span>Sign Out</a></li>		
<li><a href="#"><i class="glyph glyphicon-login"></i>Sign In</a></li>
<div class="input-group">
    <input type="text" class="form-control" placeholder="Search">
    <div class="input-group-btn">
      <button class="btn btn-primary" type="submit">
        <i class="glyphicon glyphicon-search"></i>
      </button></div>
</ul>
</div>
</nav>

</div>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"><body>

</body>
</html>