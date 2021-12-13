package com.dbDesignmoocs_v2.Entities.LearnerRecordManagement;

import java.util.ArrayList;
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

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestItems;

@Entity
@Table(name="InteractiveLearningSessions")
public class InteractiveLearningSessions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sessionId;

	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "interactiveSession",orphanRemoval=true)
	List<TestItems> listOftestItems=new ArrayList<>();
	
	private long crId;
	
	@ManyToOne 
	@JoinColumn(name="Id")
	CourseRegistrations courseRegistration;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "interactiveSession",orphanRemoval=true)
	List<InteractiveLearningResources>listofInteractiveResources=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "responses",orphanRemoval=true)
	List<ResponsesOnLearning>listofresponses=new ArrayList<>();
	
}
