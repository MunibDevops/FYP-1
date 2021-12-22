package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestItems;

@Entity
@Table(name="Rukuhaat")
public class Rukuhaat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rukuhId;
	@Column(nullable=true)
	private String surahName;
	@Column(nullable=true)
	private long totalAyaat;
	
	@Column(length = 500,nullable=true)
	private String urduSummary;
	
	@Column(length = 500,nullable=true)
	private String englishSummary;
	@ManyToOne
	@JoinColumn(name="surahId")
	Surahs surahs;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "rukuh",orphanRemoval=true)
	private List<Ayaat>ayat = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "rukuh",orphanRemoval=true)
	private List<LearningResources> learningRes=new ArrayList<>();
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "rukuh",orphanRemoval=true)
	List<TestItems> listoftestItem=new ArrayList<>();
	
	@ManyToMany(mappedBy = "listofRukuhaat")
	List<StudyCourses> listofcourses=new ArrayList<>();

	public Rukuhaat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rukuhaat(long rukuhId, String surahName, long totalAyaat, String urduSummary, String englishSummary,
			Surahs surahs, List<Ayaat> ayat, List<LearningResources> learningRes, List<TestItems> listoftestItem,
			List<StudyCourses> listofcourses) {
		super();
		this.rukuhId = rukuhId;
		this.surahName = surahName;
		this.totalAyaat = totalAyaat;
		this.urduSummary = urduSummary;
		this.englishSummary = englishSummary;
		this.surahs = surahs;
		this.ayat = ayat;
		this.learningRes = learningRes;
		this.listoftestItem = listoftestItem;
		this.listofcourses = listofcourses;
	}

	public long getRukuhId() {
		return rukuhId;
	}

	public void setRukuhId(long rukuhId) {
		this.rukuhId = rukuhId;
	}

	public String getSurahName() {
		return surahName;
	}

	public void setSurahName(String surahName) {
		this.surahName = surahName;
	}

	public long getTotalAyaat() {
		return totalAyaat;
	}

	public void setTotalAyaat(long totalAyaat) {
		this.totalAyaat = totalAyaat;
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

	public Surahs getSurah() {
		return surahs;
	}

	public void setSurah(Surahs surahs) {
		this.surahs = surahs;
	}

	public List<Ayaat> getAyat() {
		return ayat;
	}

	public void setAyat(List<Ayaat> ayat) {
		this.ayat = ayat;
	}

	public List<LearningResources> getLearningRes() {
		return learningRes;
	}

	public void setLearningRes(List<LearningResources> learningRes) {
		this.learningRes = learningRes;
	}

	public List<TestItems> getListoftestItem() {
		return listoftestItem;
	}

	public void setListoftestItem(List<TestItems> listoftestItem) {
		this.listoftestItem = listoftestItem;
	}

	public List<StudyCourses> getListofcourses() {
		return listofcourses;
	}

	public void setListofcourses(List<StudyCourses> listofcourses) {
		this.listofcourses = listofcourses;
	}

	@Override
	public String toString() {
		return "Rukuhaat [rukuhId=" + rukuhId + ", surahName=" + surahName + ", totalAyaat=" + totalAyaat
				+ ", urduSummary=" + urduSummary + ", englishSummary=" + englishSummary + ", surah=" + surahs + ", ayat="
				+ ayat + ", learningRes=" + learningRes + ", listoftestItem=" + listoftestItem + ", listofcourses="
				+ listofcourses + "]";
	}
	
	
	
}
