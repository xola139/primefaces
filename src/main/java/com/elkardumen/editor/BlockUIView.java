package com.elkardumen.editor;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

@ManagedBean
public class BlockUIView {
	private String firstname;
	private String lastname;
	private boolean conditionFlag;
	
	public boolean isConditionFlag() {
		return conditionFlag;
	}
	public void setConditionFlag(boolean conditionFlag) {
		this.conditionFlag = conditionFlag;
	}
	//5541626947
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void save() {
        if(!getFirstname().equals("") && !getLastname().equals("")){
        	this.conditionFlag = true;
        	System.out.println("----->");
        	 RequestContext.getCurrentInstance().execute("PF('dlg2').show()");
        }
		//FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("You've registered"));
    }

}
