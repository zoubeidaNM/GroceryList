package me.aoa4eva;

import java.util.ArrayList;

public class ShoppingCart {

    // an ArryList of GroceryItems
    private ArrayList<GroceryItem> groceryItems;

    public ShoppingCart() {
        groceryItems = new ArrayList<GroceryItem>();
    }

    public ArrayList<GroceryItem> getGroceryItems() {
        return groceryItems;
    }

    public void setGroceryItems(ArrayList<String> groceryItems) {
        groceryItems = groceryItems;
    }

    //add a GroceryItem to the ArrayList of GroceryItems
    public void add(GroceryItem groceryItem) {
        groceryItems.add(groceryItem);
    }


    //display the grocery list and the total price
    public String displayGroceryList() {
        //initialize the returned String
        String str = "\nGrocery List\n";
        str += "============================\n";

        //initialize the grocery total price to 0
        double groceryTotalPrice = 0.0;

        //for every item(class GroceryItem) in the groceryItems list
        for (GroceryItem groceryItem : groceryItems) {

            //add the name and price of the grocery item, name at the start of the line, price at the send of the line
            str += str.format("%-20s%s%4.2f\n", groceryItem.getName(), "$", + groceryItem.getPrice());

            //add the grocery item price to the grocery total price
            groceryTotalPrice += groceryItem.getPrice();

        }
        str += "============================\n";
        // display the grocery total price
        str += str.format("%-20s%s%4.2f\n", "Total price: ", "$", + groceryTotalPrice);
        return str;


    }


    public String toString() {
        String str = "\nGrocery List\n";
        str += "=================================\n";
        double groceryTotalPrice = 0.0;
        for (GroceryItem groceryItem : groceryItems) {
            str += groceryItem;
            groceryTotalPrice += groceryItem.getPrice();
        }
        str += "=================================\n";
        str += str.format("%-20s%8s\n", "Total price: ", "$" + groceryTotalPrice);
        return str;


    }


}
