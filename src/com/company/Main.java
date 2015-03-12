package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");

        startGame();
    }

    public static void startGame(){
        Player newPlayer = new Player();
        //index numbers for playerStats are as follows: 0 = Health; 1 = Defence;
        List<List<Integer>> playerStats = newPlayer.initializeStats();
        Integer playerHealth = playerStats.get(0).get(0);
        Integer playerDefence = playerStats.get(1).get(0);
        System.out.print("Please enter a name: ");

        newPlayer.name = Input.get().next();

        System.out.println("Your player character is named " + newPlayer.name + " and has " + playerHealth + " health and " + playerDefence + " defence.");
        System.out.println("Oh no! as you walked out of the temple of Phalumis, you tripped and fell, hitting your head on a rock!");
        System.out.println("You lose 10 health."); //Just testing to make sure everything is editable like I need
        playerHealth = playerHealth - 10;
        System.out.println("Your current health is " + playerHealth);


    }
}
