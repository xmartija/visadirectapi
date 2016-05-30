
package visadirect.model;

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
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "acquirerCountryCode",
    "acquiringBin",
    "amount",
    "businessApplicationId",
    "cardAcceptor",
    "localTransactionDateTime",
    "merchantCategoryCode",
    "pointOfServiceData",
    "recipientName",
    "recipientPrimaryAccountNumber",
    "retrievalReferenceNumber",
    "senderAccountNumber",
    "senderAddress",
    "senderCity",
    "senderCountryCode",
    "senderName",
    "senderReference",
    "senderStateCode",
    "sourceOfFundsCode",
    "systemsTraceAuditNumber",
    "transactionCurrencyCode",
    "transactionIdentifier"
})
public class PushFundsBody {

    @JsonProperty("acquirerCountryCode")
    private String acquirerCountryCode;
    @JsonProperty("acquiringBin")
    private String acquiringBin;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("businessApplicationId")
    private String businessApplicationId;
    @JsonProperty("cardAcceptor")
    private CardAcceptor cardAcceptor;
    @JsonProperty("localTransactionDateTime")
    private String localTransactionDateTime;
    @JsonProperty("merchantCategoryCode")
    private String merchantCategoryCode;
    @JsonProperty("pointOfServiceData")
    private PointOfServiceData pointOfServiceData;
    @JsonProperty("recipientName")
    private String recipientName;
    @JsonProperty("recipientPrimaryAccountNumber")
    private String recipientPrimaryAccountNumber;
    @JsonProperty("retrievalReferenceNumber")
    private String retrievalReferenceNumber;
    @JsonProperty("senderAccountNumber")
    private String senderAccountNumber;
    @JsonProperty("senderAddress")
    private String senderAddress;
    @JsonProperty("senderCity")
    private String senderCity;
    @JsonProperty("senderCountryCode")
    private String senderCountryCode;
    @JsonProperty("senderName")
    private String senderName;
    @JsonProperty("senderReference")
    private String senderReference;
    @JsonProperty("senderStateCode")
    private String senderStateCode;
    @JsonProperty("sourceOfFundsCode")
    private String sourceOfFundsCode;
    @JsonProperty("systemsTraceAuditNumber")
    private String systemsTraceAuditNumber;
    @JsonProperty("transactionCurrencyCode")
    private String transactionCurrencyCode;
    @JsonProperty("transactionIdentifier")
    private String transactionIdentifier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    
    public void initialize(){
		this.setAcquirerCountryCode("840");
		this.setAcquiringBin("408999");
		this.setBusinessApplicationId("AA");

		

		this.setMerchantCategoryCode("6012");


		this.setRetrievalReferenceNumber("412770451018");

		this.setSenderReference("");
		this.setSourceOfFundsCode("05");
		this.setSystemsTraceAuditNumber("451018");
		this.setTransactionIdentifier("381228649430015");

		CardAcceptor aCardAcceptor = new CardAcceptor();
		this.setCardAcceptor(aCardAcceptor);

		Address address = new Address();
		aCardAcceptor.setAddress(address);

		address.setCountry("USA");
		address.setCounty("San Mateo");
		address.setState("CA");
		address.setZipCode("94404");
		aCardAcceptor.setIdCode("CA-IDCode-77765");
		aCardAcceptor.setName("Visa Inc. USA-Foster City");
		aCardAcceptor.setTerminalId("TID-9999");

		PointOfServiceData pointOfServiceData = new PointOfServiceData();
		this.setPointOfServiceData(pointOfServiceData);

		pointOfServiceData.setMotoECIIndicator("0");
		pointOfServiceData.setPanEntryMode("90");
		pointOfServiceData.setPosConditionCode("00");
		

    }
    
    /**
     * 
     * @return
     *     The acquirerCountryCode
     */
    @JsonProperty("acquirerCountryCode")
    public String getAcquirerCountryCode() {
        return acquirerCountryCode;
    }

    /**
     * 
     * @param acquirerCountryCode
     *     The acquirerCountryCode
     */
    @JsonProperty("acquirerCountryCode")
    public void setAcquirerCountryCode(String acquirerCountryCode) {
        this.acquirerCountryCode = acquirerCountryCode;
    }

