<%--
  Created by IntelliJ IDEA.
  User: Sravya
  Date: 1/10/2020
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement" tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<template:page pageTitle="${pageTitle}">
    <cms:pageSlot position="Promotion1" var="comp" element="div" class="productDetailsPageSection1">
        <cms:component component="${comp}" />
    </cms:pageSlot>
    <cms:pageSlot position="Promotion2" var="comp" element="div" class="productDetailsPageSection2">
        <cms:component component="${comp}" />
    </cms:pageSlot>

</template:page>
