package cashkaro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;
@Test
public class LoginPage2 extends ProjectMethods{
	
	public LoginPage2(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("CashKaro Beta")) {
			reportStep("this is not LogIn Page", "FAIL");
		}		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Join Free")
	private WebElement elejoinfree;	
	public Joinfree clickjoinfree() {
		click(elejoinfree);
		return new Joinfree(driver, test);	
	}
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Sign in')]")
	private WebElement eleSignin;	
	public LoginPage2 clickSignin() {
		click(eleSignin);
		return this;	
	}
	
		
	@FindBy(how=How.ID,using="uname")
	private WebElement eleuname;	
	public LoginPage2 enteruname(String uname) {
		type(eleuname, uname);
		return this;	
	}
	
	@FindBy(how=How.ID,using="pwd")
	private WebElement elepassword;	
	public LoginPage2 enterpassword(String password) {
		type(elepassword, password);
		return this;	
	}
	
	@FindBy(how=How.ID,using="btnLayoutSignIn")
	private WebElement eleLayoutSignIn;	
	public LoginPage2 clickLayoutSignIn() {
		click(eleLayoutSignIn);
		return this;	
	}
	
	@FindBy(how=How.ID,using="lnkLayoutForgotPassword")
	private WebElement eleForgotPassword;	
	public LoginPage2 clickForgotPassword() {
		click(eleForgotPassword);
		return this;	
	}
	
	@FindBy(how=How.ID,using="submit_req")
	private WebElement eleRestPassword;	
	public LoginPage2 clickRestPassword() {
		click(eleRestPassword);
		return this;	
	}
	
	@FindBy(how=How.ID,using="from_email")
	private WebElement elefromemail;	
	public LoginPage2 enterfromemail(String fromemail) {
		type(elefromemail, fromemail);
		return this;	
	}
	
	/*@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogin;
	public Object clickLogin;
	public HomePage clickLogin() {
		click(eleLogin);
		return new HomePage(driver, test);
	}*/
		
}
	/*@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLoginFailer;
	public LoginPage clickLoginFailer() {
		click(eleLoginFailer);
		return this;
	}*/
	
	
	
	
	
