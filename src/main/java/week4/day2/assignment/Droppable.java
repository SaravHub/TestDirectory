package week4.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Droppable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();//Creating the Driver object
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		WebElement dragele= driver.findElement(By.id("draggable"));
		WebElement dropele= driver.findElement(By.id("droppable"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(dragele,dropele).perform();
		String text = driver.findElement(By.xpath("//div[@id='droppable']/p")).getText();
		if(text.equals("Dropped!"))
			System.out.println("Element has been Dropped to the Target place...");
		else
			System.out.println("Element has not been Dropped to the Target place...");
	}

}
