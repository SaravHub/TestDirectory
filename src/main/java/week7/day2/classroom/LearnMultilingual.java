package week7.day2.classroom;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMultilingual {
	public static void main(String[] args) throws IOException {
		FileInputStream fil=new FileInputStream("./data/config.properties");
		Properties prop=new Properties();
		prop.load(fil);
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.name("USERNAME")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
}
