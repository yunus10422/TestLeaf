package com.leaftaps.leads.pages;

import com.leaftaps.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage() { // Pagefactory code
	}

	public MyLeadPage ClickCRM() {
		driver.findElementByXPath("//div[@class='crmsfa']//img[1]").click();
		return new MyLeadPage();
	}
}
