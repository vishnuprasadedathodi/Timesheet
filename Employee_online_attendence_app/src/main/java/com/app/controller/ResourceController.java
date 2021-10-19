package com.app.controller;

import java.sql.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.modal.Admin;
import com.app.modal.Employee;
import com.app.modal.Leave;
import com.app.modal.Timesheet;
import com.app.service.EmployeeServiceImpl;
import com.app.service.LeaveServiceImpl;
import com.app.service.ServiceImpl;
import com.app.service.TimesheetServiceImpl;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ResourceController {
	
	private ServiceImpl serviceimpl;
	
	private EmployeeServiceImpl employeeserviceimpl;
	
	private TimesheetServiceImpl timeserviceimpl;
	
	private LeaveServiceImpl leaveserviceimpl;
	
	@Autowired
	public ResourceController(ServiceImpl serviceimpl,EmployeeServiceImpl employeeserviceimpl,TimesheetServiceImpl timeserviceimpl,LeaveServiceImpl leaveserviceimpl) {
		super();
		this.serviceimpl=serviceimpl;
		this.employeeserviceimpl=employeeserviceimpl;
		this.timeserviceimpl=timeserviceimpl;
		this.leaveserviceimpl=leaveserviceimpl;
	}
	

	
	@GetMapping("/admin")
	public List<Admin> findAll(){

		return serviceimpl.findAll();
	}
	
	@GetMapping("/employee")
	public List<Employee> findAllEmployee(){
		return employeeserviceimpl.findAll();
	}
	
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee theEmployee) 
	{
		theEmployee.setId(0);
		employeeserviceimpl.save(theEmployee);
		return theEmployee;
		
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee theEmployee) {
		employeeserviceimpl.save(theEmployee);
		return theEmployee;
		
	}
	
	@GetMapping("/employee/{employeeId}")
	public Employee searchEmployee(@PathVariable int employeeId) {
		
		Employee theEmployee =employeeserviceimpl.findById(employeeId);
		System.out.println(theEmployee);
		return theEmployee;
		
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId)
	{
		System.out.println("inside delete");
		Employee theEmployee=employeeserviceimpl.findById(employeeId);
		if(theEmployee==null)
		{
			throw new RuntimeException("employee id not found"+employeeId);
			
		}
		employeeserviceimpl.deleteById(employeeId);
		return "Deleted Employee Id="+employeeId;	
		}
	
	@GetMapping("/timesheet")
	public List<Timesheet> findAllTime()
	{
		return timeserviceimpl.findAll();
		
	}
	
	@PostMapping("/timeadd")
	public Timesheet add(@RequestBody Timesheet theTimesheet) {
		
		timeserviceimpl.save(theTimesheet);
		return theTimesheet;
		
	}
	
	@GetMapping("/time/{tId}")
	public Timesheet searchEmpTime(@PathVariable int tId) {
		System.out.println("inside single time");
		Timesheet theTimesheet =timeserviceimpl.findById(tId);
		System.out.println(theTimesheet);
		return theTimesheet;
		
	}
	
	@GetMapping("/timesheet/{employeeId}")
	public List<Timesheet> getdetail(@PathVariable int employeeId) {
		
		List<Timesheet> t=timeserviceimpl.getdetail(employeeId);
		System.out.println(t);
		return t;
		
	}
	
	@GetMapping("/timeedit/{employeeId}")
	public List<Timesheet> editTime(@PathVariable int employeeId) {
		
		List<Timesheet> t=timeserviceimpl.gettime(employeeId);
		System.out.println(t);
		return t;
		
	}
	
	@PutMapping("/timeupdate")
	public Timesheet update(@RequestBody Timesheet theTimesheet) {
		
		
		timeserviceimpl.save(theTimesheet);
		return theTimesheet;
		
	}
	
	@GetMapping("/leave")
	public List<Leave> getleavedetail()
	{
		return leaveserviceimpl.findAll();
		
	}
	
	@PostMapping("/addleave")
	public Leave addleave(@RequestBody Leave theLeave)
	{
		leaveserviceimpl.save(theLeave);
		return theLeave;
		
	}
	
	@GetMapping("/leavedetail/{employeeId}")
	public List<Leave> getleavedetail(@PathVariable int employeeId) {
		System.out.println("getleavedetail");
		List<Leave> l=leaveserviceimpl.getleavedetail(employeeId);
		System.out.println(l);
		return l;
		
	}
	
	@GetMapping("/timesubmit")
	public List<Timesheet> gettimesubmit()
	{
		return timeserviceimpl.getsubmitted();
		
	}
	
	@PutMapping("/updateleave")
	public Leave updateleave(@RequestBody Leave theLeave)
	{
		leaveserviceimpl.save(theLeave);
		return theLeave;
		
	}
	
	@GetMapping("/leavesubmit")
	public List<Leave> getleavesubmit()
	{
		return leaveserviceimpl.getleavesubmitted();
		
	}
	
	@GetMapping("/leave/{lId}")
	public Leave singleleave(@PathVariable int lId) {
		System.out.println("inside single");
		Leave theLeave =leaveserviceimpl.findById(lId);
		System.out.println(theLeave);
		return theLeave;
		
	}
	
	@GetMapping("/custom/{fdate}/{tdate}")
	public List<Timesheet> customTime(@PathVariable Date fdate,@PathVariable Date tdate ) {
		
		List<Timesheet> t=timeserviceimpl.customdate(fdate, tdate);
		System.out.println(t);
		return t;
		
	}
	

	
	

}
