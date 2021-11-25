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
	private String surahName;
	private long totalAyaat;
	private long totalRukuhaat;
	@Column(length = 150)
	private String urduIntroduction;
	@Column(length = 150)
	private String englishIntroduction;
	@Column(length = 500)
	private String urduSummary;
	@Column(length = 500)
	private String englishSummary;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "Surahs",orphanRemoval=true)
	List<Rukuhaat> rukuh=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "Surahs",orphanRemoval=true)
	List<Ayaat> ayat=new ArrayList<>();
	
}