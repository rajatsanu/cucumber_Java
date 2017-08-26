package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestSetting{

	private String configFile = System.getProperty("user.dir")
			+ "src/main/resources/config.properties";
	private static Properties pro ;
	private static WebDriver driver ;

	public TestSetting() throws IOException {
		FileInputStream file = new FileInputStream(configFile);
		pro = new Properties();
		pro.load(file);
	}
	
	public static String getProperty(String property){
		return pro.getProperty(property);
	}

	public static WebDriver getDriver(){
		if(pro.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", pro.getProperty("pathOfGeckoDriver"));
			driver = new FirefoxDriver();
			return driver;
		}else if(pro.getProperty("browser").equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", pro.getProperty("pathOfIEDriver"));
			driver = new InternetExplorerDriver();
			return driver;
		}else {
			System.setProperty("webdriver.chrome.driver", pro.getProperty("pathOfChromeDriver"));
			driver = new ChromeDriver();
			return driver;
		}
	}
	
	
}
