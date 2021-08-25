package mock.exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		List<WebElement> checkbox= driver.findElements(By.xpath("//div[@class='example'][1]//input[@type='checkbox']"));
		for (WebElement webElement : checkbox) {
			System.out.println(webElement);
			webElement.click();
		}
	}

}
