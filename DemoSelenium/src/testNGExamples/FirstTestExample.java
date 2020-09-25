package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class FirstTestExample {
	WebDriver driver;

	@Test
	public void titleTest() {
		System.out.println("In Test");
		driver.get("http://google.com");
		Assert.assertEquals(driver.getTitle(), "Google India");
	}

	@BeforeTest // Pre-Condition
	public void beforeTest() {
		System.out.println("In Before Test");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mprem\\OneDrive\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		// Parent p=new Child()
	}

	@AfterTest // Post-Condition
	public void afterTest() {
		System.out.println("In After Test");
		driver.quit();
	}

}
