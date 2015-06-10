package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public static Scanner get(){

        return new Scanner(System.in);
    }

    public static List<String> readCellFile(String cellName){
        List<String> cell = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader("Cells/" + cellName))){
            String str;
            int x = 0;
            while ((str = in.readLine()) != null){
                if (str.contains("-*")){
                    x++;
                  str = (Integer.toString(x) + ". ") + (str.replace("-*", ""));
                }
                cell.add(str);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.print("That file doesn't exist!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("Something went horribly wrong!");
        }
        return cell;
    }


}
