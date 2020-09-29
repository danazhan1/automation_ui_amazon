package com.app.step_defenitions;

import com.app.pages.LoginPage;
import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage_Step_Def {
	
	LoginPage page = new LoginPage();
	
	
	
	@Given("enter url")
	public void enter_url() {
		Driver.get().get(ConfigurationReader.get("url"));
		//Driver.get().get("https://www.amazon.com/gp/css/homepage.html?ref_=nav_AccountFlyout_ya");

		
		
		new LoginPage().sign_In.click();
		
	}

	@Given("will see the homepage")
	public void will_see_the_homepage() {
		
		page.email.sendKeys("danaqa.9@gmail.com");
		
		page.continue_button.click();
	}

	@When("i find sign in box")
	public void i_find_sign_in_box() {
	    
		page.password.sendKeys("2poweroftesting#");
		
		page.submit.click();
	}

	@When("will transfer to sign in window")
	public void will_transfer_to_sign_in_window() {
	    
		//page.Authentication_continue.click();
	}

	@When("will enter email address")
	public void will_enter_email_address() {
		
		page.hamburger_menu.click();
	   
	}

	@Then("i enter password")
	public void i_enter_password() {
	  
	}

	@Then("see homepage")
	public void see_homepage() {
	    
	}

}

