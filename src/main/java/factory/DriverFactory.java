package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	public WebDriver init_driver(String browser) {
		System.out.println("browser value is " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//ChromeOptions co = new ChromeOptions();
			//co.addArguments("--remote-allow-origins=*");
			tlDriver.set(new ChromeDriver());

		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		} else {
			System.out.println("Please pass the correct browser value : " + browser);
		}
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return tlDriver.get();

	}

}
