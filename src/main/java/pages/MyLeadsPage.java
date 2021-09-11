package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class MyLeadsPage extends TestNgHooks {
	
	
	public CreateLeadPage clickCreateLeadMenu() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	public FindLeadPage clickFindLeadMenu() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage();
	}
}
