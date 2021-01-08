package com.mobikwik.standingrequest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class League {
    @JsonProperty("country_id")
    private String countryId;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("league_name")
    private String leagueName;
    public League(String countryId, String countryName, String leagueId, String leagueName){
        this.countryId = countryId;
        this.countryName = countryName;
        this.leagueId = leagueId;
        this.leagueName = leagueName;
    }
    public League(){

    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
