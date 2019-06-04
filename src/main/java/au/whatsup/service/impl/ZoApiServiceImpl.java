package au.whatsup.service.impl;

import au.whatsup.config.ZoApiConfig;
import au.whatsup.domain.*;
import au.whatsup.service.ZoApiService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
@Log4j2
public class ZoApiServiceImpl implements ZoApiService {

    private static final String CONTENT_TYPE = "application/json";

    @Autowired
    private RestTemplate restTemplate;

    @Value("${application.zo.api.key}")
    private String apiKey;

    @Autowired
    private ZoApiConfig config;

    @Override
    public Categories getCategories() {
        ResponseEntity<Categories> response = restTemplate.exchange(config.getDetails().get(ZoApiConfig.CATEGORIES_URL), HttpMethod.GET, getStringHttpEntity(), Categories.class);
        log.info("Categories {} found.",response.getBody());
        return response.getBody();
    }

    @Override
    public LocationSuggestions getLocationSuggestions(String cityName, Integer cityId) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(config.getDetails().get(ZoApiConfig.LOCATIONS_URL)).queryParam("q", cityName).queryParam("city_ids", cityId);
        ResponseEntity<LocationSuggestions> responseEntity = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, getStringHttpEntity(), LocationSuggestions.class);
        log.info("Location suggestions {} found for query params {} & {}.",responseEntity.getBody(),cityName,cityId);
        return responseEntity.getBody();
    }

    @Override
    public Collections getCollections(Integer cityId) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(config.getDetails().get(ZoApiConfig.COLLECTIONS_URL)).queryParam("city_id", cityId);
        ResponseEntity<Collections> responseEntity = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, getStringHttpEntity(), Collections.class);
        log.info("Collections found for query param {} are {}", cityId, responseEntity.getBody());
        return responseEntity.getBody();
    }

    @Override
    public Cuisines getCusines(Integer cityId) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(config.getDetails().get(ZoApiConfig.CUISINES_URL)).queryParam("city_id", cityId);
        ResponseEntity<Cuisines> responseEntity = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, getStringHttpEntity(), Cuisines.class);
        log.info("Cuisines found for query param {} are {}", cityId, responseEntity.getBody());
        return responseEntity.getBody();
    }

    @Override
    public Establishments getEstablishments(Integer cityId) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(config.getDetails().get(ZoApiConfig.ESTABLISHMENTS_URL)).queryParam("city_id", cityId);
        ResponseEntity<Establishments> responseEntity = restTemplate.exchange(uriBuilder.toUriString(), HttpMethod.GET, getStringHttpEntity(), Establishments.class);
        log.info("Establishments found for query param {} are {}", cityId, responseEntity.getBody());
        return responseEntity.getBody();
    }

    private HttpEntity<String> getStringHttpEntity() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("user-key", apiKey);
        headers.add("content-type", CONTENT_TYPE);
        return new HttpEntity<>(null, headers);
    }
}
