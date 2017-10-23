package me.aoa4eva;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        * Create an array list of strings to store the grocery list
        * */

        //Initialize user entered String variable
        String entered = "y";

        Scanner keyboard = new Scanner(System.in);


        //create a new ShoppingCart class
        ShoppingCart shoppingCart = new ShoppingCart();

        do {
            //while the answer is "y"
            if (entered.equalsIgnoreCase("y")) {

                //create a new GroceryItem lass
                GroceryItem groceryItem = new GroceryItem();

                //get the grocery item name from the user
                System.out.print("Enter an item to add to your grocery list:");
                //set the grocery item name in the GroceryItem class
                groceryItem.setName(keyboard.nextLine());
                //get the grocery item price from the user
                System.out.print("Enter the price of the item added to your grocery list:");
                //set the grocery item price in the GroceryItem class
                groceryItem.setPrice(keyboard.nextDouble());
                keyboard.nextLine();

                //add the GroceryItem class to the shoppingCart
                //(GroceryItem added to the ArrayList in the shoppingCart
                shoppingCart.add(groceryItem);
            }
            // ask the user if he wants to continue
            System.out.print("Do you want to continue (Y/N)?");
            entered = keyboard.nextLine();

        } while (entered.equalsIgnoreCase("y") || !entered.equalsIgnoreCase("n"));

        //display the grocery list and the total price using the shoppingCart class
        System.out.println(shoppingCart.displayGroceryList());
    }
}
