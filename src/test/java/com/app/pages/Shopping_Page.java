package com.app.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.utilities.Driver;

public class Shopping_Page extends Base{
	
	
	public Shopping_Page() {
		PageFactory.initElements (Driver.get(), this);
	}
	
	@FindBy(xpath = "//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	public WebElement _4_stars_and_up;
	
	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[15]")
	public WebElement plastic;
	
	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[17]")
	public WebElement rubber;
	
	@FindBy(xpath = "(//*[@class='nav-line-1'])[2]")
	public WebElement sighin;
	
	@FindBy(xpath = "//*[@class='a-color-state a-text-bold']")
	public WebElement MacBook_Pro_13_inch_case;
	
	@FindBy(xpath = "//*[.='New']")
	public WebElement newCondition;
	
	@FindBy(xpath = "//*[.='MOSISO']")
	public WebElement mosisoBrand;
	
	@FindBy(xpath = "	//*[.='MOSISO MacBook Pro 13 inch Case 2019 2018 2017 2016 Release A2159 A1989 A1706 A1708, Plastic Hard Shell Case&Keyboard Cover&Screen Protector&Storage Bag Compatible with MacBook Pro 13, Navy Blue']\n" + 
			"")
	public WebElement selectedCase;
	
	@FindBy(xpath = "//*[@title='Click to select Rose Quartz']")
	public WebElement roseQuartz;
	
	@FindBy(xpath = "//button[@id='siNoCoverage-announce']")
	public WebElement closePopUp;
	
	
	
	
	@FindBy(xpath = "//*[@id='productTitle']")
	public WebElement assert_roseQuartz;
	
	@FindBy(id = "add-to-cart-button")
	public WebElement addToCartButton;
	

}
