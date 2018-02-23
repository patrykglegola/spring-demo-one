package com.luv2code.springdemo.coaches.impl;


import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.services.FortuneService;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Spend 20 minutes on shooting practise";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void initMethod() {
        System.out.println("FootballCoach init method.");
    }

    public void destroyMethod() {
        System.out.println("FootballCoach destroy method.");
    }
}
