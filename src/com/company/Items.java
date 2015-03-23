package com.company;


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

}
