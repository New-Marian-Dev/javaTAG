package com.company;


/**
 * Created by adumbguy on 5/4/2015.
 */
public class Game {

    public static void startGame(){

        Player currentPlayer = Player.playerCreation();

        String clearScreen = "\u000C";
        System.out.println(clearScreen);

        System.out.println("You are " + currentPlayer.name + " the " + currentPlayer.classList.get(Integer.parseInt(currentPlayer.playerClass)-1) + "\n"
        + "Your stats: " + "\n" +
                "-Health: "+ currentPlayer.playerStats.get(0) + "\n"+
                "-Defence: " + currentPlayer.playerStats.get(1) + "\n"+
                "-Magic: " + currentPlayer.playerStats.get(2));

    }


}
