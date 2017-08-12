

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail here:</title>
    </head>
    <body>
        
        <h1>Account Detail:</h1>
        <title>Account Information:</title>
    <h1>ID:<jsp:getProperty name="acc" property= "id"/></h>
    <h1>Name:<jsp:getProperty name="acc" property= "name"/></h>
        <h1>Description:<jsp:getProperty name="acc" property= "desription"/></h>
        <jsp:setProperty name="acc" property="id" value="3"/>
    </body>
</html>
