package com.app.service;

import java.util.List;


import com.app.modal.Leave;
import com.app.modal.Timesheet;



public interface LeaveService {
	
	public List<Leave> findAll();
	public Leave findById(int tId);
	public void save(Leave theLeave);
	
	public List<Leave> getleavedetail(int id);
	
	public List<Leave> getleavesubmitted();

}
