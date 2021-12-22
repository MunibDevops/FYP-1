package com.dbDesignmoocs_v2.Entities.CourseExecution;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestItems;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.CourseRegistrations;

@Entity
@Table(name="CourseProgress")
public class CourseProgress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long progressId;
	
	@Column(nullable=true)
	private long crId;
	
	@Column(nullable=true)
	private String attempted;
	@Column(nullable=true)
	private String completed;
	@Column(nullable=true)
	private String result;
	
	@ManyToOne
	@JoinColumn(name="Id")
	CourseRegistrations courseRegistration;
	
	@Column(nullable=true)
	private Date startTime;

	@Column(nullable=true)
	private Date dueDate;
	
	@Column(nullable=true)
	private Date attemptDate;
	
	@Column(nullable=true)
	private boolean completitionStatus;
	
	@Column(nullable=true)
	private String remarks;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy ="courseProgress",orphanRemoval=true)
	List<TestItems> listOftestItems=new ArrayList<>();

	public CourseProgress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseProgress(long crId, long progressId, String attempted, String completed, String result,
			CourseRegistrations courseRegistration, Date startTime, Date dueDate, Date attemptDate,
			boolean completitionStatus, String remarks, List<TestItems> listOftestItems) {
		super();
		this.crId = crId;
		this.progressId = progressId;
		this.attempted = attempted;
		this.completed = completed;
		this.result = result;
		this.courseRegistration = courseRegistration;
		this.startTime = startTime;
		this.dueDate = dueDate;
		this.attemptDate = attemptDate;
		this.completitionStatus = completitionStatus;
		this.remarks = remarks;
		this.listOftestItems = listOftestItems;
	}

	public long getCrId() {
		return crId;
	}

	public void setCrId(long crId) {
		this.crId = crId;
	}

	public long getProgressId() {
		return progressId;
	}

	public void setProgressId(long progressId) {
		this.progressId = progressId;
	}

	public String getAttempted() {
		return attempted;
	}

	public void setAttempted(String attempted) {
		this.attempted = attempted;
	}

	public String getCompleted() {
		return completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public CourseRegistrations getCourseRegistration() {
		return courseRegistration;
	}

	public void setCourseRegistration(CourseRegistrations courseRegistration) {
		this.courseRegistration = courseRegistration;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getAttemptDate() {
		return attemptDate;
	}

	public void setAttemptDate(Date attemptDate) {
		this.attemptDate = attemptDate;
	}

	public boolean isCompletitionStatus() {
		return completitionStatus;
	}

	public void setCompletitionStatus(boolean completitionStatus) {
		this.completitionStatus = completitionStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<TestItems> getListOftestItems() {
		return listOftestItems;
	}

	public void setListOftestItems(List<TestItems> listOftestItems) {
		this.listOftestItems = listOftestItems;
	}
	
	
}
