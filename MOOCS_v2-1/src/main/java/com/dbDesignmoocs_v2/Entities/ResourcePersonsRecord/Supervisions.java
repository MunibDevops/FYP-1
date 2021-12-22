package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Supervisions")
public class Supervisions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long supervisionID;
	
	
	@Column(nullable = true)
	private String supervisedCourses;


	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons ResourcePersons;


	public Supervisions() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Supervisions(long supervisionID, String supervisedCourses,
			com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons resourcePersons) {
		super();
		this.supervisionID = supervisionID;
		this.supervisedCourses = supervisedCourses;
		ResourcePersons = resourcePersons;
	}

	



	public long getSupervisionID() {
		return supervisionID;
	}



	public void setSupervisionID(long supervisionID) {
		this.supervisionID = supervisionID;
	}



	public String getSupervisedCourses() {
		return supervisedCourses;
	}



	public void setSupervisedCourses(String supervisedCourses) {
		this.supervisedCourses = supervisedCourses;
	}



	public ResourcePersons getResourcePersons() {
		return ResourcePersons;
	}



	public void setResourcePersons(ResourcePersons resourcePersons) {
		ResourcePersons = resourcePersons;
	}



	@Override
	public String toString() {
		return "Supervisions [supervisedCourses=" + supervisedCourses + ", resPers=" + ResourcePersons + "]";
	}
	
	
}
