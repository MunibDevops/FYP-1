package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AcademicQualifications")
public class AcademicQualifications {
	
	private String degree;
	private String field;
	private String institute;

	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;
}
