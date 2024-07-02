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
public class FromLeadWindow extends ProjectMethods{

	public FromLeadWindow(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Find Leads")) {
			throw new RuntimeException();
		}		
	}

	@FindBy(how=How.XPATH,using="(//input[@name='id']")
	private WebElement eleFromLeadId;
	public Object enterFromLeadId;
	public FromLeadWindow enterFromLeadId(String lID) {
		type(eleFromLeadId, lID);
		return this;
	}	

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeads;
	public Object clickFindLeads;
	public FromLeadWindow clickFindLeads() {
		switchToWindow(1);
		click(eleFindLeads);
		return this;
	}
}