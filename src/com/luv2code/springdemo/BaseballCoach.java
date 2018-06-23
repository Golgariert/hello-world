package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    // define a private field
    private FortuneService fortuneService;

    // define a constructor


    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes on a batting practice.";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        return fortuneService.getFortune();
    }
}











