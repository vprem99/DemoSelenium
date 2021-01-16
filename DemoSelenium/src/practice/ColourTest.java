package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class ColourTest {

	public static void main(String[] args) {
		// Start Our Browser & Url
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://blazedemo.com");

		WebElement E = driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));

		String backColor = E.getCssValue("background-color");

		System.out.println(backColor);

		String hexBackColor = Color.fromString(backColor).asHex();
		

		System.out.println(hexBackColor);

		if (hexBackColor.equals("#006dcc"))
			System.out.println("Test for Find Flight Passed");
		else
			System.out.println("Test for Find Flight Failed");

	}

}
