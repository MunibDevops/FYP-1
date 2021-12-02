package com.dbDesignmoocs_v2.Entities.LearnerRecordManagement;

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

import com.dbDesignmoocs_v2.Entities.CourseExecution.CourseProgress;
import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestAttempts;
import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;
import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.PeerReviews;

@Entity
@Table(name="CourseRegistrations")
public class CourseRegistrations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(unique = true)
	private long crId;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	StudyCourses courseId;
	
	@ManyToOne
	@JoinColumn(name="learnerId")
	Learners learner;
	
	Date dateOfRegistration;
	
	@ManyToOne
	@JoinColumn(name="testItemId")
	TestAttempts testAttempt;
	
	@ManyToOne
	@JoinColumn(name="peerReviewId")
	PeerReviews peerReview;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "courseRegistration",orphanRemoval=true)
	List<CourseProgress> courseProgress=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "courseRegistration",orphanRemoval=true)
	List<InteractiveLearningSessions> learningSessions=new ArrayList<>();
	
}
