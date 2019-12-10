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
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class AltaEntrenadorAction extends Action 
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
    AltaEntrenadorForm cc = (AltaEntrenadorForm) form;
    String id = cc.getId();
    String nom = cc.getNombre();
    String pais1 = cc.getPais1();
    String pais2 = cc.getPais2();
    
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;

    if(pais1.equals("0"))
    {
      pais1=null;
    }else
    {
      pais1="'"+pais1+"'";
    }
    if(pais2.equals("0"))
    {
      pais2=null;
    }else
    {
      pais2="'"+pais2+"'";
    }
    

       try
       {
         cn = conn.conexion;
         String cadena = "insert into g9_entrenador values ("+id+",'"+nom+"',"+pais1+","+pais2+")";
         System.out.println(cadena);
         int a = conn.InsertaDatos(cadena);
          
         return mapping.findForward("menu");
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
}