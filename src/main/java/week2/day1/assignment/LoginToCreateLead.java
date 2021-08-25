package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToCreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();//Creating the Driver object
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		//Verify we are in the correct page
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saravanan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KB");
		WebElement element=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select src=new Select(element);
		src.selectByValue("LEAD_WORDOFMOUTH");
		WebElement market=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select eCom=new Select(market);
		eCom.selectByIndex(6);
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Feros");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Gandhi");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Victory");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/01/1995");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("BIT $ COIN");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Commerce");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1050000");
		WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select cur=new Select(currency);
		cur.selectByVisibleText("AED - United Arab Emirates Dirham");
		WebElement indus=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select ind=new Select(indus);
		ind.selectByVisibleText("Manufacturing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2000");
		WebElement mark1=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select mark=new Select(mark1);
		mark.selectByIndex(3);
		driver.findElement(By.name("sicCode")).sendKeys("Sic_123456");
		driver.findElement(By.name("tickerSymbol")).sendKeys("#");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lorem ipsum loren ipsum loren ipsum.....");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("For drop down 3 ways can do.(Index,VisibleText and Value)");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("567");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9999990991");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("xyz");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("maxx@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.meant.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Ureka");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Gear");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3,Dubai Main Road");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("dubai cross street, Dubai");
		driver.findElement(By.name("generalCity")).sendKeys("Florida");
		WebElement con=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country=new Select(con);
		country.selectByValue("IND");
		Thread.sleep(1000);
		WebElement state1=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(state1);
		state.selectByVisibleText("KERALA");
		driver.findElement(By.name("generalPostalCode")).sendKeys("625001");
		driver.findElement(By.name("generalPostalCodeExt")).sendKeys("025");
		
		driver.findElement(By.className("smallSubmit")).click();
		String txt=driver.getTitle();
		if(txt.equals("View Lead | opentaps CRM"))
			System.out.println("Title is Same as expected");
		else
			System.out.println("Not in correct page");
		String cmpyName=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("CompanyName:"+cmpyName);
		System.out.println("--------------------------");
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();;
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Mouritius");
		driver.findElement(By.className("smallSubmit")).click();
		String dupCmpy = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(cmpyName.equals(dupCmpy))
			System.out.println("Duplicate company name still exist!!!");
		else
			System.out.println("New Company("+dupCmpy+")has been entered...");
		driver.close();
	}

}
