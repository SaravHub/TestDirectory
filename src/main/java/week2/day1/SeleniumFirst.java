package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Will download and get the ChromeDriver
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravanan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KB");
		driver.findElement(By.className("smallSubmit")).click();
		String txt=driver.getTitle();
		if(txt.equals("View Lead | opentaps CRM"))
			System.out.println("Title is Same as expected");
		else
			System.out.println("Not in correct page");
		String cmpyName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("CompanyName"+cmpyName);
		System.out.println(cmpyName.replaceAll("\\D", ""));
		}
}
