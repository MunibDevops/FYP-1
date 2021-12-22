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
	private String answerurdu;
	@Column(nullable=true)
	private String answereng;
	@Column(nullable=true)
	private String hint1urdu;
	@Column(nullable=true)
	private String hint2urdu;
	@Column(nullable=true)
	private String hint3urdu;
	@Column(nullable=true)
	private String hint4urdu;
	@Column(nullable=true)
	
	private String hint1eng;
	@Column(nullable=true)
	
	private String hint2eng;
	@Column(nullable=true)
	
	private String hint3eng;
	@Column(nullable=true)
	
	private String hint4eng;
	@ManyToOne
	@JoinColumn(name="ayatId")
	Ayaat ayat;
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Questions(long questionId, long weight, String type, String questionInUrdu, String questionInEnglish,
			String option1Urdu, String option2Urdu, String option3Urdu, String option4Urdu, String option1English,
			String option2English, String option3English, String option4English, String answerurdu, String answereng,
			String hint1urdu, String hint2urdu, String hint3urdu, String hint4urdu, String hint1eng, String hint2eng,
			String hint3eng, String hint4eng, Ayaat ayat) {
		super();
		this.questionId = questionId;
		this.weight = weight;
		this.type = type;
		this.questionInUrdu = questionInUrdu;
		this.questionInEnglish = questionInEnglish;
		this.option1Urdu = option1Urdu;
		this.option2Urdu = option2Urdu;
		this.option3Urdu = option3Urdu;
		this.option4Urdu = option4Urdu;
		this.option1English = option1English;
		this.option2English = option2English;
		this.option3English = option3English;
		this.option4English = option4English;
		this.answerurdu = answerurdu;
		this.answereng = answereng;
		this.hint1urdu = hint1urdu;
		this.hint2urdu = hint2urdu;
		this.hint3urdu = hint3urdu;
		this.hint4urdu = hint4urdu;
		this.hint1eng = hint1eng;
		this.hint2eng = hint2eng;
		this.hint3eng = hint3eng;
		this.hint4eng = hint4eng;
		this.ayat = ayat;
	}
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQuestionInUrdu() {
		return questionInUrdu;
	}
	public void setQuestionInUrdu(String questionInUrdu) {
		this.questionInUrdu = questionInUrdu;
	}
	public String getQuestionInEnglish() {
		return questionInEnglish;
	}
	public void setQuestionInEnglish(String questionInEnglish) {
		this.questionInEnglish = questionInEnglish;
	}
	public String getOption1Urdu() {
		return option1Urdu;
	}
	public void setOption1Urdu(String option1Urdu) {
		this.option1Urdu = option1Urdu;
	}
	public String getOption2Urdu() {
		return option2Urdu;
	}
	public void setOption2Urdu(String option2Urdu) {
		this.option2Urdu = option2Urdu;
	}
	public String getOption3Urdu() {
		return option3Urdu;
	}
	public void setOption3Urdu(String option3Urdu) {
		this.option3Urdu = option3Urdu;
	}
	public String getOption4Urdu() {
		return option4Urdu;
	}
	public void setOption4Urdu(String option4Urdu) {
		this.option4Urdu = option4Urdu;
	}
	public String getOption1English() {
		return option1English;
	}
	public void setOption1English(String option1English) {
		this.option1English = option1English;
	}
	public String getOption2English() {
		return option2English;
	}
	public void setOption2English(String option2English) {
		this.option2English = option2English;
	}
	public String getOption3English() {
		return option3English;
	}
	public void setOption3English(String option3English) {
		this.option3English = option3English;
	}
	public String getOption4English() {
		return option4English;
	}
	public void setOption4English(String option4English) {
		this.option4English = option4English;
	}
	public String getAnswerurdu() {
		return answerurdu;
	}
	public void setAnswerurdu(String answerurdu) {
		this.answerurdu = answerurdu;
	}
	public String getAnswereng() {
		return answereng;
	}
	public void setAnswereng(String answereng) {
		this.answereng = answereng;
	}
	public String getHint1urdu() {
		return hint1urdu;
	}
	public void setHint1urdu(String hint1urdu) {
		this.hint1urdu = hint1urdu;
	}
	public String getHint2urdu() {
		return hint2urdu;
	}
	public void setHint2urdu(String hint2urdu) {
		this.hint2urdu = hint2urdu;
	}
	public String getHint3urdu() {
		return hint3urdu;
	}
	public void setHint3urdu(String hint3urdu) {
		this.hint3urdu = hint3urdu;
	}
	public String getHint4urdu() {
		return hint4urdu;
	}
	public void setHint4urdu(String hint4urdu) {
		this.hint4urdu = hint4urdu;
	}
	public String getHint1eng() {
		return hint1eng;
	}
	public void setHint1eng(String hint1eng) {
		this.hint1eng = hint1eng;
	}
	public String getHint2eng() {
		return hint2eng;
	}
	public void setHint2eng(String hint2eng) {
		this.hint2eng = hint2eng;
	}
	public String getHint3eng() {
		return hint3eng;
	}
	public void setHint3eng(String hint3eng) {
		this.hint3eng = hint3eng;
	}
	public String getHint4eng() {
		return hint4eng;
	}
	public void setHint4eng(String hint4eng) {
		this.hint4eng = hint4eng;
	}
	public Ayaat getAyat() {
		return ayat;
	}
	public void setAyat(Ayaat ayat) {
		this.ayat = ayat;
	}
	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", weight=" + weight + ", type=" + type + ", questionInUrdu="
				+ questionInUrdu + ", questionInEnglish=" + questionInEnglish + ", option1Urdu=" + option1Urdu
				+ ", option2Urdu=" + option2Urdu + ", option3Urdu=" + option3Urdu + ", option4Urdu=" + option4Urdu
				+ ", option1English=" + option1English + ", option2English=" + option2English + ", option3English="
				+ option3English + ", option4English=" + option4English + ", answerurdu=" + answerurdu + ", answereng="
				+ answereng + ", hint1urdu=" + hint1urdu + ", hint2urdu=" + hint2urdu + ", hint3urdu=" + hint3urdu
				+ ", hint4urdu=" + hint4urdu + ", hint1eng=" + hint1eng + ", hint2eng=" + hint2eng + ", hint3eng="
				+ hint3eng + ", hint4eng=" + hint4eng + ", ayat=" + ayat + "]";
	}
	
	
	
}
