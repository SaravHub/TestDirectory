package week4.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LensKart {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();         
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.lenskart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement comGlass = driver.findElement(By.linkText("Computer Glasses"));
		Actions act=new Actions(driver);
		act.moveToElement(comGlass);
		WebElement prmRng = driver.findElement(By.xpath("//span[text()='PREMIUM RANGE']"));
		act.moveToElement(prmRng);
		act.click().build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Round']")).click();
		Thread.sleep(3000);		
	
		List<WebElement> findElements = driver.findElements(By.xpath("//div[text()='FRAME COLOR']//following-sibling::ul//input"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Integer> li=new ArrayList<Integer>();
		for (int i = 1; i < findElements.size(); i++) {
			WebElement clor= driver.findElement(By.xpath("(//div[text()='FRAME COLOR']//following-sibling::ul//span)["+i+"]"));
			String str=clor.getText().replaceAll("[a-zA-z()]", "");
			System.out.print(str+",");
			li.add(Integer.parseInt(str));
		}
		Collections.sort(li, Collections.reverseOrder());
		int high=li.get(0);
		System.out.println("High-"+high);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)");
		driver.findElement(By.xpath("//span[contains(text(),'Black("+high+")')]/preceding-sibling::input/parent::label")).click();
		/*Actions checkBox=new Actions(driver);
		checkBox.moveToElement(findElement);
		checkBox.click().build().perform();*/
		String[] split = driver.findElement(By.xpath("//div[@class='show_count']")).getText().replaceAll("[a-zA-z()]", "").split(" ");
		System.out.println("Products Available:"+split[3]);
		if (high==Integer.parseInt(split[3])) 
			System.out.println("Products dispalying and Checked count are same");
		else
			System.out.println("Products dispalying and Checked count are diff...!");
		//driver.close();
	}

}
