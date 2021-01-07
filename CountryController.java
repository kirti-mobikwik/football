package com.mobikwik.country.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobikwik.country.model.Country;
import com.mobikwik.country.model.CountryComparator;
import com.mobikwik.country.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;

@RestController
@RequestMapping("/country")
public class CountryController {
    //@Value("$(api.key)")
    //private String apiKey;
    @Autowired
    private CountryService countryService;
    //@Autowired
    //private ObjectMapper objectMapper;
    //@Autowired
    //private RestTemplate restTemplate;
    @RequestMapping("{countryName}")
    public Country getCountryInfo(@PathVariable("countryName") String countryName)  {
        //List<Country> countries = Arrays.asList(countryService.getCountries());
        //System.out.println(country.getCountryId());
        CountryComparator countryComparator = new CountryComparator(countryName);
        Country country = countryService.getCountryByName(countryName,countryComparator);
        //Country country = countryService.findByCountryName(countryList,countryName);
        return country;
    }
}