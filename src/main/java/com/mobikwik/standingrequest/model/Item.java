package com.mobikwik.standingrequest.model;


public class Item {
    private String countryName;
    private String countryId;
    private String leagueName;
    private String leagueId;
    private String teamName;
    private String teamId;
    private String overallPosition;

    public Item(String countryName, String countryId, String leagueName, String leagueId, String teamName, String teamId, String overallPosition) {
        this.countryName = countryName;
        this.countryId = countryId;
        this.leagueName = leagueName;
        this.leagueId = leagueId;
        this.teamName = teamName;
        this.teamId = teamId;
        this.overallPosition = overallPosition;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getOverallPosition() {
        return overallPosition;
    }

    public void setOverallPosition(String overallPosition) {
        this.overallPosition = overallPosition;
    }
}
