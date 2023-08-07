@UIAPIEndtoEndScenarios
Feature: Insta To CRM Applications End To End Scenarios

  Scenario Outline: Verify the flow of Lead Details from CRM when Lead created from Insta Applications
    Given AddLeadAPI Payload with register numebr first
    Then addotpAPI Payload with succefully OTP
    And Fetch the lead ID from Insta API
    When Enter Mobile Number
    When Enter OTP
    And Enter "<Pincode>" "<EmailID>"
    And click on Next button
    And Enter "<business PAN>"
    And click on correct button
    And click on the close button
    And click on Next button
    And Click on the business information
    And click on the Type of business
    And select Drop down value from How old is your Business DD
    And click on Next button
    And Select your business nature from DD
    And click on Next button
    And click on the Business Document Either YES nor NO
    And Select any one value from What is your purpose of taking loan page
    And click on Next button

    And Enter the value into Verify Your Business Details of BBN "<Registered Business Name>"
    And Enter the value into Verify Your Business Details of BDA "<Business Registration Date>"
    And Enter the value into Verify Your Business Details of BA "<Business Address>"
    And Enter the value into pincode "<Pincode>"
    And click on Next button
    Then Call CRMAPI with leadID while generated From InstathroughMobileNumber
    Then Verify LeadID from database by putting mobilenumber
    Examples: 
      | Pincode | EmailID      | business PAN | Registered Business Name | Business Registration Date | Business Address |
      |  560040 | vg@gmail.com | AOSPV4431J   | NeoCash pvt ltd          | 05-02-1992                 | bangalore        |
