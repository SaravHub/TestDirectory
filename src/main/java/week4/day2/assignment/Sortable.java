package week4.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Sortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();//Creating the Driver object
		driver.get("http://leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		WebElement item1= driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item6= driver.findElement(By.xpath("//li[text()='Item 6']"));
		/*Point loc=item6.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		System.out.println(x+","+y);*/
		Actions builder=new Actions(driver);
		builder.dragAndDrop(item1, item6).perform();
		/*Action dragAndDrop = builder.clickAndHold(item1)
				.moveToElement(item6)
				.release(item6)
				.build();

				//Performing the drag and drop action
				dragAndDrop.perform();*/
	}

}
