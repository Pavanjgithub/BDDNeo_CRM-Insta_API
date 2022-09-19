package com.Api.model;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"lead_id",
"original_doc_token",
"business_vintage",
"industry_master_id",
"purpose_of_loan_master_id",
"pan",
"application_type_id",
"nature_of_business_id",
"nature_of_business_master_id",
"name",
"full_name",
"business_name",
"city_name",
"partners_availed",
"gender",
"mobile",
"email",
"dob",
"pincode",
"consent",
"otp",
"entity_name",
"trading_name",
"average_monthly_sales",
"digital_payments_accepted",
"address",
"kyc_request_id",
"fathers_name",
"permanent_address",
"same_as_permanent_address",
"current_address",
"nature_of_bank_account_master_id",
"account_number",
"ifsc_code",
"cities_master_id",
"states_master_id",
"bank_master_id",
"bank_branch",
" document_type_master_id",
"file",
"password",
"gst_registered",
"business_registration_date",
"application_type_master_id",
"average_monthly_turnover_master_id",
"file",
"industry_name",
"source",
"crm_lead_id"
})
@Generated("jsonschema2pojo")
public class Insta {

@JsonProperty("lead_id")
private String leadId;
@JsonProperty("business_vintage")
private String businessVintage;
@JsonProperty("industry_master_id")
private Integer industryMasterId;
@JsonProperty("purpose_of_loan_master_id")
private Integer purposeOfLoanMasterId;
@JsonProperty("pan")
private String pan;
@JsonProperty("application_type_id")
private Integer applicationTypeId;
@JsonProperty("nature_of_business_id")
private Integer natureOfBusinessId;
@JsonProperty("name")
private String name;
@JsonProperty("Full_name")
private String fullname;
@JsonProperty("business_name")
private String businessname;
@JsonProperty("city_name")
private String cityname;
@JsonProperty("partners_availed")
private List<String> partneravailed;
@JsonProperty("gender")
private String gender;
@JsonProperty("mobile")
private String mobile;
@JsonProperty("email")
private String email;
@JsonProperty("dob")
private String dob;
@JsonProperty("pincode")
private String pincode;
@JsonProperty("consent")
private Boolean consent;
@JsonProperty("otp")
private String otp;
@JsonProperty("entity_name")
private String entityName;
@JsonProperty("trading_name")
private String tradingName;
@JsonProperty("average_monthly_sales")
private Boolean averageMonthlySales;
@JsonProperty("digital_payments_accepted")
private Boolean digitalPaymentsAccepted;
@JsonProperty("address")
private Address address;
@JsonProperty("kyc_request_id")
private Boolean kyc_request_id;
@JsonProperty("fathers_name")
private String fathers_name;
@JsonProperty("identity_address_proof")
private String identity_address_proof;
@JsonProperty("permanent_address")
private Address permanent_address;
@JsonProperty("same_as_permanent_address")
private Boolean same_as_permanent_address;
@JsonProperty("current_address")
private Address current_address;
@JsonProperty("nature_of_bank_account_master_id")
private Integer natureOfBankAccountMasterId;
@JsonProperty("account_number")
private Integer accountNumber;
@JsonProperty("ifsc_code")
private String ifscCode;
@JsonProperty("cities_master_id")
private Integer citiesMasterId;
@JsonProperty("states_master_id")
private Integer statesMasterId;
@JsonProperty("bank_master_id")
private Integer bankMasterId;
@JsonProperty("bank_branch")
private String bankBranch;
@JsonProperty("original_doc_token")
private String originalDocToken;
@JsonProperty(" document_type_master_id")
private String documentTypeMasterId;
@JsonProperty("file")
private java.io.File file;
@JsonProperty("password")
private String password;
@JsonProperty("gst_registered")
private Boolean gstRegistered;
@JsonProperty("business_registration_date")
private String businessRegistrationDate;
@JsonProperty("application_type_master_id")
private String applicationTypeMasterId;
@JsonProperty("average_monthly_turnover_master_id")
private String averageMonthlyTurnoverMasterId;
@JsonProperty("nature_of_business_master_id")
private Boolean nature_of_business_master_id;
@JsonProperty("industry_name")
private String industry_name;
@JsonProperty("source")
private String source;
@JsonProperty("crm_lead_id")
private String crm_lead_id;
@JsonProperty("file")
private String File;

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("lead_id")
public String getLeadId() {
return leadId;
}

@JsonProperty("lead_id")
public void setLeadId(String leadId) {
this.leadId = leadId;
}

@JsonProperty("business_vintage")
public String getBusinessVintage() {
return businessVintage;
}

@JsonProperty("business_vintage")
public void setBusinessVintage(String businessVintage) {
this.businessVintage = businessVintage;
}

@JsonProperty("industry_master_id")
public Integer getIndustryMasterId() {
return industryMasterId;
}

@JsonProperty("industry_master_id")
public void setIndustryMasterId(Integer industryMasterId) {
this.industryMasterId = industryMasterId;
}

@JsonProperty("purpose_of_loan_master_id")
public Integer getPurposeOfLoanMasterId() {
return purposeOfLoanMasterId;
}

@JsonProperty("purpose_of_loan_master_id")
public void setPurposeOfLoanMasterId(Integer purposeOfLoanMasterId) {
this.purposeOfLoanMasterId = purposeOfLoanMasterId;
}

@JsonProperty("pan")
public String getPan() {
return pan;
}

@JsonProperty("pan")
public void setPan(String pan) {
this.pan = pan;
}

@JsonProperty("application_type_id")
public Integer getApplicationTypeId() {
return applicationTypeId;
}

@JsonProperty("application_type_id")
public void setApplicationTypeId(Integer applicationTypeId) {
this.applicationTypeId = applicationTypeId;
}

@JsonProperty("nature_of_business_id")
public Integer getNatureOfBusinessId() {
return natureOfBusinessId;
}

@JsonProperty("nature_of_business_id")
public void setNatureOfBusinessId(Integer natureOfBusinessId) {
this.natureOfBusinessId = natureOfBusinessId;
}
@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}
@JsonProperty("gender")
public String getGender() {
return gender;
}

