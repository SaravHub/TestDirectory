package week4.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();//Creating the Driver object
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		WebElement it1 = driver.findElement(By.xpath("//ol[@id='selectable']/li[text()='Item 1']"));
		WebElement it2 =driver.findElement(By.xpath("//ol[@id='selectable']/li[text()='Item 2']"));
		WebElement it3 =driver.findElement(By.xpath("//ol[@id='selectable']/li[text()='Item 3']"));
		WebElement it4 =driver.findElement(By.xpath("//ol[@id='selectable']/li[text()='Item 4']"));
		WebElement it6 =driver.findElement(By.xpath("//ol[@id='selectable']/li[text()='Item 6']"));
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL)
		.click(it1)
		.click(it2)
		.click(it3)
		.click(it4)
		.keyUp(Keys.CONTROL)
		.build().perform();
		driver.navigate().refresh();
		Thread.sleep(30);
		builder.clickAndHold(it1)
		.moveToElement(it6)
		.release().perform();
	}

}
