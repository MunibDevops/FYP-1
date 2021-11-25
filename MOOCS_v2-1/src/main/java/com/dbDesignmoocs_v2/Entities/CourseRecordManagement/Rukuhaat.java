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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Rukuhaat")
public class Rukuhaat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long rukuhId;
	private String surahName;
	private long totalAyaat;
	@Column(length = 500)
	private String urduSummary;
	@Column(length = 500)
	private String englishSummary;
	@ManyToOne
	@JoinColumn(name="surahId")
	Surahs surah;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "Rukuhaat",orphanRemoval=true)
	private List<Ayaat>ayat = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "Rukuhaat",orphanRemoval=true)
	private List<LearningResources> learningRes=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "Rukuhaat",orphanRemoval=true)
	private List<CourseContents> courseContent=new ArrayList<>();

}
