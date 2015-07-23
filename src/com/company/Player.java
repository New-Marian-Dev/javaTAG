package com.company;



import java.util.*;


public class Player {

    //Store name, health, and defence for later use. May be replaced by the List in the initialize Stats method.
    public String name;
    public String race;
    public String playerClass;
    public static int intHealth; //Deprecated
    public static int intDefence; //Deprecated
    public List<Integer> playerStats;
    public List<List<Items>> playerInventory;
    public List<String> raceList;
    public List<String> classList;


    //Used only at startup, creates the base stats of the player, and an 2d list of the stats.
    public List<List<Integer>> initializeTestStats(){

        intHealth = 100;
        intDefence = 10;

        List<List<Integer>> stats = new ArrayList<>();
        List<Integer> health = new ArrayList<>();
        health.add(intHealth);
        List<Integer> defence = new ArrayList<>();
        defence.add(intDefence);
        stats.add(health);
        stats.add(defence);


        return stats;
    }

    public List<Integer> initializePlayerStats(Player player){

        List<Integer> playerStats = new ArrayList<>();
        int playerHealth = 50;
        int playerDefence = 5;
        int playerMagic = 0;
        playerStats.add(playerHealth);
        playerStats.add(playerDefence);
        playerStats.add(playerMagic);

       switch (player.playerClass){
           case "1":
               final int clericHealthMod = 100;
               final int clericDefMod = 5;
               final int clericMagicMod = 25;
               playerStats.set(0, clericHealthMod);
               playerStats.set(1, clericDefMod);
               playerStats.set(2, clericMagicMod);
               break;

           case "2":
               final int warriorHealthMod = 110;
               final int warriorDefMod = 10;
               final int warriorMagicMod = 0;
               playerStats.set(0, warriorHealthMod);
               playerStats.set(1, warriorDefMod);
               playerStats.set(2, warriorMagicMod);
               break;
       }
        return playerStats;
    }

    public List<List<Items>> initializeTestInventory(){ //Used to test a very simple inventory system.
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

    public static Player playerCreation(){
        Player player = new Player(); //Creates "Player"
        //Just a list of classes to choose from, it'll be small for now
        List<String> classes = new ArrayList<>();
        classes.add("Medic");
        classes.add("Mercenary");
        player.classList = classes;
        //Shitty intro thing to get things going. It will NOT be this in final, hell it may be gone next version with the first iteration of the actual intro.
        System.out.println("As a new recruit in the Imperial Xerilian Astral Marines");
        System.out.print("Enter Name: ");
        String playerName = Input.get().nextLine(); //get player input for their name, nextLine() used to get any spaces in the names
        player.name = playerName;
        System.out.println("Well then " + playerName + ", what kind of adventurer are you?");
        int listNum = 1; //Only used for this "for" loop
        for(String choice : classes){ //Prints available classes for the player to choose, numbering them
            System.out.println(listNum + ". " + choice);
            listNum++;
        }
        System.out.print("Choose your class: ");
        String playerClass = Input.get().next(); //Only gets the class number, so there shouldn't be any spaces
        player.playerClass = playerClass; //Sets the class number in the player object to the class number form the list
        String playerClassString;
        playerClassString = classes.get(Integer.parseInt(playerClass) - 1); //This is so the upcoming print function knows the class name

        System.out.print("\n " + player.name + " the " + playerClassString + " eh? Well good luck on your journey friend. \n");

        player.playerInventory = Items.generatePlayerInitialInventory(playerClass);
        player.playerStats = player.initializePlayerStats(player);

        return player;

    }
}
