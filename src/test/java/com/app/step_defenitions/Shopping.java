package com.app.step_defenitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.app.pages.Base;
import com.app.pages.Shopping_Page;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shopping {
	
	Shopping_Page shopping = new Shopping_Page();
	
	@Given("I'm on the HomePage")
	public void i_m_on_the_HomePage() {
		Driver.get().get(ConfigurationReader.get("url"));
		//shopping.search_box.sendKeys("MacBook Pro 13 inch case");
	}
	
	@When("I'm looking for a MacBook Pro {int} inch case And Add selected case into shopping cart")
	public void i_m_looking_for_a_MacBook_Pro_inch_case_And_Add_selected_case_into_shopping_cart(Integer int1) throws InterruptedException {
		shopping.search("MacBook Pro 13 inch case");
		shopping._4_stars_and_up.click();
		String expected = "\"MacBook Pro 13 inch case\"";
		Assert.assertEquals( expected,shopping.MacBook_Pro_13_inch_case.getText());
		Actions action = new Actions(Driver.get());
		//action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();    --> scrolls page down
		action.moveToElement(shopping.mosisoBrand).click().perform();
		shopping.mosisoBrand.click();
		action.moveToElement(shopping.newCondition).click().perform();
		shopping.newCondition.click();
		
		shopping.selectedCase.click();
		shopping.roseQuartz.click();
		
		String expected_2 = "MOSISO MacBook Pro 13 inch Case 2019 2018 2017 2016 Release A2159 A1989 A1706 A1708, Plastic Hard Shell Case&Keyboard Cover&Screen Protector&Storage Bag Compatible with MacBook Pro 13, Rose Quartz";
		Assert.assertEquals(expected_2, shopping.assert_roseQuartz.getText());
		shopping.addToCartButton.click();
		Thread.sleep(3000);
		shopping.closePopUp.click();
		
//		new WebDriverWait(Driver.get(), 20).until(ExpectedConditions.alertIsPresent()).dismiss();
//		System.out.println("Popup clicked!");

//		Alert alert = Driver.get().switchTo().alert();
//		Driver.get().switchTo().alert().dismiss();
	}
	

	@When("I'm looking for Iphone XR case And Add selected Iphone case into shopping cart")
	public void i_m_looking_for_Iphone_XR_case_And_Add_selected_Iphone_case_into_shopping_cart() {
		shopping.search_box.clear();
		shopping.search("Ihone XR case");	   
	}

	@Then("I check shopping cart And continue shopping")
	public void i_check_shopping_cart_And_continue_shopping() {
	   
	}
		
}
