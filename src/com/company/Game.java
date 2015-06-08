package com.company;


import java.util.ArrayList;

/**
 * Created by adumbguy on 5/4/2015.
 */
public class Game {

    public static void startGame(){

        Player currentPlayer = Player.playerCreation();

        int screenSeparatorInt = 0;

        while (screenSeparatorInt < 5){
            System.out.println("***************************");
            screenSeparatorInt++;
        }

        System.out.println("You are " + currentPlayer.name + " the " + currentPlayer.classList.get(Integer.parseInt(currentPlayer.playerClass)-1) + "\n"
        + "Your stats: " + "\n" +
                "-Health: "+ currentPlayer.playerStats.get(0) + "\n"+
                "-Defence: " + currentPlayer.playerStats.get(1) + "\n"+
                "-Magic: " + currentPlayer.playerStats.get(2));

    }

    public static void testCellLoader(){ //This needs to return the cell info [Name, Desc, Movement Options, ect.] when it's time to actually use this.
        ArrayList<String> cell = Input.readCellFile("TestCell");

    }


}
