package com.mysmartprice.stepdefinition;

import com.pages.MSP_CompareAmazonPrice;
import com.pages.MSP_CompareFlipkartPrice;
import com.pages.MSP_CompareTataCliqPrice;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class Cu_StepDepfinition_MySmartPrice 
{

	String browser;
	MSP_CompareAmazonPrice amazonTest;
	MSP_CompareFlipkartPrice flipkartTest;
	MSP_CompareTataCliqPrice tataCliqTest;
	
	@Before
	public void startTest()
	{
		browser="firefox";
	}
	
	@Given("I am on MyBestPrice page_AMZN")
	public void i_am_on_my_best_price_page_amzn() 
	{
		amazonTest=new MSP_CompareAmazonPrice(browser);
		
		amazonTest.startApplication();
	}

	@Given("record the bestprice on page_AMZN")
	public void record_the_bestprice_on_page_amzn() 
	{
		amazonTest.getMySmartPrice();
				
	}
	
	@When("I go to Amazon store and check the price on Amazon page")
	public void i_go_to_amazon_store_and_check_the_price_on_Amazon_page() 
	{
	
		amazonTest.getAmazonPrice();
	}
	
	@Then("on comparision both MyBestPrice and price on Amazon store should be same")
	public void on_comparision_both_my_best_price_and_price_on_amazon_store_should_be_same() 
	{
		amazonTest.compareAmazonPrice();	
	}
	
	
	@Given("I am on MyBestPrice page_FPK")
	public void i_am_on_my_best_price_page_fpk() 
	{
		flipkartTest=new MSP_CompareFlipkartPrice(browser);
	
	}
	
	@Given("record the bestprice on page_FPK")
	public void record_the_bestprice_on_page_fpk() 
	{
		flipkartTest.startApplication();
		
		flipkartTest.getMySmartPrice();
		
	}
	
	@When("I go to Flipkart store and check the price on Flipkart page")
	public void i_go_to_flipkart_store_and_check_the_price_on_Flipkart_page() 
	{
		flipkartTest.getFlipkartPrice();
		
	}
		
	@Then("on comparision both MyBestPrice and price on Flipkart store should be same")
	public void on_comparision_both_my_best_price_and_price_on_Flipkart_store_should_be_same() 
	{
		flipkartTest.compareFlipkartPrice();
	}
	
	
	@Given("I am on MyBestPrice page_TATA")
	public void i_am_on_my_best_price_page_tata() 
	{
		tataCliqTest=new MSP_CompareTataCliqPrice(browser);
		
		tataCliqTest.startApplication();
		
	}
	
	@Given("record the bestprice on page_TATA")
	public void record_the_bestprice_on_page_tata() 
	{
		tataCliqTest.getMySmartPrice();
	
	}
	
	@When("I go to TataCliq store and check the price on TataCliq page")
	public void i_go_to_tata_cliq_store_and_check_the_price_on_TataCliq_page() 
	{
		tataCliqTest.getTataCliqPrice();
		
	}
	

	@Then("on comparision both MyBestPrice and price on TataCliq store should be same")
	public void on_comparision_both_my_best_price_and_price_on_tata_cliq_store_should_be_same() 
	{
		tataCliqTest.compareTataCliqPrice();	
	}
	
	@After
	public void closeTest()
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
