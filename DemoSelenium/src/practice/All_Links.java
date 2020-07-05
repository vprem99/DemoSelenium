package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Links {
	public static void main(String[] args) {
		// 1.What is Links
		/*
		 * Links are having always tag as 'a' & these are used to connect two Pages
		 */
		// 2.Start Browser & Open URL
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mprem\\OneDrive\\Desktop\\SelJar\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		// 3.What is difference between findElement & findElements()
		/*
		 * findElement > Working with Single Object findElements > Working with Multiple
		 * Object having some Common Property
		 */
		// 4.Get All available links
		List<WebElement> ls = driver.findElements(By.tagName("a"));

		// 5.Print the size of links
		int sz = ls.size();
		System.out.println("Total Links available " + sz);
		// 6.Print all links

		for (int i = 0; i < sz; i++) {
			System.out.print((i+1)+" ");
			System.out.println(ls.get(i).getText());
		}
		
		ls.get(2).click();
	}
}