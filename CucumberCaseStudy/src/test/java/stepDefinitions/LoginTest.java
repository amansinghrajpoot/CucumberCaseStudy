package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import testRunnerPackage.Repository;

public class LoginTest {
	WebDriver driver;
	String uname;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438_p5.training\\JuneGFTBatch\\CucumberCaseStudy\\resources\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User enters data {string} and  {string}")
	public void user_enters_data_and(String string, String string2) {
		@SuppressWarnings("unused")
		Repository repository = new Repository(driver);
		 Repository.usern.sendKeys(string);
		 Repository.password.sendKeys(string2);
		 uname = string;
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).submit();
	  
	}
	
	@Then("login verify the Pass in step")
	public void login_verify_the_Pass_in_step() {
		Assert.assertTrue(driver.findElement(By.xpath("//ul[@class='nav navbar-nav']")).getText().contains(uname));
		driver.close();
	}

}
