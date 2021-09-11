package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class MyHomePage extends TestNgHooks {
	
	
	public MyLeadsPage clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}

}
