package practice;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mprem\\OneDrive\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		//Parent p=new Child > Due to this only common methods between Parent & Child is visible
		
		//ChromeDriver is Child of TakesScreenShot 
		driver.get("http://rediff.com");
		
		TakesScreenshot tc=(TakesScreenshot)driver; //Type Casting
		
		File src=tc.getScreenshotAs(OutputType.FILE);  // For Taking ScreenShot
		
		//For Copying from Java's Buffer Memory to Actual Memory
		FileHandler.copy(src, new File(".\\rediff.png")); 	
		driver.quit();
		
	}
}
