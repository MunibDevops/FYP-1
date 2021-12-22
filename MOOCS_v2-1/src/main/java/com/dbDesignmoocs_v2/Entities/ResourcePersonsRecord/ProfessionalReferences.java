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
@Table(name="ProfessionalReferences")
public class ProfessionalReferences {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long referenceId;
	@Column(nullable = true)
	private String referenceLink;
	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons ResourcePersons;

	public ProfessionalReferences() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessionalReferences(long referenceId, String referenceLink,
			com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons resourcePersons) {
		super();
		this.referenceId = referenceId;
		this.referenceLink = referenceLink;
		ResourcePersons = resourcePersons;
	}

	public long getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(long referenceId) {
		this.referenceId = referenceId;
	}

	public String getReferenceLink() {
		return referenceLink;
	}

	public void setReferenceLink(String referenceLink) {
		this.referenceLink = referenceLink;
	}

	public ResourcePersons getResourcePersons() {
		return ResourcePersons;
	}

	public void setResourcePersons(ResourcePersons resourcePersons) {
		ResourcePersons = resourcePersons;
	}

	
	
	
}
