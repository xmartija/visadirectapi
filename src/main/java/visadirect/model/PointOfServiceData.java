
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
    "motoECIIndicator",
    "panEntryMode",
    "posConditionCode"
})
public class PointOfServiceData {

    @JsonProperty("motoECIIndicator")
    private String motoECIIndicator;
    @JsonProperty("panEntryMode")
    private String panEntryMode;
    @JsonProperty("posConditionCode")
    private String posConditionCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The motoECIIndicator
     */
    @JsonProperty("motoECIIndicator")
    public String getMotoECIIndicator() {
        return motoECIIndicator;
    }

    /**
     * 
     * @param motoECIIndicator
     *     The motoECIIndicator
     */
    @JsonProperty("motoECIIndicator")
    public void setMotoECIIndicator(String motoECIIndicator) {
        this.motoECIIndicator = motoECIIndicator;
    }

    /**
     * 
     * @return
     *     The panEntryMode
     */
    @JsonProperty("panEntryMode")
    public String getPanEntryMode() {
        return panEntryMode;
    }

    /**
     * 
     * @param panEntryMode
     *     The panEntryMode
     */
    @JsonProperty("panEntryMode")
    public void setPanEntryMode(String panEntryMode) {
        this.panEntryMode = panEntryMode;
    }

    /**
     * 
     * @return
     *     The posConditionCode
     */
    @JsonProperty("posConditionCode")
    public String getPosConditionCode() {
        return posConditionCode;
    }

    /**
     * 
     * @param posConditionCode
     *     The posConditionCode
     */
    @JsonProperty("posConditionCode")
    public void setPosConditionCode(String posConditionCode) {
        this.posConditionCode = posConditionCode;
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
