package com.leaftaps.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leaftaps.utils.ReadLibrary;

public class ProjectSpecificMethods {
	public String excelFileName;

	@DataProvider(name = "fetchData")
	public Object[][] setUpData() throws IOException {
		Object[][] data = ReadLibrary.readExcelData(excelFileName);
		return data;
	}

	public static ChromeDriver driver;

	@BeforeMethod
	public void login() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
