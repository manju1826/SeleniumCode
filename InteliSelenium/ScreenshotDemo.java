package InteliSelenium;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jars_sel\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/"); 
		
		Date date=new Date();
		DateFormat dateformat= new SimpleDateFormat("yyyy-MM-DD hh-ss");
		String time=dateformat.format(date);
		
		//take screenshot with below two lines
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("src\\InteliSelenium\\file" +time + ".png"));
		driver.quit();
		
		
	}

}
