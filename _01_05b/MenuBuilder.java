package _01_05b;

import java.util.ArrayList;

public class MenuBuilder {
  public static void main(String[] args) {

    // Create a variable called menuTitle of type String and assign it the value "My
    // Dream Menu:".
    String menuTitle = "My Menu";
    // Print the menuTitle variable to the console.
    System.out.println(menuTitle);
    // Create a variable called menu of type ArrayList.
    ArrayList menu = new ArrayList<>();
    // Create a variable called starter of type MenuItem and pass in the name of
    // your favourite starter.
    String starter = "differentStarter";
    // Add the starter variable to the ArrayList called menu.
    menu.add(starter);
    // Create a variable called mainCourse of type MenuItem and pass in the name of
    // your favourite main course.
    String mainCourse = "Biryani";
    // Add the mainCourse variable to the ArrayList called menu.
    menu.add(mainCourse);
    // Create a variable called dessert of type MenuItem and pass in the name of
    // your favourite dessert.
    String dessert = "sweet";
    // Add the dessert variable to the ArrayList called menu.
    menu.add(dessert);
    // create a variable number the list
    int number = 3;
    // Add the number of items in the list to Array list menu
    menu.add(number);
    // Print the menu variable to the console.
    System.out.println(menu);
  }
}
