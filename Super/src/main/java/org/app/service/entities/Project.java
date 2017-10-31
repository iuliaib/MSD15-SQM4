package org.app.service.entities;

import java.util.List;

import javax.persistence.*;

@Entity
public class Project {
	
	@Id
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer project_id;
	
private String project_name;
	
private String project_description;
	
//Maparea legaturii dintre clasele Project si Bug
	@OneToMany
	@JoinColumn(name="project_id", referencedColumnName="project_id")
	private List<Bug>bugproject;

	public Integer getProject_id() {
		return project_id;
	}

	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_description() {
		return project_description;
	}

	public void setProject_description(String project_description) {
		this.project_description = project_description;
	}

	public List<Bug> getBugproject() {
		return bugproject;
	}

	public void setBugproject(List<Bug> bugproject) {
		this.bugproject = bugproject;
	}

	public Project(Integer project_id, String project_name, String project_description, List<Bug> bugproject) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_description = project_description;
		this.bugproject = bugproject;
	}

	public Project() {
		super();
	}
	
	
	
	
}
