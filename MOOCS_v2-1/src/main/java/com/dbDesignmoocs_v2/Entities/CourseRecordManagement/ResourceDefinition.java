package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons;

@Entity
@Table(name="ResourceDefinition")
public class ResourceDefinition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long resourceDefinitionID;
	
	@Column(nullable=true)
	private Date defdate;
	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	private ResourcePersons resourcePersons;
	
	@ManyToOne
	@JoinColumn(name="resourceId")
	private LearningResources learningResource;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	private StudyCourses studycourse;

	public ResourceDefinition() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceDefinition(Date defdate, ResourcePersons resourcePersons, LearningResources learningResource,
			StudyCourses studycourse) {
		super();
		this.defdate = defdate;
		this.resourcePersons = resourcePersons;
		this.learningResource = learningResource;
		this.studycourse = studycourse;
	}

	public Date getDefdate() {
		return defdate;
	}

	public void setDefdate(Date defdate) {
		this.defdate = defdate;
	}

	public ResourcePersons getResourcePerson() {
		return resourcePersons;
	}

	public void setResourcePerson(ResourcePersons resourcePersons) {
		this.resourcePersons = resourcePersons;
	}

	public LearningResources getLearningResource() {
		return learningResource;
	}

	public void setLearningResource(LearningResources learningResource) {
		this.learningResource = learningResource;
	}

	public StudyCourses getStudycourse() {
		return studycourse;
	}

	public void setStudycourse(StudyCourses studycourse) {
		this.studycourse = studycourse;
	}

	@Override
	public String toString() {
		return "ResourceDefinition [defdate=" + defdate + ", resourcePerson=" + resourcePersons + ", learningResource="
				+ learningResource + ", studycourse=" + studycourse + "]";
	}

	
	
	
	
}
