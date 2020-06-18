<%--
  Created by IntelliJ IDEA.
  User: Sravya
  Date: 1/10/2020
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<template:page pageTitle="${pageTitle}">
<form:form modelAttribute="productRegistrationForm" action="${pageContext.request.contextPath}/product/register/submitRegistrationpage" method="post">
    <formElement:formInputBox idKey="register.firstName"
                              labelKey="companyName" path="companyName" inputCSS="form-control"
                              mandatory="true" /><br>
    <formElement:formInputBox idKey="productId"
                              labelKey="productId" path="productId" inputCSS="form-control"
                              mandatory="true" /><br>
    <formElement:formInputBox idKey="quantityNeeded"
                              labelKey="quantity Needed" path="quantityNeeded" inputCSS="form-control"
                              mandatory="true" /><br>
    <button type="submit">Register</button>

</form:form>
</template:page>
