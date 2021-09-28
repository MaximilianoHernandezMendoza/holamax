<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>personas</title>
</head>

<body style"backgroud-color: lightcyan">


<section class="contenedor">
	

	<div style="margin-laft: 40%"; margin-top: 6% >
	<h2>Registro de personas</h2>
		<s:form action="register"> 
			<h1>Registro </h1>
            
				
			        <fieldset>         
                        <div class="campo">
                        	
                            <s:textfield name="clave" label="clave persona"></s:textfield>
                             
                        </div>

                        <div class="campo">
                        	<s:textfield name="nombre" label="nombre: "></s:textfield>
                        </div>

                        <div class="campo">
                        	<s:textfield name="apellidos" label="Apellidos: "></s:textfield>
                        </div>

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
