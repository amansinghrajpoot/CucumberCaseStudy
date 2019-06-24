package testRunnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Repository {
	
	WebDriver driver;

	public Repository(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "userName")
	public static WebElement usern;
	
	@FindBy(name = "firstName")
	public static WebElement fname;
	
	@FindBy(name = "lastName")
	public static WebElement lname;
	
	@FindBy(name = "password")
	public static WebElement password;
	
	@FindBy(name = "confirmPassword")
	public static WebElement cpassword;
	

	@FindBy(name = "emailAddress")
	public static WebElement email;
	

	@FindBy(name = "mobileNumber")
	public static WebElement mobile;
	
	@FindBy(name = "address")
	public static WebElement address;
	
	@FindBy(name = "answer")
	public static WebElement answer;
		
	@FindBy(name = "products")
	public static WebElement searchbox;

	
	
}
