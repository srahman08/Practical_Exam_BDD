package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import util.ScreenshotMethod;

public class Color_Blue {
		
	WebDriver driver;  
	ScreenshotMethod sshot;
	
	public Color_Blue(WebDriver driver) {
		this.driver = driver;
		sshot = PageFactory.initElements(driver, ScreenshotMethod.class);
		
	}
@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]") WebElement clickToBlueBackground;
@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']") WebElement colorBlueConfirmation;

public void blueBackground() throws IOException {
	clickToBlueBackground.click();
	
}
	public void colorBlueValidation() throws IOException {
		sshot.takeScreenshotAtEndOfTest(driver);
		System.out.println(colorBlueConfirmation.getText());
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(colorBlueConfirmation.getText(), "background-color: skyblue;");
		
		
	}
	
}





