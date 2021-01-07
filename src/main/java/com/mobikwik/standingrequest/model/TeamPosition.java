package com.mobikwik.standingrequest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TeamPosition {
    @Id
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("league_name")
    private String leagueName;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("overall_league_position")
    private String overallPosition;
    @JsonIgnore
    private String overall_league_payed = "38";
    @JsonIgnore
    private String overall_league_W= "32";
    @JsonIgnore
    private String overall_league_D = "2";
    @JsonIgnore
    private String overall_league_L="4";
    @JsonIgnore
    private String overall_league_GF= "95";
    @JsonIgnore
    private String overall_league_GA = "23";
    @JsonIgnore
    private String overall_league_PTS = "98";
    @JsonIgnore
    private String home_league_position= "1";
    @JsonIgnore
    private  String home_league_payed= "19";
    @JsonIgnore
    private String home_league_W= "18";
    @JsonIgnore
    private String home_league_D= "0";
    @JsonIgnore
    private String home_league_L= "1";
    @JsonIgnore
    private String home_league_GF= "57";
    @JsonIgnore
    private String home_league_GA= "12";
    @JsonIgnore
    private String home_league_PTS= "54";
    @JsonIgnore
    private String away_league_position= "1";
    @JsonIgnore
    private  String away_league_payed= "19";
    @JsonIgnore
    private String away_league_W= "14";
    @JsonIgnore
    private String away_league_D= "2";
    @JsonIgnore
    private String away_league_L= "3";
    @JsonIgnore
    private String away_league_GF= "38";
    @JsonIgnore
    private String away_league_GA ="11";
    @JsonIgnore
    private String away_league_PTS= "44";
    public TeamPosition(String teamName, String countryName, String leagueName, String teamId, String overallPosition){
        this.teamName = teamName;
        this.countryName = countryName;
        this.leagueName = leagueName;
        this.teamId = teamId;
        this.overallPosition = overallPosition;
    }
    public TeamPosition(){

    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
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
