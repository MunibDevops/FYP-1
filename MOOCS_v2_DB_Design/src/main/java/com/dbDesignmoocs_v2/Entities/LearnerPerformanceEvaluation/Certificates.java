package com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.Learners;

@Entity
@Table(name="Certificates")
public class Certificates {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long certificateId;
	@ManyToOne
	@JoinColumn(name="learnerId")
	Learners learner;
	
	@Column(nullable=true)
	
	private Date certificateDate;
	@OneToOne(mappedBy = "certificate")
	StudyCourses courses;
	@Column(nullable=true)
	private String courseTitle;
	@Column(nullable=true)
	private String verifiedBy;
	@Column(nullable=true)
	private String certificateURL;
	@Column(nullable=true)
	private Date issuanceDate;
	@Column(nullable=true)
	private Date completionDate;
	public Certificates() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificates(long certificateId, Learners learner, Date certificateDate, StudyCourses courses,
			String courseTitle, String verifiedBy, String certificateURL, Date issuanceDate, Date completionDate) {
		super();
		this.certificateId = certificateId;
		this.learner = learner;
		this.certificateDate = certificateDate;
		this.courses = courses;
		this.courseTitle = courseTitle;
		this.verifiedBy = verifiedBy;
		this.certificateURL = certificateURL;
		this.issuanceDate = issuanceDate;
		this.completionDate = completionDate;
	}
	public long getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(long certificateId) {
		this.certificateId = certificateId;
	}
	public Learners getLearner() {
		return learner;
	}
	public void setLearner(Learners learner) {
		this.learner = learner;
	}
	public Date getCertificateDate() {
		return certificateDate;
	}
	public void setCertificateDate(Date certificateDate) {
		this.certificateDate = certificateDate;
	}
	public StudyCourses getCourses() {
		return courses;
	}
	public void setCourses(StudyCourses courses) {
		this.courses = courses;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String getVerifiedBy() {
		return verifiedBy;
	}
	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}
	public String getCertificateURL() {
		return certificateURL;
	}
	public void setCertificateURL(String certificateURL) {
		this.certificateURL = certificateURL;
	}
	public Date getIssuanceDate() {
		return issuanceDate;
	}
	public void setIssuanceDate(Date issuanceDate) {
		this.issuanceDate = issuanceDate;
	}
	public Date getCompletionDate() {
		return completionDate;
	}
	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}
	@Override
	public String toString() {
		return "Certificates [certificateId=" + certificateId + ", learner=" + learner + ", certificateDate="
				+ certificateDate + ", courses=" + courses + ", courseTitle=" + courseTitle + ", verifiedBy="
				+ verifiedBy + ", certificateURL=" + certificateURL + ", issuanceDate=" + issuanceDate
				+ ", completionDate=" + completionDate + "]";
	}
	
	
}
