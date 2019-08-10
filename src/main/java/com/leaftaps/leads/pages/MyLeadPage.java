package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {

	public MyLeadPage() {  
	}

	public MyLeadPage clickLead() {
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		return new MyLeadPage();
	}
	
}
