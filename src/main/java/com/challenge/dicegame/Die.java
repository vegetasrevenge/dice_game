package com.challenge.dicegame;

public class Die {

    protected Integer rollResult;

    public Die() {}

    public Integer getRollResult() {
        return rollResult;
    }

    public void setRollResult() {
        this.rollResult = (int)(Math.random()*6)+1;
    }
}
