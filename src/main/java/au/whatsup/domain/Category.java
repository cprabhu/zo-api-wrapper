
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
    "categories"
})
@Data
public class Category {

    /**
     * The Categories Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("categories")
    private CategoryDetails categories;
}
