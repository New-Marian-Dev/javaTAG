package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Items {

    public String itemName;
    public String itemType;
    public List<Items> itemSlot;

    public static Items generateRandTestItem(){
        final int min = 0;
        final int max = 5;

        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        Items result = null;

        switch (randomNum){
            case 0:
                Items nothing = new Items();
                nothing.itemName = "Nothing";
                nothing.itemType = "Nothing";

                result = nothing;
                break;

            case 1:
                Items dogPile = new Items();
                dogPile.itemName = "Dog Pile";
                dogPile.itemType = "Shit";

                result = dogPile;
                break;

            case 2:
                Items rock = new Items();
                rock.itemName = "Potentially Useful Rock";
                rock.itemType = "Ultra Greatsword";

                result = rock;
                break;

            case 3:
                Items shiv = new Items();
                shiv.itemName = "Broken Shiv";
                shiv.itemType = "Potato";

                result = shiv;
                break;

            case 4:
                Items dagger = new Items();
                dagger.itemName = "Rusty Dagger";
                dagger.itemType = "Holy Mace of the Undaunted";

                result = dagger;
                break;

            case 5:
                Items sword = new Items();
                sword.itemName = "Broad Sword";
                sword.itemType = "Long Stabby Stick";

                result = sword;
                break;

            default:
                System.out.println("Something Fucked up in generation!");
                break;

        }
        return result;
    }


    public static List<List<Items>> generatePlayerInitialInventory(String playerClass){ //Generates a starter inventory for the player based on class
        List<List<Items>> inventory = new ArrayList<List<Items>>();

        List<Items> headSlot = new ArrayList<Items>();
        List<Items> bodySlot = new ArrayList<Items>();
        List<Items> legSlot = new ArrayList<Items>();
        List<Items> footSlot = new ArrayList<Items>();
        List<Items> weaponSlot = new ArrayList<Items>();

        inventory.add(headSlot);
        inventory.add(bodySlot);
        inventory.add(legSlot);
        inventory.add(footSlot);
        inventory.add(weaponSlot);

        Items clericHelmet = new Items();
        clericHelmet.itemType

        switch(playerClass){

            //Indexes for the slots: Head = 0, Body = 1, Legs = 2, Feet = 3, Weapon = 4;
            case "Cleric":
                List<List<Items>> clericInventory = inventory;




                return clericInventory;
            break;

            case "Warrior":
                List<List<Items>> warriorInventory = inventory;



                return warriorInventory;
            break;
        }


    }

}
