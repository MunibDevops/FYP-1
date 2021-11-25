package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Publications")
public class Publications {
	
	private long publicationId;
	private String publicationName;
	private String publicaitonType;
	private Date publicationDate;
	
	@OneToMany
	@JoinColumn(name="resourcePersonId")
	ResourcePersons resPers;

}
