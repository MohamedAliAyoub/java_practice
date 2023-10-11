package com.example.demo;

public class Baseball implements Coach {
    @Override
    public String getDailyWorkout()
    {
        return "test IOC by XML <bean> ";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
