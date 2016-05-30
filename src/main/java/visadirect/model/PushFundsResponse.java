package visadirect.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"transactionIdentifier",
"actionCode",
"approvalCode",
"responseCode",
"transmissionDateTime",
"cavvResultCode"
})
public class PushFundsResponse {

@JsonProperty("transactionIdentifier")
private Long transactionIdentifier;
@JsonProperty("actionCode")
private String actionCode;
@JsonProperty("approvalCode")
private String approvalCode;
@JsonProperty("responseCode")
private String responseCode;
@JsonProperty("transmissionDateTime")
private String transmissionDateTime;
@JsonProperty("cavvResultCode")
private String cavvResultCode;

/**
*
* @return
* The transactionIdentifier
*/
@JsonProperty("transactionIdentifier")
public Long getTransactionIdentifier() {
return transactionIdentifier;
}

/**
*
* @param transactionIdentifier
* The transactionIdentifier
*/
@JsonProperty("transactionIdentifier")
public void setTransactionIdentifier(Long transactionIdentifier) {
this.transactionIdentifier = transactionIdentifier;
}

/**
*
* @return
* The actionCode
*/
@JsonProperty("actionCode")
public String getActionCode() {
return actionCode;
}

/**
*
* @param actionCode
* The actionCode
*/
@JsonProperty("actionCode")
public void setActionCode(String actionCode) {
this.actionCode = actionCode;
}

/**
*
* @return
* The approvalCode
*/
@JsonProperty("approvalCode")
public String getApprovalCode() {
return approvalCode;
}

/**
*
* @param approvalCode
* The approvalCode
*/
@JsonProperty("approvalCode")
public void setApprovalCode(String approvalCode) {
this.approvalCode = approvalCode;
}

/**
*
* @return
* The responseCode
*/
@JsonProperty("responseCode")
public String getResponseCode() {
return responseCode;
}

/**
*
* @param responseCode
* The responseCode
*/
@JsonProperty("responseCode")
public void setResponseCode(String responseCode) {
this.responseCode = responseCode;
}

/**
*
* @return
* The transmissionDateTime
*/
@JsonProperty("transmissionDateTime")
public String getTransmissionDateTime() {
return transmissionDateTime;
}

/**
*
* @param transmissionDateTime
* The transmissionDateTime
*/
@JsonProperty("transmissionDateTime")
public void setTransmissionDateTime(String transmissionDateTime) {
this.transmissionDateTime = transmissionDateTime;
}

/**
*
* @return
* The cavvResultCode
*/
@JsonProperty("cavvResultCode")
public String getCavvResultCode() {
return cavvResultCode;
}

/**
*
* @param cavvResultCode
* The cavvResultCode
*/
@JsonProperty("cavvResultCode")
public void setCavvResultCode(String cavvResultCode) {
this.cavvResultCode = cavvResultCode;
}

}