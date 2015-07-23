package com.company;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Eddie on 7/21/2015.
 */
public class Cell {

    public static ArrayList<List> cellLoader() {
        ArrayList<List> cellList = new ArrayList<>();
        List<String> modList = new ArrayList<>();
        File cellDir = new File("Cells/");
        File fileList[] = cellDir.listFiles();
        if(fileList != null) {
            for (File file : fileList) {
                if (!file.getName().equalsIgnoreCase("!!CELL_TEMPLATE") && !file.getName().equalsIgnoreCase("!!CELL_MODIFIERS")) {
                    List<String> cell = Input.readCellFile(file.getName());
                    cellList.add(cell);
                    System.out.println(file.getName() + " has loaded successfully");
                }
                if(file.getName().equalsIgnoreCase("!!CELL_MODIFIERS")){
                    for (String str: Input.readCellFile(file.getName())){
                        if (!str.contains("::")) {
                            str.replace("\n", "");
                            modList.add(str);
                            System.out.print("Cell mod : \"" + str + "\" was loaded added to modList \n");
                        }
                    }
                    if (modList != null){
                        System.out.print(file.getName() + "has loaded successfully");
                        cellList.add(modList);
                    }
                }
            }
        }
        System.out.print("\n");
        return cellList;
    }

    public static void cellPrinter(List<String> cell) {

        for (String str : cell) {
            if (!str.equalsIgnoreCase("\n") && !str.contains("&!!&") && !str.contains("::") && !str.contains("-*")) {
                System.out.println(str);
            } else if (str.contains("&!!&")) {

            }
        }


    }

    public static void cellModifiers(ArrayList<List<String>> cellList, List<String> cell, Player player){
        boolean hasMods = false;
        List<String> currentMods = new ArrayList<>();
        for (String str: cell){
            if (str.contains("&!!&")){
                str.replace("&!!&", "");
                for (String mod: str.split(","))
                        currentMods.add(mod);
                if (currentMods.size() > 0){
                    hasMods = true;
                }else{
                    hasMods = false;
                }
            }
        }
        if(hasMods){
            for (String mod: currentMods){
                for (String modMaster: cellList.get(0)){
                    if (mod.equalsIgnoreCase(modMaster)){
                        //TODO: Add logic for the different modifiers here.
                    }
                }
            }
        }
    }

    public static List<String> nextCell(ArrayList<List<String>> cellList, List<String> cell){ //Used to choose the next cell from the current one

        List<String> choices = new ArrayList<>();
        List<String> newCell = new ArrayList<>();
        int x = 0;
        for (String str: cell){
            if (str.contains("-*")) {
                x++;
                str = (Integer.toString(x) + ". ") + (str.replace("-*", ""));
                int y = 0;
                for(List<String> lCell: cellList){
                    if (str.contains(lCell.get(0))){
                        choices.add(lCell.get(0));

                        str.replace("[[", "");
                        str.replace(lCell.get(0), "");
                        str.replace("]]","");
                    }
                }
                System.out.print(str + "\n");
            }
        }
        Scanner playerChoice = Input.get();
        int cellChoice = Integer.parseInt(playerChoice.next());
        if((cellChoice <= choices.size() && cellChoice >= 0)){

            for (List<String> lCell: cellList){
                if (lCell.get(0).equals(choices.get(cellChoice))){
                    newCell = lCell;
                }
            }
        }
        return newCell;

    }
}