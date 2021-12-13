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
	
}
