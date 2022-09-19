package com.plms.Api.test;
//make static
import static io.restassured.RestAssured.baseURI;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GETandPOSTExample
{
	@Test(enabled = false)
	@SuppressWarnings("unchecked")
	public void postExampleCRM()
	{
		
		//Map<String, Object> map=new HashMap<String, Object>();
		JSONObject request=new JSONObject();
		request.put("opportunity_id", "11b10334-4ca8-44b5-dbc4-630314dd8530");
		request.put("opportunity_stage", "Open");
		
		System.out.println(request.toJSONString());
		System.out.println(request);
		baseURI="https://crm2_0uat.neogrowth.in";	
		Response res=RestAssured.
		given(). 
		header("content-Type","application/json").
		 contentType(ContentType.JSON). 
		 accept(ContentType.JSON).
		 body(request.toJSONString()).
		when().
		  post("/index.php?entryPoint=crmapi").
		andReturn();
		
		System.out.println("Hello");
		System.out.println(res.statusCode());
		System.out.println(res.getBody());
		System.out.println(res.body());
		System.out.println(res.asPrettyString());
		System.out.println("******cookies*********");
		System.out.println(res.cookies());
		
		System.out.println("*****Header********");
		System.out.println(res.getHeaders());
		
	}


	@Test(enabled = false)
	@SuppressWarnings("unchecked")
	public void postExampleCRMOld()
	{
		
		
			
			//Map<String, Object> map=new HashMap<String, Object>();
			JSONObject request=new JSONObject();
			request.put("opportunity_id", "11b10334-4ca8-44b5-dbc4-630314dd8530");
			request.put("opportunity_stage", "Submitted");
			
			System.out.println(request.toJSONString());
			
			baseURI="https://crm2_0uat.neogrowth.in";		
//		given(). 
//			header("AUTHORIZEDAPPLICATION","N30gr0wth").
//			header("Accept","application/json, text/plain, */*").
//			header("Authorization","Basic bmczNTY6V2VsY29tZUAxMjM=").
//			header("Content-Type","application/json").
//			header("REQUESTEDMETHOD","Update").
//			header("REQUESTEDMODULE","Opportunities").
//			 contentType(ContentType.JSON). 
//			 accept(ContentType.JSON).
//			 body(request.toJSONString()).
//			when().
//			  post("/index.php?entryPoint=crmapi").
//			then().
//			  statusCode(200).log().all();
//			
//			
			
	}
	
	@Test(enabled = true)
	public void postReqest() 
	{
		RestAssured.baseURI="https://reqres.in/api";
		
		JSONObject requestParam=new JSONObject();
		requestParam.put("name", "Shilpa");
		requestParam.put("job", "Testing");
	
		RequestSpecification httpRequest=RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		
		httpRequest.body(requestParam.toJSONString());
		Response response=httpRequest.request(Method.POST,"/users");
		String responseBody=response.toString();
		
		System.out.println(response);
		System.out.println(responseBody);
		System.out.println(response.asPrettyString());
		
		int statuscode=response.getStatusCode();
		System.out.println("statusCode "+statuscode);
		Assert.assertEquals(statuscode, 201);
		
		String statusline=response.getStatusLine();
		System.out.println(statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 201 Created");
		
		
//		String succesCodeMsg=response.jsonPath().get("SuccessCode");
//		System.out.println("successcodemsg "+succesCodeMsg);
//		Assert.assertEquals(succesCodeMsg, "OPERATION_SUCCESS");
		
		
		
		
	}
	
	
	@Test(enabled = false)
	
	public void javaPOst() 
	{
		RestAssured.baseURI="https://crm2_0uat.neogrowth.in";
		
		JSONObject requestParam=new JSONObject();
		requestParam.put("opportunity_id", "11b10334-4ca8-44b5-dbc4-630314dd8530");
		requestParam.put("opportunity_stage", "Open");
	
		RequestSpecification httpRequest=RestAssured.given();
		httpRequest.header("Content-Type","application/json");
		
		httpRequest.body(requestParam.toJSONString());
		Response response=httpRequest.request(Method.POST,"/index.php?entryPoint=crmapi");
		String responseBody=response.toString();
		
		System.out.println(response);
		System.out.println(responseBody);
		
		int statuscode=response.getStatusCode();
		System.out.println("statusCode "+statuscode);
		//Assert.assertEquals(statuscode, 201);
		
		String statusline=response.getStatusLine();
		System.out.println(statusline);
		//Assert.assertEquals(statusline, "HTTP/1.1 201 Created");
		
		
		
	
		
		
	}
	


}
