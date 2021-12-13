package com.dbDesignmoocs_v2.Entities.ResourcePersonsRecord;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.LearningResources;
import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.ResourceDefinition;

@Entity
@Table(name="ResourcePersons")
public class ResourcePersons {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long resourcePersonId;
	@Column(nullable = true)
	private String userName;
	@Column(nullable = true)
	private String firstName;
	@Column(nullable = true)
	private String lastName;
	@Column(unique = true,nullable=true)
	private String email;
	@Column(nullable = true)
	private String password;
	@Column(nullable = true)
	private long phoneNo;
	@Column(nullable = true)
	private String country;
	@Column(nullable = true)
	private String gender;
	@Column(unique = true,nullable=true)
	private long cnic;
	@Column(nullable = true)
	private Date dob;
	@Column(nullable = true)
	private String role;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<ResourceDefinition>listofResourceDefinition=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<ProfessionalLearnings>listofLearnings=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<AcademicQualifications>listofqualifications=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<Skills>listofSkills=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<WorkExperiences>listofexperience=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<Publications>listofpublications=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<Supervisions>listofsupervisions=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<RelatedCourses>listofcourses=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<ProfessionalReferences>listofreferences=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "ResourcePersons")
	List<Achievements>listofachievements=new ArrayList<>();
	
	
	
}
