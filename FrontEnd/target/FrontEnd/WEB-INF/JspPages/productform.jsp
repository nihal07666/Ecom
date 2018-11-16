<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="Header.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- using action attribute we are going to call handler method -->
<div class="container">
<c:url value='/admin/addproduct' var="url"></c:url>

<form:form action="${url}" method="post" modelAttribute="product"  enctype="multipart/form-data"><!-- newly created product object -->
	<table>
	
		<tr>
			<td>Enter Product Name</td>
			<td>
			<form:input path="productName"/>
			<form:errors path="productName" cssStyle="color:red"></form:errors>
			
			
			</td>
		</tr>
        <tr>
			<td>Enter Product Description</td>
			<td>
			<form:textarea path="description"/>
			<form:errors path="description" cssStyle="color:red"></form:errors>
			
			</td>
		</tr>
        <tr>
			<td>Enter Product Price</td>
			<td>
			<form:input path="price"/>
			<form:errors path="price" cssStyle="color:red"></form:errors>
			
			</td>
		</tr>
		
		<tr>
			<td>Enter Product Quantity</td>
			<td>
			<form:input path="quantity"/>
			<form:errors path="quantity" cssStyle="color:red"></form:errors>
			
			</td>
		</tr>

	
		<tr>
		<td>Select Category</td>
		<td><form:select path="category.id"><!-- product.category.id=6 -->
		<c:forEach items="${categories}" var="c">
		<form:option value="${c.id }">${c.categoryname}</form:option>
		</c:forEach>
		
		
		
		
		
		
		
		<%-- <form:option value="1">Furniture</form:option>
		<form:option value="2">Educational books</form:option>
		<form:option value="3">Electronic items</form:option>
		<form:option value="4">Kids</form:option>
		<form:option value="5">Clothes</form:option>
		<form:option value="6">Others</form:option> --%>
		</form:select>
		<form:errors path="category" cssStyle="color:red"></form:errors>
		</td>
		</tr>
		<tr>
		<td>Upload an image</td>
		<td><form:input type="file" path="image" ></form:input></td>
		</tr>
		
		<tr><td>
		<input type="submit" value="Add Product">  </td>
		<td></td>
		</tr>
		
	
		</table></form:form></div></body></html>