package com.adminnc.qa.tests;

import org.testng.annotations.Test;

import com.adminnc.qa.Base.NCBaseTest;

public class NCLoginTest extends NCBaseTest {

	@Test
	public void doLoginTest() {
		ncloginpage.dologin(prop.getProperty("username"), prop.getProperty("password"));
	}

}
