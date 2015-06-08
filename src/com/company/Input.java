package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static Scanner get(){
        //Need to look in to a better method of doing this, there can't be any spaces
        //Otherwise the other words are stored for the next use
        return new Scanner(System.in);
    }

    public static ArrayList<String> readCellFile(String cellName){
        ArrayList<String> cell = new ArrayList<>();
        try(BufferedReader in = new BufferedReader(new FileReader("Cells/" + cellName + ".txt"))){
            String str;
            while ((str = in.readLine()) != null){
                cell.add(str);
            }
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
