<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>hola mundo max</title>
</head>

<body>
<h2>Aqui debe ir el login</h2>

<!-- 
<ul>
    <li>
        <s:url var="url" action="HelloWorld">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">English</s:a>
    </li>
    <li>
        <s:url var="url" action="HelloWorld">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:a href="%{url}">Espanol</s:a>
    </li>
</ul>
 -->

	<h3>Login</h3>

	 <hr/> 
	 
	
        <s:url var="url" action="Menu">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">ir a menu</s:a>
        <br>
        
        <s:url var="url" action="Registro">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">ir a registro</s:a>

		<br>
		
		<s:form action="hello">
 		<s:textfield name="userName" label="Your name" />
  		<s:submit value="Submit" />
		</s:form>
		
		
</body>
</html>
