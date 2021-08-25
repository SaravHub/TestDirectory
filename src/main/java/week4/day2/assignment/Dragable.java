package week4.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dragable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();//Creating the Driver object
		driver.get("http://leafground.com/pages/drag.html");
		driver.manage().window().maximize();
		WebElement dragable= driver.findElement(By.id("draggable"));
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(dragable,100,200).perform();
	}

}
