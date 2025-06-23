package com.java.lms.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


import com.java.lms.bal.Lmsbal;
import com.java.lms.exception.LmsExeception;
import com.java.lms.model.LeaveStatus;
import com.java.lms.model.LeaveType;
import com.java.lms.model.Model;


public class MainLMS {
	
		static Scanner sc;
		static Lmsbal bal;
		
		static {
			sc = new Scanner(System.in);
			bal = new Lmsbal();
		}
		
		public static void main(String[] args) {
			int choice = 0;
			do {
				System.out.println("1. Add Leave");
				System.out.println("2. Show Leave");
				System.out.println("3. Search Leave");
				System.out.println("4. Update Leave");
				System.out.println("5. Delete Leave");
				System.out.println("6. Exit");
				System.out.println("Enter Your Choice  ");
				choice = sc.nextInt();
				switch(choice) {
				case 1 : 
					try {
						addLeavemain();
					} catch (LmsExeception e) {
						System.err.println(e.getMessage());
					}
					break;
				case 2 : 
					showleavemain();
					break;
				case 3 : 
					searchLeavemain();
					break;
				
				case 4 : 
					try {
						updateLeavemain();
					} catch (LmsExeception e) {
						System.err.println(e.getMessage());
					}
					break;
				case 5 : 
					deleteLeavemain();
					break;
				case 6 : 
					return;
				}
			} while(choice!=6);
				}
			
			public static void searchLeavemain() {
				int leaveid;
				System.out.println("Enter Leave id to search");
				leaveid =sc.nextInt();
				Model leavefound = bal.searchLmsbal(leaveid);
				if(leavefound != null) {
					System.out.println(leavefound);
				}else {
					System.out.println("Leave Record Not Found");
				}
		}
			public static void deleteLeavemain() {
			int leaveid;
			System.out.println("Enter The Leaveid To delete:  ");
			leaveid = sc.nextInt();
			System.out.println(bal.deleteLmsbal(leaveid));
		}
			public static void showleavemain() {
			List<Model> leavelist = bal.showLmsbal();
			for(Model c : leavelist) {
				System.out.println(c);	
		}
			}
			
			public static void updateLeavemain() throws LmsExeception {
				Model md = new Model();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				
				try {
					System.out.println("Enter leave startdate (yyyy-MM-dd)");
					String startDateStr = sc.next();
					Date startDate = sdf.parse(startDateStr);
					md.setLeaveStartDate(startDate);
					System.out.println("Enter leave enddate (yyyy-MM-dd)");
					String endDateStr = sc.next();
					Date endDate = sdf.parse(endDateStr);
					md.setLeaveEndDate(endDate);
				} catch (Exception e) {
					// TODO: handle exception
				}
				System.out.println("Enetr leave reason");
				md.setLeaveReason(sc.next());
				
				System.out.println("Enetr leave type (EL,PL,ML)");
				md.setLeaveType(LeaveType.valueOf(sc.next()));
				
				
				System.out.println(bal.updateLmsBal(md));
			}
			

		public static void addLeavemain() throws LmsExeception{
			
			Model md = new Model();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			System.out.println("Enetr leave Id");
			md.setLeaveId(sc.nextInt());
			
			System.out.println("Enetr emp Id");
			md.setEmpId(sc.nextInt());
			
			sc.nextLine();
			
			try {
				System.out.println("Enetr leave startdate (yyyy-MM-dd)");
				String startDateStr = sc.next();
				Date startDate = sdf.parse(startDateStr);
				md.setLeaveStartDate(startDate);
				
				System.out.println("Enetr leave enddate (yyyy-MM-dd)");
				String endDateStr = sc.next();
		        Date endDate = sdf.parse(endDateStr);
		        md.setLeaveEndDate(endDate);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
			
			sc.nextLine();
			
			System.out.println("Enter leave reason");
			md.setLeaveReason(sc.next());
			
			System.out.println("Enetr leave type (EL,PL,ML)");
			md.setLeaveType(LeaveType.valueOf(sc.next()));
			
			System.out.println("Enetr leave status (PENDING,ACCEPTED,REJECTED)");
			md.setLeaveStatus(LeaveStatus.valueOf(sc.next()));
			
			System.out.println(bal.addLmsBal(md));
		
		}
}
			
		

