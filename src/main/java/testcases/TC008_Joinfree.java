package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cashkaro.Joinfree;
import cashkaro.LoginPage2;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC008_Joinfree extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC008_Joinfree";
		testCaseName = "TC008_Joinfree";
		testDescription = "To Test Login and LogOut";
		category= "Smoke";
		authors	="Vinoth";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logIn(String Fname, String email, String conemail, String Pwd) {
		
		new LoginPage2(driver, test)
		.clickjoinfree()
		.enterfirstname(Fname)
		.enteremail(email)
		.enterconemail(conemail)
		.enterelePwd(Pwd)
		.clickjoinSubmit();								
	}

}
