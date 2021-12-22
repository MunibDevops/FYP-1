package com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.PeerReviews;
@Entity
@Table(name = "RequiredActivities")
public class RequiredActivities {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long activityId;
	@Column(nullable=true)
	private long questionId;
	@Column(nullable=true)
	private long assignmentId;
	@Column(nullable=true)
	private String activity;
	@Column(nullable=true)
	private long maxPoints;
	@Column(nullable=true)
	private long avgPoints;
	@Column(nullable=true)
	private long minPoints;

	@ManyToOne
	@JoinColumn(name="peerReviewId")
	PeerReviews peerReview;

	public RequiredActivities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequiredActivities(long activityId, long questionId, long assignmentId, String activity, long maxPoints,
			long avgPoints, long minPoints, PeerReviews peerReview) {
		super();
		this.activityId = activityId;
		this.questionId = questionId;
		this.assignmentId = assignmentId;
		this.activity = activity;
		this.maxPoints = maxPoints;
		this.avgPoints = avgPoints;
		this.minPoints = minPoints;
		this.peerReview = peerReview;
	}

	public long getActivityId() {
		return activityId;
	}

	public void setActivityId(long activityId) {
		this.activityId = activityId;
	}

	public long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}

	public long getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(long assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public long getMaxPoints() {
		return maxPoints;
	}

	public void setMaxPoints(long maxPoints) {
		this.maxPoints = maxPoints;
	}

	public long getAvgPoints() {
		return avgPoints;
	}

	public void setAvgPoints(long avgPoints) {
		this.avgPoints = avgPoints;
	}

	public long getMinPoints() {
		return minPoints;
	}

	public void setMinPoints(long minPoints) {
		this.minPoints = minPoints;
	}

	public PeerReviews getPeerReview() {
		return peerReview;
	}

	public void setPeerReview(PeerReviews peerReview) {
		this.peerReview = peerReview;
	}

	@Override
	public String toString() {
		return "RequiredActivities [activityId=" + activityId + ", questionId=" + questionId + ", assignmentId="
				+ assignmentId + ", activity=" + activity + ", maxPoints=" + maxPoints + ", avgPoints=" + avgPoints
				+ ", minPoints=" + minPoints + ", peerReview=" + peerReview + "]";
	}
	
	
}
