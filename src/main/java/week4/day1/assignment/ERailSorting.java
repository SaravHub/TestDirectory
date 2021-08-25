package week4.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERailSorting {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();//Creating the Driver object
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.ENTER);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu",Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		Thread.sleep(2000);
		WebElement table=driver.findElement(By.xpath("//div[@id='divTrainsList']//table"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		List<String> li=new ArrayList<String>();
		for (int i = 0; i < rows.size(); i++) {
			WebElement rowtxt = rows.get(i);
			List<WebElement> allcol = rowtxt.findElements(By.tagName("td"));
			String text = allcol.get(1).getText();
			li.add(text);
		}
		Collections.sort(li);
		for (String trains : li) {
			System.out.println(trains);
		}
		
	}

}
