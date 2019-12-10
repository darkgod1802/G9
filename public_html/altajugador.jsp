<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Alta jugador
</title>
</head>
<body>
<h2>
Alta Jugador
</h2>
<html:form action="/altajugador">

<table  cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td><bean:message key="jugid.prompt" /></td>
    <td><html:text property="jugid" /></td>
</tr>
<tr>
    <td><bean:message key="jugnombre.prompt" /></td>
    <td><html:text property="jugnombre" /></td>
</tr>
<tr>
    <td><bean:message key="jugedad.prompt" /></td>
    <td><html:text property="jugedad" /></td>
</tr>
<tr>
    <td><bean:message key="jugcontacto.prompt" /></td>
    <td><html:text property="jugcontacto" /></td>
</tr>
<tr>
    <td><bean:message key="jugsexo.prompt" /></td>
    <td><html:text property="jugsexo" /></td>
</tr>
<tr>
    <td><bean:message key="jugpais.prompt" /></td>
    <td><html:select property="jugpais">
    <html:options collection="ayuda" property="id" labelProperty="nombre" />
    </html:select></td>
</tr>
<tr>
    <td><bean:message key="jugpaisdos.prompt" /></td>
    <td><html:select property="jugpaisdos">
    <html:options collection="ayudados" property="id" labelProperty="nombre"  />
    </html:select></td>
</tr>
</table>

<html:submit value="añadir" />



</html:form>

</body>
</html>




