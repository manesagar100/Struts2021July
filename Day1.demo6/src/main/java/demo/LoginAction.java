package demo;

		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;

		import org.apache.struts.action.Action;
		import org.apache.struts.action.ActionForm;
		import org.apache.struts.action.ActionForward;
		import org.apache.struts.action.ActionMapping;


		public class LoginAction extends Action {
		   @Override
		   public ActionForward execute(ActionMapping mapping, ActionForm form,
				   HttpServletRequest request, HttpServletResponse response)
				   throws Exception {
			   LoginForm loginForm = (LoginForm) form;

			   if (loginForm.getUserName() == null || loginForm.getPassword() == null
					   || !loginForm.getUserName().equalsIgnoreCase("Mukesh")
					   || !loginForm.getPassword().equals("kumar")) {
				   System.out.println("current login "+ loginForm.getUserName()+"  "+loginForm.getPassword());
				   return mapping.findForward("success");
			   } else
				   return mapping.findForward("failure");
		   }

		}