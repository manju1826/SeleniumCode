package InteliSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers_launch {

	WebDriver driver;
	
	
	public void ChromeLaunch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	
	}
	
	public void FireFoxLaunch() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Jars_sel\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	Browsers_launch  bl=new Browsers_launch();
	bl.ChromeLaunch();
	bl.FireFoxLaunch();

	}

}
