package com.Api.helpers;

import java.util.HashMap;

import org.json.simple.JSONObject;

import com.Api.constants.AutoConst;
import com.Api.constants.Endpoint;
import com.Api.utils.BaseTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthService_ServiceHelper extends BaseTest implements AutoConst
{
	public AuthService_ServiceHelper() throws Throwable {
		 
		  RestAssured.baseURI =flib.getKeyPropertyvalue(CONFIG_PATH, "BASE_URL_AUTH_SERVICE");
		 }
	
	public Response generateOTP_TC1(String username, String ngid) throws Throwable 
	{
		
		Response response=RestAssured
				.given()
				.param(username,ngid)//username:ng2011
				.when()
				.post(Endpoint.GENERATE_OTP_AUTHSERVICE)
				.thenReturn();
				
		return response;
		
	}
	
	
	
	public Response regiggerOTP_TC2(String username, String ngid) throws Throwable
	{
		Response response=RestAssured
				.given()
				.param(username,ngid)
				.when()
				.post(Endpoint.RETRIGGER_OTP_AUTHSERVICE)
				.thenReturn();
				
		return response;
		
	}
	public Response verifyOTP_TC3( HashMap<String, String> params) throws Throwable
	{	
		Response response=RestAssured
				.given()
				.params(params)
				.when()
				.post(Endpoint.VERIFY_OTP_AUTHSERVICE)
				.thenReturn();
		return response;
	}
	
	public Response verifyTicket_TC4(String ticketkey ,String ticketvalue) throws Throwable
	{
		
		Response response=RestAssured
				.given()
				.param(ticketkey,ticketvalue)
				.when()
				.post(Endpoint.VERIFY_TICKET_AUTHSERVICE)
				.thenReturn();
				
				return response;
		
	}
	
	public Response userDeatils_TC5(String uuidKey, String uuidValue) throws Throwable
	{
		Response response=RestAssured
				.given()
				.param(uuidKey,uuidValue)
				.when()
				.get(Endpoint.USER_DETAILS_UAT_AUTHSERVICE)
				.thenReturn();
		return response;
	}
	
	public Response logout_TC6(String ticketKey, String ticketValue) throws Throwable 
	{
		Response response=RestAssured
				.given()
				.param(ticketKey,ticketValue)
				.when()
				.post(Endpoint.LOGOUT_AUTHSERVICE)
				.thenReturn();
		return response;
	}

	
}
