package com.java.OrderDAO;

import java.util.List;

import com.java.OrderModel.OrderDetails;

public interface OrderDao {
	List<OrderDetails> showAlldetails();
	String addOrderDao(OrderDetails odetails);
	OrderDetails searchDaoOrder(int cid);
	String updateDaoOrder(OrderDetails odetails);
	String deleteDaoOrder(int cid);
	Double calculateBillDao(int orderNo);
}
