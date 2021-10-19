package com.app.modal;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_leave")
public class Leave {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="lid")
	private int lid;
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="date")
	private Date date;
	@Column(name="days")
	private int days;
	@Column(name="leave_type")
	
	private String leave_type;
	@Column(name="status")
	private String status;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Leave(int lid, int id, String name, Date date, int days, String leave_type, String status) {
		super();
		this.lid = lid;
		this.id = id;
		this.name = name;
		this.date = date;
		this.days = days;
		this.leave_type = leave_type;
		this.status = status;
	}
	public Leave() {
		super();
	}
	@Override
	public String toString() {
		return "Leave [lid=" + lid + ", id=" + id + ", name=" + name + ", date=" + date + ", days=" + days
				+ ", leave_type=" + leave_type + ", status=" + status + "]";
	}
	
	
	
	

	
	
}
