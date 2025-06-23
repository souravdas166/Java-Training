package com.javaexam.dao;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.java.model.Model;
import com.java.model.Model.OrderDetails;

public class DaoImpl implements Dao{
	static Map<String, Double>menuItems;
	static Map<Integer,Double>prices;
	static List<Model> listOrder;
	static Model odetails;
	static int index;
	static {
		listOrder = new LinkedList<>();
		prices = new LinkedHashMap<>();
		Model odetails;

		menuItems = new LinkedHashMap<>();
		menuItems.put("Panner Masala", 120.0);
		menuItems.put("Mutton", 180.0);
		menuItems.put("Mushrom 65", 100.0);
		menuItems.put("Salad", 40.0);
		menuItems.put("Rice", 30.0);
 
		prices.put(1, 120.0);
		prices.put(2, 180.0);
		prices.put(3, 100.0);
		prices.put(4, 40.0);
		prices.put(5, 30.0);
 
	}

	@Override
	public List<Model> showAlldetails() {
		return listOrder;
	}
 
//	@Override
//	public String addOrderDao(Model odetails) {
//		int index = (int)Math.random()+1;
////		if(listOrder.size()==0) {
////			index = 0;
////		}
////		else {
////			index=listOrder.get(listOrder.size()-1).getOrderId()+1;
//////			}
////			listOrder.add(index++,odetails);
////			return "Order added";
////
////		}
//		 listOrder.add(odetails);
//		 return "Order received";
//	}
 
	@Override
	public OrderDetails searchDaoOrder(int orderId) {
		Model order=null;
		for(Model ord:listOrder) {
			if(ord.()==orderId) {
				order=ord;
			}
		}
		return order;
	}
 
	@Override
	public String updateDaoOrder(OModel odetails) {
		// TODO Auto-generated method stub
		return null;
	}
 
	@Override
	public String deleteDaoOrder(int orderId) {
		Model order= searchDaoOrder(orderId);
		if(order!=null) {
			listOrder.remove(orderId);
			return "deleted";
		}
		return "not found";
	}
 
 
	@Override
	public Double calculateBillDao(int orderId) {
		OrderDetails order=searchDaoOrder(orderId);
		Double bill=0.0;
		if(order!=null) {
			bill=order.getQuantityOrder()*prices.get(orderId);
		}
		return bill;
	}

	@Override
	public String addOrderDao(OrderDetails odetails) {
		int index = (int)Math.random()+1;
//		if(listOrder.size()==0) {
//			index = 0;
//		}
//		else {
//			index=listOrder.get(listOrder.size()-1).getOrderId()+1;
////			}
//			listOrder.add(index++,odetails);
//			return "Order added";
//
//		}
		 listOrder.add(odetails);
		 return "Order received";
	}

	@Override
	public String updateDaoOrder(OrderDetails odetails) {
		// TODO Auto-generated method stub
		return null;
	}
 
}
