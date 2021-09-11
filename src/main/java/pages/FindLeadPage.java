package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;

public class FindLeadPage extends TestNgHooks{
	
	public FindLeadPage clickFindByPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadPage typePhoneNumber(String phNum) {
		driver.findElement(By.name("phoneNumber")).sendKeys(phNum);
		return this;
	}
	public FindLeadPage clickFindLeadsBtn() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;	
	}
	public FindLeadPage checkRecordsListed(){
		String rcrd=driver.findElement(By.className("x-paging-info")).getText();
		if(rcrd.equals("No records to display"))
			System.out.println("No Leads to display in this phoneNumber");
		else
			System.out.println("Records are exists for this phoneNumber!!!");
		return this;	
	}
	public FindLeadPage clickOnFirstRecord() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return this;
	}
	public FindLeadPage clickEditBtn() {
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}
	public FindLeadPage typeCmpyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	public  FindLeadPage clickUpdateBtn() {
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
	
}
