package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.Color_Blue;
import page.Color_White;
import util.BrowserFactory;


public class StepDefinition {
	WebDriver driver;
	Color_Blue clrBlue;
	Color_White clrWhite;
	
	@Before
	public void beforeRun() {
		driver= BrowserFactory.launchBrowser();
		clrBlue = PageFactory.initElements(driver, Color_Blue.class);
		clrWhite=PageFactory.initElements(driver, Color_White.class);
	}
	@Given("^User is on the Techfios Automation Practical Exam Page$")
	public void user_is_on_the_Techfios_Automation_Practical_Exam_Page() throws Throwable {
	    
	}

	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String arg1) throws Throwable {
	 
	}

	@When("^User clicks on the button$")
	public void user_clicks_on_the_button() throws Throwable {
		clrBlue.blueBackground();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
	   clrBlue.colorBlueValidation();
	}

	@Then("^User clicks \"([^\"]*)\" button$")
	public void user_clicks_button(String arg1) throws Throwable {
	clrWhite.whiteBackground();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
	  clrWhite.colorWhiteValidation();
	}


	
//	  @After public void tearDown() throws InterruptedException { 
//		  Thread.sleep(2000);
//		  driver.close();
//		  driver.quit(); 
//		  }
}
