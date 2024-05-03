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
import pageobjects.LanguagePage;
import pageobjects.ProductPage;
import resources.Base;

public class LanguageTest extends Base{
	
	public WebDriver d;
	
	@Test(dataProvider="getLanguage")
	public void Languagetest(String productName) throws FileNotFoundException, IOException, InterruptedException
	{
		
		LandingPage l=new LandingPage(d);
		Thread.sleep(3000);
		l.language_dropdown().click();
		Thread.sleep(5000);
		LanguagePage lan =new LanguagePage(d);
		lan.Lnaguagevalue().click();
		Thread.sleep(5000);
		lan.SaveButton().click();
		Thread.sleep(5000);
		System.out.println(l.Amazon_text().getText());
		
		Assert.assertEquals(l.Amazon_text().getText(),"मुख्य कंटेंट देखें");
		
		
		
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
	public Object[][] getLanguage()
	{
		Object[][] data= {{"Mobiles"}};
		return data;
	}
}
