package com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PeerReviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private long peerReviewId;
	
	private long assignmentId;
	private long activityId;
	private long reviewerId;
	private long crId;
	private Date reviewDate;
	private long pointsEarned;
	private String comments;
}
