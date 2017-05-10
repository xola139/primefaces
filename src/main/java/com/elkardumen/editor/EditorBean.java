package com.elkardumen.editor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

import org.primefaces.model.DualListModel;

@ManagedBean(name = "EditorBean")
public class EditorBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String value = "This editor is provided by PrimeFaces";
	private String[] selectedConsoles;
	private DualListModel<String> theList;
	private List<String> comer = new ArrayList<String>();
	private List<String> fresko = new ArrayList<String>();
	private List<String> city = new ArrayList<String>();
	
	
	
	@PostConstruct
	public void init() {
		selectedConsoles = null;
		
		//Cities
        List<String> citiesSource = new ArrayList<String>();
        List<String> citiesTarget = new ArrayList<String>();
		
        comer.add("comer1");
        comer.add("comer2");
        comer.add("comer3");
        comer.add("comer4");
        comer.add("comer5");
        comer.add("comer6");
        comer.add("comer7");
        
        fresko.add("fresko1");
        fresko.add("fresko2");
        fresko.add("fresko3");
        
        city.add("city1");
        city.add("city2");
        city.add("city3");
        city.add("city4");
        
        citiesSource.add("1");
        citiesSource.add("2");
        citiesSource.add("3");
         
        theList = new DualListModel<String>(citiesSource, citiesTarget);
	}
	
	public void exampleListener (){
		addMessage("Testeando Welcome to Primefaces!!");
	}
	
	 public void buttonAction(ActionEvent actionEvent) {
	        addMessage("Welcome to Primefaces!!");
	    }
	     
	    public void addMessage(String summary) {
	        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_WARN, summary,  null);
	        FacesContext.getCurrentInstance().addMessage(null, message);
	    }
	
	public DualListModel<String> getTheList() {
        return theList;
    }
 
    public void setTheList(DualListModel<String> theList) {
        this.theList = theList;
    }
	
	

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String[] getSelectedConsoles() {
	    return selectedConsoles;
	}
	 
	public void setSelectedConsoles(String[] selectedConsoles) {
	    this.selectedConsoles = selectedConsoles;
	}
	
	
	public void ajaxListener(AjaxBehaviorEvent event) {
		System.out.println("----->");
		List<String> citiesSource = new ArrayList<String>();
	    List<String> citiesTarget = new ArrayList<String>();
		
		for(String v:getSelectedConsoles()){
			if(v.equals("lacomer")){
				for(String l:comer){
					citiesSource.add(l);
				}
			}
			else if(v == "fresko"){
				for(String l:fresko){
					citiesSource.add(l);
				}
			}else if(v == "city"){
				for(String l:city){
					citiesSource.add(l);
				}
			}
		        
		     
		     
		}
		
		citiesSource.add("5");
        citiesSource.add("6");
        citiesSource.add("7");
         
        theList = new DualListModel<String>(citiesSource, citiesTarget);
		
		
		
	}
	
	
}