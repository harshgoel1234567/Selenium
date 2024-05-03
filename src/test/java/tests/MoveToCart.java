package tests;






import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.CartPage;
import pageobjects.LandingPage;
import pageobjects.ProductPage;
import resources.Base;

public class MoveToCart  extends Base {

	public WebDriver d;
	
	@Test(dataProvider="getProductName")
	public void SaveforLatertest(String productName) throws FileNotFoundException, IOException, InterruptedException
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
		
 		
 		c.SaveLaterButton().click();
 		
 		System.out.println(c.SaveLaterText().getText());
 		//Assert.assertTrue(false);
 		Thread.sleep(3000);
 		Assert.assertEquals(c.SaveLaterText().getText(),"Saved for later (1 item)");
//		
 		
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
	public Object[][] getProductName()
	{
		Object[][] data= {{"Mobiles"}};
		return data;
	}
}
