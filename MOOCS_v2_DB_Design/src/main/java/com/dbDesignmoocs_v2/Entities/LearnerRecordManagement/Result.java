package com.dbDesignmoocs_v2.Entities.LearnerRecordManagement;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestItems;
import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;

@Entity
@Table(name="Result")
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long resultId;
	
	@Column(nullable=true)
	private long resultScore;
	
	@Column(nullable=true)
	private long crId;
	
	@OneToOne(mappedBy = "result")
	TestItems testItem;
	
	@Column(nullable=true)
	private Date attemptDate;
	
	@Column(nullable=true)
	private int totalMarks;
	
	@Column(nullable=true)
	private String remarks;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(long resultId, long resultScore, long crId, TestItems testItem, Date attemptDate, int totalMarks,
			String remarks) {
		super();
		this.resultId = resultId;
		this.resultScore = resultScore;
		this.crId = crId;
		this.testItem = testItem;
		this.attemptDate = attemptDate;
		this.totalMarks = totalMarks;
		this.remarks = remarks;
	}

	public long getResultId() {
		return resultId;
	}

	public void setResultId(long resultId) {
		this.resultId = resultId;
	}

	public long getResultScore() {
		return resultScore;
	}

	public void setResultScore(long resultScore) {
		this.resultScore = resultScore;
	}

	public long getCrId() {
		return crId;
	}

	public void setCrId(long crId) {
		this.crId = crId;
	}

	public TestItems getTestItem() {
		return testItem;
	}

	public void setTestItem(TestItems testItem) {
		this.testItem = testItem;
	}

	public Date getAttemptDate() {
		return attemptDate;
	}

	public void setAttemptDate(Date attemptDate) {
		this.attemptDate = attemptDate;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", resultScore=" + resultScore + ", crId=" + crId + ", testItem="
				+ testItem + ", attemptDate=" + attemptDate + ", totalMarks=" + totalMarks + ", remarks=" + remarks
				+ "]";
	}
	
	
	
}
