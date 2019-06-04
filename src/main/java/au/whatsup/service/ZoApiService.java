package au.whatsup.service;


import au.whatsup.domain.*;

/**
 * This Service class provides access to Zomato's APIs whose details can be found on
 * their API documentation.
 * @author chaitanyaprabhu
 */
public interface ZoApiService {

    /**
     * Gets all the categories supported by platform.
     * @return all categories for the platform.
     */
    Categories getCategories();

    /**
     * This method returns all the location suggestions for matching cityname or id.
     * @param cityName for which location suggestions needs to be retrieved.
     * @param cityId the id for which location suggestions are needed.
     * @return the matching location suggestions for either cityname or id.
     */
    LocationSuggestions getLocationSuggestions(String cityName, Integer cityId);

    /**
     * This method returns all the collections like "Trending this week" for a city.
     * @param cityId the id of the city for which collections are required.
     * @return the Collections for the city given that the cityId id valid.
     */
    Collections getCollections(Integer cityId);

    /**
     * This method returns all the cuisines like "Asian, Australian, Indian" for a city.
     * @param cityId the id of the city for which cuisines are required.
     * @return the Cuisines available for the city with id cityId.
     */
    Cuisines getCusines(Integer cityId);

    /**
     * This method returns all the Establishments like "Food Court, Brewery" for a city.
     * @param cityId the id of the city for which Establishments are required.
     * @return the Establishments available for the city with id cityId
     */
    Establishments getEstablishments(Integer cityId);
}