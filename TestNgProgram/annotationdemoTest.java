package TestNgProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotationdemoTest {
	
	 @BeforeSuite
	  public void beforeSuite() {
	  }
	 
	 @BeforeTest
	  public void beforeTest() {
	  }
	 @BeforeClass
	  public void beforeClass() {
	  }
	 
  @BeforeMethod
  public void beforeMethod() {
  }

  @Test
  public void fTest() {
    throw new RuntimeException("Test not implemented");
  }
  @AfterMethod
  public void afterMethod() {
  }

  

  @AfterClass
  public void afterClass() {
  }

 

  @AfterTest
  public void afterTest() {
  }

 

  @AfterSuite
  public void afterSuite() {
  }



}
