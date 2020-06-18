<%--
  Created by IntelliJ IDEA.
  User: Sravya
  Date: 2/6/2020
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<h1>componentsdfsdf</h1>
<c:forEach var="productData" items="${data}">
    <div>
        <p>Product Data From Component</p>
        <p>${productData.code}</p>
        <p>${productData.description}</p>
        <p>${productData.name}</p>
    </div>
</c:forEach>