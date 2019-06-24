package stepDefinitions;


import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.*;
import testRunnerPackage.Repository;

public class CartSearchTest {

	WebDriver driver;
	String strkey;

	@Given("User is on home page for searching")
	public void user_is_on_home_page_for_searching() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438_p5.training\\JuneGFTBatch\\CucumberCaseStudy\\resources\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 @SuppressWarnings("unused")
		 Repository repository = new Repository(driver);
		 Repository.usern.sendKeys("Lalitha");
		 Repository.password.sendKeys("Password123");
		 driver.findElement(By.xpath("//input[contains(@type,'submit')]")).submit();
		 
	}

	@When("User enters four characters {string}")
	public void user_enters_four_characters(String string) {
	    String str[]=null;
	    str= string.split("");
		Actions act = new Actions(driver);
		act.keyDown(Repository.searchbox, Keys.SHIFT).perform();
		act.sendKeys(str[0]).sendKeys(str[1]).pause(1000).sendKeys(str[2]).pause(1000).sendKeys(str[3]).perform();
	    strkey= string;
	}

	@When("press search button")
	public void press_search_button() throws Exception {
	
		WebElement product = driver.findElement(By.xpath("(//div[contains(.,"+"'"+strkey+"'"+")])[4]"));
		Actions act = new Actions(driver);
		act.moveToElement(product).click().perform();
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).submit();
	/*	String handlename = driver.getWindowHandle();
		 Properties properties = new Properties();
			properties.setProperty("whandle", handlename);
			File file = new File("src\\test\\java\\test2.properties");
			FileOutputStream fileOut = new FileOutputStream(file);
			properties.store(fileOut, "whandle");
			fileOut.close();*/
		
		 
	}

	@Then("User should see accurate result")
	public void user_should_see_accurate_result() {
		Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(.,"+"'"+strkey+"'"+")]")).getText().contains(strkey));
		driver.close();
	}
	

}
