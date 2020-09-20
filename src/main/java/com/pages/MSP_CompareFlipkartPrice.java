package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.base.MSP_Setup;

public class MSP_CompareFlipkartPrice extends MSP_Setup {

	public MSP_CompareFlipkartPrice() 
	{
		super();
	}
	
	public MSP_CompareFlipkartPrice(String browser) 
	{
		super(browser);
	}

	double flipkartPrice;
	
	public void getFlipkartPrice()
	{
		driver.findElement(By.xpath("//div[@class='prdct-dtl__rght']//div[2]//div[1]//div[3]//a[1]")).click();
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
	    
	    driver.switchTo().window(tabs.get(1));
	    
		String rawprice=driver.findElement(By.cssSelector("div._1vC4OE._3qQ9m1")).getAttribute("innerHTML");
				
		flipkartPrice=Double.parseDouble(rawprice.substring(1).replaceAll(",", ""));
		
		System.out.println("FP Price :"+flipkartPrice);
	}
	
	public void compareFlipkartPrice()
	{
		Assert.assertEquals(flipkartPrice, mySmartPrice);
		
		System.out.println("Test Successful");
	}
	
	
	public static void main(String[] args) {
		MSP_CompareFlipkartPrice obj=new MSP_CompareFlipkartPrice("firefox");
		
		obj.startApplication();
		
		obj.getMySmartPrice();
		
		obj.getFlipkartPrice();
		
		obj.compareFlipkartPrice();
		
		System.exit(0);
	}

}
