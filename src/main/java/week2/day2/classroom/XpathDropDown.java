package week2.day2.classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDropDown {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driv=new ChromeDriver();
		driv.get("http://leafground.com/pages/Dropdown.html");
		driv.manage().window().maximize();
		WebElement ele=driv.findElement(By.id("//select[@id='dropdown1']"));
		Select sec=new Select(ele);
		sec.selectByIndex(1);
		WebElement ele1=driv.findElement(By.id("//select[@name='dropdown2']"));
		Select sec1=new Select(ele1);
		sec1.selectByVisibleText("UFT/QTP");
		WebElement ele2=driv.findElement(By.id("//select[@id='dropdown3']"));
		Select sec2=new Select(ele2);
		sec2.selectByValue("4");
	//td[@class='titleCell']/following::a[1]
	}
}
