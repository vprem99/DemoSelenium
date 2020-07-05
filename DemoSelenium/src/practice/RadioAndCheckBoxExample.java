package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBoxExample {

	public static void main(String[] args) {

		// 1.What is Radio button & Checkbox on Web Page

		// 2.Start Browser & Open URL
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.facebook.com/");

		// 3.Identify Radio button with CSS | XPath
		// htmltag[property='value of that property']
		// WebElement gender = driver.findElement(By.cssSelector("input[value='2']"));

		// Syntax >> //htmltag[@property='value of that property']
		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		// 4.Click on Radio Button
		gender.click();

		// 5.Check Radio button is Clicked or Not
		System.out.println("Radio selection is " + gender.isSelected());
		
		*/
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		WebElement rem=driver.findElement(By.cssSelector("input[value='1']"));
		
		System.out.println("Remember me is Selected before Click "+rem.isSelected());
		
		
		rem.click();
		
		System.out.println("Remember me is Selected after Click "+rem.isSelected());

	}
}
