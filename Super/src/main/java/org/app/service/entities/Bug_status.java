package org.app.service.entities;

import javax.persistence.*;

@Entity
public class Bug_status {
	
	@Id
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer bug_status_id;
	
	@Column(name="status")
private String status;
	
	@Column(name="description")
private String description;

	public Integer getBug_status_id() {
		return bug_status_id;
	}

	public void setBug_status_id(Integer bug_status_id) {
		this.bug_status_id = bug_status_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Bug_status(Integer bug_status_id, String status, String description) {
		super();
		this.bug_status_id = bug_status_id;
		this.status = status;
		this.description = description;
	}

	public Bug_status() {
		super();
	}
	
	

}
