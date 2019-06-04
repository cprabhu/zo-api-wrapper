package au.whatsup.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties("zomato.url")
@Data
public class ZoApiConfig {

    public static final String CATEGORIES_URL = "categoriesUrl";
    public static final String COLLECTIONS_URL = "collectionsUrl";
    public static final String LOCATIONS_URL = "locationsUrl";
    public static final String CUISINES_URL = "cuisinesUrl";
    public static final String ESTABLISHMENTS_URL = "establishmentsUrl";

    private Map<String, String> details;

    @Autowired
    private ResponseErrorHandler zoResponseErrorHandler;

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setErrorHandler(zoResponseErrorHandler);
        return restTemplate;
    }

    @Data
    public class ZoApiUrlDetails {
        private String categoriesUrl;
        private String collectionsUrl;
        private String locationsUrl;
    }
}
