package com.dbDesignmoocs_v2.Entities.CourseRecordManagement;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.ForeignKey;



@Entity
@Table(name="Ayaat")
public class Ayaat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long ayatId;
	private long ayatNo;
	private long ayatSequence;
	private String surahName;
	private String arabicText;
	private String urduTranslation;
	private String englishTranslation;
	private String urduSummary;
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
