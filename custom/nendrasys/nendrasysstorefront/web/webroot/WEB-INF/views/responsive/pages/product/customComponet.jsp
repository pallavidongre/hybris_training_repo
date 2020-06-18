<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<template:page pageTitle="${pageTitle}">
    <h1>thiiiiiiiiiiiiiiiiiiiiiiiiidsdfa</h1>
    <cms:pageSlot position="LatestProducts" var="comp">
        <cms:component component="${comp}" />
    </cms:pageSlot>

</template:page>