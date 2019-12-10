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


<html:form action="/altapais">
  <html:submit value="ALTA PAIS"/>
</html:form>

<html:form action="/listadopais">
  <html:submit  value="LISTADO PAIS"/>
</html:form>


<html:form action="/altaentrenador">
  <html:submit value="ALTA ENTRENADOR" />
</html:form>


<html:form action="/listadoentrenador">
  <html:submit value="LISTADO ENTRENADOR" />
</html:form>


<html:form action="/altajugador">
  <html:submit value="ALTA JUGADOR" />
</html:form>


<html:form action="/listadojugador">
  <html:submit value="LISTADO JUGADOR" />
</html:form>



</body>
</html>
