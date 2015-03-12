package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

    //Store name, health, and defence for later use. May be replaced by the List in the initialize Stats method.
    public String name;
    public static int intHealth;
    public static int intDefence;


    //Used only at startup, creates the base stats of the player, and an 2d list of the stats.
    public List<List<Integer>> initializeStats(){

        intHealth = 100;
        intDefence = 10;

        List<List<Integer>> stats = new ArrayList<List<Integer>>();
        List<Integer> health = new ArrayList<Integer>();
        health.add(intHealth);
        List<Integer> defence = new ArrayList<Integer>();
        defence.add(intDefence);
        stats.add(health);
        stats.add(defence);


        return stats;
    }
}
