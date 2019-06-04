
package au.whatsup.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


/**
 * The Categories Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name"
})
@Data
public class CategoryDetails {

    /**
     * The Id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("id")
    private Integer id = 0;
    /**
     * The Name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name = "";
}
