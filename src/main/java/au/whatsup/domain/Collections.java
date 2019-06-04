
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
    "collections"
})
@Data
public class Collections {

    /**
     * The Collections Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("collections")
    private List<Collection> collections = null;
}
