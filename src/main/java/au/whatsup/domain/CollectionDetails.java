
package au.whatsup.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


/**
 * The Collection Schema
 * <p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "collection_id",
    "res_count",
    "image_url",
    "url",
    "title",
    "description",
    "share_url"
})
@Data
public class CollectionDetails {

    /**
     * The Collection_id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("collection_id")
    private Integer collectionId = 0;
    /**
     * The Res_count Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("res_count")
    private Integer resCount = 0;
    /**
     * The Image_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("image_url")
    private String imageUrl = "";
    /**
     * The Url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("url")
    private String url = "";
    /**
     * The Title Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("title")
    private String title = "";
    /**
     * The Description Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("description")
    private String description = "";
    /**
     * The Share_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("share_url")
    private String shareUrl = "";
}
