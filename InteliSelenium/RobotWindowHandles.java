package InteliSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotWindowHandles {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");

		String mainWindowId=driver.getWindowHandle();
		driver.findElement(By.xpath("//div[contains(text(),'Register')]")).click();
		Thread.sleep(1000);
		
		Set<String> childID= driver.getWindowHandles();
		for(String childWindows: childID)
		{
			if(!childWindows.matches(mainWindowId))
			{
				driver.switchTo().window(childWindows);
			}
		}
		
		
		//scroll
		JavascriptExecutor scrollj=((JavascriptExecutor)driver);
		scrollj.executeScript("scroll(+10,+300)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Upload Resume')]")).click();
		Robot  robo=new Robot();
		StringSelection sel=new StringSelection("C:\\Users\\manju\\OneDrive\\Desktop\\Manju Tripathi_Resume.docx");//for path in build class Stringselection
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);//toolkit class to save in memory from above path
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		driver.close();
		
	

				
		
		
	}

}
