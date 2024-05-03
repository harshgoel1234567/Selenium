
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


public class LanguagePage {

	
	WebDriver driver;
	
	public LanguagePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
		
	}
	@FindBy(xpath ="/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]")
	private WebElement Language_value;
	
	@FindBy(id="icp-save-button")
	private WebElement Save_button;
	
	
	
//	
//private	By emailField=By.id("input-email");
//private	By password=By.id("input-password");
//private	By loginButton=By.cssSelector("input[value='Login']");


public WebElement Lnaguagevalue()
{
	return Language_value;
	//return driver.findElement(emailField);
}
public WebElement SaveButton()
{
	return Save_button;
	//return driver.findElement(emailField);
}
	
}
