<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Listado Jugador
</title>
</head>
<body>
<h2>
Listado Jugador
</h2>



<table cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td>ID</td>
    <td>NOMBRE</td>
    <td>EDAD</td>
    <td>CONTACTO</td>
    <td>SEXO</td>
    <td>PAIS</td>
    <td>PAIS 2</td>
</tr>

<logic:iterate id="tabla" indexId="index" name="nn" property="tabla">
<tr>
    <td><bean:write name="tabla" property="jugid" /></td>
    <td><bean:write name="tabla" property="jugnombre" /></td>
    <td><bean:write name="tabla" property="jugedad" /></td>
    <td><bean:write name="tabla" property="jugcontacto" /></td>
    <td><bean:write name="tabla" property="jugsexo" /></td>
    <td><bean:write name="tabla" property="jugpais" /></td>
    <td><bean:write name="tabla" property="jugpaisdos" /></td>
</tr>
</logic:iterate>
</table>

</body>
</html>
