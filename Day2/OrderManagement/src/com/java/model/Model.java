package com.java.model;

import java.time.LocalDate;

import java.util.Date;

import java.util.List;

public class Model {
	
	
	 
	public class OrderDetails {
	 
		private int orderId;

		private int customId;

		private int itemId;

		int quantityOrder;

		private LocalDate orderdate;

		private String OrderComments;

		public OrderDetails(int orderId, int customId, int itemId, int quantityOrder, LocalDate orderdate,

				String orderComments) {

			this.orderId = orderId;

			this.customId = customId;

			this.itemId = itemId;

			this.quantityOrder = quantityOrder;

			this.orderdate = orderdate;

			OrderComments = orderComments;

		}


	 
		public OrderDetails() {

		}
	 
	 
	 
		public int getOrderId() {

			return orderId;

		}
	 
		public void setOrderId(int orderId) {

			this.orderId = orderId;

		}
	 
		public int getCustomId() {

			return customId;

		}
	 
		public void setCustomId(int customId) {

			this.customId = customId;

		}
	 
		public int getItemId() {

			return itemId;

		}
	 
		public void setItemId(int itemId) {

			this.itemId = itemId;

		}
	 
	 
		public int getQuantityOrder() {

			return quantityOrder;

		}
	 
		public void setQuantityOrder(int quantityOrder) {

			this.quantityOrder = quantityOrder;

		}
	 
		public LocalDate getOrderdate() {

			return orderdate;

		}
	 
		public void setOrderdate(LocalDate orderdate) {

			this.orderdate = orderdate;

		}
	 
		public String getOrderComments() {

			return OrderComments;

		}
	 
		public void setOrderComments(String orderComments) {

			OrderComments = orderComments;

		}
	 
		@Override

		public String toString() {

			return "OrderDetails [orderId=" + orderId + ", customId=" + customId + ", quantityOrder="

					+ quantityOrder + ", orderdate=" + orderdate + ", OrderComments=" + OrderComments + "]";

		}

	}

	}
	 
	
		

	 

