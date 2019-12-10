package mypackage4;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AltaPaisForm extends ActionForm 
{
  String codigo;
  String nombre;

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
    ActionErrors errors = new ActionErrors();
    if ((codigo == null) || (codigo.length() < 1)) 
      errors.add("codigo", new ActionError("error.codigo.pais.requerido"));
    if ((nombre == null) || (nombre.length() < 1)) 
      errors.add("nombre", new ActionError("error.nombre.pais.requerido"));
    return errors;  
  }

  public String getCodigo()
  {
    return codigo;
  }

  public void setCodigo(String newCodigo)
  {
    codigo = newCodigo;
  }

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }
}