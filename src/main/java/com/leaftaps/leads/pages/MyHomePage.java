package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {

	public MyHomePage() { // Pagefactory code
	}

	public MyLeadPage clickLead() {
		driver.findElementByXPath("//div[@class='crmsfa']//img[1]").click();
		return new MyLeadPage();
	}
}
   