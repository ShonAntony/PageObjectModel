package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_CreateLead";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Enter Mandatory Details";
		category= "Smoke";
		authors	="Nesa";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logIn(String userName, String passWord, String cName, String fName, String lName) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.entercompanyName(cName)
		.enterfirstName(fName)
		.enterlastName(lName)
		.clickcreateLeadButton();
		
	
		
		
		
		
		
					
	}

	private void clickUpate() {
		// TODO Auto-generated method stub
		
	}

}
