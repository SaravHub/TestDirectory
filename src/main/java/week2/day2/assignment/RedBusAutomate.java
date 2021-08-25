package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='src']/following::li[1]")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='dest']/following::li[1]")).click();
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		driver.findElement(By.xpath("//div[@class='rb-calendar']//following::td[text()=29]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("close")).click();
		String busCount=driver.findElement(By.xpath("//span[contains(@class,'busFound')]")).getText();
		int count=Integer.parseInt(busCount.replaceAll("\\D", ""));
		System.out.println("Total Bus(s)Found: "+count);
		driver.findElement(By.xpath("//label[contains(text(),'SEATER')]/preceding-sibling::label")).click();
		//To Filter by Seater
		String busCount1=driver.findElement(By.xpath("//span[contains(@class,'busFound')]")).getText();
		int count1=Integer.parseInt(busCount1.replaceAll("\\D", ""));
		System.out.println("Seater Bus(s)Found: "+count1);
		//To Filter by AC also
		String busCount2=driver.findElement(By.xpath("//span[contains(@class,'busFound')]")).getText();
		int count2=Integer.parseInt(busCount2.replaceAll("\\D", ""));
		System.out.println("AC Bus(s)Found: "+count2);
	}

}
