package com.mobikwik.standingrequest.model;

import lombok.Data;

@Data
public class LeagueComparator {
    private String leagueName;
    public LeagueComparator(String leagueName){
        this.leagueName = leagueName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
}
