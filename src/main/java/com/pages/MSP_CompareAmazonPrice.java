package com.pages;

import java.util.ArrayList;

import org.testng.Assert;

import org.openqa.selenium.By;

import com.base.MSP_Setup;

public class MSP_CompareAmazonPrice extends MSP_Setup {

	public MSP_CompareAmazonPrice() 
	{
		super();
	}
	
	public MSP_CompareAmazonPrice(String browser) 
	{
		super(browser);
	}
	

    double amazonPrice;
    
	public void getAmazonPrice()
	{
		driver.findElement(By.xpath("//div[@class='prdct-dtl__cntr']//div[1]//div[1]//div[3]//a[1]")).click();
		
	    ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
	    
	    driver.switchTo().window(tabs.get(1));
	    
	    String[] str=driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getAttribute("innerHTML").split(";");
	    
	    amazonPrice=Double.parseDouble(str[1].replaceAll(",", ""));
	    
	    System.out.println("AMZ Price: "+amazonPrice);
	}
	
	public void compareAmazonPrice()
	{
		Assert.assertEquals(amazonPrice, mySmartPrice);
		
		System.out.println("Test Successful");
	}
	
	
	public static void main(String[] args) 
	{
		
		MSP_CompareAmazonPrice obj= new MSP_CompareAmazonPrice("firefox");
				
		obj.startApplication();
		
		obj.getMySmartPrice();
		
		obj.getAmazonPrice();
		
		obj.compareAmazonPrice();
		
		System.exit(0);
		
		
	}

}
