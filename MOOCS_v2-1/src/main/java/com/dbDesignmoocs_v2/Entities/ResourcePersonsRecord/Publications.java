package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne
	@JoinColumn(name="resourcePersonId")
	ResourcePersons ResourcePersons;

	public Publications() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publications(long publicationId, String publicationName, String publicaitonType, Date publicationDate,
			ResourcePersons ResourcePersons) {
		super();
		this.publicationId = publicationId;
		this.publicationName = publicationName;
		this.publicaitonType = publicaitonType;
		this.publicationDate = publicationDate;
		this.ResourcePersons = ResourcePersons;
	}

	public long getPublicationId() {
		return publicationId;
	}

	public void setPublicationId(long publicationId) {
		this.publicationId = publicationId;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	public String getPublicaitonType() {
		return publicaitonType;
	}

	public void setPublicaitonType(String publicaitonType) {
		this.publicaitonType = publicaitonType;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public ResourcePersons getResPers() {
		return ResourcePersons;
	}

	public void setResPers(ResourcePersons ResourcePersons) {
		this.ResourcePersons = ResourcePersons;
	}

	@Override
	public String toString() {
		return "Publications [publicationId=" + publicationId + ", publicationName=" + publicationName
				+ ", publicaitonType=" + publicaitonType + ", publicationDate=" + publicationDate + ", resPers="
				+ ResourcePersons + "]";
	}

	
	
}
