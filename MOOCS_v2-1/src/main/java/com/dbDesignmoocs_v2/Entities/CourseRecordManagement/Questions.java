package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

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
	private long weight;
	private String type;
	private String questionInUrdu;
	private String questionInEnglish;
	private String option1Urdu;
	private String option2Urdu;
	private String option3Urdu;
	private String option4Urdu;
	private String option1English;
	private String option2English;
	private String option3English;
	private String option4English;
	private String answer;
	
	@ManyToOne
	@JoinColumn(name="ayatId")
	Ayaat ayat;
	

}
