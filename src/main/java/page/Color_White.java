package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import util.ScreenshotMethod;

public class Color_White {
WebDriver driver;  

	
	public Color_White(WebDriver driver) {
		this.driver = driver;
		ScreenshotMethod sshot = PageFactory.initElements(driver, ScreenshotMethod.class);
		
	}
@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]") WebElement clickToWhiteBackground;
@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']") WebElement colorWhiteConfirmation;

public void whiteBackground()  {
	clickToWhiteBackground.click();
		
}
public void colorWhiteValidation() throws IOException {
	ScreenshotMethod sshot = PageFactory.initElements(driver, ScreenshotMethod.class);
	sshot.takeScreenshotAtEndOfTest(driver);
	System.out.println(colorWhiteConfirmation.getText());
	SoftAssert softAssertion = new SoftAssert();
	softAssertion.assertEquals(colorWhiteConfirmation.getText(), "background-color: white;");
	
}

}
