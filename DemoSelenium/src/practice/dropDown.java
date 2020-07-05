package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mprem\\OneDrive\\Desktop\\SelJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.magneticautomation.in/p/drop-down-example.html");

		WebElement E = driver.findElement(By.name("cars"));

		Select s = new Select(E);
		// s.selectByVisibleText("Audi");

		// s.selectByIndex(0);
		s.selectByValue("saab");

		System.out.println(s.isMultiple());

		WebElement E2 = driver.findElement(By.name("multi"));
		Select s2=new Select(E2);
		s2.selectByVisibleText("One");
		s2.selectByVisibleText("Three");
		Thread.sleep(1500);
		//s2.deselectByIndex(0);
		s2.deselectAll();
		
		s.deselectAll();
	}
}