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
public class MyHomePage extends ProjectMethods{

	public MyHomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		
		if(!verifyTitle("My Home | opentaps CRM")) {
			throw new RuntimeException();
		}		
	}

	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	public Object clickLeads;
	public MyLeads clickLeads() {
		click(eleLeads);
		return new MyLeads(driver, test);
	}

}