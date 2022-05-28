package InteliSelenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.hdfcbank.com/netbanking");
	Thread.sleep(5000);
	String title = driver.getTitle();
	System.out.println(title);
	driver.switchTo().frame("login_page");
	driver.findElement(By.xpath("//div[@id='nortonimg1']//a[contains(text(),'Know')]")).click();
	Thread.sleep(5000);
	ArrayList<String> windowsids=new ArrayList<>(driver.getWindowHandles());
	
	//driver.switchTo().window(get(1));
}
}
