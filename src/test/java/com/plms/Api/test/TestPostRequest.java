package com.plms.Api.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Api.helpers.ServiceHelper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestPostRequest {

	
	private ServiceHelper serviceHelper;
	
	 @BeforeClass(alwaysRun = true)
	 public void init() {
		 serviceHelper =new ServiceHelper();
		
	 }
	 
	 @Test
	 public void testBlockAccount()
	 {
	  Response response = serviceHelper.blockAccount();
      String status = serviceHelper.blockAccount().jsonPath().getString("status");
	 
	     //assertNotNull(status, "list is not empty");
	     assertEquals(response.getStatusCode(),201);
	 }
	 
	 
	 @Test(groups = {"insta"})
	 public void testRegister() 
	 {
	    Response response = serviceHelper.register();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	 }
	 
	 
	 @Test(groups = {"insta"})
	 public void testOtp()
	 {
	    Response response = serviceHelper.getOtp();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	 }
	 
	 
	 @Test(groups = {"insta"})
	 public void getBusinessInfo()
	 {
	    Response response = serviceHelper.getBusinessInfo();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),400);
	 }
	 
	 @Test(groups = {"insta"})
	 public void getBusinessDetail()
	 {
	    Response response = serviceHelper.getBusinessDetail();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	 }
	 
	 @Test(groups = {"insta"})
	 public void getDigiLockers()
	 {
	     Response response = serviceHelper.digi_Locker();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	 }
	 
	 @Test(groups = {"insta"})
	 public void getIndividualDetails()
	 {
	     Response response = serviceHelper.getIndividualDetail();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	 }
	 

	 @Test(groups = {"insta"})
	 public void getBankAccountDetails()
	 {
	     Response response = serviceHelper.bankAccountDetail();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	 }
	 
	 @Test(groups = {"insta"})
	 public void testUploadDocument() throws Exception
	 {
	     Response response = serviceHelper.uploadDocument();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	     
	      
	 }
	 @Test(groups = {"insta"})
	 public void testBussinessRegistration()
	 {
	     Response response = serviceHelper.bussinessRegistration();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),400);
	     System.out.print(response.getBody().asString());
	 }
	 
}
