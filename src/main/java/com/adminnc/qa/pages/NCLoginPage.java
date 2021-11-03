package com.adminnc.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adminnc.qa.Base.NCBasePage;

public class NCLoginPage extends NCBasePage {

	private By AdminUsername = By.id("Email");
	private By AdminPwd = By.id("Password");
	private By LoginLink = By.cssSelector("[type='submit']");

	public NCLoginPage(WebDriver driver) {
		this.driver = driver;

	}

	public void dologin(String USR, String PWD) {

		driver.findElement(AdminUsername).clear();
		driver.findElement(AdminUsername).sendKeys(USR);
		driver.findElement(AdminPwd).clear();
		driver.findElement(AdminPwd).sendKeys(PWD);
		driver.findElement(LoginLink).click();

	}

}
