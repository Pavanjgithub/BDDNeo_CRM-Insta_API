package com.crm.NeoGrowthstepDef;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import com.crm.GenericUtilis.Driver;
import com.crm.GenericUtilis.SeleniumUtility;
import com.crm.POM.InstaPage;
import com.crm.POM.LeadCreation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class InstaStepDef extends Driver {
	static Driver d= new Driver();
	SeleniumUtility sel = new SeleniumUtility();
	LeadCreation lc= new LeadCreation(driver);
	InstaPage IP= new InstaPage(driver);
	
	
	static long rand = d.randomnumber(50000);
	static	String vg=String.valueOf(rand);
	static String num = "95421"+vg;
	static  String leadId;
	String query="select id from leads where phone_mobile='"+num+"'";
    
	@When("Enter Mobile Number")
	public void enter_mobile_number() throws InterruptedException {
		IP.entermobilenumber(num);
        Reporter.log(num);
        }


	@When("Enter OTP")
	public void enter_otp() {
     lc.enterOTP();
	}
	
	@Then("Fetch the lead ID from Insta API")
		public void Fetch_the_lead_ID_from_Insta_API() {
		Response response = RestAssured.given()
		          .baseUri("https://crm2_0uat.neogrowth.in")
		          .body("{\r\n"
		                  + "  \"lead_id\": \""+leadId+"\"\r\n"
		                  + "}")
		          .headers("REQUESTEDMODULE", "Lead", "REQUESTEDMETHOD", "Fetch", "Content-Type", "application/json;charset=utf-8","Accept", "application/json, text/plain, application/json",
		          		"Authorization", "BasicTkczOTU6V2VsY29tZUAxMjM=","User-Agent", "PostmanRuntime/7.32.2","Accept-Language", "en-US","Cache-Control", "no-cache",
		          		"AUTHORIZEDAPPLICATION","N30gr0wth")
		          .when().log().all().get("/index.php?entryPoint=crmapi")
		          .then().log().all().assertThat().statusCode(200).extract().response();

	  String responseBody = response.jsonPath().getString("Leads[0].channel_source");
		  System.out.println(responseBody);
		  
		     }
		
		
	

	@Then("Enter {string} {string}")
	public void enter(String string, String string2) {
	lc.enterpincodeandemailid(string, string2);
	}
	@Then("click on Next button")
	public void click_on_next_button() {
	   lc.clickNextButton();
	}
	@Then("Enter {string}")
	public void enter(String string) {
	    lc.enterpan(string);
	}
	@Then("click on correct button")
	public void click_on_correct_button() {
	   IP.clicksubmitbutton();    
	}
	@Then("click on the close button")
	public void click_on_the_close_button() {
		IP.clickclosebutton();
	}
	@Then("click on the Next button")
	public void click_on_the_next_button() {
		IP.ClickNextButton();
	}
	@Then("Click on the business information")
	public void click_on_the_business_information() {
	   IP.BuisnessOwnerTF();
	}
	@Then("click on the Type of business")
	public void click_on_the_type_of_business() {
		IP.BooksandStationaryTF();
	}
	@Then("select Drop down value from How old is your Business DD")
	public void select_drop_down_value_from_how_old_is_your_business_dd() {
		IP.selectDropdownvalue();
	}
	@Then("Select your business nature from DD")
	public void select_your_business_nature_from_dd() {
	  IP.selectBuisnessnatureDropdown();  
	}
	@Then("click on the Business Document Either YES nor NO")
	public void click_on_the_business_document_either_yes_nor_no() {
		IP.clickTextButton();
	}
	@Then("Select any one value from What is your purpose of taking loan page")
	public void select_any_one_value_from_what_is_your_purpose_of_taking_loan_page() {
	    IP.Expansion();
	    IP.ClickNextButton();   
	}
	@Then("Enter the value into Verify Your Business Details of BBN {string}")
	public void enter_the_value_into_verify_your_business_details_of_BBN(String string) {
	   IP.clickbusinessnameTF(string);
	}

	@Then("Enter the value into Verify Your Business Details of BDA {string}")
	public void enter_the_value_into_verify_your_business_details_of_BDA(String string) {
	  IP.placeholderclick(string);
	}

	@Then("Enter the value into Verify Your Business Details of BA {string}")
	public void enter_the_value_into_verify_your_business_details_of_BA(String string) {
	   IP.SendBuisnessaddressTF(string);
	}
	
	@Then("Enter the value into pincode {string}")
	public void enter_the_value_into_pincode(String string) {
		lc.enterpincode(string);
	}

	
	
	
	@Given("AddLeadAPI Payload with register numebr first")
	public void add_lead_api_payload_with_register_numebr_first() 
	{
		RestAssured.baseURI="https://uat.advancesuite.in:3071";
		 Response respo = given().header("Content-Type","application/json").body("{\r\n"
				+ "  \"mobile\": \""+num+"\"\r\n"
				+ "}")
		 .when().log().all().post("/api/v2/otp")
		.then()
		.assertThat().statusCode(200).extract().response();
    String msg= respo.jsonPath().getString("message");
    System.out.println(msg); 
    }
	
	@Then("addotpAPI Payload with succefully OTP")
	public void addotp_api_payload_with_succefully_otp() {
		RestAssured.baseURI="https://uat.advancesuite.in:3071/api/v2/register";
   	 String requestBody = "{ \"mobile\": \""+num+"\", \"otp\": \"123456\", \"lead_source\": \"Marketing\" }";

		  Response respo1 = given().headers("Content-Type","application/json","User-Agent","PostmanRuntime/7.32.3","Accept","*/*")
				  .body(requestBody)
		      .when().log().all().post()
		      .then().assertThat().statusCode(200)
		        .extract().response();
	  leadId = respo1.jsonPath().getString("data.lead.crm_lead_id");
	  System.out.println(num);
 System.out.println(leadId);
 }
	
	@Then("Call CRMAPI with leadID while generated From InstathroughMobileNumber")
	public void call_crmapi_with_lead_id_while_generated_from_instathrough_mobile_number() {
		String leadidfetch =
				"{\r\n"
		+ "\"lead_id\":\""+leadId+"\"\r\n"
		+ "}";
		Response response = RestAssured.given()
		          .baseUri("https://crm2_0uat.neogrowth.in")
		          .body(leadidfetch)

		          .headers("REQUESTEDMODULE", "Lead", "REQUESTEDMETHOD", "Fetch", "Content-Type", "application/json;charset=utf-8","Accept", "application/json, text/plain, application/json",
		          		"Authorization", "BasicTkczOTU6V2VsY29tZUAxMjM=","User-Agent", "PostmanRuntime/7.32.2","Accept-Language", "en-US","Cache-Control", "no-cache",
		          		"AUTHORIZEDAPPLICATION","N30gr0wth")
		          .when().log().all().get("/index.php?entryPoint=crmapi")
		.then().assertThat().statusCode(200).extract().response();
	  String leadsource = response.jsonPath().getString("Leads[0].lead_source");
	  String phonemobile= response.jsonPath().getString("Leads[0].phone_mobile");
	  String productC=  response.jsonPath().getString("Leads[0].product_c");
	  String sourceType= response.jsonPath().getString("Leads[0].source_type");
	  String channel_source=response.jsonPath().getString("Leads[0].channel_source");
	  System.out.println(leadsource);
	  System.out.println(phonemobile);
	  System.out.println(productC);
	  System.out.println(sourceType);
	  System.out.println(channel_source);
	  Assert.assertEquals("Marketing", leadsource);
	  Assert.assertEquals(num, phonemobile);
	  Assert.assertEquals("Insta Express Digital", productC);
	  Assert.assertEquals("NeoCash Insta", sourceType);
	  Assert.assertEquals("Insta", channel_source);
	
	}
	
	
	@Then("Verify LeadID from database by putting mobilenumber")
	public void verify_lead_id_from_database_by_putting_mobilenumber() throws SQLException, IOException {
		
		sel.mysqlconnector();
		  String DBLeadid  = sel.executequery(query,"id");
		Assert.assertEquals(DBLeadid, leadId);
	    
		System.out.println(DBLeadid);
		System.out.println(leadId);
		
		
	}
}

