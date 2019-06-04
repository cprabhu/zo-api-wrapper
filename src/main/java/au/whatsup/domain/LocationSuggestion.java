
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
    "id",
    "name",
    "country_id",
    "country_name",
    "country_flag_url",
    "should_experiment_with",
    "discovery_enabled",
    "has_new_ad_format",
    "is_state",
    "state_id",
    "state_name",
    "state_code"
})
@Data
public class LocationSuggestion {

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
    /**
     * The Country_id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("country_id")
    private Integer countryId = 0;
    /**
     * The Country_name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("country_name")
    private String countryName = "";
    /**
     * The Country_flag_url Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("country_flag_url")
    private String countryFlagUrl = "";
    /**
     * The Should_experiment_with Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("should_experiment_with")
    private Integer shouldExperimentWith = 0;
    /**
     * The Discovery_enabled Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("discovery_enabled")
    private Integer discoveryEnabled = 0;
    /**
     * The Has_new_ad_format Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("has_new_ad_format")
    private Integer hasNewAdFormat = 0;
    /**
     * The Is_state Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("is_state")
    private Integer isState = 0;
    /**
     * The State_id Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("state_id")
    private Integer stateId = 0;
    /**
     * The State_name Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("state_name")
    private String stateName = "";
    /**
     * The State_code Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @JsonProperty("state_code")
    private String stateCode = "";
}
