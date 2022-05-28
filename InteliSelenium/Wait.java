package InteliSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		//implicit wait for entire code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		

		WebElement username=driver.findElement(By.name("userName"));
		
		//explicit for condition and polling ll be every 500ms
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.attributeToBe(By.name("userName"), "name", "userName"));
		
		WebElement password=driver.findElement(By.name("password"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		
		WebElement submit=driver.findElement(By.name("submit"));
		username.sendKeys("mercury");
		password.sendKeys("mercury");
		submit.click();
		
		
		
	}

}
