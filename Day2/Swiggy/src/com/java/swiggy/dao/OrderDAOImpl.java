package com.java.swiggy.dao;

import java.util.ArrayList;
import java.util.List;
import com.java.model.OrderInfo;

public class OrderDAOImpl implements OrderDAO {
    // List to store all orders
    static List<OrderInfo> orders;

    static {
        orders = new ArrayList<>(); // Initialize the list of orders
    }

    // Method to generate a new unique order ID
    public int generateOrderId() {
        if (orders.size() == 0) {
            // If no orders exist, return ID 1
            return 1;
        } else {
            // Otherwise, return the next ID based on the last order ID
            return orders.get(orders.size() - 1).getOrderId() + 1;
        }
    }

    // Method to add an order
    @Override
    public String addOrder(OrderInfo order) {
        // Generate and set a unique order ID for the new order
        order.setOrderId(generateOrderId());

        // Add the order to the orders list
        orders.add(order);

        // Return confirmation message
        return "Order added to the list with Order ID: " + order.getOrderId();
    }

    // Method to get all orders by a specific customer ID
    @Override
    public List<OrderInfo> getOrderByCustomerId(int customerId) {
        List<OrderInfo> result = new ArrayList<>();
        // Loop through orders to find orders that match the given customerId
        for (OrderInfo order : orders) {
            if (order.getCustomerId() == customerId) {
                result.add(order);
            }
        }
        return result;
    }

    // Method to update an existing order
    @Override
    public String updateOrder(OrderInfo updatedOrder) {
        // Search for the order to update by ID
        OrderInfo found = searchOrderbyId(updatedOrder.getOrderId());
        if (found != null) {
            // Update order quantity and bill amount if order is found
            found.setQuantityOrdered(updatedOrder.getQuantityOrdered());
            found.setBillAmount(found.getPrice() * updatedOrder.getQuantityOrdered());
            return "Order Record Updated for Order ID: " + updatedOrder.getOrderId();
        }
        return "Order Record Not Found for Order ID: " + updatedOrder.getOrderId();
    }

    // Method to delete an order
    @Override
    public String deleteOrder(int orderId) {
        // Search for the order by ID
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getOrderId() == orderId) {
                orders.remove(i); // Remove the order from the list
                return "Order ID " + orderId + " deleted successfully.";
            }
        }
        return "Order not found for deletion with Order ID: " + orderId;
    }

    // Method to search for an order by ID
    @Override
    public OrderInfo searchOrderbyId(int orderId) {
        // Loop through orders to find the order with the given ID
        for (OrderInfo order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null; // Return null if order with the given ID is not found
    }
}
