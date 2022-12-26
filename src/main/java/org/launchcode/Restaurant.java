package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
  public static void main(String[] args) {
    ArrayList<MenuItems> menuItems = new ArrayList<>(Arrays.asList(
      new MenuItems("Salad", 8.75, "chicken Caesar salad","Entree"),
      new MenuItems("Chicken Alfredo",18.50,"chicken in a white sauce","Entree"))
    );
    Menu menu = new Menu(menuItems);
    menu.addMenuItem(new MenuItems("Tiramisu",9.50,"Italian dessert","Dessert"));
    menu.printMenuItem();
    menu.printMenu();
  }
}