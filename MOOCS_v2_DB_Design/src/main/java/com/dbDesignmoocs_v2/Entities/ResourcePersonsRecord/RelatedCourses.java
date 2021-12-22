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
@Table(name="RelatedCourses")
public class RelatedCourses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	@Column(nullable = true)
	private String courseName;
	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons ResourcePersons;

	public RelatedCourses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RelatedCourses(long courseId, String courseName, ResourcePersons ResourcePersons) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.ResourcePersons = ResourcePersons;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ResourcePersons getResPers() {
		return ResourcePersons;
	}

	public void setResPers(ResourcePersons ResourcePersons) {
		this.ResourcePersons = ResourcePersons;
	}

	@Override
	public String toString() {
		return "RelatedCourses [courseId=" + courseId + ", courseName=" + courseName + ", resPers=" + ResourcePersons + "]";
	}

	
	
}
