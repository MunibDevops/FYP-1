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
@Table(name="Achievements")
public class Achievements {
	

	public Achievements() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Achievements(long achievementId, String achievement, ResourcePersons ResourcePersons) {
		super();
		this.achievementId = achievementId;
		this.achievement = achievement;
		this.ResourcePersons = ResourcePersons;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long achievementId;
	@Column(nullable = true)
	private String achievement;
	
	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons ResourcePersons;


	public long getAchievementId() {
		return achievementId;
	}



	public void setAchievementId(long achievementId) {
		this.achievementId = achievementId;
	}



	public String getAchievement() {
		return achievement;
	}



	public void setAchievement(String achievement) {
		this.achievement = achievement;
	}



	public ResourcePersons getResPers() {
		return ResourcePersons;
	}



	public void setResPers(ResourcePersons ResourcePersons) {
		this.ResourcePersons = ResourcePersons;
	}



	@Override
	public String toString() {
		return "Achievements [achievementId=" + achievementId + ", achievement=" + achievement + ", resPers=" + ResourcePersons
				+ "]";
	}
	
	
	
}
