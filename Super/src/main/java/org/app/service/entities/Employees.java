package org.app.service.entities;

import java.util.*;

import javax.persistence.*;

@Entity
public class Employees {
	
	@Id
	@Column(name="employee_id")
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer employee_id;
	
	//Maparea legaturii dintre clasele Employees si Assign
	@OneToMany(mappedBy="employee_id")
	private Set<Assign> employeeid;
		
private String employee_name;

private String employee_email;

public Integer getEmployee_id() {
	return employee_id;
}

public void setEmployee_id(Integer employee_id) {
	this.employee_id = employee_id;
}

public Set<Assign> getEmployeeid() {
	return employeeid;
}

public void setEmployeeid(Set<Assign> employeeid) {
	this.employeeid = employeeid;
}

public String getEmployee_name() {
	return employee_name;
}

public void setEmployee_name(String employee_name) {
	this.employee_name = employee_name;
}

public String getEmployee_email() {
	return employee_email;
}

public void setEmployee_email(String employee_email) {
	this.employee_email = employee_email;
}

public Employees(Integer employee_id, Set<Assign> employeeid, String employee_name, String employee_email) {
	super();
	this.employee_id = employee_id;
	this.employeeid = employeeid;
	this.employee_name = employee_name;
	this.employee_email = employee_email;
}

public Employees() {
	super();
}


}
