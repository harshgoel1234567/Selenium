package tests;

import java.io.*;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import pageobjects.AccountPage;
import pageobjects.LandingPage;
//import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base{
	
	public WebDriver d;
	
	@Test(dataProvider="getLoginData")
	public void LoginTest(String email,String password,String status) throws FileNotFoundException, IOException, InterruptedException
	{
		
		LandingPage l=new LandingPage(d);
		l.Accountlist().click();
		
		Thread.sleep(3000);
		
		l.email().sendKeys(email);
		l.continueButton().click();
		
		l.password().sendKeys(password);
		l.siginButton().click();
		
		
	}
	@BeforeMethod
	public void openApplication() throws FileNotFoundException, IOException
	{
		d=initializedriver();
		d.get(prop.getProperty("url"));
	}
	@AfterMethod
	public void closure()
	{
		d.close();
	
	}
	
	@DataProvider
	public Object[][] getLoginData()
	{
		Object[][] data= {{"7017726362","Pencil123#","Successful"}};
		return data;
	}
}
