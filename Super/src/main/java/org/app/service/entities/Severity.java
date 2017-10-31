package org.app.service.entities;

import javax.persistence.*;

@Entity
public class Severity {
	
	@Id
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private Integer severity_id;
	
	@Column(name="severity")
private String severity;
	
	@Column(name="description")
private String description;

	public Integer getSeverity_id() {
		return severity_id;
	}

	public void setSeverity_id(Integer severity_id) {
		this.severity_id = severity_id;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Severity(Integer severity_id, String severity, String description) {
		super();
		this.severity_id = severity_id;
		this.severity = severity;
		this.description = description;
	}

	public Severity() {
		super();
	}
	
	
	
}