    /**
     * 
     * @return
     *     The acquiringBin
     */
    @JsonProperty("acquiringBin")
    public String getAcquiringBin() {
        return acquiringBin;
    }

    /**
     * 
     * @param acquiringBin
     *     The acquiringBin
     */
    @JsonProperty("acquiringBin")
    public void setAcquiringBin(String acquiringBin) {
        this.acquiringBin = acquiringBin;
    }

    /**
     * 
     * @return
     *     The amount
     */
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    /**
     * 
     * @param amount
     *     The amount
     */
    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * 
     * @return
     *     The businessApplicationId
     */
    @JsonProperty("businessApplicationId")
    public String getBusinessApplicationId() {
        return businessApplicationId;
    }

    /**
     * 
     * @param businessApplicationId
     *     The businessApplicationId
     */
    @JsonProperty("businessApplicationId")
    public void setBusinessApplicationId(String businessApplicationId) {
        this.businessApplicationId = businessApplicationId;
    }

    /**
     * 
     * @return
     *     The cardAcceptor
     */
    @JsonProperty("cardAcceptor")
    public CardAcceptor getCardAcceptor() {
        return cardAcceptor;
    }

    /**
     * 
     * @param cardAcceptor
     *     The cardAcceptor
     */
    @JsonProperty("cardAcceptor")
    public void setCardAcceptor(CardAcceptor cardAcceptor) {
        this.cardAcceptor = cardAcceptor;
    }

    /**
     * 
     * @return
     *     The localTransactionDateTime
     */
    @JsonProperty("localTransactionDateTime")
    public String getLocalTransactionDateTime() {
        return localTransactionDateTime;
    }

    /**
     * 
     * @param localTransactionDateTime
     *     The localTransactionDateTime
     */
    @JsonProperty("localTransactionDateTime")
    public void setLocalTransactionDateTime(String localTransactionDateTime) {
        this.localTransactionDateTime = localTransactionDateTime;
    }

    /**
     * 
     * @return
     *     The merchantCategoryCode
     */
    @JsonProperty("merchantCategoryCode")
    public String getMerchantCategoryCode() {
        return merchantCategoryCode;
    }

    /**
     * 
     * @param merchantCategoryCode
     *     The merchantCategoryCode
     */
    @JsonProperty("merchantCategoryCode")
    public void setMerchantCategoryCode(String merchantCategoryCode) {
        this.merchantCategoryCode = merchantCategoryCode;
    }

    /**
     * 
     * @return
     *     The pointOfServiceData
     */
    @JsonProperty("pointOfServiceData")
    public PointOfServiceData getPointOfServiceData() {
        return pointOfServiceData;
    }

    /**
     * 
     * @param pointOfServiceData
     *     The pointOfServiceData
     */
    @JsonProperty("pointOfServiceData")
    public void setPointOfServiceData(PointOfServiceData pointOfServiceData) {
        this.pointOfServiceData = pointOfServiceData;
    }

    /**
     * 
     * @return
     *     The recipientName
     */
    @JsonProperty("recipientName")
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * 
     * @param recipientName
     *     The recipientName
     */
    @JsonProperty("recipientName")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * 
     * @return
     *     The recipientPrimaryAccountNumber
     */
    @JsonProperty("recipientPrimaryAccountNumber")
    public String getRecipientPrimaryAccountNumber() {
        return recipientPrimaryAccountNumber;
    }

    /**
     * 
     * @param recipientPrimaryAccountNumber
     *     The recipientPrimaryAccountNumber
     */
    @JsonProperty("recipientPrimaryAccountNumber")
    public void setRecipientPrimaryAccountNumber(String recipientPrimaryAccountNumber) {
        this.recipientPrimaryAccountNumber = recipientPrimaryAccountNumber;
    }

    /**
     * 
     * @return
     *     The retrievalReferenceNumber
     */
    @JsonProperty("retrievalReferenceNumber")
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /**
     * 
     * @param retrievalReferenceNumber
     *     The retrievalReferenceNumber
     */
    @JsonProperty("retrievalReferenceNumber")
    public void setRetrievalReferenceNumber(String retrievalReferenceNumber) {
        this.retrievalReferenceNumber = retrievalReferenceNumber;
    }

    /**
     * 
     * @return
     *     The senderAccountNumber
     */
    @JsonProperty("senderAccountNumber")
    public String getSenderAccountNumber() {
        return senderAccountNumber;
    }

