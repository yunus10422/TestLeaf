package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage() {  
	}

	public CreteLead ClickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return this();
	}
	
}
