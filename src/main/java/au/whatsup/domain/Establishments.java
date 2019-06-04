
package au.whatsup.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.List;


/**
 * The Root Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "establishments"
})
@Data
public class Establishments {

    /**
     * The Establishments Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("establishments")
    private List<Establishment> establishments = null;
}
