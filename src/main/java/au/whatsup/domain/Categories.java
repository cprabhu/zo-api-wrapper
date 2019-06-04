
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
    "categories"
})
@Data
public class Categories {

    /**
     * The Categories Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("categories")
    private List<Category> categories = null;
}
