package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.magneticautomation.in/2019/01/alert-example.html");

		driver.findElement(By.xpath("//*[@id=\"post-body-5405753133268992336\"]/div/button[3]")).click();

		Alert a = driver.switchTo().alert();

		System.out.println(a.getText());
		a.sendKeys("Google");

		//a.accept();   // Pressing OK
		
		a.dismiss();   // Pressing on Cancel 
		
		
	}
}
