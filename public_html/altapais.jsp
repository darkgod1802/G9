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
Alta pais
</h2>
<h3>Introduzca los datos del nuevo país</h3>

<html:errors />

<html:form action="/altapais">

<table  cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td><bean:message key="codigo.pais.prompt" /></td>
    <td><html:text property="codigo" /></td>
</tr>
<tr>
    <td><bean:message key="nombre.pais.prompt" /></td>
    <td><html:text property="nombre" /></td>
</tr>
</table>

<html:submit value="ALTA"/>

</html:form>


</body>
</html>
