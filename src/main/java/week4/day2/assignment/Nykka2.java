package week4.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykka2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement brand = driver.findElementByXPath("//a[text()='brands']");
		Actions builder = new Actions(driver);
		builder.moveToElement(brand).perform();
		//WebElement popular = driver.findElementByXPath("//a[text()='Popular']");
		driver.findElementByXPath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> newWin = new ArrayList<String>(windowHandles);
		driver.switchTo().window(newWin.get(1));
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Title Matched");
		}
		driver.findElementByXPath("//span[@title='POPULARITY']").click();
		driver.findElementByXPath("//input[@id='3']/following-sibling::div[1]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[text()='Category']").click();
		driver.findElementByXPath("//span[text()='Hair']").click();
		driver.findElementByXPath("//span[text()='Hair Care']").click();
		driver.findElementByXPath("//span[text()='Shampoo']").click();
		String text = driver.findElementByXPath("//li[text()='Shampoo']").getText();
		System.out.println(text);
		if(text.contains("Shampoo"))
		{
			System.out.println("Title Matched");
		}
		driver.findElementByXPath("//span[contains(text(),'Colour Protect')]").click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> newWin1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(newWin1.get(2));
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='175ml']").click();
		String text2 = driver.findElementByXPath("//span[text()='MRP:']").getText();
		driver.findElementByXPath("//button[text()='ADD TO BAG']").click(); 
		driver.findElementByXPath("//div[@class='cursor-hand arrowup-tooltip']//div[1]").click();
		String text3 = driver.findElementByXPath("//div[@class='value medium-strong']").getText();
		System.out.println(text3);
		driver.findElementByXPath("//span[text()='Proceed']").click(); 
		WebElement element = driver.findElementByXPath("(//button[contains(@class,'btn full')])[2]");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		String text4 = driver.findElementByXPath("(//div[@class='value']//span)[2]").getText();
		
		if(text2.equals(text4))
		{
			System.out.println("Price Matched");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
