package InteliSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		WebElement dragele = driver.findElement(By.id("draggable"));
		WebElement dropele = driver.findElement(By.id("droppable"));
		
		
		Actions act = new Actions(driver);
		act.dragAndDrop(dragele, dropele).perform();
		String text = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		if (text.contains("Dropped!")) 
		{
			System.out.println("dropped");
		} else 
		{
			System.out.println("invalid");

		}

	}

}
