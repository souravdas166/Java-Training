package com.java.lms.dao;

import java.util.ArrayList;
import java.util.List;

import com.java.lms.model.Model;

public class LmsDaoImpl implements Lmsdao {
	static List<Model> leavelist;
	
	static {
		leavelist = new ArrayList<Model>();
	}

	@Override
	public String addLmsdao(Model mod) {
		leavelist.add(mod);
		
		return "Leave Added Sussesfully";
	}

	@Override
	public Model searchLmsdao(int leaveId) {
		Model leavefound = null;
		for(Model mod : showleavedetails()) {
			if(mod.getLeaveId() == leaveId) {
				leavefound = mod;
				break;
			}
		}
		return null;
	}

	@Override
	public String deleteLmsdao(int leaveId) {
		Model leavefound = searchLmsdao(leaveId);
		if(leavefound != null) {
			showleavedetails().remove(leavefound);
			return "Leave is sussesfully Deleted";
		}
		return "Leave Not Found";
	}

	@Override
	public String updateLmsdao(Model modup) {
		Model leavefound = searchLmsdao(modup.getLeaveId());
		if (leavefound !=null) {
			leavefound.setLeaveId(modup.getLeaveId());
			leavefound.setLeaveStartDate(modup.getLeaveStartDate());
			leavefound.setLeaveEndDate(modup.getLeaveEndDate());
			leavefound.setLeaveType(modup.getLeaveType());
			leavefound.setLeaveReason(modup.getLeaveReason());
			leavefound.setLeaveStatus(modup.getLeaveStatus());
			leavefound.setNoOfDays(modup.getNoOfDays());
			return "Leave Record Updated...";
		}
		return "Leave Record Not Found...";
	}
		

	@Override
	public List<Model> showleavedetails() {
		// TODO Auto-generated method stub
		return leavelist;
	}
}
