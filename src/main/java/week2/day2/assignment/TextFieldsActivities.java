package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldsActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElement(By.id("email")).sendKeys("dummy@gamil.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Some Values Appended",Keys.TAB);
		String txt=driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value");
		System.out.println("Text in the field: "+txt);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean value = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isDisplayed();
		System.out.println("Return true if Last TextField is Disabled :"+value);
	}

}
