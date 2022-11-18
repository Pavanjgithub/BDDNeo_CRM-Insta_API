package com.authService.Api.test;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Api.constants.AutoConst;
import com.Api.helpers.AuthService_ServiceHelper;
import com.Api.utils.BaseTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AuthService_negative_API_TC extends BaseTest
{
	
	private AuthService_ServiceHelper serviceHelper;
	 @BeforeClass(alwaysRun = true)
	 public void init() throws Throwable {
		 serviceHelper =new AuthService_ServiceHelper();
		
	 }

	 @Test(enabled = true,priority = 1)
	
	 public void authService_generateOTP_negative_TC1() throws Throwable
	 {
		 
		 	test=extent.createTest("authService_generateOTP_negative_TC1");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_generateOTP_nagative_TC1 API************");
			Response response=serviceHelper.generateOTP_TC1(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 2, 2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 2, 3));
			
			JsonPath  path=response.body().jsonPath();
			System.out.println(response.asPrettyString());
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 2, 4)).toString();//response
			System.out.println(message);
			System.out.println((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 2, 5)));
			
			if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 2, 5)))
			{

				 softAssertions.assertTrue(true, "Pass :'User not found. ' message is displayed for invalid NGID");
					System.out.println("Pass :'User not found. ' message is displayed for invalid NGID");
					logger.info("Pass :'User not found. ' message is displayed for invalid NGID");
					test.info("Pass :'User not found. ' message is displayed for invalid NGID");
				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : Message Not Verified for invalid NGID");
				logger.info("Fail : Message Not Verified for invalid NGID");
				test.info("Fail : Message Not Verified for invalid NGID");
		
			}
			
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 3, 6)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
				System.out.println("Pass :Verified status code as 400");
				logger.info("Pass :Verified status code as 400");
				test.info("Pass :Verified status code as 400");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 400 ");
				logger.info("Fail :Status code is not 400");
				test.info("Fail :Status code is not 400");
		
			}
		
			logger.info("*******Ended authService_generateOTP_negative_TC1 API ***********");
			logger.info("\n");
			softAssertions.assertAll();
			
	}
	 
	 @Test (enabled = true, dependsOnMethods ="authService_generateOTP_negative_TC1", priority = 2)
	 
	 public void authService_regenerateOTP_negative_TC2() throws Throwable 
	 {
		 
		 	test=extent.createTest("authService_regenerateOTP_negative_TC2");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_regenerateOTP_negative_TC2 API************");
			Response response=serviceHelper.regiggerOTP_TC2(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API",5,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 5, 3));//username:12345
			System.out.println(response.asPrettyString());
			
	
			JsonPath  path=response.body().jsonPath();
			
			//System.out.println(path.get("message").toString());
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 5, 4)).toString();
			System.out.println(message);
			System.out.println(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 5, 5));
			
			if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 5, 5)))
			{

				 softAssertions.assertTrue(true, "Pass :'User not found. ' message is displayed for invalid NGID");
					System.out.println("Pass :'User not found. ' message is displayed for invalid NGID");
					logger.info("Pass :'User not found. ' message is displayed for invalid NGID");
					test.info("Pass :'User not found. ' message is displayed for invalid NGID");
				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : Message Not Verified for invalid NGID");
				logger.info("Fail : Message Not Verified for invalid NGID");
				test.info("Fail : Message Not Verified for invalid NGID");
		
			}
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 8, 6)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
				System.out.println("Pass :Verified status code as 400");
				logger.info("Pass :Verified status code as 400");
				test.info("Pass :Verified status code as 400");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 400");
				logger.info("Fail :Status code is not 400");
				test.info("Fail :Status code is not 400");
		
			}
			logger.info("*******Ended authService_RetriggerOTP_TC2 API ***********");
			logger.info("\n");
			softAssertions.assertAll();
	}
	 
	 @Test(enabled = true , priority = 3)
	 public void authService_verifiyOTP_invalidOTP_TC3a() throws Throwable 
	 {
		 	test=extent.createTest("authService_verifiyOTP_invalidOTP_TC3a");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_verifiyOTP_invalidOTP_TC3a API************");
			HashMap<String, String> params=new HashMap();
			params.put(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API",8,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 8, 3));//username:ng2011
			params.put(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API",9,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 9, 3)); //otp:123456CONFIG_PATH, AuthServive_API_EXCEL_PATH)
			
			Response response=serviceHelper.verifyOTP_TC3(params);
			System.out.println(response.asPrettyString());
			
			JsonPath path=response.body().jsonPath();
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 8, 4));
			
			if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 8, 5)))
			{
				
				 softAssertions.assertTrue(true, "Pass :'Incorrect OTP. Please try again.' - Message is verified for invalid OTP");
					System.out.println("Pass :'Incorrect OTP. Please try again.' - Message is verified for invalid OTP");
					logger.info("Pass :'Incorrect OTP. Please try again.' - Message is verified for invalid OTP");
					test.info("Pass :'Incorrect OTP. Please try again.' - Message is verified for invalid OTP");
				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : Message Not Verified");
				logger.info("Fail :Message Not Verified");
				test.info("Fail :Message Not Verified");
		
			}
			
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 8, 6)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
				System.out.println("Pass :Verified status code as 400");
				logger.info("Pass :Verified status code as 400");
				test.info("Pass :Verified status code as 400");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 400");
				logger.info("Fail :Status code is not 400");
				test.info("Fail :Status code is not 400");
		
			}
			
			logger.info("*******Ended authService_verifiyOTP_invalidOTP_TC3a API ***********");
			logger.info("\n");
			softAssertions.assertAll();
		
	}
	
	 @Test(enabled = true , priority = 4)
	 
	 public void authService_verifiyOTP_invalidUsername_TC3b() throws Throwable
	 {
		 test=extent.createTest("authService_verifiyOTP_invalidUsername_TC3b");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_verifiyOTP_invalidUsername_TC3b API************");
			HashMap<String, String> params=new HashMap();
			params.put(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API",11,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 11, 3));//username:ng2011
			params.put(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API",12,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 12, 3)); //otp:123456CONFIG_PATH, AuthServive_API_EXCEL_PATH)
			
			Response response=serviceHelper.verifyOTP_TC3(params);
			System.out.println(response.asPrettyString());
			
			JsonPath path=response.body().jsonPath();
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 11, 4));
			
			if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 11, 5)))
			{
				
				 softAssertions.assertTrue(true, "Pass :'User not found.' - Message is verified for invalid OTP");
					System.out.println("Pass :'User not found.' - Message is verified for invalid OTP");
					logger.info("Pass :'User not found..' - Message is verified for invalid OTP");
					test.info("Pass :'User not found.' - Message is verified for invalid OTP");
				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : Message Not Verified");
				logger.info("Fail :Message Not Verified");
				test.info("Fail :Message Not Verified");
		
			}
			
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 11, 6)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
				System.out.println("Pass :Verified status code as 400");
				logger.info("Pass :Verified status code as 400");
				test.info("Pass :Verified status code as 400");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 400");
				logger.info("Fail :Status code is not 400");
				test.info("Fail :Status code is not 400");
		
			}
			
			logger.info("*******Ended authService_verifiyOTP_invalidUsername_TC3b API ***********");
			logger.info("\n");
			softAssertions.assertAll();
		
	}
		

	 @Test(enabled = true , priority = 5)
	 
	 public void authService_verifiyOTP_emptyUsername_TC3c() throws Throwable
	 {
		 	test=extent.createTest("authService_verifiyOTP_emptyUsername_TC3c");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_verifiyOTP_emptyUsername_TC3c API************");
			HashMap<String, String> params=new HashMap();
			params.put(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API",14,2), "");//username:null
			params.put(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API",15,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 15, 3)); //otp:123456CONFIG_PATH, AuthServive_API_EXCEL_PATH)
			
			Response response=serviceHelper.verifyOTP_TC3(params);
			System.out.println(response.asPrettyString());
			
			JsonPath path=response.body().jsonPath();
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 14, 4));
			
			if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 14, 5)))
			{
				
				 softAssertions.assertTrue(true, "Pass :'Please provide username' - Message is verified for null username");
					System.out.println("Pass :'Please provide username' - Message is verified for null username");
					logger.info("Pass :'Please provide username' - Message is verified for null username");
					test.info("Pass :'Please provide username' - Message is verified for null username");
				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : Message Not Verified");
				logger.info("Fail :Message Not Verified");
				test.info("Fail :Message Not Verified");
		
			}
			
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 14, 6)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
				System.out.println("Pass :Verified status code as 400");
				logger.info("Pass :Verified status code as 400");
				test.info("Pass :Verified status code as 400");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 400");
				logger.info("Fail :Status code is not 400");
				test.info("Fail :Status code is not 400");
		
			}
			
			logger.info("*******Ended authService_verifiyOTP_emptyUsername_TC3c API ***********");
			logger.info("\n");
			softAssertions.assertAll();
		
	}
	 
	@Test(enabled = true, priority = 6)
	
	 public void authService_verifyTicket_noticketValue_TC4a() throws Throwable 
	{
		test=extent.createTest("authService_verifyTicket_noticketValue_TC4a");
		SoftAssert softAssertions = new SoftAssert();
		logger.info("*******Started authService_verifyTicket_noticketValue_TC4a API************");
		
		Response response=serviceHelper.verifyTicket_TC4(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 17, 2),""); //ticket : and its vale
		
		JsonPath path=response.body().jsonPath();
		String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 17, 4));
		System.out.println(response.asPrettyString());
		
		if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 17, 5)))
		{
			
			 softAssertions.assertTrue(true, "Pass :'User not logged in' - Message is verified for null ticket value");
				System.out.println("Pass :'User not logged in' - Message is verified for null ticket value");
				logger.info("Pass :'User not logged in' - Message is verified for null ticket value");
				test.info("Pass :'User not logged in' - Message is verified for null ticket value");
			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail : Message Not Verified");
			logger.info("Fail :Message Not Verified");
			test.info("Fail :Message Not Verified");
	
		}
		
		if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 17, 6)))) 
	 	{
		 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
			System.out.println("Pass :Verified status code as 400");
			logger.info("Pass :Verified status code as 400");
			test.info("Pass :Verified status code as 400");

			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail :Status code is not 400");
			logger.info("Fail :Status code is not 400");
			test.info("Fail :Status code is not 400");
	
		}
		
		logger.info("*******Ended authService_verifyTicket_noticketValue_TC4a API ***********");
		logger.info("\n");
		softAssertions.assertAll();

	}

	@Test(enabled = true, priority = 7)
	
	 public void authService_verifyTicket_invalidTicketValue_TC4b() throws Throwable 
	{
		test=extent.createTest("authService_verifyTicket_invalidTicketValue_TC4b");
		SoftAssert softAssertions = new SoftAssert();
		logger.info("*******Started authService_verifyTicket_invalidTicketValue_TC4b API************");
		
		Response response=serviceHelper.verifyTicket_TC4(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 19, 2),flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 19, 3)); //ticket : and its vale
		
		JsonPath path=response.body().jsonPath();
		String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 19, 4));
		System.out.println(response.asPrettyString());
		if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 19, 5)))
		{
			
			 softAssertions.assertTrue(true, "Pass :'Session not found' - Message is verified for invalid ticket value");
				System.out.println("Pass :'Session not found' - Message is verified for invalid ticket value");
				logger.info("Pass :'Session not found' - Message is verified for invalid ticket value");
				test.info("Pass :'Session not found' - Message is verified for invalid ticket value");
			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail : Message Not Verified");
			logger.info("Fail :Message Not Verified");
			test.info("Fail :Message Not Verified");
	
		}
		
		if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 19, 6)))) 
	 	{
		 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
			System.out.println("Pass :Verified status code as 400");
			logger.info("Pass :Verified status code as 400");
			test.info("Pass :Verified status code as 400");

			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail :Status code is not 400");
			logger.info("Fail :Status code is not 400");
			test.info("Fail :Status code is not 400");
	
		}
		
		logger.info("*******Ended authService_verifyTicket_invalidTicketValue_TC4b API ***********");
		logger.info("\n");
		softAssertions.assertAll();

	}
	
	
	@Test(enabled = true, priority = 8)
	public void authService_userDetails_InvalidUuid_TC5a() throws Throwable 
	{
		test=extent.createTest("authService_userDetails_InvalidUuid_TC5a");
		SoftAssert softAssertions = new SoftAssert();
		logger.info("*******Started authService_userDetails_InvalidUuid_TC5a API************");
		Response response=serviceHelper.userDeatils_TC5(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 22, 2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 22, 3));// uuid : its vale
		System.out.println(response.asPrettyString());
		
		JsonPath path=response.body().jsonPath();
		
		String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 22, 4));
		System.out.println(response.asPrettyString());
		if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 22, 5)))
		{
			
			 softAssertions.assertTrue(true, "Pass :'User not found' - Message is verified for invalid uuid value");
				System.out.println("Pass :'User not found' - Message is verified for invalid uuid value");
				logger.info("Pass :'User not found' - Message is verified for invalid uuid value");
				test.info("Pass :'User not found' - Message is verified for invalid uuid value");
			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail : Message Not Verified");
			logger.info("Fail :Message Not Verified");
			test.info("Fail :Message Not Verified");
	
		}
		
		if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 22, 6)))) 
	 	{
		 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
			System.out.println("Pass :Verified status code as 400");
			logger.info("Pass :Verified status code as 400");
			test.info("Pass :Verified status code as 400");

			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail :Status code is not 400");
			logger.info("Fail :Status code is not 400");
			test.info("Fail :Status code is not 400");
	
		}
		
		logger.info("*******Ended authService_userDetails_InvalidUuid_TC5a API ***********");
		logger.info("\n");
		softAssertions.assertAll();

	}
	
	@Test(enabled = true , priority = 9 )
	
	public void authService_userDetails_emptyUUid_TC5b() throws Throwable 
	{
		test=extent.createTest("authService_userDetails_emptyUUid_TC5b");
		SoftAssert softAssertions = new SoftAssert();
		logger.info("*******Started authService_userDetails_emptyUUid_TC5b API************");
		Response response=serviceHelper.userDeatils_TC5(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 24, 2), "");// uuid : its value null
		System.out.println(response.asPrettyString());
		
		JsonPath path=response.body().jsonPath();
		
		String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 24, 4));
		System.out.println(response.asPrettyString());
		if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 24, 5)))
		{
			
			 softAssertions.assertTrue(true, "Pass :'Uuid missing' - Message is verified for NULL uuid value");
				System.out.println( "Pass :'Uuid missing' - Message is verified for NULL uuid value");
				logger.info( "Pass :'Uuid missing' - Message is verified for NULL uuid value");
				test.info( "Pass :'Uuid missing' - Message is verified for NULL uuid value");
			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail : Message Not Verified");
			logger.info("Fail :Message Not Verified");
			test.info("Fail :Message Not Verified");
	
		}
		
		if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_negative_API", 24, 6)))) 
	 	{
		 softAssertions.assertTrue(true, "Pass :Verified status code as 400");
			System.out.println("Pass :Verified status code as 400");
			logger.info("Pass :Verified status code as 400");
			test.info("Pass :Verified status code as 400");

			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail :Status code is not 400");
			logger.info("Fail :Status code is not 400");
			test.info("Fail :Status code is not 400");
	
		}
		
		logger.info("*******Ended authService_userDetails_emptyUUid_TC5b API ***********");
		logger.info("\n");
		softAssertions.assertAll();
	}
	
	
}
