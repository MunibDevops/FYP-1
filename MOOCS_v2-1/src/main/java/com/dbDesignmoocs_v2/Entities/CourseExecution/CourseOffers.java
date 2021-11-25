package com.dbDesignmoocs_v2.Entities.CourseExecution;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;

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
