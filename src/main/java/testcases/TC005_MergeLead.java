package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005_MergeLead";
		testCaseName = "TC005_MergeLead";
		testDescription = "To Enter Mandatory Details";
		category= "Smoke";
		authors	="Nesa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logIn(String userName, String passWord, String cName, String fName, 
			String lName, String uFromLead, String uToLead, String verifyErrorMessage) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.clickIconFromLead()
		.enterFromLeadID(uFromLead)
		.clickFindLeadsInFindLeadsWindow()
		.clickFirstResultingLeadInFromLead()
		.clickIconToLead()
		.enterToLeadID(uToLead)
		.clickFindLeadsButtonForTo()
		.clickFirstResultingLeadInToLead()
		.clickMergeButton()
		.clickFindLeadsAfterMerge()
		.enterLeadIDAfterMerge(uFromLead)
		.clickFindLeadsAfterEnteringLeadIDAfterMerge()
		.verifyErrorMessage(verifyErrorMessage);
				
	}

}
