package com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.Learners;

@Entity
@Table(name="Certificates")
public class Certificates {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long certificateId;
	@ManyToOne
	@JoinColumn(name="learnerId")
	Learners learner;
	
	@Column(nullable=true)
	
	private Date certificateDate;
	@OneToOne(mappedBy = "certificate")
	StudyCourses courses;
	
}
