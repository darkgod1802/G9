package mypackage4;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;


import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;
public class MenuAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    MenuForm menu = (MenuForm) form;
    String opcion = menu.getOpcion();
 
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;

    if ( opcion.equals("ALTA ENTRENADOR") ) {
    return mapping.findForward("altaentrenador");
    }
    if ( opcion.equals("LISTADO ENTRENADOR") ) {
    return mapping.findForward("listadoentrenador");
    }
    if ( opcion.equals("ALTA JUGADOR") ) {
      Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
      String cadena = "select * from G9_PAIS order by 1";
      rsConsulta = conn.getData(cadena);
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
        ClasePais item = new ClasePais();
        item.setId(rsConsulta.getString("id"));
        item.setNombre(rsConsulta.getString("nombre"));
        items.add(item);
        System.out.println("Paso ..");
      }  
      request.getSession().setAttribute("ayuda",items);
      request.getSession().setAttribute("ayudados",items);

        return mapping.findForward("altajugador");
    }
	
    catch(Exception e)
    {
      e.printStackTrace();
      return (mapping.findForward("error"));
    }
    finally
    {
      conn.closeConnection();	
    }
    }
    if ( opcion.equals("LISTADO JUGADOR") ) {

    
        Connection cn = null;
        ConnectDB conn =new ConnectDB();
        ResultSet rsConsulta = null;
        try
        {
          cn = conn.conexion;
          String cadena = "select id,nombre,edad,contacto,sexo,pais_nac,pais_2_nac from g9_jugador order by 1";
          rsConsulta = conn.getData(cadena);
          ArrayList items = new ArrayList();
          while (rsConsulta.next())
          {
            ClaseJugadorItem item = new ClaseJugadorItem();
            item.setJugid(rsConsulta.getString("id"));
            item.setJugnombre(rsConsulta.getString("nombre"));
            item.setJugedad(rsConsulta.getString("edad"));
            item.setJugcontacto(rsConsulta.getString("contacto"));
            item.setJugsexo(rsConsulta.getString("sexo"));
            item.setJugpais(rsConsulta.getString("pais_nac"));
            item.setJugpaisdos(rsConsulta.getString("pais_2_nac"));
            items.add(item);
          }  
          ListadoJugadorForm f = new ListadoJugadorForm ();
          f.setTabla(items);
          request.getSession().setAttribute("nn", f);
          return mapping.findForward("listadojugador");

        }
	
        catch(Exception e)
        {
          e.printStackTrace();
          return (mapping.findForward("error"));
        }
        finally
        {
          conn.closeConnection();	
        }


    }
    if ( opcion.equals("ALTA PAIS") ) {
    return mapping.findForward("altapais");
    }
    if ( opcion.equals("LISTADO PAIS") ) {

      try {
      String cadena = "select id, nombre from G9_PAIS";
      rsConsulta = conn.getData(cadena);
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
        Pais pais = new Pais();
        pais.setCodigo(rsConsulta.getString("id"));
        pais.setNombre(rsConsulta.getString("nombre"));
        items.add(pais);
      }
      ListadoPaisForm f = new ListadoPaisForm();
      f.setTabla(items);
      request.getSession().setAttribute("listaPais",f);
      
      return mapping.findForward("listadopais");
      } catch (Exception e)
      {
        e.printStackTrace();
      return (mapping.findForward("error"));
      }
      finally {
        conn.closeConnection();	
      }   
    }
    return mapping.findForward("");
  }
}
