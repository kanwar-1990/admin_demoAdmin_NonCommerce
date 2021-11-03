package com.adminnc.qa.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.adminnc.qa.pages.NCLoginPage;

public class NCBaseTest {

	public NCBasePage ncbasepage;
	public WebDriver driver;
	public Properties prop;
	public NCLoginPage ncloginpage;

	@BeforeTest
	// @Test
	public void Setup() {
		ncbasepage = new NCBasePage();
		prop = ncbasepage.init_Properties();
		String Browser = prop.getProperty("url");
		driver = ncbasepage.init_Browser("chrome");
		driver.get(Browser);
		ncloginpage = new NCLoginPage(driver);

	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}

}
