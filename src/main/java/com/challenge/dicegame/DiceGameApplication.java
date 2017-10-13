package com.challenge.dicegame;

import com.sun.tools.doclint.Entity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static com.sun.tools.doclint.Entity.cup;

public class DiceGameApplication {

	public static void main(String[] args) {

		Cup cup = new Cup();

		cup.play();

		cup.playAgain();
	}
}

