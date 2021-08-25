package week4.day1.classroom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElementByXPath("//button[text()='Confirm Box']").click();
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();
        driver.findElementByXPath("//button[text()='Confirm Box']").click();
        alert1.dismiss();
        driver.findElementByXPath("//button[text()='Prompt Box']").click();
        alert1.sendKeys("TextField Edited");
        alert1.accept();
		
		
	}

}
