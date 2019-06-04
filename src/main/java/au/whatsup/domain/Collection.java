
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
    "collection"
})
@Data
public class Collection {

    /**
     * The Collection Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("collection")
    private CollectionDetails collection;
}
