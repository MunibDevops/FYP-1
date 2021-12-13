package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Achievements")
public class Achievements {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long achievementId;
	@Column(nullable = true)
	private String achievement;
	
	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;
	
}
