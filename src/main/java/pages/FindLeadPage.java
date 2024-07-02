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
public class FindLeadPage extends ProjectMethods{

	public FindLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		
		if(!verifyTitle("Find Leads | opentaps CRM")) {
			throw new RuntimeException();
		}	
	}

	@FindBy(how=How.XPATH,using="(//input[@type='text' and @name='firstName'])[3]")
	private WebElement eleFirstName;
	public Object enterFirstName;
	public FindLeadPage enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;
	public Object clickFindLeadsButton;
	public FindLeadPage clickFindLeadsButton() {
		click(eleFindLeadsButton);
		return this;
	}

	@FindBy(how=How.XPATH,using="//div[text()='Lead ID']/following::a[@class='linktext']")
	private WebElement eleLeadID;
	public Object clickLeadID;
	public ViewLeadPage clickLeadID() {
		click(eleLeadID);
		return new ViewLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Phone")
	private WebElement elePhone;
	public Object clickPhone;
	public FindLeadPage clickPhone() {
		click(elePhone);
		return this;
	}

	@FindBy(how=How.NAME,using="phoneNumber")
	private WebElement elephoneNumber;
	public Object enterphoneNumber;
	public FindLeadPage enterphoneNumber(String PhNumber) {
		type(elephoneNumber, PhNumber);
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Email")
	private WebElement eleEmail;
	public Object clickEmail;
	public FindLeadPage clickEmail(){
		click(eleEmail);
		return this;
	}
	
	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleemailAddress;
	public Object enteremailAddress;
	public FindLeadPage enteremailAddress(String Email) {
		type(eleemailAddress, Email);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement eleEnterFromLeadID;
	public FindLeadPage enterFromLeadID(String enterFromLeadID)	{
		type(eleEnterFromLeadID,enterFromLeadID);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='x-btn-text']")
	WebElement eleClickFindLeadsInFindLeadsWindow;
	public FindLeadPage clickFindLeadsInFindLeadsWindow()
	{
		click(eleClickFindLeadsInFindLeadsWindow);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleClickFirstResultingLeadInFromLead;
	public MergeLeadPage clickFirstResultingLeadInFromLead()
	{
		click(eleClickFirstResultingLeadInFromLead);
		switchToWindow(0);
		return new MergeLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	WebElement eleEnterToLead;
	public FindLeadPage enterToLeadID(String enterToLeadID)
	{
		type(eleEnterToLead, enterToLeadID);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[@class='x-btn-text']")
	WebElement eleClickFindLeadsButtonForTo;
	public FindLeadPage clickFindLeadsButtonForTo()
	{
		click(eleClickFindLeadsButtonForTo);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	WebElement eleClickFirstResultingLeadInToLead;
	public MergeLeadPage clickFirstResultingLeadInToLead()
	{
		click(eleClickFirstResultingLeadInToLead);
		switchToWindow(0);
		return new MergeLeadPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleEnterLeadIDAfterMerge;
	public FindLeadPage enterLeadIDAfterMerge(String enterLeadIDAfterMerge)
	{
		type(eleEnterLeadIDAfterMerge, enterLeadIDAfterMerge);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleClickFindLeadsAfterEnteringLeadIDAfterMerge;
	public FindLeadPage clickFindLeadsAfterEnteringLeadIDAfterMerge()
	{
		click(eleClickFindLeadsAfterEnteringLeadIDAfterMerge);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleVerifyErrorMessage;
	public FindLeadPage verifyErrorMessage(String verifyErrorMessage)
	{
		verifyExactText(eleVerifyErrorMessage, verifyErrorMessage);
		return this;
	}
}	

