package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://rediff.com");

		//driver.switchTo().frame("moneyiframe");//  using id or Name of Frame
		//driver.switchTo().frame(0);  // using index of iframe
		
		//Using WebElement as a argument
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"moneyiframe\"]")));
		String nse=driver.findElement(By.id("nseindex")).getText();
		System.out.println(nse);
		
		// Focusing on Parent HTML Page (Getting out of iframe)
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("SPORTS")).click();
		
	}
}
