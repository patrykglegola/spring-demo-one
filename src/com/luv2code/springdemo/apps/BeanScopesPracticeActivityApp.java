package com.luv2code.springdemo.apps;

import com.luv2code.springdemo.coaches.Coach;
import com.luv2code.springdemo.coaches.impl.FootballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesPracticeActivityApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScopesPracticeActivity-appContext.xml");

        Coach nawalkaCoach = context.getBean("myFootballCoach", FootballCoach.class);
        Coach beenhakkerCoach = context.getBean("myFootballCoach", FootballCoach.class);

        compareCoaches(nawalkaCoach, beenhakkerCoach);

        context.close();
    }

    private static void compareCoaches(Coach coach1, Coach coach2) {
        boolean isTheSameCoach = (coach1 == coach2);
        System.out.println("Is it the same trainer? " + isTheSameCoach);
        System.out.println("Memory location for Nawałka: "+coach1);
        System.out.println("Memory location for Beenhakker: "+coach2);
    }

}
