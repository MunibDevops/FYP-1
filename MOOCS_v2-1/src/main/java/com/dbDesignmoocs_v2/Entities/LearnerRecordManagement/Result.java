package com.dbDesignmoocs_v2.Entities.LearnerRecordManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestItems;
import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;

@Entity
@Table(name="Result")
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long resultId;
	@Column(nullable=true)
	private long resultScore;
	@Column(nullable=true)
	private long crId;
	
	@OneToOne(mappedBy = "result")
	TestItems testItem;
	
	

}
