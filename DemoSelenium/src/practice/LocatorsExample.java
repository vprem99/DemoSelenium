package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mprem\\OneDrive\\Desktop\\SelJar\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();  // Starting Chrome Browser
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(1500);
	//driver.findElement(By.className("panelTrigger")).click();
	driver.findElement(By.partialLinkText("Welcome")).click();
	Thread.sleep(1500);
	//driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(1500);	
	driver.quit(); // closing browser

	}
}