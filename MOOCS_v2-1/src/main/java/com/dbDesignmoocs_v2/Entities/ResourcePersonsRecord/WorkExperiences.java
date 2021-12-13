package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="WorkExperiences")
public class WorkExperiences {
	@Column(nullable = true)
	private long experienceDuration;
	@Column(nullable = true)
	private String experienceInstitute;
	
	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;

}
