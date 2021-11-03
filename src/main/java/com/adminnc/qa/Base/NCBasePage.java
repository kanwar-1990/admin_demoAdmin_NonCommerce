package com.adminnc.qa.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NCBasePage {

	public WebDriver driver;
	public Properties prop;
	public NCOptionManager ncoptionmanager;

	public WebDriver init_Browser(String BrowserName) {
		System.out.println("The Browser value is :" + BrowserName);
		ncoptionmanager = new NCOptionManager(prop);
		if (BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ncoptionmanager.getChromeOptions());
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(ncoptionmanager.getFireFoxOptions());
		} else if (BrowserName.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {

			System.out.println("Please check the browserValue :" + BrowserName);

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public Properties init_Properties() {

		prop = new Properties();
		try {
			FileInputStream io = new FileInputStream("./src/main/java/com/adminnc/qa/properties/config.properties");
			prop.load(io);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return prop;
	}

}
