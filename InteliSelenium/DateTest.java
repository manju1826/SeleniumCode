package InteliSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.name("txtJourneyDate")).click();
		List<WebElement> date=driver.findElements(By.xpath("//table/tbody/tr/td/a"));
		for (int i=0; i < date.size(); i++) 
		{
		List<WebElement> date1=driver.findElements(By.xpath("//table/tbody/tr/td/a"));
		String text=date1.get(i).getText();
		//date1.get(i).click();
		///driver.findElement(By.name("txtJourneyDate")).click();
		if(text.contains("28"))
		{
			date1.get(i).click();
			System.out.println("selected date is clicked :" +" " +text);
			break;
		}
		driver.findElement(By.name("txtJourneyDate")).click();
		}
		
		driver.quit();
	}

}
