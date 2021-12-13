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
	
	
}
