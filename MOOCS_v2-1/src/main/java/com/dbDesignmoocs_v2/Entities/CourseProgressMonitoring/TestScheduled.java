package com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TestScheduled")
public class TestScheduled {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long scheduleId;
	
	@Column(nullable=true)
	private String learnerName;
	
	@Column(nullable=true)
	private String courseName;
	
	@Column(nullable=true)
	private Date offerDate;
	
	@Column(nullable = true)
	private int timeAllowed;
	
	@Column(nullable=true)
	private Date dueDate;
	
	@OneToOne(mappedBy = "testScheduled")
	TestItems testItem;

	public TestScheduled() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TestScheduled(long scheduleId, String learnerName, String courseName, Date offerDate, int timeAllowed,
			Date dueDate, TestItems testItem) {
		super();
		this.scheduleId = scheduleId;
		this.learnerName = learnerName;
		this.courseName = courseName;
		this.offerDate = offerDate;
		this.timeAllowed = timeAllowed;
		this.dueDate = dueDate;
		this.testItem = testItem;
	}

	public long getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getLearnerName() {
		return learnerName;
	}

	public void setLearnerName(String learnerName) {
		this.learnerName = learnerName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getOfferDate() {
		return offerDate;
	}

	public void setOfferDate(Date offerDate) {
		this.offerDate = offerDate;
	}

	public int getTimeAllowed() {
		return timeAllowed;
	}

	public void setTimeAllowed(int timeAllowed) {
		this.timeAllowed = timeAllowed;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public TestItems getTestItem() {
		return testItem;
	}

	public void setTestItem(TestItems testItem) {
		this.testItem = testItem;
	}
	
	
}
