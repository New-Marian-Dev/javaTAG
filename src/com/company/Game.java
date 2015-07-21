package com.company;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Methods used for playing the game or doing key actions for the playing of the game that aren't specific to a different Class
public class Game {

    public static void startGame(){

        ArrayList<List> cellList = Cell.cellLoader(); //The index of any cell should be their place in the directory -1. (0 = firstFile)

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
        System.out.print("\n \n");

        System.out.print("Choose a cell from [0-" + (cellList.size() - 1) + "]: ");
        int x = 0;
        for (List cells: cellList){
            System.out.print("\n" + x + ". " + cells.get(0));
            x++;
        }
        System.out.print("\n");
        Scanner playerInput = Input.get();

        Cell.cellPrinter(cellList.get(Integer.parseInt(playerInput.next()))); //simply for debug purposes to test out cells directly, and to test transitions when they are implemented

    }



}



