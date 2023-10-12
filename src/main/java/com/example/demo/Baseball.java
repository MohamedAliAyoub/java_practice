package com.example.demo;

public class Baseball implements Coach {

    private FortuneService fortuneService;
    public   Baseball(FortuneService theFortuneService)
    {
        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout() {
        return "test";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
