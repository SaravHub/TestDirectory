package week4.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='10']")).click();
		driver.close();
	}

}
