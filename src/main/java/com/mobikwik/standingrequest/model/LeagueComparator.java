package com.mobikwik.standingrequest.model;

import lombok.Data;

@Data
public class LeagueComparator {
    private String leagueName;
    private String countryId;
    public LeagueComparator(String leagueName, String countryId){
        this.leagueName = leagueName;
        this.countryId = countryId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
