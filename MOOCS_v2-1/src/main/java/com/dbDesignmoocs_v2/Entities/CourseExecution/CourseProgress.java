package com.dbDesignmoocs_v2.Entities.CourseExecution;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestItems;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.CourseRegistrations;

public class CourseProgress {
	
	@Column(nullable=true)
	private long crId;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long progressId;
	@Column(nullable=true)
	private String attempted;
	@Column(nullable=true)
	private String completed;
	@Column(nullable=true)
	private String result;
	
	@ManyToOne
	@JoinColumn(name="Id")
	CourseRegistrations courseRegistration;
	

	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "courseProgress",orphanRemoval=true)
	List<TestItems> listOftestItems=new ArrayList<>();
}
