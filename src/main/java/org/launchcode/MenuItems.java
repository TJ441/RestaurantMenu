package org.launchcode;
import java.util.Date;
import java.util.Objects;

public class MenuItems {
  private String name;
  private double price;
  private String description;
  private String category;
  private final boolean isNew;
  private final Date dateCreated;

  public MenuItems(String name, double price, String description, String category) {
    this.name = name;
    this.price = price;
    this.description = description;
    this.category = category;
    this.isNew = true;
    this.dateCreated = new Date();
  }

  public void setItemName(String aName) { name = aName; }
  public void setPrice(double aPrice) { price = aPrice; }
  public void setDescription(String aDescription) { description = aDescription; }
  public void setCategory(String aCategory) { category = aCategory; }
  public boolean isNew() { return isNew; }

  public String getName() { return name; }
  public double getPrice() { return price; }
  public String getDescription() { return description; }
  public String getCategory() { return category; }
  public Date getDateCreated() { return dateCreated; }

  @Override
  public String toString() {
    return name + "\n" + description + "\n$" + price + "\n" + category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MenuItems menuItems = (MenuItems) o;
    return name.equals(menuItems.name) && category.equals(menuItems.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category);
  }
}
