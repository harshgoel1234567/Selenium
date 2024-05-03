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


public class CartPage {

	
	WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
		
	}             
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")
	private WebElement CartProduct;
	@FindBy(id="sc-subtotal-label-activecart")
	private WebElement Subtotal;
	@FindBy(xpath="//input[@value='Proceed to checkout']")
	private WebElement Checkout;
	@FindBy(xpath="//input[@value='Delete']")
	private WebElement DeleteButton;
	@FindBy(xpath="//input[@value='Save for later']")
	private WebElement SaveLaterButton;
	@FindBy(id="sc-saved-cart-list-caption-text")
	private WebElement SaveLaterText;
	@FindBy(className="a-dropdown-label")
	private WebElement Quantitytag;
	@FindBy(id="quantity_3")
	private WebElement Quantityoption;
	
	
	
	
//	
//private	By emailField=By.id("input-email");
//private	By password=By.id("input-password");
//private	By loginButton=By.cssSelector("input[value='Login']");


public WebElement CartProduct()
{
	return CartProduct;
	//return driver.findElement(emailField);
}
public WebElement Subtotal()
{
	return Subtotal;
	//return driver.findElement(emailField);
}
public WebElement Checkout()
{
	return Checkout;
	//return driver.findElement(emailField);
}
public WebElement Delete()
{
	return DeleteButton;
	//return driver.findElement(emailField);
}

public WebElement SaveLaterButton()
{
	return SaveLaterButton;
}
public WebElement SaveLaterText()
{
	return SaveLaterText;
}
	
public WebElement QquantityTag()
{
	return  Quantitytag;
}
public WebElement Qquantityoption()
{
	return  Quantityoption;
}
}
