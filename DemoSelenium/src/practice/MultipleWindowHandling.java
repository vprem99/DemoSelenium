package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://naukri.com");

		String PID = driver.getWindowHandle(); // Getting Parent Window ID
		Set<String> allWin = driver.getWindowHandles(); // Getting ID of All Windows

		for (String id : allWin) {
			// Focusing on Particular Browser Window
			driver.switchTo().window(id);
			//Printing Title
			System.out.println(driver.getTitle());

			if (!(id.equals(PID)))
				driver.close(); // Closing Tab | Browser Window
		}
	}
}
