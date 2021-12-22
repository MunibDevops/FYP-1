package com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.ProjectAssignments;

@Entity
@Table(name = "LearnersSolutions")
public class LearnersSolutions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long solutionId;
	@Column(nullable=true)
	private long crId;
	@Column(nullable=true)
	private Date submitDate;
	@Column(nullable=true)
	private String sourceFile;
	
	@ManyToOne
	@JoinColumn(name = "peerReviewId")
	PeerReviews peerReview;
	
	@ManyToOne
	@JoinColumn(name="assignmentId")
	ProjectAssignments assignments;

	public LearnersSolutions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LearnersSolutions(long solutionId, long crId, Date submitDate, String sourceFile, PeerReviews peerReview,
			ProjectAssignments assignments) {
		super();
		this.solutionId = solutionId;
		this.crId = crId;
		this.submitDate = submitDate;
		this.sourceFile = sourceFile;
		this.peerReview = peerReview;
		this.assignments = assignments;
	}

	public long getSolutionId() {
		return solutionId;
	}

	public void setSolutionId(long solutionId) {
		this.solutionId = solutionId;
	}

	public long getCrId() {
		return crId;
	}

	public void setCrId(long crId) {
		this.crId = crId;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public String getSourceFile() {
		return sourceFile;
	}

	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}

	public PeerReviews getPeerReview() {
		return peerReview;
	}

	public void setPeerReview(PeerReviews peerReview) {
		this.peerReview = peerReview;
	}

	public ProjectAssignments getAssignments() {
		return assignments;
	}

	public void setAssignments(ProjectAssignments assignments) {
		this.assignments = assignments;
	}

	@Override
	public String toString() {
		return "LearnersSolutions [solutionId=" + solutionId + ", crId=" + crId + ", submitDate=" + submitDate
				+ ", sourceFile=" + sourceFile + ", peerReview=" + peerReview + ", assignments=" + assignments + "]";
	}
	
	
	
	
}
