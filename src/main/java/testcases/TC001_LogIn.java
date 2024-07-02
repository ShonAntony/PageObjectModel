package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_LogIn extends ProjectMethods {
	@BeforeClass
	public void setData() {
		dataSheetName = "TC001_Login";
		testCaseName = "TC001_LogInLogOut";
		testDescription = "To Test Login and LogOut";
		category = "Smoke";
		authors = "Nesa";
		browserName = "chrome";
	}

	// @Parameter("","")
	@Test(dataProvider = "fetchData")
	public void logIn(String userName, String passWord, String cName, String fName, String lName) {

		new LoginPage(driver, test).enterUserName(userName).enterPassword(passWord).clickLogin().clickCRMSFA()
				.clickLeads().clickCreateLead().entercompanyName(cName).enterfirstName(fName).enterlastName(lName);
		// .clickLogout()

	}

}
