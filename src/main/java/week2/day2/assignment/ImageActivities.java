package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("(//section[@class='innerblock']//following::img)[1]")).click();
		driver.navigate().back();
		String str=driver.findElement(By.xpath("(//section[@class='innerblock']//following::img)[2]")).getAttribute("src");
		driver.get(str);
		String title = driver.getTitle();
		driver.navigate().back();
        if(title.contains("404")) 
            System.out.println("Image is Broken");
        else 
        	System.out.println("Image is not Broken");
	    driver.findElement(By.xpath("(//section[@class='innerblock']//following::img)[3]")).click();
	    driver.close();
	}

}
