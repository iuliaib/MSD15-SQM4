package org.app.service.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Environment")
public class Environment {
	
	@Id
	@Column(name="environment_id")
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer environment_id;
	
private String name;
	
private String version;

//Maparea legaturii M-to-M dintre clasele Environment si Bug prin intermediul clasei Environment_Bug
@ManyToMany(cascade= {CascadeType.ALL})
@JoinTable(
		name="Environment_Bug",
		joinColumns={@JoinColumn(name="environment_id")},
		inverseJoinColumns={@JoinColumn(name="bug_id")}
		)
Set<Bug>bugs=new HashSet<>();

public Integer getEnvironment_id() {
	return environment_id;
}

public void setEnvironment_id(Integer environment_id) {
	this.environment_id = environment_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getVersion() {
	return version;
}

public void setVersion(String version) {
	this.version = version;
}

public Set<Bug> getBugs() {
	return bugs;
}

public void setBugs(Set<Bug> bugs) {
	this.bugs = bugs;
}

public Environment(Integer environment_id, String name, String version, Set<Bug> bugs) {
	super();
	this.environment_id = environment_id;
	this.name = name;
	this.version = version;
	this.bugs = bugs;
}

public Environment() {
	super();
}

}
