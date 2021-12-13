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
	
}
