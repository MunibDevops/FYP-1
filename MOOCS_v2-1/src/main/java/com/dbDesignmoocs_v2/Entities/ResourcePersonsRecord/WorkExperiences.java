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
@Table(name="WorkExperiences")
public class WorkExperiences {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long experienceID;
	
	@Column(nullable = true)
	private long experienceDuration;
	@Column(nullable = true)
	private String experienceInstitute;
	
	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons ResourcePersons;


	public WorkExperiences() {
		super();
		// TODO Auto-generated constructor stub
	}


	public WorkExperiences(long experienceDuration, String experienceInstitute, ResourcePersons ResourcePersons) {
		super();
		this.experienceDuration = experienceDuration;
		this.experienceInstitute = experienceInstitute;
		this.ResourcePersons = ResourcePersons;
	}


	public long getExperienceDuration() {
		return experienceDuration;
	}


	public void setExperienceDuration(long experienceDuration) {
		this.experienceDuration = experienceDuration;
	}


	public String getExperienceInstitute() {
		return experienceInstitute;
	}


	public void setExperienceInstitute(String experienceInstitute) {
		this.experienceInstitute = experienceInstitute;
	}


	public ResourcePersons getResPers() {
		return ResourcePersons;
	}


	public void setResPers(ResourcePersons ResourcePersons) {
		this.ResourcePersons = ResourcePersons;
	}


	@Override
	public String toString() {
		return "WorkExperiences [experienceDuration=" + experienceDuration + ", experienceInstitute="
				+ experienceInstitute + ", resPers=" + ResourcePersons + "]";
	}

	
}
