package com.mobikwik.country.service;


import com.mobikwik.country.model.Country;
import com.mobikwik.country.model.CountryComparator;
import com.mobikwik.country.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CountryService {

    public List<Country> getCountries(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers =  new HttpHeaders();
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        Map<String, String> mapCountry = new HashMap<>();
        mapCountry.put("action","get_countries");
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://apiv2.apifootball.com/?action=get_countries&").queryParam("APIkey","9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978");
        List<Country> countryList = Arrays.asList(restTemplate.exchange(builder.toUriString(), HttpMethod.POST, new HttpEntity<>(headers), Country[].class).getBody());
        return countryList;
    }
    public Country getCountryByName(String countryName, CountryComparator countryComparator) {
        //return getCountries().stream().filter((country) -> country.getCountryName()==countryName).findAny().orElse(new Country());
        //return getCountries().get(0);
        return getCountries().stream().filter(country -> countryComparator.getCountryName().equalsIgnoreCase(country.getCountryName())).findAny().orElse(null);
    }
}
