package demo;

import org.apache.struts.action.ActionForm;

public class InfoForm extends ActionForm{
	public InfoForm(){
		System.out.println("inside InfoForm-Constructor");
	}
	
	private String name = null;
	private String address = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
