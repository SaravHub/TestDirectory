package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class HomePage extends TestNgHooks {
	
	public LoginPage clickLogout() {
		driver.findElement(By.xpath("//input[@value='Logout']")).click();
		return new LoginPage();
	}
	
	public MyHomePage clickCrm() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
