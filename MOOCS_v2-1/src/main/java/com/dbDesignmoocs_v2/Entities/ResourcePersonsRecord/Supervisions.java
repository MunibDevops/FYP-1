package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Supervisions")
public class Supervisions {
	
	private String supervisedCourses;


	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;
}
