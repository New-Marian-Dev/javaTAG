package com.company;


import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Methods used for playing the game or doing key actions for the playing of the game that aren't specific to a different Class
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

        System.out.print("Choose a cell from [0-" + (cellList.size() - 1) + "]: ");
        Scanner playerInput = Input.get();

        cellPrinter(cellList.get(Integer.parseInt(playerInput.next().toString()))); //simply for debug purposes to test out cells directly, and to test transitions when they are implemented

    }

    public static ArrayList<List> cellLoader(){
        ArrayList<List> cellList = new ArrayList<>();
        File dir = new File("Cells/");
        for(File file: dir.listFiles()){
            if (!file.getName().equalsIgnoreCase("!!CELL_TEMPLATE")){
                List<String> cell = Input.readCellFile(file.getName());
                cellList.add(cell);
                System.out.println(file.getName() + " has loaded successfully");
            }

        }
        System.out.print("\n");
        return cellList;
    }

    public static void cellPrinter(List<String> cell){
        for (String str: cell){
            if (!str.equalsIgnoreCase("\n") && !str.contains("&!!&")){
                System.out.println(str);
            }else if(str.contains("&!!&")) {

            }else{
                break;
            }
        }
    }
}


