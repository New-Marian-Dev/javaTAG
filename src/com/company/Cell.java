package com.company;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eddie on 7/21/2015.
 */
public class Cell {

    public static ArrayList<List> cellLoader() {
        ArrayList<List> cellList = new ArrayList<>();
        File dir = new File("Cells/");
        File fileList[] = dir.listFiles();
        if(fileList != null) {
            for (File file : fileList) {
                if (!file.getName().equalsIgnoreCase("!!CELL_TEMPLATE")) {
                    List<String> cell = Input.readCellFile(file.getName());
                    cellList.add(cell);
                    System.out.println(file.getName() + " has loaded successfully");
                }
            }
        }
        System.out.print("\n");
        return cellList;
    }

    public static void cellPrinter(List<String> cell) {
        int x = 0;
        for (String str : cell) {
            if (!str.equalsIgnoreCase("\n") && !str.contains("&!!&") && !str.contains("::")) {
                if (str.contains("-*")) {
                    x++;
                    str = (Integer.toString(x) + ". ") + (str.replace("-*", ""));
                }
                System.out.println(str);
            } else if (str.contains("&!!&")) {

            }
        }


    }
}