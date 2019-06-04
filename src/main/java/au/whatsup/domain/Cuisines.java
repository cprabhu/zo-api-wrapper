
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
    "cuisines"
})
@Data
public class Cuisines {

    /**
     * The Cuisines Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisines")
    private List<Cuisine> cuisines = null;
}
