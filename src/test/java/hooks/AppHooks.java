package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dsutilities.ConfigReader;
import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	private static DriverFactory driverfactory;
	 static  WebDriver driver;
	private static ConfigReader configreader;
	static Properties prop;
	
	@BeforeAll
	public static void Setup() {
		configreader = new ConfigReader();
		prop =configreader.init_prop();
		String browsername = prop.getProperty("browser");
		driverfactory = new DriverFactory();
        driver = driverfactory.init_driver(browsername);
		
	}
		
//	@Before (order = 1)	
//	public void launchbrowser() {
//		String browsername = prop.getProperty("browser");
//		driverfactory = new DriverFactory();
//        driver = driverfactory.init_driver(browsername);
//	}
	
	@AfterAll(order = 1)
	public static void quitbrowser() {
		driver.quit();	
	}

	@After(order=0)
	public static void screenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			//logic for taking screenshot:
	String screenshotName  = scenario.getName().replaceAll(" ", "_");
	byte [] sourcepath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	scenario.attach(sourcepath, "image/png", screenshotName);
		}
	}	
}
