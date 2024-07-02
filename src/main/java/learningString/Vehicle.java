package learningString;

public class Vehicle {

	public static void run() {
	
	System.out.println("Vehicle is running");
	}
	static class Bike extends Vehicle{  	    
		  public static void main(String args[]){  
		  Bike obj = new Bike();  
		  obj.run();  
		  }  
	}
}
	
	
//TODO Auto-generated method stub
		/*System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cashkaro.iamsavings.co.uk/");
		driver.findElementByLinkText("Join Free").click();
		driver.findElementById("firstname").sendKeys("Vinoth kumar");
		driver.findElementById("email").sendKeys("evinoth.kumar@yahoo.com");
		driver.findElementById("con_email").sendKeys("evinoth.kumar@yahoo.com");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		jse.executeScript("document.getElementById('pwd-txt').setAttribute('value', 'Water2428@')");		
		driver.findElementById("join_free_submit").click();*/
		