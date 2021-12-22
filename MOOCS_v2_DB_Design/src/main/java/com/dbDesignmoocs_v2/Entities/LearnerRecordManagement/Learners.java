package com.dbDesignmoocs_v2.Entities.LearnerRecordManagement;

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestAttempts;
import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.Certificates;

@Entity
@Table(name="Learners")
public class Learners {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long learnerId;
	@Column(unique = true,nullable=true)
	private String userName;
	@Column(nullable=true)
	private String firstName;
	@Column(nullable=true)
	private String lastName;
	
	@Column(unique = true,nullable=true)
	private String email;
	@Column(nullable=true)
	private String password;
	@Column(unique = true,nullable=true)
	private long phoneNumber;
	@Column(nullable=true)
	private String country;
	@Column(nullable=true)
	private String gender;
	@Column(unique = true,nullable=true)
	private long cnic;
	@Column(nullable=true)
	private java.sql.Date dob;
	@Column(nullable=true)
	private String role;
	@Column(nullable = true)
	private String image;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "learner",orphanRemoval=true)
	List<Certificates> listOfCertificates = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "learner",orphanRemoval=true)
	List<CourseRegistrations> listOfRegistrations = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "learner",orphanRemoval=true)
	List<TestAttempts> listOfTestAttempts = new ArrayList<>();

	public Learners() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Learners(long learnerId, String userName, String firstName, String lastName, String email, String password,
			long phoneNumber, String country, String gender, long cnic, java.sql.Date dob, String role, String image,
			List<Certificates> listOfCertificates, List<CourseRegistrations> listOfRegistrations,
			List<TestAttempts> listOfTestAttempts) {
		super();
		this.learnerId = learnerId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.gender = gender;
		this.cnic = cnic;
		this.dob = dob;
		this.role = role;
		this.image = image;
		this.listOfCertificates = listOfCertificates;
		this.listOfRegistrations = listOfRegistrations;
		this.listOfTestAttempts = listOfTestAttempts;
	}

	public long getLearnerId() {
		return learnerId;
	}

	public void setLearnerId(long learnerId) {
		this.learnerId = learnerId;
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public List<Certificates> getListOfCertificates() {
		return listOfCertificates;
	}

	public void setListOfCertificates(List<Certificates> listOfCertificates) {
		this.listOfCertificates = listOfCertificates;
	}

	public List<CourseRegistrations> getListOfRegistrations() {
		return listOfRegistrations;
	}

	public void setListOfRegistrations(List<CourseRegistrations> listOfRegistrations) {
		this.listOfRegistrations = listOfRegistrations;
	}

	public List<TestAttempts> getListOfTestAttempts() {
		return listOfTestAttempts;
	}

	public void setListOfTestAttempts(List<TestAttempts> listOfTestAttempts) {
		this.listOfTestAttempts = listOfTestAttempts;
	}

	@Override
	public String toString() {
		return "Learners [learnerId=" + learnerId + ", userName=" + userName + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", country=" + country + ", gender=" + gender + ", cnic=" + cnic + ", dob=" + dob
				+ ", role=" + role + ", image=" + image + ", listOfCertificates=" + listOfCertificates
				+ ", listOfRegistrations=" + listOfRegistrations + ", listOfTestAttempts=" + listOfTestAttempts + "]";
	}

	
}
