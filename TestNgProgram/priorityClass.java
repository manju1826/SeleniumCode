package TestNgProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priorityClass {
	
  @Test(priority = 1)
  public void login() {
	  System.out.println("login done");
		Assert.assertEquals("aa","aad");
  }
  
  @Test(priority = 2,dependsOnMethods = {"login"})
  public void payment() {
	  System.out.println("payment done");
		Assert.assertEquals("aa","aa");
  }
  
  @Test(priority = 3,dependsOnMethods = {"login","payment"} ,alwaysRun = true)
  public void logout() {
	  System.out.println("logout done");
		Assert.assertEquals("aa","aa");
  }
}
