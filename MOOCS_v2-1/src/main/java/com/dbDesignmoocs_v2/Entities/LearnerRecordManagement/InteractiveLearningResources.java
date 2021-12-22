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
	private long ILResourceId;
	
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

	public InteractiveLearningResources() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InteractiveLearningResources(long iLResourceId, String statement, String question, String answer,
			String hints, String option1, String option2, String option3, String option4,
			InteractiveLearningSessions interactiveSession) {
		super();
		ILResourceId = iLResourceId;
		this.statement = statement;
		this.question = question;
		this.answer = answer;
		this.hints = hints;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.interactiveSession = interactiveSession;
	}

	public long getILResourceId() {
		return ILResourceId;
	}

	public void setILResourceId(long iLResourceId) {
		ILResourceId = iLResourceId;
	}

	public String getStatement() {
		return statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getHints() {
		return hints;
	}

	public void setHints(String hints) {
		this.hints = hints;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public InteractiveLearningSessions getInteractiveSession() {
		return interactiveSession;
	}

	public void setInteractiveSession(InteractiveLearningSessions interactiveSession) {
		this.interactiveSession = interactiveSession;
	}

	@Override
	public String toString() {
		return "InteractiveLearningResources [ILResourceId=" + ILResourceId + ", statement=" + statement + ", question="
				+ question + ", answer=" + answer + ", hints=" + hints + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", interactiveSession=" + interactiveSession + "]";
	}
	
	
	
	
}
