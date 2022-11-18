package com.Api.helpers;

import java.util.HashMap;

import com.Api.constants.AutoConst;
import com.Api.constants.Endpoint;
import com.Api.model.GrowthPartner_pojo;
import com.Api.utils.BaseTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GrowthPartner_ServiceHelper extends BaseTest implements AutoConst
{
	 public GrowthPartner_ServiceHelper() throws Throwable {
		 
		  RestAssured.baseURI =flib.getKeyPropertyvalue(CONFIG_PATH, "BASE_URL_GROWTH_PARTNER");
		 }

	 public Response generateOTP_TC1(GrowthPartner_pojo gp_pojo)
	 {
		 Response response=RestAssured
				 .given()
				 .body(gp_pojo)
				  .log().all()
				  .contentType(ContentType.JSON)
				  .get(Endpoint.GENERATE_OTP_GROWTH_PARTNER)
				  .andReturn();
		 return response;
		
	}
	 
	
}
