package InteliSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Forgotten account?")).click();
		String currenturl=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println(currenturl);
		System.out.println(title);
		if (title.matches("Facebook -log in "))
		{
			System.out.println("page is valid");
		}
		else 
		{
			System.out.println("page is invalid");
		}
		driver.findElement(By.partialLinkText("Account")).click();
		try {
			System.out.println("click on account button successfully");
			
		} catch (Exception e) {
			System.out.println("not able to click");
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		driver.close();
		
	}

}
