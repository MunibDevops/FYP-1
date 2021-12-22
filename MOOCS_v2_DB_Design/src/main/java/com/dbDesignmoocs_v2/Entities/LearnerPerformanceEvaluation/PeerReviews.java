package com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.ProjectAssignments;
import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.RequiredActivities;
import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestItems;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.CourseRegistrations;

@Entity
@Table(name="PeerReviews")
public class PeerReviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long peerReviewId;
	
	private long reviewerId;
	
	private long crId;
	private Date reviewDate;
	private long pointsEarned;
	private String comments;
	
	@ManyToOne
	@JoinColumn(name="testItemId")
	TestItems testItem;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "peerReview",orphanRemoval=true)
	List<ProjectAssignments> listofassignments=new ArrayList<>();
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "peerReview",orphanRemoval=true)
	List<CourseRegistrations> listofCourseRegistration=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "peerReview",orphanRemoval=true)
	List<RequiredActivities> listofrequiredActivities=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "peerReview",orphanRemoval=true)
	List<LearnersSolutions> listoflearnerSolutions=new ArrayList<>();

	public PeerReviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PeerReviews(long peerReviewId, long reviewerId, long crId, Date reviewDate, long pointsEarned,
			String comments, TestItems testItem, List<ProjectAssignments> listofassignments,
			List<CourseRegistrations> listofCourseRegistration, List<RequiredActivities> listofrequiredActivities,
			List<LearnersSolutions> listoflearnerSolutions) {
		super();
		this.peerReviewId = peerReviewId;
		this.reviewerId = reviewerId;
		this.crId = crId;
		this.reviewDate = reviewDate;
		this.pointsEarned = pointsEarned;
		this.comments = comments;
		this.testItem = testItem;
		this.listofassignments = listofassignments;
		this.listofCourseRegistration = listofCourseRegistration;
		this.listofrequiredActivities = listofrequiredActivities;
		this.listoflearnerSolutions = listoflearnerSolutions;
	}

	public long getPeerReviewId() {
		return peerReviewId;
	}

	public void setPeerReviewId(long peerReviewId) {
		this.peerReviewId = peerReviewId;
	}

	public long getReviewerId() {
		return reviewerId;
	}

	public void setReviewerId(long reviewerId) {
		this.reviewerId = reviewerId;
	}

	public long getCrId() {
		return crId;
	}

	public void setCrId(long crId) {
		this.crId = crId;
	}

	public Date getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}

	public long getPointsEarned() {
		return pointsEarned;
	}

	public void setPointsEarned(long pointsEarned) {
		this.pointsEarned = pointsEarned;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public TestItems getTestItem() {
		return testItem;
	}

	public void setTestItem(TestItems testItem) {
		this.testItem = testItem;
	}

	public List<ProjectAssignments> getListofassignments() {
		return listofassignments;
	}

	public void setListofassignments(List<ProjectAssignments> listofassignments) {
		this.listofassignments = listofassignments;
	}

	public List<CourseRegistrations> getListofCourseRegistration() {
		return listofCourseRegistration;
	}

	public void setListofCourseRegistration(List<CourseRegistrations> listofCourseRegistration) {
		this.listofCourseRegistration = listofCourseRegistration;
	}

	public List<RequiredActivities> getListofrequiredActivities() {
		return listofrequiredActivities;
	}

	public void setListofrequiredActivities(List<RequiredActivities> listofrequiredActivities) {
		this.listofrequiredActivities = listofrequiredActivities;
	}

	public List<LearnersSolutions> getListoflearnerSolutions() {
		return listoflearnerSolutions;
	}

	public void setListoflearnerSolutions(List<LearnersSolutions> listoflearnerSolutions) {
		this.listoflearnerSolutions = listoflearnerSolutions;
	}

	@Override
	public String toString() {
		return "PeerReviews [peerReviewId=" + peerReviewId + ", reviewerId=" + reviewerId + ", crId=" + crId
				+ ", reviewDate=" + reviewDate + ", pointsEarned=" + pointsEarned + ", comments=" + comments
				+ ", testItem=" + testItem + ", listofassignments=" + listofassignments + ", listofCourseRegistration="
				+ listofCourseRegistration + ", listofrequiredActivities=" + listofrequiredActivities
				+ ", listoflearnerSolutions=" + listoflearnerSolutions + "]";
	}
	
	
	
	
}
