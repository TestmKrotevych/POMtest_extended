package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pages.GoogleWelcome;
import pages.Results;

public class TestSteps  {
	 GoogleWelcome objPageOne;
	 Results objPageTwo;
	
	public   void performQueryTest ( WebDriver driver, String query)
	{
		objPageOne = new GoogleWelcome(driver);
		objPageOne.performSearch(query);
		objPageTwo = new Results (driver);
		Assert.assertTrue(objPageTwo.getSearchResSize() != 0);
	}

}
