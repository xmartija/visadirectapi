
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
    "address",
    "idCode",
    "name",
    "terminalId"
})
public class CardAcceptor {

    @JsonProperty("address")
    private Address address;
    @JsonProperty("idCode")
    private String idCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("terminalId")
    private String terminalId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The idCode
     */
    @JsonProperty("idCode")
    public String getIdCode() {
        return idCode;
    }

    /**
     * 
     * @param idCode
     *     The idCode
     */
    @JsonProperty("idCode")
    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The terminalId
     */
    @JsonProperty("terminalId")
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * 
     * @param terminalId
     *     The terminalId
     */
    @JsonProperty("terminalId")
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
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
