package dataParameterization;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass{
	@Test(dataProvider="sendData")
	public void create(String cmpyName,String firstName,String lastName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
	}
	@DataProvider
	public String[][] sendData()
	{
		String[][] data=new String[1][3];
		data[0][0]="TestLeaf";
		data[0][1]="Hari";
		data[0][2]="R";
		//data[0][3]="97";
		return data;
	}
}