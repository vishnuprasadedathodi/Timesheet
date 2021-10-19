package com.app.service;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.app.modal.Timesheet;

public interface TimesheetService {
	
	public List<Timesheet> findAll();
	public void save(Timesheet theTimesheet);
	public Timesheet findById(int tId);
	public List<Timesheet> getdetail(int id);
	public List<Timesheet> gettime( int id);
	public List<Timesheet> getsubmitted();
	public List<Timesheet> customdate(Date fdate,Date tdate);

}
