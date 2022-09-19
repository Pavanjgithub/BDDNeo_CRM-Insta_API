package com.plms.Api.test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Api.helpers.ServiceHelper;
import com.Api.utils.BaseTest;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Docs_service_GET_POST extends BaseTest
{

	private ServiceHelper serviceHelper;
	 @BeforeClass(alwaysRun = true)
	 public void init() {
		 serviceHelper =new ServiceHelper();
		
	 }
	
	@Test
	public void document_meta_data_Docs_service_TC1 () throws Throwable 
	{		
		test=extent.createTest("document_meta_data_Docs_service_TC1");
		SoftAssert softAssertions = new SoftAssert();
		logger.info("*******Started verifyLandingpageInDashboard_TC1************");

		Response response=serviceHelper.document_meta_data_docs_service();
		String jsonData = response.getBody().asPrettyString();
		System.out.println("response is "+ jsonData);
		JsonPath  path=response.body().jsonPath();
		List<Object> jsonObjects=path.getList("");
		System.out.println("count is "+jsonObjects.size());
		System.out.println(path.get("name").toString());
		
		
		//System.out.println(response.jsonPath().get().);
		Assert.assertEquals(response.getStatusCode(),200);
		 if (jsonData.contains("custom_attributes")) 
		 {
			 //softAssertions.assertTrue(true);
			 softAssertions.assertTrue(true, "Pass :custom_attributes is present");
				System.out.println("Pass :custom_attributes is present");
				test.info("Pass :custom_attributes is present");

				
			}
			else
			{
				softAssertions.assertFalse(true);
				System.out.println("Fail :custom_attributes is not present");
				test.info("Fail :custom_attributes is not present");
		
			}

		 softAssertions.assertAll();
		 
	}

}
