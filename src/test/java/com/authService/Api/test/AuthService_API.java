package com.authService.Api.test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Api.helpers.AuthService_ServiceHelper;
import com.Api.utils.BaseTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AuthService_API extends BaseTest
{
	private AuthService_ServiceHelper serviceHelper;
	 @BeforeClass(alwaysRun = true)
	 public void init() throws Throwable {
		 serviceHelper =new AuthService_ServiceHelper();
		
	 }

	 @Test(enabled = true,priority = 1)
	 public void authserivice_generateOTP_TC1() throws Throwable
	 {
		 	test=extent.createTest("authserivice_generateOTP_TC1");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authserivice_generateOTP_TC1 API************");
			Response response=serviceHelper.generateOTP_TC1(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API",2,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 2, 3));//username:ng2011);
			
			
			JsonPath  path=response.body().jsonPath();
			
			//System.out.println(path.get("message").toString());
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 2, 4)).toString();//response
			System.out.println(message);
			System.out.println(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 2, 5));
			
			if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 2, 5)))
			{

				 softAssertions.assertTrue(true, "Pass :Success  Message is verified");
					System.out.println("Pass : Success Message is verified");
					logger.info("Pass : Success Message is verified");
					test.info("Pass : Success Message is verified");
				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : Message Not Verified");
				logger.info("Fail :Message Not Verified");
				test.info("Fail :Message Not Verified");
		
			}
			
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 3, 6)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Verified status code as 200");
				System.out.println("Pass :Verified status code as 200");
				logger.info("Pass :Verified status code as 200");
				test.info("Pass :Verified status code as 200");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 200");
				logger.info("Fail :Status code is not 200");
				test.info("Fail :Status code is not 200");
		
			}
		
			logger.info("*******Ended authserivice_generateOTP_TC1 API ***********");
			logger.info("\n");
			softAssertions.assertAll();
	}
	 
	 @Test (enabled = true, dependsOnMethods ="authserivice_generateOTP_TC1", priority = 2)
	 public void authService_RetriggerOTP_TC2() throws Throwable 
	 {
		 	test=extent.createTest("authService_RetriggerOTP_TC2");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_RetriggerOTP_TC2 API************");
			Response response=serviceHelper.regiggerOTP_TC2(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API",5,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 5, 3));//username:ng2011
			System.out.println(response.asPrettyString());
			
	
			JsonPath  path=response.body().jsonPath();
			
			//System.out.println(path.get("message").toString());
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 5, 4)).toString();
			System.out.println(message);
			System.out.println(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 5, 5));
			
			if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 5, 5)))
			{

				 softAssertions.assertTrue(true, "Pass :Success  Message is verified");
					System.out.println("Pass : Success Message is verified");
					logger.info("Pass : Success Message is verified");
					test.info("Pass : Success Message is verified");
				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : Message Not Verified");
				logger.info("Fail :Message Not Verified");
				test.info("Fail :Message Not Verified");
		
			}
			
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 6, 6)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Verified status code as 200");
				System.out.println("Pass :Verified status code as 200");
				logger.info("Pass :Verified status code as 200");
				test.info("Pass :Verified status code as 200");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 200");
				logger.info("Fail :Status code is not 200");
				test.info("Fail :Status code is not 200");
		
			}
			logger.info("*******Ended authService_RetriggerOTP_TC2 API ***********");
			logger.info("\n");
			softAssertions.assertAll();
	 }
	 
	 @Test (enabled = true ,dependsOnMethods ="authserivice_generateOTP_TC1")
	 public void authService_verifyOTP_TC3() throws Throwable 
	 {
		 	test=extent.createTest("authService_verifyOTP_TC3");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_verifyOTP_TC3 API************");
			
		
			HashMap<String, String> params=new HashMap();
			params.put(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API",8,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 8, 3));//username:ng2011
			params.put(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API",9,2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 9, 3)); //otp:123456CONFIG_PATH, AuthServive_API_EXCEL_PATH)
			
			Response response=serviceHelper.verifyOTP_TC3(params);
			System.out.println(response.asPrettyString());
			
			JsonPath path=response.body().jsonPath();
			System.out.println(response.asPrettyString());
			
			System.out.println(path.get("ticket").toString());
			flib.setCellData(AuthServive_API_EXCEL_PATH, "AuthService_API", 11, 5, path.get("ticket").toString());
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 10, 4));
			
			if (message.contains(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 10, 5)))
			{
				
				 softAssertions.assertTrue(true, "Pass :Success  Message is verified");
					System.out.println("Pass : Success Message is verified");
					logger.info("Pass : Success Message is verified");
					test.info("Pass : Success Message is verified");
				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : Message Not Verified");
				logger.info("Fail :Message Not Verified");
				test.info("Fail :Message Not Verified");
		
			}
			String ticket=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 11, 4));
			System.out.println(ticket);
			
		if (ticket!= null) 
		{
			
				softAssertions.assertTrue(true, "Pass :Ticket generated successfully");
				System.out.println("Pass :Ticket generated successfully");
				logger.info("Pass : Ticket generated successfully");
				test.info("Pass : Ticket generated successfully");
			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail : No ticket found");
			logger.info("Fail :No ticket found");
			test.info("Fail :No ticket found");
	
		}
		
		if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 10, 6)))) 
	 	{
		 softAssertions.assertTrue(true, "Pass :Verified status code as 200");
			System.out.println("Pass :Verified status code as 200");
			logger.info("Pass :Verified status code as 200");
			test.info("Pass :Verified status code as 200");

			
		}
		else
		{
			softAssertions.assertFalse(true);
			System.out.println("Fail :Status code is not 200");
			logger.info("Fail :Status code is not 200");
			test.info("Fail :Status code is not 200");
	
		}
		logger.info("*******Ended authService_verifyOTP_TC3 API ***********");
		logger.info("\n");
		softAssertions.assertAll();
	}
	 
	 @Test(enabled = true , dependsOnMethods = "authService_verifyOTP_TC3")
	 public void authService_verifyTicket_TC4() throws Throwable 
	 {
		 	test=extent.createTest("authService_verifyTicket_TC4");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_verifyTicket_TC4 API************");
			
			Response response=serviceHelper.verifyTicket_TC4(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 11, 4), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 11, 5)); //ticket : and its vale
			
			System.out.println(response.asPrettyString());
			
			JsonPath path=response.body().jsonPath();
			String ngID=path.get("attributes.username").toString();
			System.out.println(ngID);
			
			if (ngID.equalsIgnoreCase(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 2, 3))) 
			{

				softAssertions.assertTrue(true, "Pass :Ticket verified for the user" + ngID);
				System.out.println("Pass :Ticket verified for the user" + ngID);
				logger.info( "Pass :Ticket verified for the user" + ngID);
				test.info( "Pass :Ticket verified for the user" + ngID);
			
			}
			else
			{
				softAssertions.assertFalse(false,"Fail :Ticket Not verified");
				System.out.println("Fail :Ticket Not verified");
				logger.info("Fail :Ticket Not verified");
				test.info("Fail :Ticket Not verified");

			}
			
			String objectUid=flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 13, 4);
			System.out.println(path.getString("attributes.".concat(objectUid).toString()));
			flib.setCellData(AuthServive_API_EXCEL_PATH, "AuthService_API", 13, 5, path.getString("attributes.".concat(objectUid).toString()));
			
			
			
			if (path.getString("attributes.".concat(objectUid)).toString() != null) 
			{

				softAssertions.assertTrue(true, "Pass : objectUID generated for the user" + ngID);
				System.out.println("Pass : objectUID generated for the user" + ngID);
				logger.info( "Pass : objectUID generated for the user" + ngID);
				test.info("Pass : objectUID generated for the user" + ngID);
			
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :ObjectUID not generated");
				logger.info("Fail:ObjectUID not generated");
				test.info("Fail :ObjectUID not generated");

			}
	 
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 13, 6)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Verified status code as 200");
				System.out.println("Pass :Verified status code as 200");
				logger.info("Pass :Verified status code as 200");
				test.info("Pass :Verified status code as 200");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 200");
				logger.info("Fail :Status code is not 200");
				test.info("Fail :Status code is not 200");
		
			}
			logger.info("*******Ended authService_verifyTicket_TC4 API ***********");
			logger.info("\n");
			softAssertions.assertAll();
	 }
	 
	 @Test(enabled = true, dependsOnMethods ="authService_verifyTicket_TC4" )
	 public void authService_userDetails_TC5() throws Throwable 
	 {
			test=extent.createTest("authService_userDetails_TC5");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_userDetails_TC5 API************");
			Response response=serviceHelper.userDeatils_TC5(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 15, 2), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 13, 5));// uuid : its vale
			System.out.println(response.asPrettyString());
			
			JsonPath path=response.body().jsonPath();
		
			String oid_key=flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 15, 4);
			String username_key=flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 16, 4);
			String uuid_key=flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 15, 2);
			
			
			String uuid_value=flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 13, 5);
			
			
			String ngid_value_tc1=flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 2, 3);
		
			System.out.println(path.get("user._id.$".concat(oid_key)).toString());
			int extraAttribute =path.getInt("user.extra_attributes.size()");
			System.out.println("COUNT INSIDE "+ extraAttribute);
			
			if (path.get("user._id.$".concat(oid_key)).toString()!= null)
			{

				softAssertions.assertTrue(true);
				System.out.println("Pass :oid generated for the user " + ngid_value_tc1);
				logger.info( "Pass : oid generated for the user " + ngid_value_tc1);
				test.info("Pass : oid generated for the user " + ngid_value_tc1);
			
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :oid not generated");
				logger.info("Fail:oid not generated");
				test.info("Fail :oid not generated");

			}
			
			
			if (extraAttribute== Integer.parseInt(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 17, 6)))
			{

				softAssertions.assertTrue(true);
				System.out.println("All the " + extraAttribute+" Extra attribute is present");
				logger.info("All the " + extraAttribute+" Extra attribute is present");
				test.info("All the " + extraAttribute+" Extra attribute is present");
			
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail : ExtraAttribute missing");
				logger.info("Fail : ExtraAttribute missing");
				test.info("Fail : ExtraAttribute missing");

			}
			
			
			
			
			if (path.get("user.".concat(username_key)).toString().equalsIgnoreCase(ngid_value_tc1) && path.get("user.".concat(uuid_key)).toString().equalsIgnoreCase(uuid_value)) 
			{

				softAssertions.assertTrue(true);
				System.out.println("Pass : user details generated for "+ngid_value_tc1+ " with uuid " +uuid_value);
				logger.info( "Pass : user details generated for "+ngid_value_tc1+ " with uuid " +uuid_value);
				test.info("Pass : user details generated for "+ngid_value_tc1+ " with uuid " +uuid_value);
			
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :User details not generated");
				logger.info("Fail :User details not generated");
				test.info("Fail :User details not generated");

			}
	 

			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 15, 6)))) 
		 	{
				softAssertions.assertTrue(true, "Pass :Verified status code as 200");
				System.out.println("Pass :Verified status code as 200");
				logger.info("Pass :Verified status code as 200");
				test.info("Pass :Verified status code as 200");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 200");
				logger.info("Fail :Status code is not 200");
				test.info("Fail :Status code is not 200");
		
			}
			logger.info("*******Ended authService_userDetails_TC5 API ***********");
			logger.info("\n");
			softAssertions.assertAll();
	}
	 
	 @Test(enabled = true , dependsOnMethods ="authService_userDetails_TC5" )
	 public void authService_logout_TC6() throws Throwable 
	 {
		 	test=extent.createTest("authService_logout_TC6");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started authService_logout_TC6 API************");
			Response response=serviceHelper.logout_TC6(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 11, 4), flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 11, 5));//ticket and its value
			System.out.println(response.asPrettyString());
			
			JsonPath path=response.body().jsonPath();
			String message=path.get(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 18, 4));
			
			System.out.println(message);
			if (message.equalsIgnoreCase(flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 18, 5))) 
			{

				softAssertions.assertTrue(true);
				System.out.println("Pass : user logged out successfully");
				logger.info( "Pass :user logged out successfully");
				test.info("Pass :user logged out successfully");
			
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :unable to log out");
				logger.info("Fail :unable to log out");
				test.info("Fail :unable to log out");

			}
	 

			if (response.statusCode()==Integer.parseInt((flib.getCellValue(AuthServive_API_EXCEL_PATH, "AuthService_API", 18, 6)))) 
		 	{
				softAssertions.assertTrue(true, "Pass :Verified status code as 200");
				System.out.println("Pass :Verified status code as 200");
				logger.info("Pass :Verified status code as 200");
				test.info("Pass :Verified status code as 200");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Status code is not 200");
				logger.info("Fail :Status code is not 200");
				test.info("Fail :Status code is not 200");
		
			}
			logger.info("*******Ended authService_logout_TC6 API ***********");
			logger.info("\n");
			softAssertions.assertAll();
	 }
	 
	 
}
