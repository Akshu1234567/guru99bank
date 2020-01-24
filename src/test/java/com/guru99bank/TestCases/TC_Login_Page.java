package com.guru99bank.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.guru99bank.PageObject.Login_Page;

public class TC_Login_Page  extends BaseClass{
	@Test
	public void Login_Page() {
		Login_Page lp=new Login_Page(driver);
		driver.get(baseurl);
		lp.setusername(userid);
		lp.setpassword(password);
		lp.Clicksubmit();
		
		
	
	if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Manager Homepage")) {
		Assert.assertTrue(true);
		
	}else {
		Assert.assertTrue(false);
	}
	}
	

}
