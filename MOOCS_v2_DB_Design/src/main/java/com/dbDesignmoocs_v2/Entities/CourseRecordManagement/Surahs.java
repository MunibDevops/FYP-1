package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Surahs")
public class Surahs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long surahId;
	@Column(nullable=true)
	private String surahName;
	@Column(nullable=true)
	private long totalAyaat;
	@Column(nullable=true)
	private long totalRukuhaat;
	@Column(length = 150,nullable=true)
	
	private String urduIntroduction;
	@Column(length = 150,nullable=true)
	private String englishIntroduction;
	@Column(length = 500,nullable=true)
	private String urduSummary;
	@Column(length = 500,nullable=true)
	private String englishSummary;
	@Column(nullable = true)
	private String revelationperiod;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "surahs",orphanRemoval=true)
	List<Rukuhaat> rukuh=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "surahs",orphanRemoval=true)
	List<Ayaat> ayat=new ArrayList<>();

	public Surahs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Surahs(long surahId, String surahName, long totalAyaat, long totalRukuhaat, String urduIntroduction,
			String englishIntroduction, String urduSummary, String englishSummary, String revelationperiod,
			List<Rukuhaat> rukuh, List<Ayaat> ayat) {
		super();
		this.surahId = surahId;
		this.surahName = surahName;
		this.totalAyaat = totalAyaat;
		this.totalRukuhaat = totalRukuhaat;
		this.urduIntroduction = urduIntroduction;
		this.englishIntroduction = englishIntroduction;
		this.urduSummary = urduSummary;
		this.englishSummary = englishSummary;
		this.revelationperiod = revelationperiod;
		this.rukuh = rukuh;
		this.ayat = ayat;
	}

	public long getSurahId() {
		return surahId;
	}

	public void setSurahId(long surahId) {
		this.surahId = surahId;
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

	public long getTotalRukuhaat() {
		return totalRukuhaat;
	}

	public void setTotalRukuhaat(long totalRukuhaat) {
		this.totalRukuhaat = totalRukuhaat;
	}

	public String getUrduIntroduction() {
		return urduIntroduction;
	}

	public void setUrduIntroduction(String urduIntroduction) {
		this.urduIntroduction = urduIntroduction;
	}

	public String getEnglishIntroduction() {
		return englishIntroduction;
	}

	public void setEnglishIntroduction(String englishIntroduction) {
		this.englishIntroduction = englishIntroduction;
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

	public String getRevelationperiod() {
		return revelationperiod;
	}

	public void setRevelationperiod(String revelationperiod) {
		this.revelationperiod = revelationperiod;
	}

	public List<Rukuhaat> getRukuh() {
		return rukuh;
	}

	public void setRukuh(List<Rukuhaat> rukuh) {
		this.rukuh = rukuh;
	}

	public List<Ayaat> getAyat() {
		return ayat;
	}

	public void setAyat(List<Ayaat> ayat) {
		this.ayat = ayat;
	}

	@Override
	public String toString() {
		return "Surahs [surahId=" + surahId + ", surahName=" + surahName + ", totalAyaat=" + totalAyaat
				+ ", totalRukuhaat=" + totalRukuhaat + ", urduIntroduction=" + urduIntroduction
				+ ", englishIntroduction=" + englishIntroduction + ", urduSummary=" + urduSummary + ", englishSummary="
				+ englishSummary + ", revelationperiod=" + revelationperiod + ", rukuh=" + rukuh + ", ayat=" + ayat
				+ "]";
	}
	
	
	
	
}