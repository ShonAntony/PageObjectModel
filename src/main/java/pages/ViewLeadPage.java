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
public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("View Lead | opentaps CRM")) {
			throw new RuntimeException();
		}	
	}
		
		@FindBy(how=How.XPATH,using="//a[text()='Find Leads']")
		private WebElement eleFindLeads;
		public Object clickFindLeads;
		public FindLeadPage clickFindLeads() {
			click(eleFindLeads);
			return new FindLeadPage(driver, test);
	}
	
		@FindBy(how=How.XPATH,using="//a[text()='Edit']")
		private WebElement eleEdits;
		public Object clickEdits;
		public OpenTapsPage clickEdits() {
			click(eleEdits);
			return new OpenTapsPage(driver, test);
	}

		@FindBy(how=How.LINK_TEXT,using="Delete")
		private WebElement eleDelete;
		public Object clickDelete;
		public MyLeads clickDelete() {
			click(eleDelete);
			return new MyLeads(driver, test);
		}

		@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
		private WebElement eleDuplicateLead;
		public Object clickDuplicateLead;
		public DuplicateLeadPage clickDuplicateLead() {
			click(eleDuplicateLead);
			return new DuplicateLeadPage(driver, test);
		}
		
		@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleClickFindLeadsAfterMerge;
		public FindLeadPage clickFindLeadsAfterMerge()
		{
			click(eleClickFindLeadsAfterMerge);
			return new FindLeadPage(driver, test);
		}
}

