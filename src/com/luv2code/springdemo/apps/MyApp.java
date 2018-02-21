package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.coaches.impl.TrackCoach;

public class MyApp {

    public static void main(String[] args) {
        Coach theCoach = new TrackCoach();
        System.out.println(theCoach.getDailyWorkout());
    }
}
