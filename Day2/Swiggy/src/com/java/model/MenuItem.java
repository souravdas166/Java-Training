package com.java.model;

public enum MenuItem {

    VEGBIRIYANI(1, "Biriyani", 200.0),
    VEGMEAL(2, "Veg_Meal", 150.0),
    PIZZA(3, "Pizza", 100.0),
    CURRY(4, "Curry", 250.0),
    MASALADOSA(5, "Masala_Dosa", 50.0),
    PANEERBUTTERMASALA(6, "Paneer_Butter_Masala", 179.0),
    MUSHROOMMASALA(7, "Mushroom_Masala", 199.0);

    private final int menuId;
    private final String itemName;
    private final double price;

    private MenuItem(int menuId, String itemName, double price) {
        this.menuId = menuId;
        this.itemName = itemName;
        this.price = price;
    }

    public int getMenuId() {
        return menuId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public static MenuItem getByMenuId(int menuId) {
        for (MenuItem item : values()) {
            if (item.getMenuId() == menuId) {
                return item;
            }
        }
        return null;
    }

    public static void displayMenu() {
        for (MenuItem item : values()) {
            System.out.println(item.getMenuId() + ". " + item.getItemName() + " - Rs" + item.getPrice());
        }
    }
}
