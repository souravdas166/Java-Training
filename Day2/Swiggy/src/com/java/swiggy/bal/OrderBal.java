package com.java.swiggy.bal;

import java.time.LocalDate;
import java.util.List;
import com.java.model.OrderInfo;
import com.java.swiggy.dao.OrderDAO;
import com.java.swiggy.dao.OrderDAOImpl;
import com.java.swiggy.exception.InvalidOrderDateException;

public class OrderBal {

    static OrderDAO orderDAO = new OrderDAOImpl();
    static StringBuilder sb = new StringBuilder();

    public String placeorder(OrderInfo order) throws InvalidOrderDateException {
        if (validate(order)) {
            return orderDAO.addOrder(order);
        }
        throw new InvalidOrderDateException(sb.toString());
    }

    public boolean validate(OrderInfo order) {
        boolean isValid = true;
        sb.setLength(0);
        if (order.getOrderDate().isBefore(LocalDate.now())) {
            sb.append("Order date cannot be in the past.");
            isValid = false;
        }
        return isValid;
    }

    public List<OrderInfo> getOrdersByCustomerId(int customerId) {
        return orderDAO.getOrderByCustomerId(customerId);
    }

    public OrderInfo searchByOrderIdBal(int orderId) {
        return orderDAO.searchOrderbyId(orderId);
    }

    public String deleteOrderBal(int orderId) {
        return orderDAO.deleteOrder(orderId);
    }

    public String updateOrderBal(int orderId, int newQuantity) {
        OrderInfo found = orderDAO.searchOrderbyId(orderId);
        if (found != null) {
            found.setQuantityOrdered(newQuantity);
            found.setBillAmount(found.getPrice() * newQuantity);
            return "Order updated successfully.";
        }
        return "Order not found.";
    }
}
