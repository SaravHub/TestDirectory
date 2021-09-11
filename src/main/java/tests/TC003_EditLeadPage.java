package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;
import pages.LoginPage;

public class TC003_EditLeadPage extends TestNgHooks{
	@Test
	public void editPage() throws InterruptedException {
		new LoginPage()
		.typeUserName("demosalesmanager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCrm()
		.clickLeadsTab()
		.clickFindLeadMenu()
		.clickFindByPhone()
		.typePhoneNumber("987")
		.clickFindLeadsBtn()
		.clickOnFirstRecord()
		.clickEditBtn()
		.typeCmpyName()
		.clickUpdateBtn();
	}
}
