package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;

public class TC002_CreateLead extends TestNgHooks{
	
	@Test
	public void createLead() {
		
		new LoginPage()
			.typeUserName("demosalesmanager")
			.typePassword("crmsfa")
			.clickLogin()
			.clickCrm()
			.clickLeadsTab()
			.clickCreateLeadMenu()
			.typeCompanyName("TestLeaf")
			.typeFirstName("Babu")
			.typeLastName("Manickam")
			.clickCreateLeadButton()
			.verifyFirstName("Babu");
	}

}

/* Page designed tests becomes easy to manage and highly verbose 
 * You can reuse the pages and its methods for other testscases
 * You can avoid duplicates !!
 * 
 */
