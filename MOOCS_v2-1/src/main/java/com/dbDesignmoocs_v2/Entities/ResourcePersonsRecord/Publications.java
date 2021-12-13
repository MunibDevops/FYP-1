package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Publications")
public class Publications {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long publicationId;
	@Column(nullable = true)

	private String publicationName;
	@Column(nullable = true)

	private String publicaitonType;
	@Column(nullable = true)

	private Date publicationDate;
	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;

}
