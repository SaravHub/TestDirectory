package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driv=new ChromeDriver();
		driv.get("http://leafground.com/pages/Dropdown.html");
		driv.manage().window().maximize();
		WebElement ele=driv.findElement(By.xpath("//select[@id='dropdown1']"));
		Select sec=new Select(ele);
		sec.selectByIndex(1);
		WebElement ele1=driv.findElement(By.xpath("//select[@name='dropdown2']"));
		Select sec1=new Select(ele1);
		sec1.selectByVisibleText("UFT/QTP");
		WebElement ele2=driv.findElement(By.xpath("//select[@id='dropdown3']"));
		Select sec2=new Select(ele2);
		sec2.selectByValue("4");
		driv.findElement(By.xpath("//section[@class='innerblock']/div[5]/select")).sendKeys("Appium");
		//WebElement ele3=driv.findElement(By.xpath("//section[@class='innerblock']/div[6]/select"));
		Actions action=new Actions(driv);
		WebElement opt1=driv.findElement(By.xpath("//section[@class='innerblock']/div[6]/select/option[text()='Appium']"));
		WebElement opt2=driv.findElement(By.xpath("//section[@class='innerblock']/div[6]/select/option[text()='Loadrunner']"));
		action.keyDown(Keys.LEFT_CONTROL);
		action.click(opt1);
		action.click(opt2);
		action.keyUp(Keys.LEFT_CONTROL);
		action.build().perform();
	}

}
