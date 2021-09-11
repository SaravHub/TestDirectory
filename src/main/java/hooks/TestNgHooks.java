package hooks;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgHooks{
	
	// I wanted to have single browser reference 
	// Can't I run in parallel? Yes, you cannot run. 
	public static RemoteWebDriver driver;
	
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public ExtentTest test;
	
	public String testCaseName, testCaseDiscription, author, category;
	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./report/MyReport.html");
		extent =new ExtentReports();
		extent.attachReporter(reporter);	
	}
	
	@BeforeClass
	public void report() {
		test=extent.createTest(testCaseName, testCaseDiscription);
		test.assignAuthor(author);
		test.assignCategory(category);
	}
    
	// launch the browser
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	// close the browser
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	@AfterSuite
	public void closeReport() {
		extent.flush();
	}
	
	

}
