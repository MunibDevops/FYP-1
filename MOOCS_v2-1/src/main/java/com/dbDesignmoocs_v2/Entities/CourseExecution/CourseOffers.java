package com.dbDesignmoocs_v2.Entities.CourseExecution;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.CourseRegistrations;

@Entity
@Table
public class CourseOffers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseOfferId;
	private Date offeredDate;
	private Date endDate;
	private String status;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	StudyCourses studycourse;
	
	

}
