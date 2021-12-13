package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ProfessionalLearnings")
public class ProfessionalLearnings {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long professionalCourseId;
	@Column(nullable = true)
	private String proferssionalCourseTitle;
	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;

}