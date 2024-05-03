package tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.CartPage;
import pageobjects.LandingPage;
import pageobjects.ProductPage;
import resources.Base;

public class AddToCartTest extends Base{
	
	public WebDriver d;
	
	@Test(dataProvider="getLoginData")
	public void AddToCarttest(String productName) throws FileNotFoundException, IOException, InterruptedException
	{
		
		LandingPage l=new LandingPage(d);
		  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		l.searchBox().sendKeys(productName);
		l.searchButton().click();
		
		ProductPage p=new ProductPage(d);
		
		p.AddToCartButton().click();
		Thread.sleep(3000);
		p.CartButton().click();
		Thread.sleep(3000);
	
		
		CartPage c=new CartPage(d);
		
 		System.out.println(c.Subtotal().getText());
		Assert.assertTrue(c.Subtotal().isDisplayed());
		
		
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
		Object[][] data= {{"Mobiles"}};
		return data;
	}
}
