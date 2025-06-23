package com.java.lms.dao;

import java.util.List;

import com.java.lms.model.Model;

public interface Lmsdao {
	List<Model> showleavedetails();
	String addLmsdao(Model mod);
	Model searchLmsdao(int leaveId);
	String deleteLmsdao(int leaveId);
	String updateLmsdao(Model modup);
	
}
