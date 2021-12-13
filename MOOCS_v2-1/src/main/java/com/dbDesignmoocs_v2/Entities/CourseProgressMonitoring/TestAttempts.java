package com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring;

import java.util.ArrayList;
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

import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.CourseRegistrations;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.Learners;

@Entity
@Table(name="TestAttempts")
public class TestAttempts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long testItemId;
	@Column(nullable=true)
	private long crId;
	
	
	
	@ManyToOne
	@JoinColumn(name="learnerId")
	Learners learner;
	
	@ManyToOne
	@JoinColumn(name="testItemId")
	TestItems testItem;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "testAttempt",orphanRemoval=true)
	List<CourseRegistrations> courseRegistration=new ArrayList<>();
}
