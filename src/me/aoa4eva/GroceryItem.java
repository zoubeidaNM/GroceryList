package me.aoa4eva;

public class GroceryItem {

    //Grocery Item price
    private String name;
    //Grocery Item description
    private String description;
    //Grocery Item price
    private double price;

    public GroceryItem() {
        name= "";
        description = "";
        price= 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        String str = "";
        str += str.format("%-20s%8s\n",name,"$"+price);;
        return str;

    }


}
