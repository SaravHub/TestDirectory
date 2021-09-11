package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;

public class TC001_LoginLogout extends TestNgHooks{
	@BeforeTest
	public void setValues() {
		testCaseName ="Login Scenario";
		testCaseDiscription ="Login and logout Checking scenario";
		author="Sarav";
		category="Smoke";
	}
	
	@Test
	public void loginLogout() {
		
		new LoginPage()
			.typeUserName("demosalesmanager")
			.typePassword("crmsfa")
			.clickLogin()
			.clickLogout();
		
		/*LoginPage login = new LoginPage();
		login.typeUserName("demosalesmanager");
		login.typePassword("crmsfa");
		login.clickLogin();
		HomePage home = new HomePage();
		home.clickLogout();*/
		
		//new LoginPage().typeUserName("").typePassword(null)
		
	}

}

/* Page designed tests becomes easy to manage and highly verbose 
 * 
 * 
 * 
 */
