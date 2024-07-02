package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004_EditLead";
		testCaseName = "TC004_EditLead";
		testDescription = "To Enter Mandatory Details";
		category= "Smoke";
		authors	="Nesa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logIn(String userName, String passWord, String ChangeCompanyName, String fName, String lName, String NewCompanyName) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()		
		.enterFirstName(fName)
		.clickFindLeadsButton()
		.clickLeadID()
		.clickEdits()
		.enterChangeCompanyName(ChangeCompanyName)
		.clickUpdate();
		
	
		
		
		
		
		
					
	}

	private void clickUpate() {
		// TODO Auto-generated method stub
		
	}

}
