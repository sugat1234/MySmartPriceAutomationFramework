# MySmartPriceAutomationFramework

The MySmartPriceAutomationFramework contains Selenium code to test MySmartPrice with prices on Amazon, Flipkart and Tatacliq.The framework consist of both testng 
and cucumber tests.

Download the repository locally to your IDE.

Steps to execute TestNG tests:
1. Run 'MySmartPrice.xml'. You change value of parameter 'browser' to 'chrome','firefox','edge'
    OR open CMD> Go to MySmartPriceAutomationFramework>mvn test
    
2. Reports are generated in test-output folder : index.html



Steps to execute Cucumber tests:
Note that to change the browser version, go to step definition file inside package com.mysmartprice.stepdefinition and set the browser in @Before annotation
1. Open folder src/test/java
2. Open package com.mysmartprice.runner
3. Run the Runner file inside it as JUnit test.
4. Reports are generated in : target/report folder. Report types: html, junit, json


NOTE: JRE Version used to compile the project is JavaSE14. In the Maven Compiler plugin, please change the compiler version to version suitable for your machine
