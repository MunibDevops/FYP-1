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
	
	@Column(nullable=true)
	private String responseType;
	
	@ManyToOne
	@JoinColumn(name="sessionId")
	InteractiveLearningSessions responses;

	public ResponsesOnLearning() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponsesOnLearning(long responseId, String response, String responseType,
			InteractiveLearningSessions responses) {
		super();
		this.responseId = responseId;
		this.response = response;
		this.responseType = responseType;
		this.responses = responses;
	}

	public long getResponseId() {
		return responseId;
	}

	public void setResponseId(long responseId) {
		this.responseId = responseId;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getResponseType() {
		return responseType;
	}

	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}

	public InteractiveLearningSessions getResponses() {
		return responses;
	}

	public void setResponses(InteractiveLearningSessions responses) {
		this.responses = responses;
	}

	@Override
	public String toString() {
		return "ResponsesOnLearning [responseId=" + responseId + ", response=" + response + ", responseType="
				+ responseType + ", responses=" + responses + "]";
	}
	
	
	
	
}
