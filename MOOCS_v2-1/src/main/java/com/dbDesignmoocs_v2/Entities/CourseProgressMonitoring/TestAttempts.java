package com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring;

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

import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.CourseRegistrations;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.Learners;

@Entity
@Table(name="TestAttempts")
public class TestAttempts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long testAttemptId;
	@Column(nullable=true)
	private long crId;
	
	@Column(nullable=true)
	private int attemptNumber;
	
	@Column(nullable=true)
	private Date attemptDate;
	
	@Column(nullable=true)
	private boolean status;
	
	@Column(nullable=true)
	private String remarks;
	
	@ManyToOne
	@JoinColumn(name="learnerId")
	Learners learner;
	
	@ManyToOne
	@JoinColumn(name="testItemId")
	TestItems testItem;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "testAttempt",orphanRemoval=true)
	List<CourseRegistrations> courseRegistration=new ArrayList<>();

	public TestAttempts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestAttempts(long testAttemptId, long crId, int attemptNumber, Date attemptDate, boolean status,
			String remarks, Learners learner, TestItems testItem, List<CourseRegistrations> courseRegistration) {
		super();
		this.testAttemptId = testAttemptId;
		this.crId = crId;
		this.attemptNumber = attemptNumber;
		this.attemptDate = attemptDate;
		this.status = status;
		this.remarks = remarks;
		this.learner = learner;
		this.testItem = testItem;
		this.courseRegistration = courseRegistration;
	}

	public long getTestAttemptId() {
		return testAttemptId;
	}

	public void setTestAttemptId(long testAttemptId) {
		this.testAttemptId = testAttemptId;
	}

	public long getCrId() {
		return crId;
	}

	public void setCrId(long crId) {
		this.crId = crId;
	}

	public int getAttemptNumber() {
		return attemptNumber;
	}

	public void setAttemptNumber(int attemptNumber) {
		this.attemptNumber = attemptNumber;
	}

	public Date getAttemptDate() {
		return attemptDate;
	}

	public void setAttemptDate(Date attemptDate) {
		this.attemptDate = attemptDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Learners getLearner() {
		return learner;
	}

	public void setLearner(Learners learner) {
		this.learner = learner;
	}

	public TestItems getTestItem() {
		return testItem;
	}

	public void setTestItem(TestItems testItem) {
		this.testItem = testItem;
	}

	public List<CourseRegistrations> getCourseRegistration() {
		return courseRegistration;
	}

	public void setCourseRegistration(List<CourseRegistrations> courseRegistration) {
		this.courseRegistration = courseRegistration;
	}

	@Override
	public String toString() {
		return "TestAttempts [testAttemptId=" + testAttemptId + ", crId=" + crId + ", attemptNumber=" + attemptNumber
				+ ", attemptDate=" + attemptDate + ", status=" + status + ", remarks=" + remarks + ", learner="
				+ learner + ", testItem=" + testItem + ", courseRegistration=" + courseRegistration + "]";
	}
	
	
	
	
}
