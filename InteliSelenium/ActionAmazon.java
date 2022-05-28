package InteliSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAmazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		WebElement ele1=driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));

		WebElement ele2=driver.findElement(By.xpath("//span[contains(text(),'Your Recommendations')]"));
		act.moveToElement(ele1).moveToElement(ele2).doubleClick().build().perform();
		driver.quit();
	}

}
