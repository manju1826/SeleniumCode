package InteliSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("input")).sendKeys("java",Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.id("matches"));
		int count=list.size();
		System.out.println("count of java matches are " +count);
		for (WebElement webElement : list) {
			System.out.println(webElement);
		}
		driver.close();
		
		//https://demo.guru99.com/test/newtours/login_sucess.php
		//mercury :username and psd
	}

}
