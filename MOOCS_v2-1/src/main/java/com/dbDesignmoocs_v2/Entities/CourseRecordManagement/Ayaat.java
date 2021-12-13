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
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "Ayaat",orphanRemoval=true)
	List<Questions> ques=new ArrayList<>();
	
}
