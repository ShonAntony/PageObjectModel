package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cashkaro.Joinfree;
import cashkaro.LoginPage2;
import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC009_Signin extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC009_Signin";
		testCaseName = "TC009_Signin";
		testDescription = "To Test Login and LogOut";
		category= "Smoke";
		authors	="Vinoth";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logIn(String uname, String password, String fromemail) {
		
		new LoginPage2(driver, test)
		.clickSignin()
		.enteruname(uname)
		.enterpassword(password)
		.clickLayoutSignIn()
		.clickForgotPassword()
		.enterfromemail(fromemail)
		.clickRestPassword();
										
	}

}