@JsonProperty("gender")
public void setGender(String gender) {
this.gender = gender;
}
@JsonProperty("fullname")
public String getFullName() {
return fullname;
}

@JsonProperty("fullname")
public void setFullName(String fullName) {
this.fullname = fullName;
}
@JsonProperty("businessName")
public String businessName() {
return businessname;
}

@JsonProperty("businessName")
public void setbusinessName(String businessName) {
this.businessname = businessName;
}
@JsonProperty("cityName")
public String getCityName() {
return cityname;
}

@JsonProperty("cityName")
public void setCityName(String cityName) {
this.cityname = cityname;
}
public void setPartners_availed(List<String> partners_availed){
this.partneravailed = partners_availed;
}
public List<String> getPartners_availed(){
return this.partneravailed;
}
@JsonProperty("mobile")
public String getMobile() {
return mobile;
}

@JsonProperty("mobile")
public void setMobile(String mobile) {
this.mobile = mobile;
}

@JsonProperty("email")
public String getEmail() {
return email;
}

@JsonProperty("email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("dob")
public String getDob() {
return dob;
}

@JsonProperty("dob")
public void setDob(String dob) {
this.dob = dob;
}

@JsonProperty("pincode")
public String getPincode() {
return pincode;
}

@JsonProperty("pincode")
public void setPincode(String pincode) {
this.pincode = pincode;
}

@JsonProperty("consent")
public Boolean getConsent() {
return consent;
}

@JsonProperty("consent")
public void setConsent(Boolean consent) {
this.consent = consent;
}

@JsonProperty("otp")
public String getOtp() {
return otp;
}

@JsonProperty("otp")
public void setOtp(String otp) {
this.otp = otp;
}

@JsonProperty("entity_name")
public String getEntityName() {
return entityName;
}

@JsonProperty("entity_name")
public void setEntityName(String entityName) {
this.entityName = entityName;
}

@JsonProperty("trading_name")
public String getTradingName() {
return tradingName;
}

@JsonProperty("trading_name")
public void setTradingName(String tradingName) {
this.tradingName = tradingName;
}

@JsonProperty("average_monthly_sales")
public Boolean getAverageMonthlySales() {
return averageMonthlySales;
}

@JsonProperty("average_monthly_sales")
public void setAverageMonthlySales(Boolean averageMonthlySales) {
this.averageMonthlySales = averageMonthlySales;
}

@JsonProperty("digital_payments_accepted")
public Boolean getDigitalPaymentsAccepted() {
return digitalPaymentsAccepted;
}

@JsonProperty("kyc_request_id")
public Boolean getkyc_request_id() {
return kyc_request_id;
}
@JsonProperty("kyc_request_id")
public void setKyc_request_id(Boolean kyc_request_id) {
this.kyc_request_id = kyc_request_id;
}

@JsonProperty("digital_payments_accepted")
public void setDigitalPaymentsAccepted(Boolean digitalPaymentsAccepted) {
this.digitalPaymentsAccepted = digitalPaymentsAccepted;
}

@JsonProperty("fathers_name")
public void setFathers_name(String fathers_name) {
this.fathers_name = fathers_name;
}

@JsonProperty("identity_address_proof")
public String getIdentity_address_proof() {
return identity_address_proof;
}
@JsonProperty("identity_address_proof")
public void setIdentity_address_proof(String identity_address_proof) {
this.identity_address_proof = identity_address_proof;
}
@JsonProperty("address")
public Address getAddress() {
return address;
}

@JsonProperty("address")
public void setAddress(Address address) {
this.address = address;
}
@JsonProperty("permanent_address")
public Address getPermanent_address() {
return permanent_address;
}
@JsonProperty("permanent_address")
public void setPermanent_address(Address permanent_address) {
this.permanent_address = permanent_address;
}
@JsonProperty("same_as_permanent_address")
public Boolean getSame_as_permanent_address() {
return same_as_permanent_address;
}

@JsonProperty("same_as_permanent_address")
public void setSame_as_permanent_address(Boolean same_as_permanent_address) {
this.same_as_permanent_address = same_as_permanent_address;
}
@JsonProperty("current_address")
public Address getCurrent_address() {
return current_address;
}

@JsonProperty("current_address")
public void setCurrent_address(Address current_address) {
this.current_address = current_address;
}
@JsonProperty("nature_of_bank_account_master_id")
public Integer getNatureOfBankAccountMasterId() {
return natureOfBankAccountMasterId;
}

@JsonProperty("nature_of_bank_account_master_id")
public void setNatureOfBankAccountMasterId(Integer natureOfBankAccountMasterId) {
this.natureOfBankAccountMasterId = natureOfBankAccountMasterId;
}

@JsonProperty("account_number")
public Integer getAccountNumber() {
return accountNumber;
}

@JsonProperty("account_number")
public void setAccountNumber(Integer accountNumber) {
this.accountNumber = accountNumber;
}

@JsonProperty("ifsc_code")
public String getIfscCode() {
return ifscCode;
}

@JsonProperty("ifsc_code")
public void setIfscCode(String ifscCode) {
this.ifscCode = ifscCode;
}

@JsonProperty("cities_master_id")
public Integer getCitiesMasterId() {
return citiesMasterId;
}

@JsonProperty("cities_master_id")
public void setCitiesMasterId(Integer citiesMasterId) {
this.citiesMasterId = citiesMasterId;
}

@JsonProperty("states_master_id")
public Integer getStatesMasterId() {
return statesMasterId;
}

@JsonProperty("states_master_id")
public void setStatesMasterId(Integer statesMasterId) {
this.statesMasterId = statesMasterId;
}

@JsonProperty("bank_master_id")
public Integer getBankMasterId() {
return bankMasterId;
}

@JsonProperty("bank_master_id")
public void setBankMasterId(Integer bankMasterId) {
this.bankMasterId = bankMasterId;
}

@JsonProperty("bank_branch")
public String getBankBranch() {
return bankBranch;
}

@JsonProperty("bank_branch")
public void setBankBranch(String bankBranch) {
this.bankBranch = bankBranch;
}
@JsonProperty("original_doc_token")
public String getOriginalDocToken() {
return originalDocToken;
}

@JsonProperty("original_doc_token")
public void setOriginalDocToken(String originalDocToken) {
this.originalDocToken = originalDocToken;
}

@JsonProperty(" document_type_master_id")
public String getDocumentTypeMasterId() {
return documentTypeMasterId;
}

@JsonProperty(" document_type_master_id")
public void setDocumentTypeMasterId(String documentTypeMasterId) {
this.documentTypeMasterId = documentTypeMasterId;
}

@JsonProperty("file")
public java.io.File getFile() {
return file;
}

@JsonProperty("file")
public void setFile(File file) {
this.file = file;
}

@JsonProperty("password")
public String getPassword() {
return password;
}

@JsonProperty("password")
public void setPassword(String password) {
this.password = password;
}
@JsonProperty("gst_registered")
public Boolean getGstRegistered() {
return gstRegistered;
}

@JsonProperty("gst_registered")
public void setGstRegistered(Boolean gstRegistered) {
this.gstRegistered = gstRegistered;
}

@JsonProperty("business_registration_date")
public String getBusinessRegistrationDate() {
return businessRegistrationDate;
}

@JsonProperty("business_registration_date")
public void setBusinessRegistrationDate(String businessRegistrationDate) {
this.businessRegistrationDate = businessRegistrationDate;
}

@JsonProperty("application_type_master_id")
public String getApplicationTypeMasterId() {
return applicationTypeMasterId;
}

@JsonProperty("application_type_master_id")
public void setApplicationTypeMasterId(String applicationTypeMasterId) {
this.applicationTypeMasterId = applicationTypeMasterId;
}

@JsonProperty("nature_of_business_master_id")
public Boolean getNatureofbusinessmasterid() {
return nature_of_business_master_id;
}

@JsonProperty("nature_of_business_master_id")
public void setnatureofbusinessmasterid(Boolean nature_of_business_master_id) {
this.nature_of_business_master_id = nature_of_business_master_id;

}
@JsonProperty("average_monthly_turnover_master_id")
public String getAverageMonthlyTurnoverMasterId() {
return averageMonthlyTurnoverMasterId;
}

@JsonProperty("average_monthly_turnover_master_id")
public void setAverageMonthlyTurnoverMasterId(String averageMonthlyTurnoverMasterId) {
this.averageMonthlyTurnoverMasterId = averageMonthlyTurnoverMasterId;
}
public void setIndustry_name(String industry_name){
this.industry_name = industry_name;
}
public String getIndustry_name(){
return this.industry_name;
}
public void setSource(String source){
    this.source = source;
}
public String getSource(){
    return this.source;
}
public void setCrm_lead_id(String crm_lead_id){
    this.crm_lead_id = crm_lead_id;
}
public String getCrm_lead_id(){
    return this.crm_lead_id;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);

}

}