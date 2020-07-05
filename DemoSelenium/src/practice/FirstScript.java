package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	public static void main(String[] args) {

		// WebDriver is Interface & FirefoxDriver , ChromeDriver, OperaDriver
		// are Classes which implements WebDriver
		// WebDriver is Parent & ChromeDriver | OperaDriver | FirefoxDriver
		// are Child
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mprem\\OneDrive\\Desktop\\SelJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Parent p=new Child > Only Parent Specific functions will be
		// visible & rest every functions will be hidden

		driver.get("http://selenium.dev"); // Opening URL
		System.out.println(driver.getTitle());  // Pronting Title
		driver.quit(); // Closing Browser
	}
}