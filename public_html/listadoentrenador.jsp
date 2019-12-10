<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
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
Listado Entrenadores
</h2>
<html:form action="/listadoentrenador">
<table cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td><b>Id</b></td>
    <td><b>Nombre</b></td>
    <td><b>Pais 1</b></td>
    <td><b>Pais 2</b></td>
</tr>
<logic:iterate id="tabla" indexId="index" name="mmm" property="tabla">
  <tr>
    <td><bean:write name="tabla" property="id" /></td>
    <td><bean:write name="tabla" property="nombre" /></td>
    <td><bean:write name="tabla" property="pais1" /></td>
    <td><bean:write name="tabla" property="pais2" /></td>
  </tr>

</logic:iterate>

</table>
</html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
