package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Achievements")
public class Achievements {
	
	private long achievementId;
	private String achievement;
	
	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;
	
}
