package mypackage4;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class ListadoJugadorForm extends ActionForm 
{
  ArrayList tabla;
  String jugid;
  String jugnombre;
  String jugedad;
  String jugcontacto;
  String jugsexo;
  String jugpais;
  String jugpaisdos;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

  public ArrayList getTabla()
  {
    return tabla;
  }

  public void setTabla(ArrayList newTabla)
  {
    tabla = newTabla;
  }

  public String getJugid()
  {
    return jugid;
  }

  public void setJugid(String newJugid)
  {
    jugid = newJugid;
  }

  public String getJugnombre()
  {
    return jugnombre;
  }

  public void setJugnombre(String newJugnombre)
  {
    jugnombre = newJugnombre;
  }

  public String getJugedad()
  {
    return jugedad;
  }

  public void setJugedad(String newJugedad)
  {
    jugedad = newJugedad;
  }

  public String getJugcontacto()
  {
    return jugcontacto;
  }

  public void setJugcontacto(String newJugcontacto)
  {
    jugcontacto = newJugcontacto;
  }

  public String getJugsexo()
  {
    return jugsexo;
  }

  public void setJugsexo(String newJugsexo)
  {
    jugsexo = newJugsexo;
  }

  public String getJugpais()
  {
    return jugpais;
  }

  public void setJugpais(String newJugpais)
  {
    jugpais = newJugpais;
  }

  public String getJugpaisdos()
  {
    return jugpaisdos;
  }

  public void setJugpaisdos(String newJugpaisdos)
  {
    jugpaisdos = newJugpaisdos;
  }
}