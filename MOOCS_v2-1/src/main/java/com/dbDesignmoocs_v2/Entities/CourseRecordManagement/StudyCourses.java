package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseExecution.CourseOffers;

@Entity
@Table(name="StudyCourses")
public class StudyCourses {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseId;
	private String courseTitle;
	private String courseDescription;
	private String objectives;
	
	
	private String language;
	private long duration;
	private String targetAudience;
	private long totalRukuhaat;
	private long totalScore;
	
	private String courseDeveloper;
	private String coursePrerequisites;
	private String definedBy;
	private Date definitonDate;
	private Date modificationDate;
	private String courseThumbnail;     // path of thumbnail

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "StudyCourses")
	List<ResourceDefinition>listofResourceDefinition=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "StudyCourses")
	List<CourseOffers>listofCourseOffers=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "StudyCourses")
	List<CourseContents>listofCourseContents=new ArrayList<>();
	
	
	
}
