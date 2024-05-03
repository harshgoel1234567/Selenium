package pageobjects;
import java.io.*;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class LandingPage {

	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
		
	}
	@FindBy(id="nav-link-accountList")
	private WebElement myAccountDropdown;
	@FindBy(id="ap_email")
	private WebElement email;
	@FindBy(id="ap_password")
	private WebElement password;
	@FindBy(id="continue")
	private WebElement continueButton;
	@FindBy(id="signInSubmit")
	private WebElement signinButton;
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	@FindBy(id="nav-search-submit-button")
	private WebElement searchButton;
	@FindBy(id="nav-orders")
	private WebElement orders;
	@FindBy(id="icp-nav-flyout")
	private WebElement language_dropdown;
	@FindBy(id="skiplink")
	private WebElement Amazon_text;
	
	
	
	
	
	
//	
//private	By emailField=By.id("input-email");
//private	By password=By.id("input-password");
//private	By loginButton=By.cssSelector("input[value='Login']");


public WebElement Accountlist()
{
	return myAccountDropdown;
	//return driver.findElement(emailField);
}
public WebElement email()
{
	return email;
	//return driver.findElement(password);
}
public WebElement password()
{
	return password;
	//return driver.findElement(loginButton);
}
public WebElement continueButton()
{
	return continueButton;
	//return driver.findElement(loginButton);
}
public WebElement siginButton()
{
	return signinButton;
	//return driver.findElement(loginButton);
}
public WebElement searchBox()
{
	return searchBox;
	//return driver.findElement(loginButton);
}
public WebElement searchButton()
{
	return searchButton;
	//return driver.findElement(loginButton);
}
public WebElement language_dropdown()
{
	return language_dropdown;
	//return driver.findElement(loginButton);
}
public WebElement Amazon_text()
{
	return Amazon_text;
	//return driver.findElement(loginButton);
}

	
}
