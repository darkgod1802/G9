package mypackage4;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AltaEntrenadorForm extends ActionForm 
{
  String id;
  String nombre;
  String pais1;
  String pais2;

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

  public String getId()
  {
    return id;
  }

  public void setId(String newId)
  {
    id = newId;
  }

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }

  public String getPais1()
  {
    return pais1;
  }

  public void setPais1(String newPais1)
  {
    pais1 = newPais1;
  }

  public String getPais2()
  {
    return pais2;
  }

  public void setPais2(String newPais2)
  {
    pais2 = newPais2;
  }
}