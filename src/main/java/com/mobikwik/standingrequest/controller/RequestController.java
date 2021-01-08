package com.mobikwik.standingrequest.controller;

import com.mobikwik.standingrequest.model.Country;
import com.mobikwik.standingrequest.model.Item;
import com.mobikwik.standingrequest.model.League;
import com.mobikwik.standingrequest.model.TeamPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/standing")
public class RequestController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/{teamName}/{leagueName}/{countryName}")
    public Item getItem(@PathVariable("teamName") String teamName, @PathVariable("leagueName") String leagueName, @PathVariable("countryName") String countryName){
        Country country = restTemplate.getForObject("http://country/country/"+countryName, Country.class);
        League league = restTemplate.getForObject("http://league/league/"+leagueName+"/"+country.getCountryId(), League.class);
        TeamPosition teamPosition = restTemplate.getForObject("http://teamPosition/team/"+teamName+"/"+league.getLeagueId(), TeamPosition.class);
        Item item = new Item(countryName,country.getCountryId(),leagueName,league.getLeagueId(),teamName,teamPosition.getTeamId(),teamPosition.getOverallPosition());
        return item;
    }
}
