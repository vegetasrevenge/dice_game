package com.challenge.dicegame;

import java.util.Random;

public class LoadedDie extends Die{

    private Random random = new Random();
    private Integer loadedToward = 0;

    public LoadedDie(Integer loadedToward) {
        this.loadedToward = loadedToward;
    }

    @Override
    public void setRollResult() {
        int chance = random.nextInt(2);
        if(chance == 0) {
            this.rollResult = loadedToward;
        } else {
            this.rollResult = (int)(Math.random()*(6-2))+1;
        }
    }
}
