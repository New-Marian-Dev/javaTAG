package com.company;

import com.sun.deploy.panel.ITreeNode;

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

    public List<List<Items>> initializeInventory(){
        List<List<Items>> inventory = new ArrayList<List<Items>>();

        List<Items> headSlot = new ArrayList<Items>();
        List<Items> bodySlot = new ArrayList<Items>();
        List<Items> legSlot = new ArrayList<Items>();
        List<Items> bag = new ArrayList<Items>();

        inventory.add(headSlot);
        inventory.add(bodySlot);
        inventory.add(legSlot);
        inventory.add(bag);


        Items simpleHat = new Items();
        simpleHat.itemName = "Simple Hat";
        simpleHat.itemSlot = inventory.get(0);
        simpleHat.itemType = "Armour";
        headSlot.add(simpleHat);

        Items simpleTunic = new Items();
        simpleTunic.itemName = "Simple Tunic";
        simpleTunic.itemSlot = inventory.get(1);
        simpleTunic.itemType = "Armour";
        bodySlot.add(simpleTunic);

        Items simpleBoots = new Items();
        simpleBoots.itemName = "Simple Boots";
        simpleBoots.itemSlot = inventory.get(2);
        simpleBoots.itemType = "Armour";
        legSlot.add(simpleBoots);

        return inventory;
    }
}
