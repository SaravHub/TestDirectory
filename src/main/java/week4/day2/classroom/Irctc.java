package week4.day2.classroom;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://irctc.co.in");
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();         
		options.addArguments("--disable-notifications"); 
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windows = driver.getWindowHandles();
		List<String> wins=new LinkedList<String>(windows);
		driver.switchTo().window(wins.get(1));
		System.out.println(driver.getTitle());
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='block-nav-right d-none d-md-block'])[2]/a/i//following-sibling::text()"));
		System.out.println(findElement.getText());
		driver.close();
		driver.switchTo().window(wins.get(0));
		driver.getTitle();
	}

}
