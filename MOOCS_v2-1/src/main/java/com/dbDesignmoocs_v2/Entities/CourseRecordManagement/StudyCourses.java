package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseExecution.CourseOffers;
import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.Certificates;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.CourseRegistrations;

@Entity
@Table(name="StudyCourses")
public class StudyCourses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	@Column(nullable=true)
	private String courseTitle;
	@Column(nullable=true)
	private String courseDescription;
	@Column(nullable=true)
	private String objectives;
	
	@Column(nullable=true)
	private String language;
	@Column(nullable=true)
	private long duration;
	@Column(nullable=true)
	private String targetAudience;
	@Column(nullable=true)
	private long totalRukuhaat;
	@Column(nullable=true)
	private long totalScore;
	@Column(nullable=true)
	private String courseDeveloper;
	@Column(nullable=true)
	private String coursePrerequisites;
	@Column(nullable=true)
	private String definedBy;
	@Column(nullable=true)
	private Date definitonDate;
	@Column(nullable=true)
	private Date modificationDate;
	@Column(nullable=true)
	private String courseThumbnail;     // path of thumbnail

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "StudyCourses")
	List<ResourceDefinition>listofResourceDefinition=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "StudyCourses")
	List<CourseOffers>listofCourseOffers=new ArrayList<>();
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "CourseContents", 
            joinColumns = { @JoinColumn(name = "courseId") }, 
            inverseJoinColumns = { @JoinColumn(name = "rukuhId") })
	List<Rukuhaat>listofRukuhaat=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "StudyCourses")
	List<CourseRegistrations> courseRegistrationList =new ArrayList<>();
	

	@OneToOne
	@JoinColumn(name="certificateId",referencedColumnName = "certificateId")
	Certificates certificate;
}
