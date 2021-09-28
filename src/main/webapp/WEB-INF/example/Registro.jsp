<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Hola mundo</h1>
		<section class="contenedor">
		<div style="margin-laft: 40%; margin-top: 6%;">
		 <s:form action="Registronuevo"> 
		
			<h1>Registro</h1>
            
				<section class="hero"></section>
			        <fieldset>         
                        <div class="campo">
                            <s:textfield name="clave" label="clave persona"></s:textfield>
                        </div>
                        <!-- -->
                        <div class="campo">
                        	<s:textfield name="hombre" label="nombre: "></s:textfield>
                        </div> 

                        <div class="campo">
                        	<s:textfield name="apellidos" label="Apellidos: "></s:textfield>
                        </div>
                        <!--  -->
                        <div class="campo">
                        	<s:textfield name="contra" label="Clave: "></s:textfield>
                        </div> 

                         <s:submit values="submit"/>
                        
                    </div> <!--cerrar contenedor clase-->
                    
				</fieldset>
		</s:form>
		</div>
		
	</section>
		
        <s:url var="url" action="HelloWorld">
            <s:param name="request_locale">en</s:param>
        </s:url>
        <s:a href="%{url}">ir al login</s:a> 
        
        
</body>
</html>