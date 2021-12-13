package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Skills")
public class Skills {
	
	@Column(nullable = true)
	private String skillName;
	@Column(nullable = true)
	private String skillType;
	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;
	

}
