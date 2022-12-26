package org.launchcode;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Menu {
  private final Date dateLastUpdated;
  private final ArrayList<MenuItems> menuItems;

  public Menu(ArrayList<MenuItems> items) {
    this.menuItems = items;
    this.dateLastUpdated = new Date();
  }

  public void addMenuItem(MenuItems item) {
    for (MenuItems i : menuItems)
      if (i.equals(item)) {
        System.out.print("Item already on menu, not added.");
        return;
      }
    this.menuItems.add(item);
  }

  public void removeMenuItem(MenuItems item) {
    this.menuItems.remove(item);
  }

  public Date getDateLastUpdated() {
    return dateLastUpdated;
  }

  public ArrayList<MenuItems> getItems() {
    return menuItems;
  }

  public void printMenu() {
    System.out.println("****");
    for (MenuItems menuItem : menuItems) {
      System.out.println(menuItem.toString());
      System.out.println("****");
    }
  }

  public void printMenuItem() {
    Scanner input = new Scanner(System.in);
    System.out.print("Salad = 0, Chicken Alfredo = 1, Tiramisu = 2\n\nSelect item to print: ");
    int choice = input.nextInt();
    System.out.print(menuItems.get(choice));
  }
}