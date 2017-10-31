package org.app.service.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Project_user extends Employees{
	
	@Column(name="user_id")
private Integer user_id;
	
	@Column(name="project_id")
private Project project_id;

//Maparea legaturii dintre Bug si Project_user
@OneToMany
@JoinColumn(name="user_id", referencedColumnName="user_id")
private List<Bug> buglist;

//Maparea legaturii M-to-M dintre clasele Project_user si Bug prin intermediul clasei Project_user_Bug
@ManyToMany(cascade= {CascadeType.ALL})
@JoinTable(
		name="Project_user_Bug",
		joinColumns={@JoinColumn(name="user_id")},
		inverseJoinColumns={@JoinColumn(name="bug_id")}
		)
Set<Bug>project_bug=new HashSet<>();



public Integer getUser_id() {
	return user_id;
}

public void setUser_id(Integer user_id) {
	this.user_id = user_id;
}

public Project getProject_id() {
	return project_id;
}

public void setProject_id(Project project_id) {
	this.project_id = project_id;
}

public List<Bug> getBuglist() {
	return buglist;
}

public void setBuglist(List<Bug> buglist) {
	this.buglist = buglist;
}

public Set<Bug> getProject_bug() {
	return project_bug;
}

public void setProject_bug(Set<Bug> project_bug) {
	this.project_bug = project_bug;
}

public Project_user() {
	super();
	// TODO Auto-generated constructor stub
}

public Project_user(Integer employee_id, Set<Assign> employeeid, String employee_name, String employee_email) {
	super(employee_id, employeeid, employee_name, employee_email);
	// TODO Auto-generated constructor stub
}

public Project_user(Integer employee_id, Set<Assign> employeeid, String employee_name, String employee_email,
		Integer user_id, Project project_id, List<Bug> buglist, Set<Bug> project_bug) {
	super(employee_id, employeeid, employee_name, employee_email);
	this.user_id = user_id;
	this.project_id = project_id;
	this.buglist = buglist;
	this.project_bug = project_bug;
}





}
