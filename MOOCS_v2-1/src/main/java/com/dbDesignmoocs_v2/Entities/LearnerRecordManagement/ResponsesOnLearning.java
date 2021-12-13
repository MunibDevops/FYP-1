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
@Table(name="ResponsesOnLearning")
public class ResponsesOnLearning {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long responseId;
	@Column(nullable=true)
	private String response;
	
	@ManyToOne
	@JoinColumn(name="sessionId")
	InteractiveLearningSessions responses;
	
	
}
