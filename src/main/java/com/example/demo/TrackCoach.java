package com.example.demo;

public class TrackCoach implements Coach {

    private  FortuneService fortuneService;
    public TrackCoach(){

    };
    public TrackCoach(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "make a new interface and test IDE ";
    }

    @Override
    public String getDailyFortune() {
        return "just do DI ";
    }
}
