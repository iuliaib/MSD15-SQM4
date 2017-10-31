package org.app.service.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;


@Entity
public class Assign {
	@Id
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer assign_id;

@ManyToOne
private Employees employee_id;

@Column(name="bug_status")
private Bug_status bug_status;

private Date actual_finish_date;

private Date estimated_finish_date;

//Mapare variabila "private Bug_status bug_status"
@OneToMany
@JoinColumn(name="status", referencedColumnName="bug_status")
private List<Bug_status> bugstatus;


//Getters and Setters

public Integer getAssign_id() {
	return assign_id;
}

public void setAssign_id(Integer assign_id) {
	this.assign_id = assign_id;
}

public Employees getEmployee_id() {
	return employee_id;
}

public void setEmployee_id(Employees employee_id) {
	this.employee_id = employee_id;
}

public Bug_status getBug_status() {
	return bug_status;
}

public void setBug_status(Bug_status bug_status) {
	this.bug_status = bug_status;
}

public Date getActual_finish_date() {
	return actual_finish_date;
}

public void setActual_finish_date(Date actual_finish_date) {
	this.actual_finish_date = actual_finish_date;
}

public Date getEstimated_finish_date() {
	return estimated_finish_date;
}

public void setEstimated_finish_date(Date estimated_finish_date) {
	this.estimated_finish_date = estimated_finish_date;
}

public List<Bug_status> getBugstatus() {
	return bugstatus;
}

public void setBugstatus(List<Bug_status> bugstatus) {
	this.bugstatus = bugstatus;
}

//Constructori cu si fara parametri
public Assign(Integer assign_id, Employees employee_id, Bug_status bug_status, Date actual_finish_date,
		Date estimated_finish_date, List<Bug_status> bugstatus) {
	super();
	this.assign_id = assign_id;
	this.employee_id = employee_id;
	this.bug_status = bug_status;
	this.actual_finish_date = actual_finish_date;
	this.estimated_finish_date = estimated_finish_date;
	this.bugstatus = bugstatus;
	
}

public Assign() {
	super();
}






}
