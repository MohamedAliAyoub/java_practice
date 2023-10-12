package com.example.demo;

import lombok.Getter;

public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    @Getter
    private String team ;
    public CricketCoach()
    {
        System.out.println("DI setter ");
    }

    public void setFortuneService(FortuneService fortuneService)
    {
        System.out.println("this inside setter");
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress)
    {
        System.out.println("setter email ");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        System.out.println("setter team ");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "practice setter in DI";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
