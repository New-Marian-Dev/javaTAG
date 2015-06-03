package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Items {

    public String itemName;
    public String itemType;
    public List<Items> itemSlot;
    public boolean isWeapon = false;
    public boolean isEnchanted = false;
    //These two are mostly going to be used for generated items more so than pre-fab ones.


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
        //Be sure to make the types somewhat relevant to what they actually are




        switch(playerClass){

            //Indexes for the slots: Head = 0, Body = 1, Legs = 2, Feet = 3, Weapon = 4;
            //Classes are: 1. Cleric, 2.Warrior
            case "1":
                List<List<Items>> clericInventory = inventory;

                //First is cleric Items
                Items clericHelmet = new Items();
                clericHelmet.itemType = "Simple Helmet";
                clericHelmet.itemName = "Cleric's Cap";
                clericHelmet.itemSlot = inventory.get(0);
                Items clericCuirass = new Items();
                clericCuirass.itemType = "Simple Cuirass";
                clericCuirass.itemName = "Cleric's Vest";
                clericCuirass.itemSlot = inventory.get(1);
                Items clericGrieves = new Items();
                clericGrieves.itemType = "Simple Grieves";
                clericGrieves.itemName = "Clerics Grieves";
                clericGrieves.itemSlot = inventory.get(2);
                Items clericSabatons = new Items();
                clericSabatons.itemType = "Simple Sabatons";
                clericSabatons.itemName = "Cleric Sabatons";
                clericSabatons.itemSlot = inventory.get(3);

                clericInventory.get(0).add(clericHelmet);
                clericInventory.get(1).add(clericCuirass);
                clericInventory.get(2).add(clericGrieves);
                clericInventory.get(3).add(clericSabatons);

                System.out.println("**Cleric Items Successfully added**"); //Comment this out later

             return clericInventory;

            case "2":
                List<List<Items>> warriorInventory = inventory;

                //Then Warrior items
                Items warriorHelmet = new Items();
                warriorHelmet.itemType = "Simple Helmet";
                warriorHelmet.itemName = "Cleric's Cap";
                warriorHelmet.itemSlot = inventory.get(0);
                Items warriorCuirass = new Items();
                warriorCuirass.itemType = "Simple Cuirass";
                warriorCuirass.itemName = "Cleric's Vest";
                warriorCuirass.itemSlot = inventory.get(1);
                Items warriorGrieves = new Items();
                warriorGrieves.itemType = "Simple Grieves";
                warriorGrieves.itemName = "Clerics Grieves";
                warriorGrieves.itemSlot = inventory.get(2);
                Items warriorSabatons = new Items();
                warriorSabatons.itemType = "Simple Sabatons";
                warriorSabatons.itemName = "Cleric Sabatons";
                warriorSabatons.itemSlot = inventory.get(3);

                warriorInventory.get(0).add(warriorHelmet);
                warriorInventory.get(1).add(warriorCuirass);
                warriorInventory.get(2).add(warriorGrieves);
                warriorInventory.get(3).add(warriorSabatons);

                System.out.println("**Warrior Items Successfully added**"); //Comment this out later

             return warriorInventory;

            default:
                System.out.print("!!Class Selection Failed!!");
                return inventory;

        }


    }

}
