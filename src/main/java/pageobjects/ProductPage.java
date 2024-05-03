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

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/span[2]/div[1]/h1[1]/div[1]/div[1]/div[1]/div[1]/span[3]")
	private WebElement ProductName;

	@FindBy(id="a-autoid-1-announce")
	private WebElement AddtoCartButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[4]/div[2]/span[2]")
	private WebElement CartButton;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]")
	private WebElement ProductFullName;
	
	

	public WebElement ProductName() {
		return ProductName;
		// return driver.findElement(loginButton);
	}
	public WebElement ProductFullName() {
		return ProductFullName;
		// return driver.findElement(loginButton);
	}
	public WebElement CartButton() {
		return CartButton;
		// return driver.findElement(loginButton);
	}
	public WebElement AddToCartButton() {
		return AddtoCartButton;
		// return driver.findElement(loginButton);
	}

}
