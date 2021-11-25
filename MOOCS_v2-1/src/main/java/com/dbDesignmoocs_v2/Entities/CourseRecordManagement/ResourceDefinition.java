package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons;

@Entity
@Table(name="ResourceDefinition")
public class ResourceDefinition {

	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	private ResourcePersons resourcePerson;
	
	@ManyToOne
	@JoinColumn(name="resourceId")
	private LearningResources learningResource;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	private StudyCourses studycourse;
}
