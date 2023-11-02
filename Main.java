package ShubhamPokale;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       // String[] menu_items_of_kfc ={"Chicken nuggets", "Chicken burger", "Bk special Whopper", "Chicken Roll"};

        Restaurant Kfc = new Restaurant("Chicken Burger",500,4.7);
        // adding items
        Kfc.add_item("Chicken Wrapper",4.5,200);
        Kfc.add_item("Chicken Roll",4.2,100);
        Kfc.add_item("Chicken Bucket",4.5,800);
        Kfc.add_item("Fried Chicken",5.0,150);

        // Demonstarting removing an item
        System.out.println("Before removing an item from the menu");
        Kfc.display_menu();
        // removing items
//        Kfc.remove_item("Chicken Wrapper");
//        System.out.println("After removing an item from the menu");
//        Kfc.display_menu();

        //Demonstrating the add rating function
            Kfc.display_menu();
        Kfc.add_rating("Chicken Wrapper",4);
            Kfc.display_menu();

        // Calculating the average rating of a particular item
        Kfc.averageRating("Fried Chicken");


        Restaurant MacD = new Restaurant("Chicken Burger",500,4.7);

        MacD.display_menu();

        // Demonstrating setter method
        MacD.setter();
        MacD.display_menu();
        Kfc.setter();
        Kfc.display_menu();
    }


}
