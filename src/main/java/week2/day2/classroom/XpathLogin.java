package week2.day2.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driv=new ChromeDriver();
		driv.get("http://leaftaps.com/opentaps/control/main");
		driv.manage().window().maximize();
		driv.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");;
		driv.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("crmsfa");
		driv.findElement(By.xpath("//input[@value='Login']")).click();
		driv.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driv.findElement(By.linkText("Leads")).click();
		driv.findElement(By.linkText("Merge Leads")).click();
		driv.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a/img ")).click();	
	//td[@class='titleCell']/following::a[1]
	}

}
