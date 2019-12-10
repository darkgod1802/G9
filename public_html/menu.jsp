<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Menú principal
</title>
</head>
<body>
<h2>
Bienvenido <%=session.getAttribute("usuario")%> 
</h2>

<h3>Escoja una de las siguientes opciones:</h3>




<html:form action="/menu">
  <html:submit property="opcion" value="ALTA ENTRENADOR" />
  <html:submit property="opcion" value="LISTADO ENTRENADOR" />
  <html:submit property="opcion" value="ALTA JUGADOR" />
  <html:submit property="opcion" value="LISTADO JUGADOR" />
  <html:submit property="opcion" value="ALTA PAIS"/>
  <html:submit property="opcion" value="LISTADO PAIS"/>
</html:form>



</body>
</html>
