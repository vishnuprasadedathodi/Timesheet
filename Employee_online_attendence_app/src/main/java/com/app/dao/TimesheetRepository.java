package com.app.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.modal.Timesheet;
@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface TimesheetRepository extends JpaRepository<Timesheet, Integer>{
	
	@Query(value="SELECT * FROM Timesheet WHERE Timesheet.id=:id",nativeQuery = true)
	public List<Timesheet> getdetail(@Param("id") int id);
	
	@Query(value="SELECT * FROM Timesheet t WHERE t.id=:id and t.status='saved' ",nativeQuery = true)
	public List<Timesheet> gettime(@Param("id") int id);
	
	@Query(value="SELECT * FROM Timesheet t WHERE  t.status='submitted' ",nativeQuery = true)
	public List<Timesheet> getsubmitted();
	
	@Query(value="SELECT * FROM Timesheet t where t.status='submitted' and date BETWEEN :date1 and :date2 ",nativeQuery=true)
	public List<Timesheet> customdate(@Param("date1") Date fdate,@Param ("date2") Date  tdate);

//	@Query(value="SELECT * FROM Timesheet t where t.date>=:date AND t.date<=:date ",nativeQuery=true)
//	public List<Timesheet> customdate(@Param("date") Date fdate,@Param ("date") Date  tdate);
	
	

}