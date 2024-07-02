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
public class MergeLeadPage extends ProjectMethods{
	
	public MergeLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Merge Leads | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}
	
	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit']")
	private WebElement eleUpdate;
	public Object clickUpate;
	public ViewLeadPage clickUpdate() {
		click(eleUpdate);
		return new ViewLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])")
	private WebElement eleFromLeadID;
	public Object clickFromLeadID;
	public FromLeadWindow clickFromLeadID() {
		click(eleFromLeadID);
		return new FromLeadWindow(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/fieldlookup.gif']")
	private WebElement eleClickIconFromLead;
	public FindLeadPage clickIconFromLead()
	{
		click(eleClickIconFromLead);
		switchToWindow(1);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleClickIconToLead;
	public FindLeadPage clickIconToLead()
	{
		click(eleClickIconToLead);
		switchToWindow(1);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Merge']")
	WebElement eleClickMergeButton;
	public ViewLeadPage clickMergeButton()
	{
		click(eleClickMergeButton);
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}
	
}
