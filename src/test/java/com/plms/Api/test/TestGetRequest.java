package com.plms.Api.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Api.helpers.ServiceHelper;
import com.Api.model.Details;
import com.Api.utils.ExcelUtils;

import io.netty.handler.codec.http.HttpRequest;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class TestGetRequest {

	private ServiceHelper serviceHelper;
	    String excelPath="./resorces/TestData.xlsx";
		String sheetName="Sheet1";
		ExcelUtils excel=new ExcelUtils(excelPath, sheetName);
	 @BeforeClass(alwaysRun = true)
	 public void init() {
		 serviceHelper =new ServiceHelper();
		
	 }
	 
	 @Test
	 public void testGetAllDetails()
	 {
	    Response response = serviceHelper.getAllDetails();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	 }
	 
	 @Test(groups = {"insta"})
	 public void testVerifyPan() throws IOException
	 {
		
 		 excel.getRowCount();
	     Response response = serviceHelper.verifyPan();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),Integer.parseInt((String) excel.getCellData(1, 2)));
	     ResponseBody resp = response.getBody();
	     String responseStr = resp.asString();
	     assertEquals(responseStr,excel.getCellData(1, 1));
	     
	 }
	
	 @Test(groups = {"insta"})
	 public void testVerifyGST()
	 {
	    Response response = serviceHelper.getGST();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	     
	     
	 }
	 
	 
	 @Test(groups = {"insta"})
	 public void testMasterData()
	 {
	    Response response = serviceHelper.master_Data();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	     
	     
	 }
	 
	 @Test(groups = {"insta"})
	 public void testDigitalKyc()
	 {
	    Response response = serviceHelper.digi_kyc();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	     System.out.println(response.getBody().asString());
	     
	     
	 }
	 
	 @Test(groups = {"regression"})
	 public void testListDocument()
	 {
	    Response response = serviceHelper.digi_kyc();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	     System.out.println(response.getBody().asString());
	     
	     
	 }
	 
	 @Test
	 public void testViewDocument()
	 {
	    Response response = serviceHelper.viewDocument();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     assertEquals(response.getStatusCode(),200);
	     System.out.println(response.getBody().asString());
	     
	 }
	 @Test
	 public void testUserDetail() throws IOException
	 {
	     Response response = serviceHelper.getUserDetail();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     int data = Integer.parseInt((String) excel.getCellData(2, 2));
	     assertEquals(response.getStatusCode(),data);
	     String responseStr = response.asString();
	     assertEquals(responseStr,excel.getCellData(2, 1));
	 
}
	 @Test
	 public void testGetMobile() throws IOException
	 {
	     Response response = serviceHelper.getGetMobile();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     int data = Integer.parseInt((String) excel.getCellData(3, 2));
	     assertEquals(response.getStatusCode(),data);
	     String responseStr = response.asString();
	     assertEquals(responseStr,excel.getCellData(3,1));
	 
}
	 @Test
	 public void testInstaLeads() throws IOException
	 {
	     Response response = serviceHelper.getInstaLead();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     int data = Integer.parseInt((String) excel.getCellData(4, 2));
	     assertEquals(response.getStatusCode(),data);
	     String responseStr = response.asString();
	     assertEquals(responseStr,excel.getCellData(4,1));
	 
}
	 @Test
	 public void testCamUser() throws IOException
	 {
	     Response response = serviceHelper.getCamUser();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     int data = Integer.parseInt((String) excel.getCellData(5, 2));
	     assertEquals(response.getStatusCode(),data);
	     String responseStr = response.asString();
	     assertEquals(responseStr,excel.getCellData(5,1));
	 
}
	 //-req timeout--
	 @Test
	 public void testFetchDetails() throws IOException
	 {
	     Response response = serviceHelper.getFetchDetail();
	     assertNotNull(response, "list is not empty");
	     assertFalse((response.asByteArray().length == 0)," list is not true");
	     int data = Integer.parseInt((String) excel.getCellData(5, 2));
	     assertEquals(response.getStatusCode(),data);
	     String responseStr = response.asString();
	     assertEquals(responseStr,excel.getCellData(5,1));
	 
}
}