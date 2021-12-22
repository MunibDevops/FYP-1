package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Coursecontents")
public class Coursecontents {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long contentId;
	@Column(nullable = true)
	private String topicnName;
	@Column(nullable = true)
	private long topicNumber;
	@Column(nullable = true)
	private String definedBy;
	@Column(nullable = true)
	private String version;
	public Coursecontents() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coursecontents(long contentId, String topicnName, long topicNumber, String definedBy, String version) {
		super();
		this.contentId = contentId;
		this.topicnName = topicnName;
		this.topicNumber = topicNumber;
		this.definedBy = definedBy;
		this.version = version;
	}
	public long getContentId() {
		return contentId;
	}
	public void setContentId(long contentId) {
		this.contentId = contentId;
	}
	public String getTopicnName() {
		return topicnName;
	}
	public void setTopicnName(String topicnName) {
		this.topicnName = topicnName;
	}
	public long getTopicNumber() {
		return topicNumber;
	}
	public void setTopicNumber(long topicNumber) {
		this.topicNumber = topicNumber;
	}
	public String getDefinedBy() {
		return definedBy;
	}
	public void setDefinedBy(String definedBy) {
		this.definedBy = definedBy;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "Coursecontents [contentId=" + contentId + ", topicnName=" + topicnName + ", topicNumber=" + topicNumber
				+ ", definedBy=" + definedBy + ", version=" + version + "]";
	}
	
	
	
}
