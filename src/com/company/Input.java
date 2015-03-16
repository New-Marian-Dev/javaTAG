package com.company;

import java.util.Scanner;

public class Input {
    public static Scanner get(){
        //Need to look in to a better method of doing this, there can't be any spaces
        //Otherwise the other words are stored for the next use
        return new Scanner(System.in);
    }
}
