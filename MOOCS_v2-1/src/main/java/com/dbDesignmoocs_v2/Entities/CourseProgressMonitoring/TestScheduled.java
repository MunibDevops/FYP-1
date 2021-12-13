package com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TestScheduled")
public class TestScheduled {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long scheduleId;
	@Column(nullable=true)
	
	private String learnerName;
	@Column(nullable=true)
	private String courseName;
	@Column(nullable=true)
	private Date date;
	
	@OneToOne(mappedBy = "testScheduled")
	TestItems testItem;
	
}
