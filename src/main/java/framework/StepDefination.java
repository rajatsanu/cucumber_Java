package framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class StepDefination extends TestSetting{
	
	private static final WebDriver driver ;
	
	public StepDefination() throws IOException {
		super();
	}
	
	static {
		driver = TestSetting.getDriver();
	}
	
	public static String getProperty(String property){
		return TestSetting.getProperty(property);
	}
	
	public static WebDriver getDriver(){
		return driver;
	}
	

}
