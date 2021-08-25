package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignement2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();//Creating the Driver object
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//Verify we are in the correct page
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("saravanan");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td//a")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton' and text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("NewTestLeaf");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String txt=driver.getTitle();
		if(txt.equals("View Lead | opentaps CRM"))
			System.out.println("Title is Same as expected");
		else
			System.out.println("Not in correct page");
		String cmpyName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("New Company Name:"+cmpyName);
		cmpyName=cmpyName.replaceAll("[0-9()]", "");
		cmpyName=cmpyName.replaceAll("\\s", "");
		System.out.println(cmpyName);
		if(cmpyName.equals("NewTestLeaf"))
			System.out.println("New Company name updated Successfully...");
		else 
			System.out.println("Some interuption with the update process, please update again!!!");
		driver.close();
	}
}
