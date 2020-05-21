<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<h1>Welcome</h1>
<img src="resources/bullet.jpg" />
<href >Login </href>
<spring:url value="/spring-mvc/login" var="url" htmlEscape="true"/>
<a href="${url}">New consultant</a>