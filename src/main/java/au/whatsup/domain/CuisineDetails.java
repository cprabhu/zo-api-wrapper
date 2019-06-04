
package au.whatsup.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


/**
 * The Cuisine Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cuisine_id",
    "cuisine_name"
})
@Data
public class CuisineDetails {

    /**
     * The Cuisine_id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisine_id")
    private Integer cuisineId = 0;
    /**
     * The Cuisine_name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("cuisine_name")
    private String cuisineName = "";
}
