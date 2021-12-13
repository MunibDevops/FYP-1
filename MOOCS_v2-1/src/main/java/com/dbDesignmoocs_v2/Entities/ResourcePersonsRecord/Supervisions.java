package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Supervisions")
public class Supervisions {
	
	@Column(nullable = true)
	private String supervisedCourses;


	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;
}
