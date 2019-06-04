
package au.whatsup.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


/**
 * The Items Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "establishment"
})
@Data
public class Establishment {

    /**
     * The Establishment Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("establishment")
    private EstablishmentDetails establishment;
}
