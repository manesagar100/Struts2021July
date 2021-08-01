package demo;

		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;

		import org.apache.struts.action.Action;
		import org.apache.struts.action.ActionForm;
		import org.apache.struts.action.ActionForward;
		import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;


		public class LoginAction extends Action {
			
			public LoginAction(){
				System.out.println("inside LoginAction-Constructor");
			}
			@Override
			public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
					HttpServletResponse response) throws Exception {
			/*	LoginForm loginForm = (LoginForm) form;
				String login = loginForm.getUserName();
				String pwd = loginForm.getPassword();
			*/
				DynaActionForm dform = (DynaActionForm)form;
				String login = dform.getString("userName");
				String pwd = dform.getString("password");
				
				System.out.println("in execute of LoginAction with " + login + ",  " + pwd);
				if (login.equals(pwd)) {
					System.out.println("current login " + login + ",  " + pwd);
					return mapping.findForward("success");
				} else
					return mapping.findForward("failure");
			}

		}