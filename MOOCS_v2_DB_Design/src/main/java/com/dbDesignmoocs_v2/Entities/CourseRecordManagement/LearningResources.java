package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord.ResourcePersons;

@Entity
@Table(name="LearningResources")
public class LearningResources {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long resourceId;
	@Column(nullable=true)
	private String resourceType;
	@Column(nullable=true)
	private String resourceName;
	@Column(nullable=true)
	private String resourceText;
	@Column(nullable=true)
	private String resourceOther;  //path of resource
	
	@ManyToOne
	@JoinColumn(name="rukuhId")
	Rukuhaat rukuh;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "resourcePersons")
	List<ResourceDefinition>listofResourceDefinition=new ArrayList<>();

	public LearningResources() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LearningResources(long resourceId, String resourceType, String resourceName, String resourceText,
			String resourceOther, Rukuhaat rukuh, List<ResourceDefinition> listofResourceDefinition) {
		super();
		this.resourceId = resourceId;
		this.resourceType = resourceType;
		this.resourceName = resourceName;
		this.resourceText = resourceText;
		this.resourceOther = resourceOther;
		this.rukuh = rukuh;
		this.listofResourceDefinition = listofResourceDefinition;
	}

	public long getResourceId() {
		return resourceId;
	}

	public void setResourceId(long resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceText() {
		return resourceText;
	}

	public void setResourceText(String resourceText) {
		this.resourceText = resourceText;
	}

	public String getResourceOther() {
		return resourceOther;
	}

	public void setResourceOther(String resourceOther) {
		this.resourceOther = resourceOther;
	}

	public Rukuhaat getRukuh() {
		return rukuh;
	}

	public void setRukuh(Rukuhaat rukuh) {
		this.rukuh = rukuh;
	}

	public List<ResourceDefinition> getListofResourceDefinition() {
		return listofResourceDefinition;
	}

	public void setListofResourceDefinition(List<ResourceDefinition> listofResourceDefinition) {
		this.listofResourceDefinition = listofResourceDefinition;
	}

	@Override
	public String toString() {
		return "LearningResources [resourceId=" + resourceId + ", resourceType=" + resourceType + ", resourceName="
				+ resourceName + ", resourceText=" + resourceText + ", resourceOther=" + resourceOther + ", rukuh="
				+ rukuh + ", listofResourceDefinition=" + listofResourceDefinition + "]";
	}
	
	
}
