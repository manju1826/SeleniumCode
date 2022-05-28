package InteliSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String currenturl=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println("current url is " +" "+currenturl);
		System.out.println("current title is " +" "+title);
		driver .quit();
	
  ChromiumDriver ch=new ChromeDriver();
  RemoteWebDriver D= new ChromeDriver();
}
	

}
