package com.app.step_defenitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.app.utilities.ConfigurationReader;
import com.app.utilities.Driver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
    public void setUp(){
        System.out.println("Before hooks");
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

//    @Before("@database")
//    public void setUpDBCOnn(){
//        System.out.println("Setting up DB connection");
//    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("After hooks");
        // check if the scenario is failed
        if (scenario.isFailed()) {
            // take that screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            // attach the scenario to the report
            scenario.embed(screenshot, "image/png");
        }
     //    Driver.closeDriver();
    }

//    @AfterClass ("@database")
//    public void tearDownConnection(){
//        System.out.println("Closing DB connection");
//    }

	
	

}
