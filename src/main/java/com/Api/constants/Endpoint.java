package com.Api.constants;

public interface Endpoint {

	String GET_ALL_DETAILS = "/paylater_outstanding_charges";
	String BLOCK_ACCOUNT = "/account_block_for_renewal";
	String UNBLOCK_ACCOUNT = "/account_block_for_renewal";

	//--------------INSTA API'S---------------------//
	String VERIFY_PAN = "/business_informations/verify_pan";
	String REGISTER = "/register";
	String OTP="/otp";
	String BUSINESSINFO="/business_informations";
	String GST="/gstin/fetch";
	String BUSINESS_DETAIL="/business_details";
	String MASTER_DATA="/master_data";
	String UPLOAD_DOCUMENT="/documents/upload_document";
	String DIGI_LOCKERS="/digilockers";
	String DIGITAL_KYC="/digilockers/fetch";
	String INDIVIDUAL_DETAILS="/individual_details";
	String BANK_ACCOUNT_DETAILS="/bank_account_details";
	String FILE_UPLOAD="/documents/upload_document";
	String FILE_UPLOAD_VD="/documents/view_document";
	String FILE_UPLOAD_DD="/documents/delete_document";
	String FILE_UPLOAD_DL="/documents";
	String BUSINESS_REGISTRATION="/business_registrations";
	String USER_DETAILS="/detail?uuid=NG2252";
	String GET_MOBILE="/get_pan_details?pan=GARPS2397H";
	String INSTA_LEADS="/validate_insta_lead?mobile=92746111122";
	String CAM_USER="/business_informations/is_user_a_cam";
	String FETCH_DETAILS="/gst/find_gst?pan_number=GARPS2397H&source=Insta";
	String CREATE_UTM="/ng_cap_backend/create_lead";
	String CREATE_USER="/leads";
	
	
	/*----------------------------DocsService API's-----------------------*/
	String DOCUMENTS_META_DATA_DOCsSERVICES="/external_interfaces/get_document_meta?requesting_service=SalesApp";
	String UPLOAD_DOCUMENT_DOCsSERVICES="/external_interfaces/upload_doc";
	String DOWLOAD_DOCUMENT_DOCsSERVICES="/external_interfaces/download_doc";
	String DOWNLOAD_PUBLIC_DOC_DOCsSERVICES="/external_interfaces/download_public_doc";
	String VIEW_DOC_DOCsSERVICES="/external_interfaces/view_doc?requesting_service=SalesApp&acknowledgement_id=o03jpkdttazc8msj5lhuwq";
	String COPY_DOC_DOCsSERVICES="//external_interfaces/copy_doc";
	String DELETE_DOC_DOCsSERVICES="//external_interfaces/delete_doc";
	String UPLOAD_MULTIPLE_DOC_DOCsSERVICES="///external_interfaces/upload_multiple_docs";
	
	/*----------------------------AuthService API's-----------------------*/
	
	String GENERATE_OTP_AUTHSERVICE="/api/v1/generate_otp";
	String VERIFY_OTP_AUTHSERVICE="/api/v1/verify_otp";
	String RETRIGGER_OTP_AUTHSERVICE="/api/v1/retrigger_otp";
	String VERIFY_TICKET_AUTHSERVICE="/api/v1/verify_ticket";
	String USER_DETAILS_UAT_AUTHSERVICE="/api/v1/detail";
	String LOGOUT_AUTHSERVICE="/api/v1/logout";
	
	/*------------------------------------GrowthPartner API's----------------------------------------------------*/
	
	String GENERATE_OTP_GROWTH_PARTNER="/api/v1/login/generate_otp";
	String VERIFY_OTP_GROWTH_PARTNER="/api/v1/login/verify_otp";
	String RESEND_OTP_GROWTH_PARTNER="/api/v1/login/resend_otp";
	
	String PARTNER_UPDATE_GROWTH_PARTNER="/api/v1/partners/update_partner";
	String GET_PARTNER_DETAILS_GROWTH_PARTNER="/api/v1/partners/get_partner";
	String UPDATE_KYC_DATA_GROWTHPARTNER="/api/v1/partners/update_kyc_data";
	String UPDATE_ESIGN_GROWTH_PARTNER="/api/v1/partners/update_esign";
	
	String CREATE_KYC_GROWTH_PARTNER ="/api/v1/digilockers";
	String GET_KYC_GROWTH_PARTNER="/api/v1/digilockers/fetch";
	String KYC_APPROVED_GROWTH_PARTNER="/api/v1/digilockers/kyc_approved";
	
	String DIGI_SIGN_GROWTH_PARTNER="/api/v1/digi_sign/create_sign_request";
	
	String UPLOAD_DOCUMENT_GROWTH_PARTNER="/api/v1/documents/upload_document";
	String VIEW_DOCUMENT_GROWTH_PARTNER="/api/v1/documents/view_document";
	String LIST_OF_DOCUMENT_GROWTH_PARTNER="/api/v1/documents";
	String DELETE_DOCUMENT_GROWTH_PARTNER="/api/v1/documents/delete_document";
	String DOWNLOAD_EXAMPLE_DOCUMENT_GROWTH_PARTNER="/api/v1/documents/download_example_document";
	
	String CREATE_BANK_GROWTH_PARTNER="/api/v1/bank_account_details";
	String IFSC_CODE_CHECK_GROWTH_PARTNER="/api/v1/bank_account_details/ifsc_code_mapping";
	String BANK_DETAILS_GROWTH_PARTNER="/api/v1/bank_account_details/get_bank_details";
	
	String CREATE_LEADS_GROWTH_PARTNER="/api/v1/leads";
	String LIST_ALL_LEADS_GROWTH_PARTNER="/api/v1/leads/list_all_leads";
	
	String PARTNER_SUBORDINATE_CREATE_GROWTH_PARTNER="/api/v1/partner_subordinates";
	String PARTNER_SUBORDINATE_DETAILS_GROWTH_PARTNER="/api/v1/partner_subordinates";
	String DELETE_SUBORDINATE_GROWTH_PARTNER="/api/v1/partner_subordinates";
	
	String PICODE_MAPPING_GROWTH_PARTNER="/api/v1/utility/pincode_mapping";
	String VERIFY_MOBILE_CRM_GROWTH_PARTNER="/api/v1/crm/verify_mobile_in_crm";
	String VALIDATE_NGID_CRM="/api/v1/crm/validate_ng_id";
	String VERIFY_PAN_GROWTH_PARTNER="/api/v1/utility/verify_pan";
	String MOBILE_NUMBER_AS_GROWTH_PARTNER="https://uat.advancesuite.in:3003/api/v1/agent_contact_numbers/agent_presence_check";
	
	String MASTER_DATA_API_GROWTH_PARTNER="/api/v1/master_data";
	
	
	

	
	
}
