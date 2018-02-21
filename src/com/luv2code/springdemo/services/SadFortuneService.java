package com.luv2code.springdemo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SadFortuneService implements FortuneService {

    private Random randomValuesGenerator;
    private List<String> fortunes;

    public SadFortuneService() {
        fortunes = new ArrayList<>();
        randomValuesGenerator = new Random();
        fortunes.add("Today is your bad day!");
        fortunes.add("Today will be awful!");
        fortunes.add("Today is your unlucky day!");
    }

    @Override
    public String getFortune() {
        Integer randomIndex = randomValuesGenerator.nextInt(3);
        return fortunes.get(randomIndex);
    }
}
