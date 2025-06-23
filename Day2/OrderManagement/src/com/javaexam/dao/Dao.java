package com.javaexam.dao;

import java.util.List;

import com.java.model.Model;
import com.java.model.Model.OrderDetails;

public interface Dao {
	List<Model> showAlldetails();
	String addOrderDao(OrderDetails odetails);
	OrderDetails searchDaoOrder(int cid);
	String updateDaoOrder(OrderDetails odetails);
	String deleteDaoOrder(int cid);
	Double calculateBillDao(int orderNo);
}
