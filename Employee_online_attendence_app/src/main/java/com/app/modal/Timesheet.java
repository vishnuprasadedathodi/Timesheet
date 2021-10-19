package com.app.modal;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timesheet")
public class Timesheet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tid")
	private int tid;
	
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="date")
	private Date date;
	@Column(name="start_time")
	private Time start_time;
	@Column(name="end_time")
	private Time end_time;
	@Column(name="status")
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public Time getStart_time() {
		return start_time;
	}
	public void setStart_time(Time start_time) {
		this.start_time = start_time;
	}
	public Time getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Time end_time) {
		this.end_time = end_time;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}

	public Timesheet(int tid, int id, String name, Date date, Time start_time, Time end_time, String status) {
		super();
		this.tid = tid;
		this.id = id;
		this.name = name;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Timesheet [tid=" + tid + ", id=" + id + ", name=" + name + ", date=" + date + ", start_time="
				+ start_time + ", end_time=" + end_time + ", status=" + status + "]";
	}
	public Timesheet() {
		super();
	}
	
	
	

}
