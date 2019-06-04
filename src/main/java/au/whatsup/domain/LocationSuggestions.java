
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
    "location_suggestions",
    "status",
    "has_more",
    "has_total"
})
@Data
public class LocationSuggestions {

    /**
     * The Location_suggestions Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("location_suggestions")
    private List<LocationSuggestion> locationSuggestions = null;
    /**
     * The Status Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("status")
    private String status = "";
    /**
     * The Has_more Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_more")
    private Integer hasMore = 0;
    /**
     * The Has_total Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_total")
    private Integer hasTotal = 0;
}
