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
public class CreateLead extends ProjectMethods{
	
	public CreateLead(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Create Lead | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecompanyName;	
	public CreateLead entercompanyName(String cName) {
		type(elecompanyName, cName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefirstName;		
	public CreateLead enterfirstName(String fName) {
		type(elefirstName, fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelastName;	
	public CreateLead enterlastName(String lName) {
		type(elelastName, lName);
		return this;
	}
		
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleclickcreateLead;
	public ViewLeadPage clickcreateLeadButton() {
		click(eleclickcreateLead);
		return new ViewLeadPage(driver, test);
	}
}
