package week4.day2.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykka {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();         
		options.addArguments("--disable-notifications");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement brands = driver.findElement(By.xpath("//div[@id='headerMenu']//ul[2]/li[1]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(brands);
		WebElement pop = driver.findElement(By.xpath("//div[@class='BrandsCategoryHeading']/a[contains(text(),'Popular')]"));
		act.moveToElement(pop);
		WebElement prod = driver.findElement(By.xpath("//div[@id='brandCont_Popular']/ul//following::img[contains(@src,'lorealparis')]"));
		act.moveToElement(prod);
		act.click().build().perform();
		Set<String> winHan = driver.getWindowHandles();
		List<String> winList=new ArrayList<String>(winHan);
		driver.switchTo().window(winList.get(1));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = driver.getTitle();
		if(title.contains("L'Oreal Paris"))
		{
			System.out.println("Title Matched:In Second Window!");
		}
		driver.findElement(By.xpath("//span[@title='POPULARITY']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		WebElement cato = driver.findElement(By.xpath("//div[text()='Category']"));
		act.moveToElement(cato);
		act.click().build().perform();
		WebElement hair=driver.findElement(By.xpath("//span[text()='Hair']"));
		act.moveToElement(hair);
		act.click().build().perform();
		WebElement hair1=driver.findElement(By.xpath("//span[text()='Hair Care']"));
		act.moveToElement(hair1);
		act.click().build().perform();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String text2=driver.getTitle();
		if(text2.contains("Shampoo"))
		{
			System.out.println("Title Matched:in Third Window");
		}
		driver.findElement(By.xpath("//span[text()=\"L'Oreal Paris Colour Protect Shampoo\"]")).click();
		Set<String> newWin= driver.getWindowHandles();
		List<String> winList1=new ArrayList<String>(newWin);
		driver.switchTo().window(winList1.get(2));
		System.out.println("Third Window Title:"+driver.getTitle());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='175ml']")).click();
		driver.findElementByXPath("//button[text()='ADD TO BAG']").click(); 
		
		driver.findElementByXPath("//div[@class='cursor-hand arrowup-tooltip']//div[1]").click();
		String text3 = driver.findElementByXPath("//div[@class='value medium-strong']").getText();
		System.out.println(text3);
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Proceed']").click(); 
		WebElement element = driver.findElementByXPath("(//button[contains(@class,'btn full')])[2]");
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		String text4 = driver.findElementByXPath("(//div[@class='value']//span)[2]").getText();
		
		if(text2.equals(text4))
		{
			System.out.println("Price Matched:"+text4);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
