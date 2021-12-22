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

import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	private java.sql.Date dob;
	@Column(nullable = true)
	private String role;
	@Column(nullable = true)
	private String image;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "resourcePersons")
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

	public ResourcePersons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourcePersons(long resourcePersonId, String userName, String firstName, String lastName, String email,
			String password, long phoneNo, String country, String gender, long cnic, java.sql.Date dob, String role,
			String image, List<ResourceDefinition> listofResourceDefinition,
			List<ProfessionalLearnings> listofLearnings, List<AcademicQualifications> listofqualifications,
			List<Skills> listofSkills, List<WorkExperiences> listofexperience, List<Publications> listofpublications,
			List<Supervisions> listofsupervisions, List<RelatedCourses> listofcourses,
			List<ProfessionalReferences> listofreferences, List<Achievements> listofachievements) {
		super();
		this.resourcePersonId = resourcePersonId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
		this.country = country;
		this.gender = gender;
		this.cnic = cnic;
		this.dob = dob;
		this.role = role;
		this.image = image;
		this.listofResourceDefinition = listofResourceDefinition;
		this.listofLearnings = listofLearnings;
		this.listofqualifications = listofqualifications;
		this.listofSkills = listofSkills;
		this.listofexperience = listofexperience;
		this.listofpublications = listofpublications;
		this.listofsupervisions = listofsupervisions;
		this.listofcourses = listofcourses;
		this.listofreferences = listofreferences;
		this.listofachievements = listofachievements;
	}

	public long getResourcePersonId() {
		return resourcePersonId;
	}

	public void setResourcePersonId(long resourcePersonId) {
		this.resourcePersonId = resourcePersonId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getCnic() {
		return cnic;
	}

	public void setCnic(long cnic) {
		this.cnic = cnic;
	}

	public java.sql.Date getDob() {
		return dob;
	}

	public void setDob(java.sql.Date dob) {
		this.dob = dob;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<ResourceDefinition> getListofResourceDefinition() {
		return listofResourceDefinition;
	}

	public void setListofResourceDefinition(List<ResourceDefinition> listofResourceDefinition) {
		this.listofResourceDefinition = listofResourceDefinition;
	}

	public List<ProfessionalLearnings> getListofLearnings() {
		return listofLearnings;
	}

	public void setListofLearnings(List<ProfessionalLearnings> listofLearnings) {
		this.listofLearnings = listofLearnings;
	}

	public List<AcademicQualifications> getListofqualifications() {
		return listofqualifications;
	}

	public void setListofqualifications(List<AcademicQualifications> listofqualifications) {
		this.listofqualifications = listofqualifications;
	}

	public List<Skills> getListofSkills() {
		return listofSkills;
	}

	public void setListofSkills(List<Skills> listofSkills) {
		this.listofSkills = listofSkills;
	}

	public List<WorkExperiences> getListofexperience() {
		return listofexperience;
	}

	public void setListofexperience(List<WorkExperiences> listofexperience) {
		this.listofexperience = listofexperience;
	}

	public List<Publications> getListofpublications() {
		return listofpublications;
	}

	public void setListofpublications(List<Publications> listofpublications) {
		this.listofpublications = listofpublications;
	}

	public List<Supervisions> getListofsupervisions() {
		return listofsupervisions;
	}

	public void setListofsupervisions(List<Supervisions> listofsupervisions) {
		this.listofsupervisions = listofsupervisions;
	}

	public List<RelatedCourses> getListofcourses() {
		return listofcourses;
	}

	public void setListofcourses(List<RelatedCourses> listofcourses) {
		this.listofcourses = listofcourses;
	}

	public List<ProfessionalReferences> getListofreferences() {
		return listofreferences;
	}

	public void setListofreferences(List<ProfessionalReferences> listofreferences) {
		this.listofreferences = listofreferences;
	}

	public List<Achievements> getListofachievements() {
		return listofachievements;
	}

	public void setListofachievements(List<Achievements> listofachievements) {
		this.listofachievements = listofachievements;
	}

	@Override
	public String toString() {
		return "ResourcePersons [resourcePersonId=" + resourcePersonId + ", userName=" + userName + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password + ", phoneNo="
				+ phoneNo + ", country=" + country + ", gender=" + gender + ", cnic=" + cnic + ", dob=" + dob
				+ ", role=" + role + ", image=" + image + ", listofResourceDefinition=" + listofResourceDefinition
				+ ", listofLearnings=" + listofLearnings + ", listofqualifications=" + listofqualifications
				+ ", listofSkills=" + listofSkills + ", listofexperience=" + listofexperience + ", listofpublications="
				+ listofpublications + ", listofsupervisions=" + listofsupervisions + ", listofcourses=" + listofcourses
				+ ", listofreferences=" + listofreferences + ", listofachievements=" + listofachievements + "]";
	}

	
	
}
