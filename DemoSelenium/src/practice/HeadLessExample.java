package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessExample {

	public static void main(String[] args) {

		
		/*System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options); */
		
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		options.addArguments("--headless");
		WebDriver driver=new FirefoxDriver(options);
		

		driver.get("https://blazedemo.com/");

		// Printing all Options
		String allOptions = driver.findElement(By.name("fromPort")).getText();

		System.out.println(allOptions);

		driver.quit();
	}
}