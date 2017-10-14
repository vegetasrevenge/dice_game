package com.challenge.dicegame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Cup{

    private List<Die> dieList = new ArrayList<>();

    public List<Die> play() {

        Scanner sc = new Scanner(System.in);

        System.out.println("*********** Let's play a dice game! ************\n");
        System.out.println("How many dice will be in your cup?");
        Integer userInput = sc.nextInt();
        System.out.println("That's " + userInput + " dice. Here we go!\n");

        for (int i = 0; i < userInput; i++) {
            if (i % 3 == 0) {
                LoadedDie loadedDie = new LoadedDie(1);
                loadedDie.setRollResult();
                dieList.add(loadedDie);
            } else {
                Die die = new Die();
                die.setRollResult();
                dieList.add(die);
            }
        }

        System.out.println("----------Roll Results---------");

        getDieList().stream().forEach(x -> System.out.println("Rolling " + x.getClass().getSimpleName() + ": " + x.getRollResult()));

        System.out.println("Total of rolls: " + getDieList().stream().mapToInt(x -> x.getRollResult()).sum());
        System.out.println("-------------------------------");


        return dieList;
    }

    public void playAgain() {
        if(!dieList.isEmpty()) {
            setDieList(Collections.emptyList());
        }

        if(dieList.isEmpty()) {
            play();
        }
    }


    public Cup() {}

    public List<Die> getDieList() {
        return dieList;
    }

    public void setDieList(List<Die> dieList) {
        this.dieList = dieList;
    }

}
