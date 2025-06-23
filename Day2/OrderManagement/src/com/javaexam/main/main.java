package com.javaexam.main;

import java.util.Scanner;

import com.javaexam.bal.OrderBal;

public class main {
	static Scanner sc;
	static OrderBal ovalid;
	static {
		sc = new Scanner(System.in);
		ovalid=new OrderBal();
	}
	public static void main(String[] args) {
		int choice =0;
		do {
			System.out.println("1.Add Order");
			System.out.println("2.Show Order");
			System.out.println("3.Update Order");
			System.out.println("4.Delete Order");
			System.out.println("5.Search Order By Order");
			System.out.println("6.Search Order By Cust");
            System.out.println("7.calculate bill");
			System.out.println("8.Exit");
			System.out.println("Enter the choice :");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				addOrderMain();
				break;
			case 2:
				showOrderMain();;
				break;
			case 3:
				updateOrderMain();;
				break;
			case 4:
				deleteOrderMain();
				break;
			case 5:
				searchOrderdMain();
				break;
			case 6:
				searchCustIdMain();
				break;
			case 7:
				calCulateBillMain();
			     break;
			case 8:
				System.out.println("Thank You For Using THANK YOU!");
				return ;
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		}while(choice!=6);
	}
	public static void showOrderMain() {
		List<OrderDetails>orders = omsValid.OrderValid();
		for(OrderDetails od:orders) {
			System.out.println(od);
		}
	}
	public static void searchCustIdMain() {
		int custId;
		System.out.println("enter the custId");
		custId=sc.nextInt();
		OrderDetails orderFound=omsValid.searchByOrderVal(custId);
		if(orderFound!=null) {
			System.out.println(orderFound);
		}
		else {
			System.out.println("order not found");
		}
	}
	public static void searchOrderdMain() {
		int orderId;
		System.out.println("enter the order");
		orderId=sc.nextInt();
		OrderDetails orderFound=omsValid.searchByOrderVal(orderId);
		if(orderFound!=null) {
			System.out.println(orderFound);
		}
		else {
			System.out.println("order not found");
		}
	}
	public static void deleteOrderMain() {
		int orderNo;
		System.out.println("Enter the orderNo");
		orderNo=sc.nextInt();
		System.out.println(omsValid.deleteOrderVal(orderNo));
	}
	public static void updateOrderMain() {
		System.out.println("Future implimentation");
	}

	public static void addOrderMain() {	
		    OrderDetails od = new OrderDetails();
		    System.out.println("Enter Customer ID: ");
		    od.setCustomId(sc.nextInt());
		    System.out.println("===food options======");
		    System.out.println("Id, FoodName         price");
		    System.out.println("1.Veg Biryani   100");
		    System.out.println("2.Chicken Biryani       100");
		    System.out.println("3.Masala Dose      50");
		    System.out.println("4.Rice+Chapati Combo        60");
		    System.out.println("===enter the id of choice===");

		    System.out.println("Enter Item no: ");
		    od.setItemId(sc.nextInt());

		    System.out.println("Enter Quantity Ordered No : ");
		    int qty = sc.nextInt();
		    od.setQuantityOrder(qty);

		    System.out.println("Enter Order Comments: ");
		    od.setOrderComments(sc.next());
//		    od.setOrderdate(new Date());; // sets current date
		    System.out.println(omsValid.addOrderValid(od));
 
		}
	public static void calCulateBillMain() {
		System.out.println("Enter order No");
		int orderNo=sc.nextInt();
		System.out.println(omsValid.calculateBillValid(orderNo));
	}
	
}
