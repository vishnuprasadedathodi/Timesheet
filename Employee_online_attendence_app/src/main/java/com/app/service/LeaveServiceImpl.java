package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.LeaveRepository;
import com.app.modal.Leave;
import com.app.modal.Timesheet;

@Service
public class LeaveServiceImpl implements LeaveService{

	private LeaveRepository leaverepository;
	
	@Autowired
	public LeaveServiceImpl( LeaveRepository leaverepository) {
	super();
	this.leaverepository=leaverepository;
	}
	
	@Override
	public List<Leave> findAll() {
		// TODO Auto-generated method stub
		return leaverepository.findAll();
	}

	@Override
	public void save(Leave theLeave) {
		// TODO Auto-generated method stub
		leaverepository.save(theLeave);
	}

	@Override
	public List<Leave> getleavedetail(int id) {
		// TODO Auto-generated method stub
		return leaverepository.getleavedetail(id);
	}

	@Override
	public List<Leave> getleavesubmitted() {
		// TODO Auto-generated method stub
		return leaverepository.getleavesubmitted();
	}

	@Override
	public Leave findById(int lId) {
		// TODO Auto-generated method stub
		Optional<Leave> l=leaverepository.findById(lId);
		return l.get();
	}

}
