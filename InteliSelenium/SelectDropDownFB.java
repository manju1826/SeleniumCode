package InteliSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownFB {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.linkText("Create New Account")).click();
			Thread.sleep(2000);

			WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
			Select selectDay= new Select(day);
			selectDay.selectByValue("18");
			Thread.sleep(1000);
			
			WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
			Select selectMonth= new Select(month);
			selectMonth.selectByVisibleText("Apr");
			Thread.sleep(1000);
			
			
			WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
			Select selectYear= new Select(year);
			selectYear.selectByValue("2021");
			Thread.sleep(1000);
			
			
			List<WebElement> allDayEle=selectDay.getOptions();
			for(WebElement allday:allDayEle)
			{
				System.out.println("value of all day is "+ allday);
				selectDay.selectByValue("23");   
				
			}
			
			
	
	}
}
