package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mprem\\OneDrive\\Desktop\\SelJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		// 1.CSS with ID syntax > tagname#id
		//driver.findElement(By.cssSelector("input#Register")).click();
		
		// 2.CSS with ClassName > tagname.className
		//driver.findElement(By.cssSelector("input.submitbtn")).click();

		// 3.CSS with other attribute > tagname[attribute=‘value’]
		//driver.findElement(By.cssSelector("input[value='Create my account >>']")).click();
		
		// 4.CSS with contains > tagname[attribute*=‘value’]
		//driver.findElement(By.cssSelector("input[value*='my']")).click();			
		
		// 5.CSS with starts-with > tagname[attribute^=‘value’]
		driver.findElement(By.cssSelector("input[name^='passwd']")).sendKeys("ABC");		
	
		// 6.CSS with ends-with > tagname[attribute$=‘value’]
		driver.findElement(By.cssSelector("input[value$='account >>']")).click();
	}
}