package com.java.lms.bal;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.java.lms.dao.LmsDaoImpl;
import com.java.lms.dao.Lmsdao;
import com.java.lms.exception.LmsExeception;
import com.java.lms.model.Model;

public class Lmsbal {
	static Lmsdao ld;
	static StringBuilder sb;
	
	static {
		ld = new LmsDaoImpl();
		sb = new StringBuilder();
	}
	
	public Model searchLmsbal(int leaveId) {
		return ld.searchLmsdao(leaveId);
	}
	
	public List<Model> showLmsbal(){
		return ld.showleavedetails();
	}
	public String deleteLmsbal(int ModId) {
		return ld.deleteLmsdao(ModId);
	}
	
	public String updateLmsBal (Model mod) throws LmsExeception{
		if(validation(mod) == true)
		{
			return ld.updateLmsdao(mod);
		}
		throw new LmsExeception(sb.toString());
	}
	public String addLmsBal (Model mod) throws LmsExeception{
		if(validation(mod) == true)
		{
			return ld.addLmsdao(mod);
		}
		throw new LmsExeception(sb.toString());
	}
	public boolean validation(Model Mod) throws LmsExeception {
		
		boolean isValid =true;
		// Set time to midnight for both today's date and Mod dates to ignore time component
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        
        calendar.set(Calendar.MILLISECOND, 0);
        Date today = calendar.getTime();
        
        
        if (Mod.getLeaveStartDate().before(today)) {
            sb.append("Leave start date cannot be in the past\n");
            isValid = false;
        }
        
       
        if (Mod.getLeaveEndDate().before(today)) {
            sb.append("Leave end date cannot be in the past\n");
            isValid = false;
        }
        
        
        if (Mod.getLeaveStartDate().after(Mod.getLeaveEndDate())) {
            sb.append("Leave start date cannot be greater than Leave end date\n");
            isValid = false;
        }
        
        long diff = Mod.getLeaveEndDate().getTime() - Mod.getLeaveStartDate().getTime();
    	int noOfDays = (int)(diff/(1000 * 60 * 60 * 24))+1;
    	Mod.setNoOfDays(noOfDays);
    
        
        return isValid;
 
	}
}

