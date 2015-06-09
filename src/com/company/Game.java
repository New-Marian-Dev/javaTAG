package com.company;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by adumbguy on 5/4/2015.
 */
public class Game {

    public static void startGame(){

        ArrayList<List> cellList = Game.cellLoader(); //The index of any cell should be their place in the directory -1. (0 = firstFile)

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



    }

    public static ArrayList<List> cellLoader(){
        ArrayList<List> cellList = new ArrayList<>();
        File dir = new File("Cells/");
        for(File file: dir.listFiles()){
            List<String> cell = Input.readCellFile(file.getName());
            cellList.add(cell);
            System.out.println(file.getName() + " has loaded successfully");
        }
        return cellList;
    }

}
