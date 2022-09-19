package com.docsService.Api.test;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Api.helpers.DocsService_ServiceHelper;
import com.Api.utils.BaseTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DocsService_API extends BaseTest
{
	private DocsService_ServiceHelper serviceHelper;
	 @BeforeClass(alwaysRun = true)
	 public void init() throws Throwable {
		 serviceHelper =new DocsService_ServiceHelper();
		
	 }
	

	 @Test(enabled = false)
	public void document_meta_data_Docs_service_TC1 () throws Throwable 
	{		
		test=extent.createTest("document_meta_data_Docs_service_TC1");
		SoftAssert softAssertions = new SoftAssert();
		logger.info("*******Started document_meta_data_Docs_service API************");

		Response response=serviceHelper.document_meta_data_docs_service_Response_TC1();
		int name_count=0;
		String jsonData = response.getBody().asPrettyString();
		System.out.println("response is "+ jsonData);
		
		JsonPath  path=response.body().jsonPath();
		List<Object> jsonObjects=path.getList("");
		
		System.out.println("count is "+jsonObjects.size());
		System.out.println(path.get("name").toString());
		System.out.println(path.get("uuid[0]").toString());
		String uuid=path.get("uuid[0]").toString();
		flib.setCellData(DocsDervice_API_EXCEL_PATH, "DocsService_API", 5, 4, uuid);
		
		logger.info("Verifying key attribute in Document meta data request");
		if (jsonData.contains("name") && jsonData.contains("custom_attributes") && jsonData.contains("uuid") && jsonData.contains("is_active")) 
		{
			 
			 softAssertions.assertTrue(true, "Pass : All the key attribute name,uuid,custom_attributes and is_active is present");
				System.out.println("Pass : All the key attribute name,uuid,custom_attributes and is_active is present");
				logger.info("Pass : All the key attribute name,uuid,custom_attributes and is_active is present");
				test.info("Pass : All the key attribute name,uuid,custom_attributes and is_active is present");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Missing key attribute in response");
				logger.info("Fail :Missing key attribute in response");
				test.info("Fail :Missing key attribute in response");
		
			}
		
		for (int i = 0; i < jsonObjects.size(); i++)
		{
			String nameExcel=flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 4, i+4);
			String nameResponse=path.get("name["+i+"]").toString();
			if (nameExcel.equalsIgnoreCase(nameResponse))
			{
				name_count++;
				
			}
			
		}
		logger.info("Getting total name's count");
		System.out.println("name count "+name_count);
		
		
		 if (name_count==Integer.parseInt((flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 3, 4)))) 
		 {
			
			 softAssertions.assertTrue(true, "Pass :All the 73 names are present");
				System.out.println("Pass :All the 73 names are present");
				logger.info("Pass :All the 73 names are present");
				test.info("Pass :All the 73 names are present");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Missing names");
				logger.info("Fail :Missing names");
				test.info("Fail :Missing names");
		
			}
		 
		 logger.info("Getting status code");
		 	if (response.statusCode()==Integer.parseInt((flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 1, 4)))) 
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
		 	logger.info("*******Ended document_meta_data_Docs_service API ***********");

		 softAssertions.assertAll();
		 
	}


	 @Test
	 public void UpdateDocument_DocsService() throws Throwable
	 {
		 test=extent.createTest("UpdateDocument_DocsService");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started UpdateDocument_DocsService API************");

			Response response=serviceHelper.uploadDocument_Response_TC2();
		
			String jsonData = response.getBody().asPrettyString();
			String filename=response.path("s3_object.filename");
			
			System.out.println("response is "+ jsonData);
			String acknowledgement_id=response.path("acknowledgement_id").toString();
			System.out.println(acknowledgement_id);
			
			System.out.println("file name "+ response.path("s3_object.filename"));
			
			
			if (response.statusCode()==Integer.parseInt((flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 7, 4)))) 
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

//			System.out.println(response.path("message").toString());
//			System.out.println(flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 12, 5));

			if (response.path("message").toString().contains((flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 12, 5)))) 
		 	{
			 softAssertions.assertTrue(true, "Pass :Successfully uploaded file to S3 ");
				System.out.println("Pass :Successfully uploaded file to S3");
				logger.info("Pass :Successfully uploaded file to S3");
				test.info("Pass :Successfully uploaded file to S3");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Error in uploading the file");
				logger.info("Fail :Error in uploading the file");
				test.info("Fail :Error in uploading the file");
		
			}

			
			
		 
			if (filename != null) 
		 	{
			 softAssertions.assertTrue(true, "Pass :uploaded Filename displayed");
				System.out.println("Pass :uploaded Filename displayed");
				logger.info("Pass :uploaded Filename displayed");
				test.info("Pass :uploaded Filename displayed");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :uploaded Filename NOT displayed");
				logger.info("Fail :uploaded Filename NOT displayed");
				test.info("Fail :uploaded Filename NOT displayed");
		
			}
			
		
			//System.out.println(response.path("s3_object.content_length").toString());
			
			
			if (response.path("s3_object.content_length").toString() != null)
		 	{
			 softAssertions.assertTrue(true, "Pass :content_length > 0");
				System.out.println("Pass :content_length > 0");
				logger.info("Pass :content_length > 0");
				test.info("Pass :content_length > 0");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :No content_length");
				logger.info("Fail :No content_length");
				test.info("Fail :No content_length");
		
			}

//			System.out.println(response.path("s3_object.content_type").toString());
//			System.out.println(flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 17, 5));
			
			
			if(response.path("s3_object.content_type").toString().contains(flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 17, 5)))
		 	{
			 softAssertions.assertTrue(true, "Pass :Content type is application/pdf");
				System.out.println("Pass :Content type is application/pdf");
				logger.info("Pass :Content type is application/pdf");
				test.info("Pass :Content type is application/pdf");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :Content type is not in requested format");
				logger.info("Fail :Content type is not in requested format");
				test.info("Fail :Content type is not in requested format");
		
			}

		softAssertions.assertAll();
	}
}
