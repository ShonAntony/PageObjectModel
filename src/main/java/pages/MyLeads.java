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
public class MyLeads extends ProjectMethods{
	
	public MyLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("My Leads | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	public Object clickCreateLead;
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
	private WebElement eleFindLeads;
	public Object clickFindLeads;
	public FindLeadPage clickFindLeads() {
		click(eleFindLeads);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])")
	private WebElement eleFromLead;
	public Object clickFromLead;
	public MergeLeadPage clickFromLead() {
		click(eleFromLead);
		return new MergeLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLead;
	public Object clickMergeLead;
	public MergeLeadPage clickMergeLead() {
		click(eleMergeLead);
		return new MergeLeadPage(driver, test);
	}

}


