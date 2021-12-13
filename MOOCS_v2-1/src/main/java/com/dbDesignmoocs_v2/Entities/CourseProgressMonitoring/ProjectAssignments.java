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
	
	
}

	

