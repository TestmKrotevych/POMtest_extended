package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.GoogleWelcome;
import pages.Results;

public class TestCore {
	public static String baseUrl = "http://google.com";
	static String driverPath = "libdriver\\chromedriver.exe";
	static WebDriver driver;
	static GoogleWelcome objPageOne;
	static Results objPageTwo;
	
	public  static WebDriver makeInitialisation () {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	      driver.get(baseUrl);
	      driver.manage().window().maximize();	
	      return driver;
	}
	
	public static void performQueryTest (WebDriver driver, String query)
	{
		objPageOne = new GoogleWelcome(driver);
		objPageOne.performSearch(query);
		objPageTwo = new Results (driver);
		Assert.assertTrue(objPageTwo.getSearchResSize() != 0);
	}
}
