package org.app.service.entities;

import javax.persistence.*;

@Entity
public class Priority {
	
	@Id
	@GeneratedValue //valoarea id-ului va fi incremetata automat
private String priority;
	
private String description;

public String getPriority() {
	return priority;
}

public void setPriority(String priority) {
	this.priority = priority;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Priority(String priority, String description) {
	super();
	this.priority = priority;
	this.description = description;
}

public Priority() {
	super();
}


}
