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
<script language="JavaScript" src="jscript/valida.js"></script>
<script language="JavaScript" src="jscript/alta.js"></script>
<body>
<h2>
Alta entrenador
<html:form action="/altaentrenador" onsubmit="return fParams( )">
<table  cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td><bean:message key="id.mensaje" /></td>
    <td><html:text property="id" onkeypress="EvaluateText('%d', this)"/></td>
</tr>
<tr>
    <td><bean:message key="nombre.mensaje" /></td>
    <td><html:text property="nombre" /></td>
</tr>
<tr>
    <td><bean:message key="pais1.mensaje" /></td>
    <td><html:select property="pais1">
  <html:options collection="ayuda1" property="id" labelProperty="nombre"/>
</html:select></td>
</tr>
<tr>
    <td><bean:message key="pais2.mensaje" /></td>
    <td><html:select property="pais2">
  <html:options collection="ayuda2" property="id" labelProperty="nombre" />
</html:select></td>
</tr>
</table>

<html:submit value="Crear" />

</html:form>



</h2>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
