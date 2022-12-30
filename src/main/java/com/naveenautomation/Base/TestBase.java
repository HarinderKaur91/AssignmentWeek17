package com.naveenautomation.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;

	public void launchBrowser() {

		String browserFortesting = "chrome";

		switch (browserFortesting.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Invalid browser");
			break;
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Manage the page load timeout
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		// Manage the script load timeout
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		driver.manage().window().maximize();
	}
	
	public void quitBrowser() {
		//closing the browser
		//driver.quit();
	}

}
