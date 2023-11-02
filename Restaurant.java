package ShubhamPokale;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {

    // Encapsulated data attributes of teh restaurant class
    // private String menu_item;
    private ArrayList<String> menu_items = new ArrayList<>();
    //  private int prices;
   private ArrayList<Integer> prices = new ArrayList<Integer>();
  //  private double ratings;
    private ArrayList<Double> ratings = new ArrayList<Double>();

    // Restaurant class constructor
    Restaurant(String menu_item, int prices,double ratings){
    // Adding elements to the ArrayList data attributes of the Restaurrant class
    this.menu_items.add(menu_item);
    this.prices.add(prices);
    this.ratings.add(ratings);
    }

    // Setter methods
//    public void setter(String menu_item, int prices,double ratings)
//        {
//
//
//
//            this.menu_items.add(menu_item);
//            this.prices.add(prices);
//            this.ratings.add(ratings);
//        }


    public void setter()
    {
        System.out.println("Enter the menu item, price and ratings to be set");

        Scanner sc = new Scanner(System.in);
        String menu_item1= sc.nextLine();
        Integer prices1 = sc.nextInt();
        Double ratings1 = sc.nextDouble();


        this.menu_items.add(menu_item1);
        this.prices.add(prices1);
        this.ratings.add(ratings1);
    }

    // Getter method
    public void getter()
        {
            System.out.println("The menu items are : " + menu_items);
            System.out.println("The respective prices are : "+ prices);
            System.out.println("The rating for each item is " + ratings);
        }


    // adding a menu item to the Menu
    public void add_item(String item_name,double ratings,int prices)
        {
            this.menu_items.add(item_name);
            this.ratings.add(ratings);
            this.prices.add(prices);

            System.out.println(item_name + "with rating" + ratings + " and price " + prices + " item details added to the menu");

        }
    // removing an item from the Menu
//    public void remove_item(String item_name,double ratings,int prices)
//        {
//            this.menu_items.remove(item_name);
//            this.ratings.remove(ratings);
//            this.prices.remove(prices);
//            System.out.println(item_name+ " item details are removed from the menu");
//
//            System.out.println(item_name + "with rating " + ratings + " and price " + prices + " item details removed from the menu");
//
//
//        }

    // removing an item method 2

    public void remove_item1(String name)
        {
            for(String x : menu_items)
            // we iterate through the ArrayList to the index of the matching element
            {   int indexinmenu_items =menu_items.indexOf(x);
                if(x.equals(name))
                {
                    menu_items.remove(indexinmenu_items);
                    ratings.remove(indexinmenu_items);
                    prices.remove(indexinmenu_items);


                }

            }
        }


    public void add_rating(String item_name, double rating )
        {       // add_rating to a particular item on the menu
            for(String x : menu_items)
            // we iterate through the ArrayList and set the rating
                {   int index =menu_items.indexOf(x);
                    if(x.equals(item_name))
                        {
                            ratings.set(index,rating);
                            System.out.println("The Rating has been updated :)");
                           // add_item(x, rating,prices.get(index));
                        }
                }
        }

    // A method to display the current menu

    void display_menu()
        {
            System.out.println("CURRENTLY ON MENU ");
            System.out.println("_________________________________________________");
            System.out.println("Menu Items  " + menu_items + " ");
            System.out.println("Ratings     " + ratings + " ");
            System.out.println("Prices      " + prices + " ");

            System.out.println("A fried chicken a day keeps hunger at bay :)");



        }


        // Average rating of an item from the menu

    public void averageRating(String item_name)
        {   double Average_Rating =0;
            double Total_Rating = 0;
            // for loop for traversing and calculating the total rating of all the items
            for(double x : ratings)
                {   int indexinratings = ratings.indexOf(x);
                    Total_Rating = ratings.get(indexinratings) + Total_Rating;

                }

            for(String x : menu_items)
            // we iterate through the ArrayList and find the element to calculate its average rating
            {   int indexinmenu_items =menu_items.indexOf(x);
                if(x.equals(item_name))
                {
                    // Calcualte average rating for the item speicfied
                    Average_Rating = ratings.get(indexinmenu_items) / Total_Rating;
                }

            }

            System.out.format("The Average rating of the product " + item_name + " is %.2f", Average_Rating );





        }


}
