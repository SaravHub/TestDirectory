package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@class='innerblock']/div[2]/div/div/a")).getAttribute("href");
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String str404=driver.findElement(By.tagName("h1")).getText();
		System.out.println("page is not found(Broken)since its showing: "+str404);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@class='innerblock']/div[4]/div/div/a")).getAttribute("href");
		//String str=driver.findElements(By.tagName("a")).getAttribute("href");
		//System.out.println(str);	
	}

}
