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
@Table(name="Skills")
public class Skills {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long skillsID;
	
	@Column(nullable = true)
	private String skillName;
	@Column(nullable = true)
	private String skillType;
	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons ResourcePersons;

	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skills(String skillName, String skillType, ResourcePersons ResourcePersons) {
		super();
		this.skillName = skillName;
		this.skillType = skillType;
		this.ResourcePersons = ResourcePersons;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	public ResourcePersons getResPers() {
		return ResourcePersons;
	}

	public void setResPers(ResourcePersons ResourcePersons) {
		this.ResourcePersons = ResourcePersons;
	}

	@Override
	public String toString() {
		return "Skills [skillName=" + skillName + ", skillType=" + skillType + ", resPers=" + ResourcePersons + "]";
	}
	
	
}
