<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>
Listado Pais
</h2>

<table  cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td><b>Codigo</b></td>
    <td><b>Nombre del País</b></td>
</tr>

<logic:iterate id="tabla" indexId="index" name="listaPais" property="tabla">
<tr>
    <td><bean:write name="tabla" property="codigo" /></td>
    <td><bean:write name="tabla" property="nombre" /></td>
</tr>
</logic:iterate>
</table>

</body>
</html>
