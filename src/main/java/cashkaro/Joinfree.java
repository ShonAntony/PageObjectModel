package cashkaro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

@Test
public class Joinfree extends ProjectMethods {

	public Joinfree(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
		if (!verifyTitle("Join CashKaro Free - India's No1 Cashback & Coupons Site")) {
			reportStep("this is not LogIn Page", "FAIL");
		}
	}

	@FindBy(how = How.ID, using = "firstname")
	private WebElement elefirstname;

	public Joinfree enterfirstname(String Fname) {
		type(elefirstname, Fname);
		return this;
	}

	@FindBy(how = How.ID, using = "email")
	private WebElement eleemail;

	public Joinfree enteremail(String email) {
		type(eleemail, email);
		return this;
	}

	@FindBy(how = How.ID, using = "con_email")
	private WebElement eleconemail;

	public Joinfree enterconemail(String conemail) {
		type(eleconemail, conemail);
		return this;
	}

	@FindBy(how = How.ID, using = "pwd-txt")
	private WebElement elePwd;
	public Object enterelePwd;

	public Joinfree enterelePwd(String Pwd) {
		type(elePwd, Pwd);
		return this;
	}

	@FindBy(how = How.ID, using = "join_free_submit")
	private WebElement elejoinSubmit;

	public Joinfree clickjoinSubmit() {

		WebElement table_element = driver.findElement(By.id("testTable"));
		List<WebElement> tr_collection = driver.findElements(By.xpath("id('testTable')/tbody/tr"));

		System.out.println("NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());

		int row_num, col_num;

		row_num = 1;

		for (WebElement trElement : tr_collection) {
			List<WebElement> td_collection = trElement.findElements(By.xpath("td"));
			System.out.println("NUMBER OF COLUMNS=" + td_collection.size());
			col_num = 1;
			for (WebElement tdElement : td_collection) {
				System.out.println("row # " + row_num + ", col # " + col_num + "text=" + tdElement.getText());
				col_num++;
			}
			row_num++;
		}

		click(elejoinSubmit);
		return this;
	}

	/*
	 * @FindBy(how=How.XPATH,using="//a[contains(text(),'Sign in')]") private
	 * WebElement eleSignin; public Joinfree clickSignin() { click(eleSignin);
	 * return this; }
	 */

}

/*
 * @FindBy(how=How.CLASS_NAME,using="decorativeSubmit") private WebElement
 * eleLoginFailer; public LoginPage clickLoginFailer() { click(eleLoginFailer);
 * return this; }
 */
