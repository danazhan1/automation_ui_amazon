package com.app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements (Driver.get(), this);
	}
	
	
	@FindBy(id = "nav-link-accountList")
	public WebElement sign_In;
	
	@FindBy(name = "email")
	public WebElement email;
	
	@FindBy(id = "continue")
	public WebElement continue_button;
	
	@FindBy(xpath= "//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	public WebElement submit;
	
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement Authentication_continue;
	
	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	public WebElement hamburger_menu;
	
	
	
	
	
	



}
