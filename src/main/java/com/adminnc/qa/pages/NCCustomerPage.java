package com.adminnc.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adminnc.qa.Base.NCBasePage;

public class NCCustomerPage extends NCBasePage{

	
	private By list =By.cssSelector("li.nav-item a p");
	private By SearchByEmailid=By.id("SearchEmail");
	private By SearchFirstName=By.id("SearchFirstName");
	private By SearchBttn=By.xpath("//button[@type='button' and @id='search-customers']");
	
	
	public NCCustomerPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void searchCustomerByDetails()
	{
		List<WebElement>Listdetails=driver.findElements(list);
		
		
	}

}
