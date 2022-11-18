package com.Api.helpers;

import java.io.File;

import com.Api.constants.AutoConst;
import com.Api.constants.Endpoint;
import com.Api.model.DocsService_pojo;
import com.Api.utils.BaseTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class DocsService_ServiceHelper extends BaseTest implements AutoConst
{
	 public DocsService_ServiceHelper() throws Throwable {
		 
	  RestAssured.baseURI =flib.getKeyPropertyvalue(CONFIG_PATH, "BASE_URL_DOCsSERVICE");
	 }

	 
	 public Response document_meta_data_docs_service_Response_TC1() throws Throwable 
	  {
		  Response response=RestAssured
				  .given()
				  .log().all()
				  .contentType(ContentType.JSON)
				  .get(Endpoint.DOCUMENTS_META_DATA_DOCsSERVICES)
				  .andReturn();
		 return response;
				  
		
	}
	 
	 public Response uploadDocument_Response_TC2() throws Throwable 
	 {
		 
	     String filePath=flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 9, 4);
		 
		  Response response = RestAssured
	     	 .given()
	     		
	     	    .multiPart(flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 8, 2), flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 8, 4)) //request_service:salesApp
	     	    .multiPart(flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 10, 2),flib.getCellValue(DocsDervice_API_EXCEL_PATH, "DocsService_API", 5, 4))//uuid:and its value from TC1
	     	    .multiPart("file", new File(System.getProperty("user.dir")+filePath),"application/pdf")//file:abc.pdf
	     		.post(Endpoint.UPLOAD_DOCUMENT_DOCsSERVICES)
	     		.andReturn();

	       return response;

	}
	 
	
	 
	 public Response downloadDocument_response_TC3() throws Throwable 
	 {
		 Response response=RestAssured
				 .given()
				 
				 .multiPart("requesting_service","SalesApp") //request_service:salesApp
				 .multiPart("acknowledgement_id","ps93vpsjcorsxnxyfjosdg") //acknowledgement_id:TC2 value
				 .post("https://uat.advancesuite.in:3051/external_interfaces/download_doc")
				 .andReturn();
				 
				 return response;
	 }
}
