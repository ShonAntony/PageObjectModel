package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006_DeleteLead";
		testCaseName = "TC006_DeleteLead";
		testDescription = "To Enter Mandatory Details";
		category= "Smoke";
		authors	="Nesa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logIn(String userName, String passWord, String cName, String fName, 
			String lName, String NewCompanyName, String PhNumber) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhone()
		.enterphoneNumber(PhNumber)
		.clickFindLeadsButton()
		.clickLeadID()
		.clickDelete();
	}

}
