
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
    "cuisine"
})
@Data
public class Cuisine {

    /**
     * The Cuisine Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisine")
    private CuisineDetails cuisine;
}
