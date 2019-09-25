package test;

import org.testng.annotations.*;



public class JavaTest extends TestCore{
	
	
	
	@Test
	public void testJavaSearch () {
		
	
		TestSteps objSteps =new TestSteps();
		objSteps.performQueryTest(driver, "Java");
		
	}
	
	
}
