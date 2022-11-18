package com.Api.model; 

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"requesting_service",
"file",
"uuid"
})
@javax.annotation.Generated("jsonschema2pojo")
public class DocsService_pojo {

@JsonProperty("requesting_service")
private String requestingService;
@JsonProperty("file")
private String file;
@JsonProperty("uuid")
private String uuid;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("requesting_service")
public String getRequestingService() {
return requestingService;
}

@JsonProperty("requesting_service")
public void setRequestingService(String requestingService) {
this.requestingService = requestingService;
}

@JsonProperty("file")
public String getFile() {
return file;
}

@JsonProperty("file")
public void setFile(String file) {
this.file = file;
}

@JsonProperty("uuid")
public String getUuid() {
return uuid;
}

@JsonProperty("uuid")
public void setUuid(String uuid) {
this.uuid = uuid;
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