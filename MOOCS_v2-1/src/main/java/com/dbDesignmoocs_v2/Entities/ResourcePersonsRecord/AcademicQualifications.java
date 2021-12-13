package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AcademicQualifications")
public class AcademicQualifications {
	
	@Column(nullable=true)
	private String degree;
	@Column(nullable=true)
	private String field;
	@Column(nullable=true)
	private String institute;

	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;
}
