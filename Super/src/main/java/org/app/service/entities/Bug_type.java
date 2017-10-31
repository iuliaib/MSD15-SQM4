package org.app.service.entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Bug_type {
	@Id
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Bug bug_type_id;

	@Column(name="bug_name")
private Bug bug_name;
	
private Boolean bug_active;

//Mapare variabila "private Bug bug_name"
@OneToMany
@JoinColumn(name="bug_name", referencedColumnName="bug_name")
private List<Bug> bugname;

public Bug getBug_type_id() {
	return bug_type_id;
}

public void setBug_type_id(Bug bug_type_id) {
	this.bug_type_id = bug_type_id;
}

public Bug getBug_name() {
	return bug_name;
}

public void setBug_name(Bug bug_name) {
	this.bug_name = bug_name;
}

public Boolean getBug_active() {
	return bug_active;
}

public void setBug_active(Boolean bug_active) {
	this.bug_active = bug_active;
}

public List<Bug> getBugname() {
	return bugname;
}

public void setBugname(List<Bug> bugname) {
	this.bugname = bugname;
}

public Bug_type(Bug bug_type_id, Bug bug_name, Boolean bug_active, List<Bug> bugname) {
	super();
	this.bug_type_id = bug_type_id;
	this.bug_name = bug_name;
	this.bug_active = bug_active;
	this.bugname = bugname;
}

public Bug_type() {
	super();
}




}
