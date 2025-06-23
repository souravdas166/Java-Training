package com.java.model;

import java.time.LocalDate;

public class OrderInfo {

    // Fields representing the details of an order
    private int orderId;
    private int customerId;
    private int menuId;
    private String itemName;
    private LocalDate orderDate;
    private double price;
    private int quantityOrdered;
    private double billAmount;
    private String orderComments;
	public Object getOrderDate;

	public OrderInfo() {
	    // No-arg constructor for data entry
	}

   
    public OrderInfo(int orderId, int customerId, int menuId, String itemName, LocalDate orderDate, double price,
                     int quantityOrdered, double billAmount, String orderComments) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.menuId = menuId;
        this.itemName = itemName;
        this.orderDate = orderDate;
        this.price = price;
        this.quantityOrdered = quantityOrdered;
        this.billAmount = billAmount;
        this.orderComments = orderComments;
    }

    

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public void setQuantityOrdered(int quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getOrderComments() {
        return orderComments;
    }

    public void setOrderComments(String orderComments) {
        this.orderComments = orderComments;
    }

    
    @Override
    public String toString() {
        return "OrderInfo [orderId=" + orderId + ", customerId=" + customerId + ", menuId=" + menuId + ", itemName="
                + itemName + ", orderDate=" + orderDate + ", price=" + price + ", quantityOrdered=" + quantityOrdered
                + ", billAmount=" + billAmount + ", orderComments=" + orderComments + "]";
    }
}
