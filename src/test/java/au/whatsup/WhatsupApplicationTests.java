package au.whatsup;

import au.whatsup.domain.*;
import au.whatsup.service.ZoApiService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhatsupApplicationTests {

	@Autowired
	private ZoApiService apiService;

	private Integer cityId;

	@Before
	public void setup() {
		cityId = apiService.getLocationSuggestions("Sydney", null).getLocationSuggestions().stream().findFirst().get().getId();
	}

	@Test
	public void categoriesLoaded() {
		Categories categories = apiService.getCategories();
		Assertions.assertThat(categories).isNotNull();
	}

	@Test
	public void locationSuggestionsLoaded() {
		LocationSuggestions locationSuggestions = apiService.getLocationSuggestions("Sydney", null);
		Assertions.assertThat(locationSuggestions).isNotNull();
		Assertions.assertThat(locationSuggestions.getLocationSuggestions().stream().findFirst().get().getName()).containsIgnoringCase("Sydney");
	}

	@Test
	public void locationSuggestionsWithOnlyCityIdLoaded() {
		LocationSuggestions locationSuggestions = apiService.getLocationSuggestions("", cityId);
		Assertions.assertThat(locationSuggestions).isNotNull();
		Assertions.assertThat(locationSuggestions.getLocationSuggestions()).hasSize(1);
	}

	@Test
	public void collectionsLoaded() {
		Collections collections = apiService.getCollections(cityId);
		Assertions.assertThat(collections).isNotNull();
		Assertions.assertThat(collections.getCollections()).isNotEmpty();
	}

	@Test
	public void cuisinesLoaded() {
		Cuisines cuisines = apiService.getCusines(cityId);
		Assertions.assertThat(cuisines).isNotNull();
		Assertions.assertThat(cuisines.getCuisines()).isNotEmpty();
	}

	@Test
	public void establishmentsLoaded() {
		Establishments establishments = apiService.getEstablishments(cityId);
		Assertions.assertThat(establishments).isNotNull();
		Assertions.assertThat(establishments.getEstablishments()).isNotEmpty();
	}
}
