package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.GoogleWelcome;
import pages.Results;

public class JavaTest {
	WebDriver driver;
	//TestCore objCore;
	
	/*public String baseUrl = "http://google.com";
	String driverPath = "libdriver\\chromedriver.exe";
	
	
	
	GoogleWelcome objPageOne;
	Results objPageTwo;*/
	
	@BeforeTest
	public void initialize () {
		/*System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
	      driver.get(baseUrl);
	      driver.manage().window().maximize();	*/
		
		  //objCore =new TestCore ();
		
	      driver=TestCore.makeInitialisation();
	}
	
	
	@Test
	public void testJavaSearch () {
		
		/*objPageOne = new GoogleWelcome(driver);
		objPageOne.performSearch("Java");
		objPageTwo = new Results (driver);
		Assert.assertTrue(objPageTwo.getSearchResSize() != 0);*/
		
		TestCore.performQueryTest(driver, "Java");
	}
	
	@AfterTest
	public void end () {
		driver.close();
	}
}
