package week4.day1.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();//Creating the Driver object
		driver.get("http://www.leafground.com/pages/table.html");
		String per=driver.findElement(By.xpath("(//tr[@class='even'])[1]/td[2]")).getText();
		System.out.println("Progress value of 'Learn to interact with Elements'(Using X-path):"+per);
		
		WebElement webTable=driver.findElement(By.id("table_id"));
		List<WebElement> tbRow = webTable.findElements(By.tagName("tr"));
		int tbRowSize = tbRow.size();
		System.out.println("Row Size:"+tbRowSize);
		WebElement tbCol=tbRow.get(2);
		List<WebElement> tds = tbCol.findElements(By.tagName("td"));
		System.out.println("Column Size:"+tds.size());
		System.out.println("Progress value of 'Learn to interact with Elements'(Using Table Context):"+tds.get(1).getText());
		List<WebElement> cols = driver.findElements(By.xpath("//table//tr//td[2]"));
		List<Integer> vital=new ArrayList<Integer>();
		for (WebElement vitalVal : cols) {
			String min=vitalVal.getText().replaceAll("%", "");
			vital.add(Integer.parseInt(min));
		}
		Collections.sort(vital);
		int min=vital.get(0);
		driver.findElement(By.xpath("//td[contains(text(),'"+min+"')]/following-sibling::td/input")).click();
		System.out.println("Min progress value for vital mark is checked");
	}

}
