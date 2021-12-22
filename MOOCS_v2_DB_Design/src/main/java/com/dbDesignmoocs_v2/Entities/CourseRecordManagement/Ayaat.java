package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;




@Entity
@Table(name="Ayaat")
public class Ayaat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ayatId;
	@Column(nullable=true)
	private long ayatNo;
	@Column(nullable=true)
	private long ayatSequence;
	@Column(nullable=true)
	private String surahName;
	@Column(nullable=true)
	private String arabicText;
	@Column(nullable=true)
	private String urduTranslation;
	@Column(nullable=true)
	private String englishTranslation;
	@Column(nullable=true)
	private String urduSummary;
	@Column(nullable=true)
	private String englishSummary;
	
	@ManyToOne
	@JoinColumn(name="rukuhId")
	Rukuhaat rukuh;
	
	@ManyToOne
	@JoinColumn(name="surahId")
	Surahs surahs;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ayat",orphanRemoval=true)
	List<Questions> ques=new ArrayList<>();

	public Ayaat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ayaat(long ayatId, long ayatNo, long ayatSequence, String surahName, String arabicText,
			String urduTranslation, String englishTranslation, String urduSummary, String englishSummary,
			Rukuhaat rukuh, Surahs surahs, List<Questions> ques) {
		super();
		this.ayatId = ayatId;
		this.ayatNo = ayatNo;
		this.ayatSequence = ayatSequence;
		this.surahName = surahName;
		this.arabicText = arabicText;
		this.urduTranslation = urduTranslation;
		this.englishTranslation = englishTranslation;
		this.urduSummary = urduSummary;
		this.englishSummary = englishSummary;
		this.rukuh = rukuh;
		this.surahs = surahs;
		this.ques = ques;
	}

	public long getAyatId() {
		return ayatId;
	}

	public void setAyatId(long ayatId) {
		this.ayatId = ayatId;
	}

	public long getAyatNo() {
		return ayatNo;
	}

	public void setAyatNo(long ayatNo) {
		this.ayatNo = ayatNo;
	}

	public long getAyatSequence() {
		return ayatSequence;
	}

	public void setAyatSequence(long ayatSequence) {
		this.ayatSequence = ayatSequence;
	}

	public String getSurahName() {
		return surahName;
	}

	public void setSurahName(String surahName) {
		this.surahName = surahName;
	}

	public String getArabicText() {
		return arabicText;
	}

	public void setArabicText(String arabicText) {
		this.arabicText = arabicText;
	}

	public String getUrduTranslation() {
		return urduTranslation;
	}

	public void setUrduTranslation(String urduTranslation) {
		this.urduTranslation = urduTranslation;
	}

	public String getEnglishTranslation() {
		return englishTranslation;
	}

	public void setEnglishTranslation(String englishTranslation) {
		this.englishTranslation = englishTranslation;
	}

	public String getUrduSummary() {
		return urduSummary;
	}

	public void setUrduSummary(String urduSummary) {
		this.urduSummary = urduSummary;
	}

	public String getEnglishSummary() {
		return englishSummary;
	}

	public void setEnglishSummary(String englishSummary) {
		this.englishSummary = englishSummary;
	}

	public Rukuhaat getRukuh() {
		return rukuh;
	}

	public void setRukuh(Rukuhaat rukuh) {
		this.rukuh = rukuh;
	}

	public Surahs getSurahs() {
		return surahs;
	}

	public void setSurahs(Surahs surahs) {
		this.surahs = surahs;
	}

	public List<Questions> getQues() {
		return ques;
	}

	public void setQues(List<Questions> ques) {
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "Ayaat [ayatId=" + ayatId + ", ayatNo=" + ayatNo + ", ayatSequence=" + ayatSequence + ", surahName="
				+ surahName + ", arabicText=" + arabicText + ", urduTranslation=" + urduTranslation
				+ ", englishTranslation=" + englishTranslation + ", urduSummary=" + urduSummary + ", englishSummary="
				+ englishSummary + ", rukuh=" + rukuh + ", surahs=" + surahs + ", ques=" + ques + "]";
	}
	
	
	
	
}
