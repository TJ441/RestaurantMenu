package org.launchcode;

public class MenuItems {
  private String itemName;
  private double price;
  private String category;
  private int daysOnMenu;

  public MenuItems(String itemName, double price, String category, int daysOnMenu) {
    this.itemName = itemName;
    this.price = price;
    this.category = category;
    this.daysOnMenu = daysOnMenu;
  }

  public void setItemName(String aItemName) { itemName = aItemName; }
  public void setPrice(double aPrice) { price = aPrice; }
  public void setCategory(String aCategory) { category = aCategory; }
  public void setDaysOnMenu(int aDaysOnMenu) { daysOnMenu = aDaysOnMenu; }

  public String getItemName() { return itemName; }
  public double getPrice() { return price; }
  public String getCategory() { return category; }
  public int getDaysOnMenu() { return daysOnMenu; }
}
