package demo;

		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;

		import org.apache.struts.action.Action;
		import org.apache.struts.action.ActionForm;
		import org.apache.struts.action.ActionForward;
		import org.apache.struts.action.ActionMapping;

		public class CalcAction extends Action {
			public CalcAction() {
				System.out.println("CalcAction Constructor invoked");
			}

			@Override
			public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
					HttpServletResponse response) throws Exception {
				CalcForm calcForm = (CalcForm) form;
				calcForm.add();
				System.out.println("Execute of CalcAction with " + calcForm.getNumber1() + ",  " + calcForm.getSum());
				return mapping.findForward("success");
			}

		}