package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="RelatedCourses")
public class RelatedCourses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	@Column(nullable = true)
	private String courseName;
	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;

}
