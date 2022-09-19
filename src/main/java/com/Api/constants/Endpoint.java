package com.Api.constants;

public class Endpoint {

	public static final String GET_ALL_DETAILS = "/paylater_outstanding_charges";
	public static final String BLOCK_ACCOUNT = "/account_block_for_renewal";
	public static final String UNBLOCK_ACCOUNT = "/account_block_for_renewal";

	//--------------INSTA API'S---------------------//
	public static final String VERIFY_PAN = "/business_informations/verify_pan";
	public static final String REGISTER = "/register";
	public static final String OTP="/otp";
	public static final String BUSINESSINFO="/business_informations";
	public static final String GST="/gstin/fetch";
	public static final String BUSINESS_DETAIL="/business_details";
	public static final String MASTER_DATA="/master_data";
	public static final String UPLOAD_DOCUMENT="/documents/upload_document";
	public static final String DIGI_LOCKERS="/digilockers";
	public static final String DIGITAL_KYC="/digilockers/fetch";
	public static final String INDIVIDUAL_DETAILS="/individual_details";
	public static final String BANK_ACCOUNT_DETAILS="/bank_account_details";
	public static final String FILE_UPLOAD="/documents/upload_document";
	public static final String FILE_UPLOAD_VD="/documents/view_document";
	public static final String FILE_UPLOAD_DD="/documents/delete_document";
	public static final String FILE_UPLOAD_DL="/documents";
	public static final String BUSINESS_REGISTRATION="/business_registrations";
	public static final String USER_DETAILS="/detail?uuid=NG2252";
	public static final String GET_MOBILE="/get_pan_details?pan=GARPS2397H";
	public static final String INSTA_LEADS="/validate_insta_lead?mobile=92746111122";
	public static final String CAM_USER="/business_informations/is_user_a_cam";
	public static final String FETCH_DETAILS="/gst/find_gst?pan_number=GARPS2397H&source=Insta";
	public static final String CREATE_UTM="/ng_cap_backend/create_lead";
	public static final String CREATE_USER="/leads";
	
	
	/*----------------------------DocsService API's-----------------------*/
	public static final String DOCUMENTS_META_DATA_DOCsSERVICES="/external_interfaces/get_document_meta?requesting_service=SalesApp";
	public static final String UPLOAD_DOCUMENT_DOCsSERVICES="/external_interfaces/upload_doc";
	public static final String DOWLOAD_DOCUMENT_DOCsSERVICES="/external_interfaces/download_doc";
	public static final String DOWNLOAD_PUBLIC_DOC_DOCsSERVICES="/external_interfaces/download_public_doc";
	public static final String VIEW_DOC_DOCsSERVICES="/external_interfaces/view_doc?requesting_service=SalesApp&acknowledgement_id=o03jpkdttazc8msj5lhuwq";
	public static final String COPY_DOC_DOCsSERVICES="//external_interfaces/copy_doc";
	public static final String DELETE_DOC_DOCsSERVICES="//external_interfaces/delete_doc";
	public static final String UPLOAD_MULTIPLE_DOC_DOCsSERVICES="///external_interfaces/upload_multiple_docs";
	
	
}
