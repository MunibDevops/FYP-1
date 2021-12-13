package com.dbDesignmoocs_v2.Entities.LearnerRecordManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="InteractiveLearningResources")
public class InteractiveLearningResources {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ResourceId;
	
	@Column(nullable=true)
	
	private String statement;
	@Column(nullable=true)
	private String question;
	@Column(nullable=true)
	private String answer;
	@Column(nullable=true)
	private String hints;
	@Column(nullable=true)
	private String option1;
	@Column(nullable=true)
	private String option2;
	@Column(nullable=true)
	private String option3;
	@Column(nullable=true)
	private String option4;
	
	@ManyToOne
	@JoinColumn(name="sessionId")
	InteractiveLearningSessions interactiveSession;
	
	
	
}
