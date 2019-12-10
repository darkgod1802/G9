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

    if ( opcion.equals("ALTA ENTRENADOR") ) {
    return mapping.findForward("altaentrenador");
    }
    if ( opcion.equals("LISTADO ENTRENADOR") ) {
    return mapping.findForward("listadoentrenador");
    }
    if ( opcion.equals("ALTA JUGADOR") ) {
    return mapping.findForward("altajugador");
    }
    if ( opcion.equals("LISTADO JUGADOR") ) {
    return mapping.findForward("listadojugador");
    }
    if ( opcion.equals("ALTA PAIS") ) {
    return mapping.findForward("altapais");
    }
    if ( opcion.equals("LISTADO PAIS") ) {
    return mapping.findForward("listadopais");
    }
    return mapping.findForward("");
  }
}