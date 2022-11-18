package com.Api.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"mobile"
})
@Generated("jsonschema2pojo")
public class GrowthPartner_pojo {

@JsonProperty("mobile")
private String mobile;

@JsonProperty("username")
private String username;

@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("mobile")
public String getMobile() {
return mobile;
}

@JsonProperty("mobile")
public void setMobile(String mobile) {
this.mobile = mobile;
}

@JsonProperty("username")
public String getusername() {
return username;
}

@JsonProperty("username")
public void setusername(String username) {
this.mobile = username;
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