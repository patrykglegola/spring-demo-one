package com.luv2code.springdemo;


public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes on shooting practise";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
