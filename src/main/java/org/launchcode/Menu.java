package org.launchcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

  public class Menu {

    private final Date dateLastUpdated;
    private final ArrayList<String> categories = new ArrayList<>(
            Arrays.asList("Appetizer", "Main Course", "Dessert")
    );
    private MenuItems special;
    private final ArrayList<MenuItems> items;

    public Menu(ArrayList<MenuItems> items) {
      this.items = items;
      this.dateLastUpdated = new Date();
    }

    public void addCategory(String category) {
      this.categories.add(category);
    }

    public void removeCategory(String category) {
      this.categories.remove(category);
    }

    public void addMenuItem(MenuItems item) {
      this.items.add(item);
    }

    public void removeMenuItem(MenuItems item) {
      this.items.remove(item);
    }

    public MenuItems getSpecial() {
      return special;
    }

    public void setSpecial(MenuItems special) {
      this.special = special;
    }

    public Date getDateLastUpdated() {
      return dateLastUpdated;
    }

    public ArrayList<String> getCategories() {
      return categories;
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
