package com.guru99bank.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	} 

	@FindBy(name="uid")
	WebElement txtusername;
	
	@FindBy(name="password")
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	
	public void setusername(String userid)
	{
		
		txtusername.sendKeys(userid);
	}

	public void setpassword(String password)
	{
		
		txtpassword.sendKeys(password);
	}
	
	public void Clicksubmit()
	{
		
		btnLogin.click();
	}
}




