package com.mysmartprice.testngtests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.MSP_Setup;
import com.pages.MSP_CompareAmazonPrice;
import com.pages.MSP_CompareFlipkartPrice;
import com.pages.MSP_CompareTataCliqPrice;

@Listeners(MSP_TestNGListener.class)
public class MSP_TestNGTests 
{
	
	MSP_CompareAmazonPrice amazonTest;
	MSP_CompareFlipkartPrice flipkartTest;
	MSP_CompareTataCliqPrice tataCliqTest;
	
	String browser;
	
	@Parameters("browserVal")
	@BeforeMethod
	public void startApplication(@Optional("chrome") String br)
	{
		browser=br;
	}
	
	@Test
	public void amazonPriceComparisionTest()
	{
		amazonTest=new MSP_CompareAmazonPrice(browser);
		
		amazonTest.startApplication();
		
		amazonTest.getMySmartPrice();
		
		amazonTest.getAmazonPrice();
		
		amazonTest.compareAmazonPrice();
		
	}
	
	@Test
	public void flipkartPriceComparisionTest()
	{
		flipkartTest=new MSP_CompareFlipkartPrice(browser);
		
		flipkartTest.startApplication();
		
		flipkartTest.getMySmartPrice();
		
		flipkartTest.getFlipkartPrice();
		
		flipkartTest.compareFlipkartPrice();
		

	}
	
	@Test
	public void tataCliqComparisionTest()
	{
		tataCliqTest=new MSP_CompareTataCliqPrice(browser);
		
		tataCliqTest.startApplication();
		
		tataCliqTest.getMySmartPrice();
		
		tataCliqTest.getTataCliqPrice();
			
		tataCliqTest.compareTataCliqPrice();

	}
	
	
	@AfterMethod
	public void closeAll()
	{
		try
		{
			amazonTest.driver.quit();	
		}
		catch(Exception e) {}
		
		try
		{
			flipkartTest.driver.quit();
		}
		catch(Exception e) {}
		
		try
		{
			tataCliqTest.driver.quit();	
		}
		catch(Exception e) {}
		
	
	}
	


}
