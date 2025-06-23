package com.java.omsvalid;

import java.util.List;

import com.java.OrderDAO.OrderDao;
import com.java.OrderDAO.OrderDaoImpl;
import com.java.OrderModel.OrderDetails;

public class OmsValidation {
	static OrderDao orderDao;
	static {
		orderDao = new OrderDaoImpl();
	}
	public List<OrderDetails> OrderValid(){
		return this.orderDao.showAlldetails();
	}
	public String addOrderValid(OrderDetails odetails) {
		return this.orderDao.addOrderDao(odetails);
	}
	public String deleteOrderVal(int orderNO) {
		return this.orderDao.deleteDaoOrder(orderNO);
	}
	public OrderDetails searchByOrderVal(int orderNo) {
		return this.orderDao.searchDaoOrder(orderNo);
	}
	public Double calculateBillValid(int custnum) {
		return orderDao.calculateBillDao(custnum);
	}
}
