package InteliSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//div[@id='corover-close-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
	
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		if(text.contains("Please select start place"))
		{
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			System.out.println("pop is accepted");
		}
		else
		{
			System.out.println("alert pop is invalid..");
			driver.switchTo().alert().dismiss();
		}
		driver.close();
		
	
		

	}

}
