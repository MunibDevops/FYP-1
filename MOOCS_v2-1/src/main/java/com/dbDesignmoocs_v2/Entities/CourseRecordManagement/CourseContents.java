package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CourseContents")
public class CourseContents {

	@ManyToOne
	@JoinColumn(name="courseId")
	StudyCourses studyCourse;
	
	@ManyToOne
	@JoinColumn(name="rukuhId")
	Rukuhaat rukuh;
	
}
