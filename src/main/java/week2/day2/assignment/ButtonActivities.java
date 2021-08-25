package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		float btn_x=driver.findElement(By.id("position")).getLocation().getX();
		float btn_y=driver.findElement(By.id("position")).getLocation().getY();
		System.out.println("Position of Button(x,y): "+btn_x+","+btn_y);
		String color=driver.findElement(By.id("color")).getCssValue("bakground-color");
		System.out.println("Color of the button: "+color);
		Dimension size=driver.findElement(By.id("size")).getSize();//type should be dimension
		System.out.println("Dimension of Button: "+size);
	}

}
