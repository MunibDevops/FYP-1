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
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "Surahs",orphanRemoval=true)
	List<Rukuhaat> rukuh=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "Surahs",orphanRemoval=true)
	List<Ayaat> ayat=new ArrayList<>();
	
}