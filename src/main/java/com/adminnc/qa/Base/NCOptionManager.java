package com.adminnc.qa.Base;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NCOptionManager {
	Properties prop;

	public NCOptionManager(Properties prop) {
		this.prop = prop;

	}

	public ChromeOptions getChromeOptions() {
		ChromeOptions co = new ChromeOptions();
		if (prop.getProperty("incognito").equals("true"))
			co.addArguments("--incognito");
		if (prop.getProperty("headless").equals("true"))
			co.addArguments("--headless");
		return co;
	}

	public FirefoxOptions getFireFoxOptions() {
		FirefoxOptions fo = new FirefoxOptions();
		if (prop.getProperty("incognito").equals("true"))
			fo.addArguments("--incognito");
		if (prop.getProperty("incognito").equals("true"))
			fo.addArguments("--headless");
		return fo;
	}

}
