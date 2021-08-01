package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class InfoAction extends Action{
	public InfoAction(){
		System.out.println("inside InfoAction-Constructor");
	}
   @Override
   public ActionForward execute(ActionMapping mapping, ActionForm form,
		   HttpServletRequest request, HttpServletResponse response)
		   throws Exception {
	   System.out.println("execute() called");
	   InfoForm infoForm = (InfoForm) form;
	   if(infoForm.getName().isEmpty())
		   return mapping.findForward("failure");
	   else
		   return mapping.findForward("yes");
	   
		  
   }
}
