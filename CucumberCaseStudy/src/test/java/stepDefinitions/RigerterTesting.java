package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.*;
import junit.framework.Assert;
import testRunnerPackage.Repository;

public class RigerterTesting {
	
	WebDriver driver;
	@Given("User is on sign up page")
	public void user_is_on_sign_up_page() {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438_p5.training\\JuneGFTBatch\\CucumberCaseStudy\\resources\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/RegisterUser.htm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User enters data {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {int} and {string}")
	public void user_enters_data(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, Integer string11, String string12) {
	    // actual scenario goes here.
		
	     @SuppressWarnings("unused")
	     Repository repository = new Repository(driver);
		 Repository.usern.sendKeys(string);
		 Repository.fname.sendKeys(string2);
		 Repository.lname.sendKeys(string3);
		 Repository.password.sendKeys(string4);
		 Repository.cpassword.sendKeys(string5);
	      driver.findElement(By.xpath("//span[contains(.,"+"'"+string6+"'"+")]")).click();
		 Repository.email.sendKeys(string7);
		 Repository.mobile.sendKeys(string8);
		 driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(string9);
		 Repository.address.sendKeys(string10);
		 WebElement que = driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]"));
		 Select selectque = new Select(que);
		 selectque.selectByIndex(string11);
		 Repository.answer.sendKeys(string12);
	}
	@When("user clicks on Signup")
	public void user_clicks_on_Signup() {
		 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).submit();
		
	}


	@Then("I verify the Pass in step")
	public void i_verify_the_Pass_in_step() {
		Assert.assertTrue(driver.findElement(By.xpath("(//div[contains(.,'User Registered Succesfully!!! Please login')])[4]")).
				getText().contains("User Registered Succesfully!!!"));
		driver.close();
	}

}
