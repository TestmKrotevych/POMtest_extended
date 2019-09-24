package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.GoogleWelcome;
import pages.Results;

public class TestCore {
	public String baseUrl = "http://google.com";
	String driverPath = "libdriver\\chromedriver.exe";
	WebDriver driver;
	GoogleWelcome objPageOne;
	Results objPageTwo;
	
	public  WebDriver makeInitialisation () {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	      driver.get(baseUrl);
	      driver.manage().window().maximize();	
	      return driver;
	}
	
	public void performQueryTest (WebDriver driver, String query)
	{
		objPageOne = new GoogleWelcome(driver);
		objPageOne.performSearch(query);
		objPageTwo = new Results (driver);
		Assert.assertTrue(objPageTwo.getSearchResSize() != 0);
	}
}
