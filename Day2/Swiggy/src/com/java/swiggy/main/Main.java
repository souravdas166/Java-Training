package com.java.swiggy.main;

import com.java.model.MenuItem;
import com.java.model.OrderInfo;
import com.java.swiggy.bal.OrderBal;
import com.java.swiggy.exception.InvalidOrderDateException;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    static OrderBal orderBal;

    static {
        sc = new Scanner(System.in);
        orderBal = new OrderBal();
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n*** Welcome to the Order Management System ***");
            System.out.println("1. Display Menu");
            System.out.println("2. Place Order");
            System.out.println("3. View Orders by Customer");
            System.out.println("4. Update Order");
            System.out.println("5. Delete Order");
            System.out.println("6. Search by Order ID");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    MenuItem.displayMenu();
                    break;

                case 2:
                    try {
                        placeOrderMain();
                    } catch (InvalidOrderDateException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    searchByCustIdMain();
                    break;

                case 4:
                    updateOrderMain();
                    break;

                case 5:
                    deleteOrderMain();
                    break;

                case 6:
                    searchByOrderIdMain();
                    break;

                case 7:
                    System.out.println("Thank you for using the Order Management System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void searchByOrderIdMain() {
        System.out.print("Enter Order ID to search: ");
        int orderId = sc.nextInt();
        OrderInfo order = orderBal.searchByOrderIdBal(orderId);
        if (order != null) {
            System.out.println(order);
        } else {
            System.out.println("Order not found.");
        }
    }

    public static void deleteOrderMain() {
        System.out.print("Enter order ID to delete: ");
        int orderIdToDelete = sc.nextInt();
        System.out.println(orderBal.deleteOrderBal(orderIdToDelete));
    }

    public static void updateOrderMain() {
        System.out.print("Enter order ID to update: ");
        int orderIdToUpdate = sc.nextInt();
        System.out.print("Enter new quantity: ");
        int newQuantity = sc.nextInt();
        System.out.println(orderBal.updateOrderBal(orderIdToUpdate, newQuantity));
    }

    public static void searchByCustIdMain() {
        System.out.print("Enter customer ID to view orders: ");
        int customerId = sc.nextInt();
        orderBal.getOrdersByCustomerId(customerId).forEach(System.out::println);
    }

    public static void placeOrderMain() throws InvalidOrderDateException {
        OrderInfo ob = new OrderInfo();

        System.out.print("Enter customer ID: ");
        ob.setCustomerId(sc.nextInt());

        System.out.print("Enter menu item ID: ");
        int menuId = sc.nextInt();
        MenuItem item = MenuItem.getByMenuId(menuId);
        if (item == null) {
            System.out.println("Invalid menu item ID.");
            return;
        }

        ob.setMenuId(menuId);
        ob.setItemName(item.getItemName());
        ob.setPrice(item.getPrice());

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        ob.setQuantityOrdered(quantity);
        ob.setBillAmount(quantity * item.getPrice());

        System.out.print("Enter order date (YYYY-MM-DD): ");
        String date = sc.next();
        ob.setOrderDate(LocalDate.parse(date));

        sc.nextLine(); // consume leftover newline
        System.out.print("Enter any comments for your order: ");
        ob.setOrderComments(sc.nextLine());

        String result = orderBal.placeorder(ob);
        System.out.println(result);
    }
}
