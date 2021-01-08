package com.mobikwik.standingrequest.model;

import lombok.Data;

@Data
public class TeamPositionComparator {
    private String teamName;
    private String leagueId;
    public TeamPositionComparator(String teamName, String leagueId){
        this.teamName = teamName;
        this.leagueId = leagueId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }
}
