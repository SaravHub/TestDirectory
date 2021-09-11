package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class CreateLeadPage extends TestNgHooks {
	
	
	public CreateLeadPage typeCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		return this;
	}
	
	public CreateLeadPage typeFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}
	
	public CreateLeadPage typeLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
