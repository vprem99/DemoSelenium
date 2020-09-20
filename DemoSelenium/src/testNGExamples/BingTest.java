package testNGExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BingTest {
	WebDriver driver;

	@Test
	public void bingTitleVerification() {
		driver.get("http://bing.com");
		Assert.assertEquals(driver.getTitle(), "Bing India");
	}

	@Test(dependsOnMethods="bingTitleVerification")
	public void searchVerification() {
		driver.findElement(By.name("q")).sendKeys("magnetic automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), "magnetic automation - Bing");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mprem\\OneDrive\\Desktop\\SelJars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
