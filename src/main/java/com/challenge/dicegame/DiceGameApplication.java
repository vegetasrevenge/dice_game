package com.challenge.dicegame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static com.sun.tools.doclint.Entity.cup;

public class DiceGameApplication {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);

		System.out.println("*********** Let's play a dice game! ************\n");

		System.out.println("How many dice will be in your cup?");
		Cup cup = new Cup();
		Integer userInput = sc.nextInt();
		System.out.println("That's " + userInput + " dice. Here we go!\n");

			for (int i = 0; i < userInput; i++) {
				if (i % 3 == 0) {
					LoadedDie loadedDie = new LoadedDie(1);
					loadedDie.setRollResult();
					cup.dieList.add(loadedDie);
				} else {
					Die die = new Die();
					die.setRollResult();
					cup.dieList.add(die);
				}
			}

		System.out.println("----------Roll Results---------");
		cup.getDieList().stream().forEach(x -> System.out.println("Rolling " + x.getClass().getSimpleName() + ": " + x.getRollResult()));


		System.out.println("Total of rolls: " + cup.getDieList().stream().mapToInt(x -> x.getRollResult()).sum());
		System.out.println("-------------------------------");


	}
}

