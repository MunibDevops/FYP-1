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
	ResourcePersons ResourcePersons;

	public ProfessionalLearnings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessionalLearnings(long professionalCourseId, String proferssionalCourseTitle, ResourcePersons ResourcePersons) {
		super();
		this.professionalCourseId = professionalCourseId;
		this.proferssionalCourseTitle = proferssionalCourseTitle;
		this.ResourcePersons = ResourcePersons;
	}

	public long getProfessionalCourseId() {
		return professionalCourseId;
	}

	public void setProfessionalCourseId(long professionalCourseId) {
		this.professionalCourseId = professionalCourseId;
	}

	public String getProferssionalCourseTitle() {
		return proferssionalCourseTitle;
	}

	public void setProferssionalCourseTitle(String proferssionalCourseTitle) {
		this.proferssionalCourseTitle = proferssionalCourseTitle;
	}

	public ResourcePersons getResPers() {
		return ResourcePersons;
	}

	public void setResPers(ResourcePersons ResourcePersons) {
		this.ResourcePersons = ResourcePersons;
	}

	@Override
	public String toString() {
		return "ProfessionalLearnings [professionalCourseId=" + professionalCourseId + ", proferssionalCourseTitle="
				+ proferssionalCourseTitle + ", resPers=" + ResourcePersons + "]";
	}

	
	
	
}