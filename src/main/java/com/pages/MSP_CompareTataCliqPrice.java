package com.pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.base.MSP_Setup;

public class MSP_CompareTataCliqPrice extends MSP_Setup {

	public MSP_CompareTataCliqPrice() 
	{
		super();
	}
	
	public MSP_CompareTataCliqPrice(String browser) 
	{
		super(browser);
	}

	public double tataCliqPrice;
	public void getTataCliqPrice()
	{
		driver.findElement(By.xpath("//div[@class='prc-box prc-tbl--fullcards']//div[3]//div[1]//div[3]//a[1]")).click();
		
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
	    
	    driver.switchTo().window(tabs.get(1));
	    
	    try
	    {
	    	driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();	
	    }
	    catch (Exception e) {}
	    
	    String tempPrice=driver.findElement(By.cssSelector("h3:nth-child(3)")).getAttribute("innerHTML");
	    
		tataCliqPrice=Double.parseDouble(tempPrice.substring(1).replaceAll(",", ""));
	    
	    System.out.println("TCP :"+tataCliqPrice);
	 
	}
	
	public void compareTataCliqPrice()
	{
		Assert.assertEquals(tataCliqPrice, mySmartPrice);
		
		System.out.println("Test Successful");
	}
		
	public static void main(String[] args) 
	{
		MSP_CompareTataCliqPrice obj=new MSP_CompareTataCliqPrice("firefox");
		
		obj.startApplication();
		
		obj.getMySmartPrice();
		
		obj.getTataCliqPrice();
	
		obj.compareTataCliqPrice();
		
		System.exit(0);
	}
	
}