    /**
     * 
     * @param senderAccountNumber
     *     The senderAccountNumber
     */
    @JsonProperty("senderAccountNumber")
    public void setSenderAccountNumber(String senderAccountNumber) {
        this.senderAccountNumber = senderAccountNumber;
    }

    /**
     * 
     * @return
     *     The senderAddress
     */
    @JsonProperty("senderAddress")
    public String getSenderAddress() {
        return senderAddress;
    }

    /**
     * 
     * @param senderAddress
     *     The senderAddress
     */
    @JsonProperty("senderAddress")
    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    /**
     * 
     * @return
     *     The senderCity
     */
    @JsonProperty("senderCity")
    public String getSenderCity() {
        return senderCity;
    }

    /**
     * 
     * @param senderCity
     *     The senderCity
     */
    @JsonProperty("senderCity")
    public void setSenderCity(String senderCity) {
        this.senderCity = senderCity;
    }

    /**
     * 
     * @return
     *     The senderCountryCode
     */
    @JsonProperty("senderCountryCode")
    public String getSenderCountryCode() {
        return senderCountryCode;
    }

    /**
     * 
     * @param senderCountryCode
     *     The senderCountryCode
     */
    @JsonProperty("senderCountryCode")
    public void setSenderCountryCode(String senderCountryCode) {
        this.senderCountryCode = senderCountryCode;
    }

    /**
     * 
     * @return
     *     The senderName
     */
    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    /**
     * 
     * @param senderName
     *     The senderName
     */
    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * 
     * @return
     *     The senderReference
     */
    @JsonProperty("senderReference")
    public String getSenderReference() {
        return senderReference;
    }

    /**
     * 
     * @param senderReference
     *     The senderReference
     */
    @JsonProperty("senderReference")
    public void setSenderReference(String senderReference) {
        this.senderReference = senderReference;
    }

    /**
     * 
     * @return
     *     The senderStateCode
     */
    @JsonProperty("senderStateCode")
    public String getSenderStateCode() {
        return senderStateCode;
    }

    /**
     * 
     * @param senderStateCode
     *     The senderStateCode
     */
    @JsonProperty("senderStateCode")
    public void setSenderStateCode(String senderStateCode) {
        this.senderStateCode = senderStateCode;
    }

    /**
     * 
     * @return
     *     The sourceOfFundsCode
     */
    @JsonProperty("sourceOfFundsCode")
    public String getSourceOfFundsCode() {
        return sourceOfFundsCode;
    }

    /**
     * 
     * @param sourceOfFundsCode
     *     The sourceOfFundsCode
     */
    @JsonProperty("sourceOfFundsCode")
    public void setSourceOfFundsCode(String sourceOfFundsCode) {
        this.sourceOfFundsCode = sourceOfFundsCode;
    }

    /**
     * 
     * @return
     *     The systemsTraceAuditNumber
     */
    @JsonProperty("systemsTraceAuditNumber")
    public String getSystemsTraceAuditNumber() {
        return systemsTraceAuditNumber;
    }

    /**
     * 
     * @param systemsTraceAuditNumber
     *     The systemsTraceAuditNumber
     */
    @JsonProperty("systemsTraceAuditNumber")
    public void setSystemsTraceAuditNumber(String systemsTraceAuditNumber) {
        this.systemsTraceAuditNumber = systemsTraceAuditNumber;
    }

    /**
     * 
     * @return
     *     The transactionCurrencyCode
     */
    @JsonProperty("transactionCurrencyCode")
    public String getTransactionCurrencyCode() {
        return transactionCurrencyCode;
    }

    /**
     * 
     * @param transactionCurrencyCode
     *     The transactionCurrencyCode
     */
    @JsonProperty("transactionCurrencyCode")
    public void setTransactionCurrencyCode(String transactionCurrencyCode) {
        this.transactionCurrencyCode = transactionCurrencyCode;
    }

    /**
     * 
     * @return
     *     The transactionIdentifier
     */
    @JsonProperty("transactionIdentifier")
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * 
     * @param transactionIdentifier
     *     The transactionIdentifier
     */
    @JsonProperty("transactionIdentifier")
    public void setTransactionIdentifier(String transactionIdentifier) {
        this.transactionIdentifier = transactionIdentifier;
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
