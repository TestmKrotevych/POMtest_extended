package test;



import org.testng.annotations.*;






public class RubyTest extends TestCore{
	
	
	
	
	
	
	@Test
	public void testJavaSearch () {
		
	
		TestSteps objSteps =new TestSteps();
		objSteps.performQueryTest(driver, "Ruby");
		
		
		
		
	}
	
	
}
