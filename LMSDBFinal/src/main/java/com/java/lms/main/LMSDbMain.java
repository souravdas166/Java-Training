package com.java.lms.main;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.java.lms.dao.EmployDao;
import com.java.lms.dao.EmployDaoImpl;
import com.java.lms.dao.LeaveDao;
import com.java.lms.dao.LeaveDaoImpl;
import com.java.lms.model.Employ;
import com.java.lms.model.Leave;
import com.java.lms.model.LeaveType;
import com.java.lms.model.Status;

public class LMSDbMain {
	static Scanner sc;
	
	
	static {
		sc = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
	    int choice;
	    do {
	        System.out.println("\nWelcome to Leave Management System:");
	        System.out.println("Enter The option for your choice:");
	        System.out.println("Enter 1 to Search Employ:");
	        System.out.println("Enter 2 to Display All Emp Record:");
	        System.out.println("Enter 3 to Apply Leave:");
	        System.out.println("Enter 4 to Search Leave By EmpID:");
	        System.out.println("Enter 5 Manager Need To Search:");
	        System.out.println("Enter 6 for Manager Approval:");
	        System.out.println("Enter 0 to Exit:");

	        choice = sc.nextInt();
	        try {
	            switch (choice) {
	                case 1:
	                    searchEmpMain();
	                    break;
	                case 2:
	                    showEmpMain();
	                    break;
	                case 3:
	                    applyLeaveMain();
	                    break;
	                case 4:
	                    searchleaveMain();
	                    break;
	                case 5:
	                    searchmangerMain();
	                    break;
	                case 6:
	                    managerApprovalMain();
	                    break;
	                case 0:
	                    System.out.println("Exiting the system. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid Choice");
	            }
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        catch (SQLException e) {
	        	e.printStackTrace();
	        }
	    } while (choice != 0);
	}
		public static void managerApprovalMain() throws ClassNotFoundException, SQLException {
		System.out.println("Enter Leave Id");
		int leavid = sc.nextInt();
		
		System.out.println("Enter Manager Id");
		int managerid = sc.nextInt();
		
		System.out.println("Give Approval:");
		sc.nextLine();
		
		 System.out.println("Give Approval (APPROVED / DENIED):");
		    String approvalInput = sc.nextLine().trim().toUpperCase();

		    boolean isAccepted;
		    if (approvalInput.equals("APPROVED")) {
		        isAccepted = true;
		    } else if (approvalInput.equals("DENIED")) {
		        isAccepted = false;
		    } else {
		        System.out.println("Invalid approval status. Use APPROVED or DENIED.");
		        return;
		    }
		
		System.out.println("Enter Comment :");
		String comment = sc.nextLine();
		
		LeaveDao leave = new LeaveDaoImpl();
		
		String result = leave.manageLeaveDao(leavid, managerid, isAccepted, comment);
		System.out.println(result);
	}

		public static void searchmangerMain() throws ClassNotFoundException, SQLException {
		
		LeaveDao leave = new LeaveDaoImpl();
		System.out.println("Enter Manager ID");
		int Managerid = sc.nextInt();
		List<Leave> display = leave.showpendingLeave(Managerid);
		for(Leave c : display) {
			System.out.println(c);
		}
		
	}

		public static void searchleaveMain() throws ClassNotFoundException, SQLException {
			
			LeaveDao leave = new LeaveDaoImpl();
			System.out.println("Enter Emp Id ");
			int empId = sc.nextInt();
			List<Leave> display = leave.searchleavebyEmpID(empId);
			for(Leave c : display) {
				System.out.println(c);
			}
	}

		public static void applyLeaveMain() throws ClassNotFoundException, SQLException{
			    LeaveDao leaveDao = new LeaveDaoImpl();

			    System.out.print("Enter Employee ID: ");
			    int empId = sc.nextInt();
			    sc.nextLine(); 

			    System.out.print("Enter Start Date (yyyy-mm-dd): ");
			    String startDateStr = sc.nextLine();
			    Date startDate = Date.valueOf(startDateStr);

			    System.out.print("Enter End Date (yyyy-mm-dd): ");
			    String endDateStr = sc.nextLine();
			    Date endDate = Date.valueOf(endDateStr);

			    System.out.print("Enter Leave Type (EL/SL/ML/PL): ");
			    String typeStr = sc.nextLine();
			    LeaveType leaveType = LeaveType.valueOf(typeStr.toUpperCase());

			    System.out.print("Enter Leave Reason: ");
			    String reason = sc.nextLine();
			    
			    String result = leaveDao.applyLeave(empId, startDate, endDate, leaveType, reason);
			    System.out.println(result);
			

	}

		public static void showEmpMain() throws ClassNotFoundException, SQLException {
			EmployDao employDao = new EmployDaoImpl();
		List<Employ> empList = employDao.showEmp();
		for ( Employ emp : empList) {
			System.out.println(emp);
		}
	}

	public static void searchEmpMain() throws ClassNotFoundException, SQLException{
		int empid;
		EmployDao employDao = new EmployDaoImpl();
		System.out.println("Enter Emp Id To Search");
		empid = sc.nextInt();
		System.out.println(employDao.searchEmp(empid));
	}
}
