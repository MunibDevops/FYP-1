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
@Table(name="ProfessionalReferences")
public class ProfessionalReferences {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long referenceId;
	@Column(nullable = true)
	private String referenceLink;
	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;

}
