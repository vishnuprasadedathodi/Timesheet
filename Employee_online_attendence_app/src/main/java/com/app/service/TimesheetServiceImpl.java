package com.app.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.dao.TimesheetRepository;

import com.app.modal.Timesheet;
@Service
public class TimesheetServiceImpl implements TimesheetService{

	private TimesheetRepository timerepository;
	
	public  TimesheetServiceImpl(TimesheetRepository timerepository) {
		super();
		this.timerepository=timerepository;
		
	}
	
	@Override
	public List<Timesheet> findAll() {
		// TODO Auto-generated method stub
		return timerepository.findAll();
	}

	@Override
	public void save(Timesheet theTimesheet) {
		// TODO Auto-generated method stub
		timerepository.save(theTimesheet);
	}

	@Override
	public Timesheet findById(int tId) {
		// TODO Auto-generated method stub
		
		Optional<Timesheet> t=timerepository.findById(tId);
		return t.get();
	}

	@Override
	public List<Timesheet> getdetail(int id) {
		// TODO Auto-generated method stub
		
		return timerepository.getdetail(id);
	}

	@Override
	public List<Timesheet> gettime(int id) {
		// TODO Auto-generated method stub
		return timerepository.gettime(id);
	}

	@Override
	public List<Timesheet> getsubmitted() {
		// TODO Auto-generated method stub
		return timerepository.getsubmitted();
	}

	@Override
	public List<Timesheet> customdate(Date fdate, Date tdate) {
		// TODO Auto-generated method stub
		return timerepository.customdate(fdate, tdate);
	}

}
