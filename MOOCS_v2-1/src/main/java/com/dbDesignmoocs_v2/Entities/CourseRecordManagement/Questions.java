package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Questions")
public class Questions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long questionId;
	@Column(nullable=true)
	private long weight;
	@Column(nullable=true)
	private String type;
	@Column(nullable=true)
	private String questionInUrdu;
	@Column(nullable=true)
	private String questionInEnglish;
	@Column(nullable=true)
	private String option1Urdu;
	@Column(nullable=true)
	private String option2Urdu;
	@Column(nullable=true)
	private String option3Urdu;
	@Column(nullable=true)
	private String option4Urdu;
	@Column(nullable=true)
	private String option1English;
	@Column(nullable=true)
	private String option2English;
	@Column(nullable=true)
	private String option3English;
	@Column(nullable=true)
	private String option4English;
	@Column(nullable=true)
	private String answer;
	
	@ManyToOne
	@JoinColumn(name="ayatId")
	Ayaat ayat;
	

}
