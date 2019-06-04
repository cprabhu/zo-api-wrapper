package au.whatsup.service;


import au.whatsup.domain.*;

public interface ZoApiService {

    Categories getCategories();

    LocationSuggestions getLocationSuggestions(String cityName, Integer cityId);

    Collections getCollections(Integer cityId);

    Cuisines getCusines(Integer cityId);

    Establishments getEstablishments(Integer cityId);
}
