package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); // To Maximize window
		Actions ac=new Actions(driver);
		
		driver.get("https://jqueryui.com/droppable/");
		//Switching to iframe
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement des=driver.findElement(By.id("droppable"));
		//Drag and Drop
		ac.dragAndDrop(src, des).perform();


	}

}
