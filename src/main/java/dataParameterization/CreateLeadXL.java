package dataParameterization;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLeadXL extends BaseClassDataParameterization{
	String fileName="CreateLead";
	@Test(dataProvider="fetchData")
	public void create(String cmpyName,String firstName,String lastName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		//driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
	}
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException
	{
		ReadExcel rxl=new ReadExcel();
		return rxl.readData(fileName);
		
	}
}
