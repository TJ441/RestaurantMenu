package org.launchcode;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
  private final Date dateLastUpdated;
  private final ArrayList<MenuItems> items;

  public Menu(ArrayList<MenuItems> items) {
    this.items = items;
    this.dateLastUpdated = new Date();
  }

  public void addMenuItem(MenuItems item) {
    for (MenuItems i : items)
      if (i.equals(item)) {
        System.out.print("Item already on menu, not added.");
        return;
      }
    this.items.add(item);
  }

  public void removeMenuItem(MenuItems item) {
    this.items.remove(item);
  }

  public Date getDateLastUpdated() {
    return dateLastUpdated;
  }

  public ArrayList<MenuItems> getItems() {
    return items;
  }

  public void printMenu() {
    System.out.println("****");
    for (MenuItems menuItem : items) {
      System.out.println(menuItem.toString());
      System.out.println("****");
    }
  }
}