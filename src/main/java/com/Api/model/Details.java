
package com.Api.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.processing.Generated;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonAnyGetter;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonAnySetter;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnore;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonInclude;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"status",
"app_ids"
})
@Generated("jsonschema2pojo")
public class Details {

@JsonProperty("status")
private String status;
@JsonProperty("app_ids")
private String appIds;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("app_ids")
public String getAppIds() {
return appIds;
}

@JsonProperty("app_ids")
public void setAppIds(String appIds) {
this.appIds = appIds;
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