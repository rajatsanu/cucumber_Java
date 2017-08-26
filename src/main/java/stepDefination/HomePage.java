package stepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import utility.BrowserInteraction;
import framework.StepDefination;

public class HomePage extends StepDefination{
	
	WebDriver driver ;
	
	public HomePage() throws IOException {
		super();
		driver = getDriver();
	}
	
	@Given("^Navigate Main page of book buy india$")
	public void openBrowser(){
		BrowserInteraction.load(driver,getProperty("url"));
	}
	
	
	
	

}
