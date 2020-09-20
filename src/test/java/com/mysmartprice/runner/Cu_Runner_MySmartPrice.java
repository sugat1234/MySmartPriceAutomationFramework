package com.mysmartprice.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(
	features = "C:\\Users\\sugat\\Google Drive\\Technical Training\\EclipseWorspaces\\Workspace1\\MySmartPriceAutomationFramework\\src\\test\\java\\com\\mysmartprice\\features\\Cu_Feature_MySmartPrice.feature",
	
	glue = "com.mysmartprice.stepdefinition",
	
	monochrome = true,
	
	stepNotifications = true,
	
	plugin = {"pretty","html:target/reports/html/mysmartprice.html",
					   "json:target/reports/json/mysmartprice.json",
					   "junit:target/reports/junit/mysmartprice.xml",}
	
	
)


public class Cu_Runner_MySmartPrice {

	

}
