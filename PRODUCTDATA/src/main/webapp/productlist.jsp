<%@page import="com.project.Product"%>
<%@page import="com.project.ProductDao"%>
<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
  <title>List of Products</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    
</head>
<body>

<h1 class="text-center font-italic mb-1">List of Available Products...</h1>

<a class="btn btn-success mt-5" href="add-product.html">
  			  Save Product
</a>

<div>
    <c:if test="${deleteResult}">
    <p class="btn btn-success mt-5">Data Deleted Successfully
    </c:if>
</div>

<table class="table table-bordered table-striped">
    <thead class="thead-dark">
        <tr>
            <th>Product ID</th>
            <th>Product Name</th>
            <th>Product Cost</th>
            <th>Brand</th>
            <th>Made In</th>
            <th>Manufacture Date</th>
            <th>Expery Date</th>
            <th>Image</th>
            <th>Actions</th>
        </tr>
    </thead>
	    
    <tbody>
        <c:forEach var="product" 
        	items="<%=new ProductDao().findAll()%>">
            <tr>
                <td>${product.proId}</td>
                <td>${product.proName}</td>
                <td>${product.proPrice}</td>
                <td>${product.proBrand}</td>
                <td>${product.proMadeIn}</td>
                <td>${product.proMfgDate}</td>
                <td>${product.proExpDate}</td>           
                <td>
   			<img src="data:image/jpeg;base64,${product.readImage}" alt="Product Image" style="max-width: 100px; max-height: 100px;">
				</td>

                <td>
                   <a class="btn btn-primary" href="./DeleteProductServlet?proId=${product.proId}">Delete</a>
                   <a class="btn btn-primary" href="./EditProductServlet?proId=${product.proId}">Edit</a>
                </td>
            </tr>,
        </c:forEach>
    </tbody>
</table>

</body>
</html>
