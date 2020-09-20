
@all
Feature: MySmartPrice
This scenarios check the best price of mobile on MySmartPrice page and compare
it against the prices on respective websites

  	@Amazon
  	Scenario: Compare best price on MySmartPrice page with Amazon price
    Given I am on MyBestPrice page_AMZN
    And record the bestprice on page_AMZN
    When I go to Amazon store and check the price on Amazon page
    Then on comparision both MyBestPrice and price on Amazon store should be same
    
  	@Flipkart
    Scenario: Compare best price on MySmartPrice page with Flipkart price
    Given I am on MyBestPrice page_FPK
    And record the bestprice on page_FPK
    When I go to Flipkart store and check the price on Flipkart page
    Then on comparision both MyBestPrice and price on Flipkart store should be same
    
    @TataCliq
     Scenario: Compare best price on MySmartPrice page with TataCliq price
    Given I am on MyBestPrice page_TATA
    And record the bestprice on page_TATA
    When I go to TataCliq store and check the price on TataCliq page
    Then on comparision both MyBestPrice and price on TataCliq store should be same
  