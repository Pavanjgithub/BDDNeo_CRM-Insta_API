package com.Api.helpers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.Api.constants.AutoConst;
import com.Api.constants.Endpoint;
import com.Api.model.Address;
import com.Api.model.Details;
import com.Api.model.Insta;
import com.Api.utils.ConfigManager;
import com.Api.utils.ExcelUtils;
import com.Api.utils.FileLib;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class ServiceHelper implements AutoConst{
		
	
	 
	 private static final String BASE_URL =ConfigManager.getIstance().getString("base_url");
	// private static final String PORT =ConfigManager.getIstance().getString("port");
	 String n;
	 public ServiceHelper() {
		 
	  RestAssured.baseURI =BASE_URL;
	  //RestAssured.port=Integer.parseInt(PORT);
	  //RestAssured.useRelaxedHTTPSValidation();
	 
   }
	 private static void createRandomInteger(int aStart, long aEnd, Random aRandom){
		    if ( aStart > aEnd ) {
		      throw new IllegalArgumentException("Start cannot exceed End.");
		    }
		    //get the range, casting to long to avoid overflow problems
		    long range = aEnd - (long)aStart + 1;
		    System.out.println("range>>>>>>>>>>>"+range);
		    // compute a fraction of the range, 0 <= frac < range
		    long fraction = (long)(range * aRandom.nextDouble());
		    System.out.println("fraction>>>>>>>>>>>>>>>>>>>>"+fraction);
		    long randomNumber =  fraction + (long)aStart;    
		    System.out.println("Generated : " + randomNumber);

		  }

		public String readJSONData(String response,String keyword) throws Exception  {			

			JSONParser parser = new JSONParser();
			Object obj = parser.parse(response);
			JSONArray array=new JSONArray();
			
			for(Object obje : array){
				JSONObject jo = (JSONObject)obj;			
				String n = (String)jo.get(keyword);
			}
			return n;

		}
	 public Response getAllDetails(){

          Response response = RestAssured
        		  .given()
        		  .header("Authorization", "Bearer " + "password")
        		  .queryParam("cust_id", "440")
        		  .queryParam("email","email@example.com")
        		  .queryParam("send_email","false")
        		  .log().all()
        		  .contentType(ContentType.JSON)
        		  .get(Endpoint.GET_ALL_DETAILS)
        		  .andReturn();
    
          
          //Type type= new TypeReference<List<Details>>(){}.getType();	
        
          //List<Details> list=response.as(type);
          return response;
	 }
          
          public Response verifyPan() throws IOException{
        	  
        	  
        	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
        	  RestAssured.baseURI =BASE_URL_INSTA;
        	  Insta insta=new Insta();
        	  insta.setPan("AAIPB6399M");
        	  
              Response response = RestAssured
            		  .given()
            		  .body(insta)
            		  .log().all()
            		  .contentType(ContentType.JSON)
            		  .get(Endpoint.VERIFY_PAN)
            		  .andReturn();
  
              return response;
          
          
		 
	 }
   public Response register(){
        	  
        	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
        	  RestAssured.baseURI =BASE_URL_INSTA;
        	  Insta insta=new Insta();
        	  insta.setName("Sowmya MR");
        	  insta.setGender("Female");
        	  insta.setMobile("8899667703");
        	  insta.setEmail("sowmya.mr@neogrowth.in");
        	  insta.setDob("22-01-1990");
        	  insta.setPincode("560078");
        	  insta.setConsent(true);
        	  insta.setOtp("123456");
        	  
        	  
              Response response = RestAssured
            		  .given()
            		  .body(insta)
            		  .log().all()
            		  .contentType(ContentType.JSON)
            		  .post(Endpoint.REGISTER)
            		  .andReturn();
  
              return response;
   }
   
   public Response getOtp(){
 	  
 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
 	  RestAssured.baseURI =BASE_URL_INSTA;
 	  Insta insta=new Insta();
 	
 	  insta.setMobile("8899667703");
 	  Response response = RestAssured
     		  .given()
     		  .body(insta)
     		  .log().all()
     		  .contentType(ContentType.JSON)
     		  .post(Endpoint.OTP)
     		  .andReturn();

       return response;
}
   
   
   public Response getBusinessInfo(){
	 	  
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA;
	 	  Insta insta=new Insta();
	 	  insta.setBusinessVintage("18 - 36 months");
	 	  insta.setIndustryMasterId(1);
	 	  insta.setPurposeOfLoanMasterId(1);
	 	  insta.setApplicationTypeMasterId("1");
	 	  insta.setPan("AAIPB6399M");
	 	  insta.setApplicationTypeId(1);
	 	  insta.setNatureOfBusinessId(1);
	 	  Response response = RestAssured
	     		  .given()
	     		  .body(insta)
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .post(Endpoint.BUSINESSINFO)
	     		  .andReturn();

	       return response;
   }
   
   public Response getGST(){
	 	  
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA;
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("b1a2c2e5-dd2c-36d1-56f3-6165636f11d4");
	 	  insta.setPan("AAIPB6399M");
	 	  insta.setnatureofbusinessmasterid(true);
 	
	 	  Response response = RestAssured
	     		  .given()
	     		  .body(insta)
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .get(Endpoint.GST)
	     		  .andReturn();
	       return response;
}
  
   public Response getBusinessDetail(){
	 	  
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA;
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("b1a2c2e5-dd2c-36d1-56f3-6165636f11d4");
	 	  insta.setEntityName("test");
	 	  insta.setTradingName("test");
	 	  insta.setAverageMonthlySales(true);
	 	  insta.setDigitalPaymentsAccepted(true);
	 	  insta.setAverageMonthlyTurnoverMasterId("1");
	 	  Address address=new Address();
	 	  address.setStreet("Jayanagar");
	 	  address.setPincode("560041");
	 	  address.setCitiesMasterId(1);
	 	  address.setStatesMasterId(1);
	 	  insta.setAddress(address);
	 	
	 	  Response response = RestAssured
	     		  .given()
	     		  .body(insta)
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .post(Endpoint.BUSINESS_DETAIL)
	     		  .andReturn();

	       return response;
}
   
   public Response master_Data(){
 	  
 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
 	  RestAssured.baseURI =BASE_URL_INSTA; 	  
       Response response = RestAssured
     		  .given()
     		  .log().all()
     		  .contentType(ContentType.JSON)
     		  .get(Endpoint.MASTER_DATA)
     		  .andReturn();

       return response;
    
}
   
   public Response uploadDocument() throws Exception{
	   
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA; 
	 
	 	  File file = new File("C://Users/chandra.prabha/eclipse-workspace/Api/resorces/Book1.xlsx");	

	      Map<String,String> map = new HashMap<String, String>();
	      map.put("document_type_master_id", "65");
	      map.put("lead_id", "a6722ce1-1cbb-08c4-4461-61f8f619758c");
	      map.put("password","test123");
	 
	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .multiPart(file)
	     		  .formParams(map)
	     		  .when()
	     		  .post(Endpoint.UPLOAD_DOCUMENT)	
	     		  .andReturn();
	    
	    String resp=response.asString();
		String a = readJSONData(resp, "original_doc_token");
		System.out.println(a);
		return response;  
		

   } 
   
   public Response listDocument(){
	  	
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA; 
	 	  
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("b1a2c2e5-dd2c-36d1-56f3-6165636f11d4");	
	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .post(Endpoint.FILE_UPLOAD_DL)
	     		  .andReturn();

	       return response;

}
   
   public Response digi_Locker(){
	  	
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA; 
	 	  
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("b1a2c2e5-dd2c-36d1-56f3-6165636f11d4");

	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .body(insta)
	     		  .post(Endpoint.DIGI_LOCKERS)
	     		  .andReturn();

	       return response;
}
   
   public Response digi_kyc(){
	  	
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA; 
	 	  
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("b1a2c2e5-dd2c-36d1-56f3-6165636f11d4");
          insta.setKyc_request_id(true);
	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .body(insta)
	     		  .get(Endpoint.DIGITAL_KYC)
	     		  .andReturn();

	       return response;
}
   
   public Response getIndividualDetail(){
	 	  
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA;
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("b1a2c2e5-dd2c-36d1-56f3-6165636f11d4");
	 	  insta.setDob("20-10-1990");
	 	  insta.setGender("M");
	 	  insta.setFathers_name("test");
	 	  insta.setIdentity_address_proof("file_upload");
	 	  
	 	  Address permanent_address=new Address();
	 	  permanent_address.setStreet("Jayanagar");
	 	  permanent_address.setPincode("560041");
	 	  permanent_address.setCitiesMasterId(1);
	 	  permanent_address.setStatesMasterId(1);
	 	  insta.setPermanent_address(permanent_address);
	 	  
	 	 insta.setSame_as_permanent_address(false);
	 	  
	 	 Address Current_address=new Address();
	 	 Current_address.setStreet("Jayanagar");
	 	 Current_address.setPincode("560070");
	 	 Current_address.setCitiesMasterId(2);
	 	 Current_address.setStatesMasterId(2);
	 	 insta.setCurrent_address(Current_address);
			
	 	  
	 	  Response response = RestAssured
	     		  .given()
	     		  .body(insta)
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .post(Endpoint.INDIVIDUAL_DETAILS)
	     		  .andReturn();

	       return response;
}

   public Response bankAccountDetail(){
	 	  
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA;
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("b1a2c2e5-dd2c-36d1-56f3-6165636f11d4");
	 	  insta.setNatureOfBankAccountMasterId(1);
	 	  insta.setAccountNumber(12333333);
	 	  insta.setIfscCode("CITI0000004");
	 	  insta.setCitiesMasterId(1);
	 	  insta.setStatesMasterId(1);
	 	  insta.setBankMasterId(1);
	 	  insta.setBankBranch("Bangalore");

	 	  Response response = RestAssured
	     		  .given()
	     		  .body(insta)
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .post(Endpoint.BANK_ACCOUNT_DETAILS)
	     		  .andReturn();

	       return response;
}
//plms------//
	 public Response blockAccount()
	 {
		Details detail=new Details();
		detail.setStatus("block");
		detail.setAppIds("80000360");
		
		Response response= RestAssured.given()
				          .header("Authorization", "Bearer " + "password")
				          .log().all()
				          .contentType(ContentType.JSON)
				          .when()
				          .body(detail)
      		              .post(Endpoint.BLOCK_ACCOUNT)
      		              .andReturn();
       
		
		return response;
		 
	 }
	 
	 public Response viewDocument(){
		  	
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA; 
	 	  
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("a6722ce1-1cbb-08c4-4461-61f8f619758c");	
	 	  insta.setOriginalDocToken("1000_1651040668_Book1.xlsx");
	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .get(Endpoint.FILE_UPLOAD_VD)
	     		  .andReturn();

	       return response;
}
	 
	 public Response bussinessRegistration(){
		  	
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA; 
	 	  File file = new File("C:\\Users\\chandra.prabha\\eclipse-workspace\\Api\\resorces\\Book1.xlsx");	
	 	  Insta insta=new Insta();
	 	  insta.setLeadId("b1a2c2e5-dd2c-36d1-56f3-6165636f11d4");	
	 	  insta.setDocumentTypeMasterId("61");
	 	  insta.setBusinessRegistrationDate("22-01-1990");
	 	  insta.setGstRegistered(true);
	 	  insta.setFile(file);
	       Response response = RestAssured
	    		      .given()
		     		  .log().all()
		     		  .multiPart(file)
		     		  .body(insta)
		     		  .when()
		     		  .post(Endpoint.BUSINESS_REGISTRATION)
		     		  .andReturn();
	       return response;
}
	 
	 public Response getUserDetail(){
		  	
	 	   RestAssured.baseURI ="https://uat.advancesuite.in:3055/api/v1";   
	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .queryParam("uuid", "NG2252")
	     		  .get(Endpoint.USER_DETAILS)
	     		  .andReturn();

	       return response;
}
	 public Response getGetMobile(){
		  	
	 	   RestAssured.baseURI ="https://uat.advancesuite.in:3026/api/insta/external_api";   
	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .queryParam("pan", "GARPS2397H")
	     		  .get(Endpoint.GET_MOBILE)
	     		  .andReturn();

	       return response; 
}
	 public Response getInstaLead(){
		  	
	 	   RestAssured.baseURI ="https://uat.advancesuite.in:3026/api/insta/external_api";   
	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .queryParam("mobile", "92746111122")
	     		  .get(Endpoint.INSTA_LEADS)
	     		  .andReturn();

	       return response; 
}
	  public Response getCamUser(){
		  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA;   
          Response response = RestAssured
   		  .given()
   		  .log().all()
   		  .contentType(ContentType.JSON)
   		  .queryParam("ngid", "ng2011")
   		  .get(Endpoint.CAM_USER)
   		  .andReturn();

     return response; 
}
	  public Response getFetchDetail(){
		   RestAssured.baseURI ="https://uat.advancesuite.in:3064/api/v1";   
	       Response response = RestAssured
	   		  .given()
	   		  .log().all()
	   		  .contentType(ContentType.JSON)
	   		  .queryParam("pan_number", "GARPS2397H","source","Insta")
	   		  .get(Endpoint.FETCH_DETAILS)
	   		  .andReturn();

	     return response; 
	}
	 
	  public Response getCreateUtm(){
		  	
	 	  String BASE_URL_INSTA =ConfigManager.getIstance().getString("base_url_insta");
	 	  RestAssured.baseURI =BASE_URL_INSTA; 	 	  
	 	  Insta insta=new Insta();
	 	  insta.setFullName("Goku R");
	 	  insta.setMobile("8838922236");
	 	  insta.setbusinessName("Business1");
	 	  insta.setCityName("Bangalore");
	 	  //insta.setPartners_availed(["Neocash Insta"]);
	       Response response = RestAssured
	     		  .given()
	     		  .log().all()
	     		  .contentType(ContentType.JSON)
	     		  .get(Endpoint.FILE_UPLOAD_VD)
	     		  .andReturn();

	       return response;
}
	  
	  /*******************DocsSevice*************/
	  public Response document_meta_data_docs_service() throws Throwable 
	  {
		  FileLib flib=new FileLib();
		  String BASE_URL_DOCsSERVICE=flib.getKeyPropertyvalue(CONFIG_PATH, "BASE_URL_DOCsSERVICE");
		  RestAssured.baseURI=BASE_URL_DOCsSERVICE;
		  Response response=RestAssured
				  .given()
				  .log().all()
				  .contentType(ContentType.JSON)
				  .get(Endpoint.DOCUMENTS_META_DATA_DOCsSERVICES)
				  .andReturn();
		 return response;
				  
		
	}
}