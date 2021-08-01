package demo;

		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;

		import org.apache.struts.action.Action;
		import org.apache.struts.action.ActionForm;
		import org.apache.struts.action.ActionForward;
		import org.apache.struts.action.ActionMapping;


		public class LoginAction extends Action {
			
			public LoginAction(){
				System.out.println("inside LoginAction-Constructor");
			}
		   @Override
		   public ActionForward execute(ActionMapping mapping, ActionForm form,
				   HttpServletRequest request, HttpServletResponse response)
				   throws Exception {
			   System.out.println("execute() called");
				   return mapping.findForward("success");
		   }

		}