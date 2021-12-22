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
@Table(name="AcademicQualifications")
public class AcademicQualifications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long qualificationsID;
	
	
	@Column(nullable=true)
	private String degree;
	@Column(nullable=true)
	private String field;
	@Column(nullable=true)
	private String institute;

	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons ResourcePersons;


	public AcademicQualifications() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AcademicQualifications(long qualificationsID, String degree, String field, String institute,
			com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons resourcePersons) {
		super();
		this.qualificationsID = qualificationsID;
		this.degree = degree;
		this.field = field;
		this.institute = institute;
		ResourcePersons = resourcePersons;
	}


	public long getQualificationsID() {
		return qualificationsID;
	}


	public void setQualificationsID(long qualificationsID) {
		this.qualificationsID = qualificationsID;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getField() {
		return field;
	}


	public void setField(String field) {
		this.field = field;
	}


	public String getInstitute() {
		return institute;
	}


	public void setInstitute(String institute) {
		this.institute = institute;
	}


	public ResourcePersons getResourcePersons() {
		return ResourcePersons;
	}


	public void setResourcePersons(ResourcePersons resourcePersons) {
		ResourcePersons = resourcePersons;
	}


	@Override
	public String toString() {
		return "AcademicQualifications [qualificationsID=" + qualificationsID + ", degree=" + degree + ", field="
				+ field + ", institute=" + institute + ", ResourcePersons=" + ResourcePersons + "]";
	}
	
	
}
