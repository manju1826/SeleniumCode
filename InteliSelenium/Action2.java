package InteliSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement image=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		Actions act= new Actions(driver);
		int x=image.getLocation().getX();
		
		int y=image.getLocation().getY();
		act.moveByOffset(x, y).contextClick().build().perform();
		
		//act.moveToElement(image,10, 30).contextClick().build().perform();
		
		driver.quit();
	}
	

}
