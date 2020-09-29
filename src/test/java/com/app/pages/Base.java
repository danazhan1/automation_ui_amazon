package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class Base {
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement search_box;
	
	@FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']")
	public WebElement search_key;
	
	//homePage = "url=https://www.amazon.com/ ";
	
	public void search ( String str) {
		search_box.sendKeys(str);
		search_key.click();
	}
	
	

}
