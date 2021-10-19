package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.app.modal.Leave;


@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface LeaveRepository extends JpaRepository<Leave, Integer>{
	
	@Query(value="SELECT * FROM emp_leave l WHERE l.id=:id",nativeQuery = true)
	public List<Leave> getleavedetail(@Param("id") int id);
	
	@Query(value="SELECT * FROM emp_leave l WHERE l.status='submitted' ",nativeQuery = true)
	public List<Leave> getleavesubmitted();
	
	

}
