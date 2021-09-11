package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;
public class TC003_FindLead extends TestNgHooks{
	@Test
	public void findLead() throws InterruptedException {
		
		new LoginPage()
			.typeUserName("demosalesmanager")
			.typePassword("crmsfa")
			.clickLogin()
			.clickCrm()
			.clickLeadsTab()
			.clickFindLeadMenu()
			.clickFindByPhone()
			.typePhoneNumber("99")
			.clickFindLeadsBtn()
			.checkRecordsListed();
			/*.clickCreateLeadMenu()
			.typeCompanyName("TestLeaf")
			.typeFirstName("Babu")
			.typeLastName("Manickam")
			.clickCreateLeadButton()
			.verifyFirstName("Babu");*/
	}
}
