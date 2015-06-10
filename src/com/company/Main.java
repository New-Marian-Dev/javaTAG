package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args){
	    //System.out.println("Hello World");

        Game.startGame();
    }

    public static void startTest(){
        Player newPlayer = new Player();
        //index numbers for playerStats are as follows: 0 = Health; 1 = Defence;
        List<List<Integer>> playerStats = newPlayer.initializeTestStats();
        Integer playerHealth = playerStats.get(0).get(0);
        Integer playerDefence = playerStats.get(1).get(0);
        //I'll eventually try and streamline this, but it'll work for now
        //The currently worn armour is in index 0 of each slot, may do away with the "bag" and just sort by slot.
        //Or may use "bag" for misc items if I ever make them.
        List<List<Items>> playerInventory = newPlayer.initializeTestInventory();
        List<Items> headSlot = playerInventory.get(0);
        List<Items> bodySlot = playerInventory.get(1);
        List<Items> legSlot = playerInventory.get(2);
        List<Items> bag = playerInventory.get(3);

        System.out.print("Please enter a name: ");

        newPlayer.name = Input.get().next(); //Sets player name
        Items genTest = Items.generateRandTestItem();

        System.out.println("Your player character is named " + newPlayer.name + " and has " + playerHealth + " health and " + playerDefence + " defence.");
        System.out.println("Oh no! as you walked out of the temple of Phalumis, you tripped and fell, hitting your head on a rock!");
        System.out.println("You lose 10 health."); //Just testing to make sure everything is editable like I need
        playerHealth = playerHealth - 10;
        System.out.println("Your current health is " + playerHealth);

        System.out.println("Your current inventory is: " + headSlot.get(0).itemName + ", " + bodySlot.get(0).itemName + ", " + legSlot.get(0).itemName);

        System.out.println("You look down, and see something, it appears to be a " + genTest.itemName);


    }
}
