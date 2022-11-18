package com.growthPartner.Api.test;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Api.helpers.AuthService_ServiceHelper;
import com.Api.helpers.GrowthPartner_ServiceHelper;
import com.Api.model.GrowthPartner_pojo;
import com.Api.utils.BaseTest;

import io.restassured.response.Response;

public class GrowthPartner_API extends BaseTest
{
	private GrowthPartner_ServiceHelper serviceHelper;
	 @BeforeClass(alwaysRun = true)
	 public void init() throws Throwable {
		 serviceHelper =new GrowthPartner_ServiceHelper();
		
	 }
	 
	 @Test
	 public void generateOTP_TC1_gp() 
	 {

		 	test=extent.createTest("generateOTP_TC1_gp");
			SoftAssert softAssertions = new SoftAssert();
			logger.info("*******Started generateOTP_TC1_gp API************");
			
			GrowthPartner_pojo gp_pojo=new GrowthPartner_pojo();
			gp_pojo.setMobile("9814567153");
			Response response=serviceHelper.generateOTP_TC1(gp_pojo);
			System.out.println(response.asPrettyString());
			
			
		
	}
	

}
