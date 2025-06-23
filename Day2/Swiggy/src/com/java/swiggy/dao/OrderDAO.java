package com.java.swiggy.dao;

import java.util.List;

import com.java.model.OrderInfo;

public interface OrderDAO {
    String addOrder(OrderInfo order);
    List<OrderInfo> getOrderByCustomerId(int customerId);
    String updateOrder(OrderInfo order);
    String deleteOrder(int orderId);
    OrderInfo searchOrderbyId(int orderId);
}
