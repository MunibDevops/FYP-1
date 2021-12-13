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

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestAttempts;
import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.Certificates;

@Entity
@Table(name="Learners")
public class Learners {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long learnerId;
	@Column(unique = true,nullable=true)
	private String userName;
	@Column(nullable=true)
	private String firstName;
	@Column(nullable=true)
	private String lastName;
	
	@Column(unique = true,nullable=true)
	private String email;
	@Column(nullable=true)
	private String password;
	@Column(unique = true,nullable=true)
	private long phoneNumber;
	@Column(nullable=true)
	private String country;
	@Column(nullable=true)
	private String gender;
	@Column(unique = true,nullable=true)
	private long cnic;
	@Column(nullable=true)
	private Date dob;
	@Column(nullable=true)
	private String role;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "learner",orphanRemoval=true)
	List<Certificates> listOfCertificates = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "learner",orphanRemoval=true)
	List<CourseRegistrations> listOfRegistrations = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "learner",orphanRemoval=true)
	List<TestAttempts> listOfTestAttempts = new ArrayList<>();

	
}
