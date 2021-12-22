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

import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.LearnersSolutions;
import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.PeerReviews;


@Entity
@Table(name = "ProjectAssignments")
public class ProjectAssignments {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long assignmentId;
	
	@Column(nullable=true)
	private String assignmentTitle;
	@Column(nullable=true)
	
	private String assignmentFile;
	@Column(nullable=true)
	private long totalQuestions;
	@Column(nullable=true)
	private Date dueDate;
	@Column(nullable=true)
	private long maxPoints;
	@Column(nullable=true)
	private String definedBy;
	@Column(nullable=true)
	private Date definedDate;
	
	
	@ManyToOne
	@JoinColumn(name="peerReviewId")
	PeerReviews peerReview;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "assignments",orphanRemoval=true)
	List<LearnersSolutions> listofSolutions=new ArrayList<>();


	public ProjectAssignments() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProjectAssignments(long assignmentId, String assignmentTitle, String assignmentFile, long totalQuestions,
			Date dueDate, long maxPoints, String definedBy, Date definedDate, PeerReviews peerReview,
			List<LearnersSolutions> listofSolutions) {
		super();
		this.assignmentId = assignmentId;
		this.assignmentTitle = assignmentTitle;
		this.assignmentFile = assignmentFile;
		this.totalQuestions = totalQuestions;
		this.dueDate = dueDate;
		this.maxPoints = maxPoints;
		this.definedBy = definedBy;
		this.definedDate = definedDate;
		this.peerReview = peerReview;
		this.listofSolutions = listofSolutions;
	}


	public long getAssignmentId() {
		return assignmentId;
	}


	public void setAssignmentId(long assignmentId) {
		this.assignmentId = assignmentId;
	}


	public String getAssignmentTitle() {
		return assignmentTitle;
	}


	public void setAssignmentTitle(String assignmentTitle) {
		this.assignmentTitle = assignmentTitle;
	}


	public String getAssignmentFile() {
		return assignmentFile;
	}


	public void setAssignmentFile(String assignmentFile) {
		this.assignmentFile = assignmentFile;
	}


	public long getTotalQuestions() {
		return totalQuestions;
	}


	public void setTotalQuestions(long totalQuestions) {
		this.totalQuestions = totalQuestions;
	}


	public Date getDueDate() {
		return dueDate;
	}


	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}


	public long getMaxPoints() {
		return maxPoints;
	}


	public void setMaxPoints(long maxPoints) {
		this.maxPoints = maxPoints;
	}


	public String getDefinedBy() {
		return definedBy;
	}


	public void setDefinedBy(String definedBy) {
		this.definedBy = definedBy;
	}


	public Date getDefinedDate() {
		return definedDate;
	}


	public void setDefinedDate(Date definedDate) {
		this.definedDate = definedDate;
	}


	public PeerReviews getPeerReview() {
		return peerReview;
	}


	public void setPeerReview(PeerReviews peerReview) {
		this.peerReview = peerReview;
	}


	public List<LearnersSolutions> getListofSolutions() {
		return listofSolutions;
	}


	public void setListofSolutions(List<LearnersSolutions> listofSolutions) {
		this.listofSolutions = listofSolutions;
	}


	@Override
	public String toString() {
		return "ProjectAssignments [assignmentId=" + assignmentId + ", assignmentTitle=" + assignmentTitle
				+ ", assignmentFile=" + assignmentFile + ", totalQuestions=" + totalQuestions + ", dueDate=" + dueDate
				+ ", maxPoints=" + maxPoints + ", definedBy=" + definedBy + ", definedDate=" + definedDate
				+ ", peerReview=" + peerReview + ", listofSolutions=" + listofSolutions + "]";
	}
	
	
	
}

	

