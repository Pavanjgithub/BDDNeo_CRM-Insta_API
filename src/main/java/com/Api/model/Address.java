package com.Api.model;

import java.util.HashMap;
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
"street",
"pincode",
"cities_master_id",
"states_master_id"
})
@Generated("jsonschema2pojo")
public class Address {

@JsonProperty("street")
private String street;
@JsonProperty("pincode")
private String pincode;
@JsonProperty("cities_master_id")
private Integer citiesMasterId;
@JsonProperty("states_master_id")
private Integer statesMasterId;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("street")
public String getStreet() {
return street;
}

@JsonProperty("street")
public void setStreet(String street) {
this.street = street;
}

@JsonProperty("pincode")
public String getPincode() {
return pincode;
}

@JsonProperty("pincode")
public void setPincode(String pincode) {
this.pincode = pincode;
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}