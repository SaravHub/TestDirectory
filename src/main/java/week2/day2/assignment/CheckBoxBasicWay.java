package week2.day2.assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxBasicWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//section[@class='innerblock']/div/div/input)[1]")).click();//JAVA
		driver.findElement(By.xpath("(//section[@class='innerblock']/div/div/input)[3]")).click();//sql
		driver.findElement(By.xpath("(//section[@class='innerblock']/div/div/input)[4]")).click();//c
		boolean bol=driver.findElement(By.xpath("(//section[@class='innerblock']/div/div/input)[6]")).isSelected();
		if(bol)
			System.out.println("Selenium is selected already");
		WebElement bol2=driver.findElement(By.xpath("(//section[@class='innerblock']/div/div/input)[8]"));
		if(bol2.isSelected())
			driver.findElement(By.xpath("(//section[@class='innerblock']/div/div/input)[8]")).click();
			System.out.println("Selected is unchecked now...");
		List<WebElement> lis=driver.findElements(By.xpath("//section[@class='innerblock']/div/div/input"));
		for(int i=8;i<lis.size();i++) {
			lis.get(i).click();
		}			
	}

}
