package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;
@Test
public class OpenTapsPage extends ProjectMethods{
	
	public OpenTapsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle(" opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleChangeCompanyName;;
	public Object enterChangeCompanyName;;
	public OpenTapsPage enterChangeCompanyName(String ChangeCompanyName) {
		type(eleChangeCompanyName, ChangeCompanyName);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit']")
	private WebElement eleUpdate;
	public Object clickUpate;
	public ViewLeadPage clickUpdate() {
		click(eleUpdate);
		return new ViewLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='updateLeadForm_companyName']")
	private WebElement eleNewCompanyName;
	public Object enterNewCompanyName;
	public OpenTapsPage enterNewCompanyName(String NewCompanyName) {
		type(eleNewCompanyName, NewCompanyName);
		return this;
	}
}
