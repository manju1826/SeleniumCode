package TestNgProgram;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.security.Key;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngTest {
	@Test
	public void test() {
		System.out.println("test method");
		String s1 = "Java";
		String s2 = "Java";
		Assert.assertEquals(s1, s2, "check the condition");
		Assert.assertFalse(10 > 100, "compare values....");
	}
//	====================================================
@Test
public void seleniumTest()
{
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String title = driver.getTitle();

		Assert.assertEquals(title, "Google");

		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		Assert.assertTrue(search.isDisplayed());
		search.sendKeys("java", Keys.ENTER);
		driver.close();
	}
}
