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

import com.dbDesignmoocs_v2.Entities.CourseExecution.CourseProgress;
import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestAttempts;
import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;
import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.PeerReviews;

@Entity
@Table(name="CourseRegistrations")
public class CourseRegistrations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	
	@Column(unique = true,nullable=true)
	private long crId;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	StudyCourses studyCourse;
	
	@ManyToOne
	@JoinColumn(name="learnerId")
	Learners learner;
	
	@Column(nullable = true)
	private Date dateOfRegistration;
	@Column(nullable = true)
	private Date verificationDate;
	@Column(nullable = true)
	private String verifiedBy;
	
	@ManyToOne
	@JoinColumn(name="testItemId")
	TestAttempts testAttempt;
	
	@ManyToOne
	@JoinColumn(name="peerReviewId")
	PeerReviews peerReview;
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "courseRegistration",orphanRemoval=true)
	List<CourseProgress> courseProgress=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "courseRegistrations",orphanRemoval=true)
	List<InteractiveLearningSessions> learningSessions=new ArrayList<>();

	public CourseRegistrations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseRegistrations(long id, long crId, StudyCourses studyCourse, Learners learner, Date dateOfRegistration,
			Date verificationDate, String verifiedBy, TestAttempts testAttempt, PeerReviews peerReview,
			List<CourseProgress> courseProgress, List<InteractiveLearningSessions> learningSessions) {
		super();
		Id = id;
		this.crId = crId;
		this.studyCourse = studyCourse;
		this.learner = learner;
		this.dateOfRegistration = dateOfRegistration;
		this.verificationDate = verificationDate;
		this.verifiedBy = verifiedBy;
		this.testAttempt = testAttempt;
		this.peerReview = peerReview;
		this.courseProgress = courseProgress;
		this.learningSessions = learningSessions;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public long getCrId() {
		return crId;
	}

	public void setCrId(long crId) {
		this.crId = crId;
	}

	public StudyCourses getCourseId() {
		return studyCourse;
	}

	public void setCourseId(StudyCourses courseId) {
		this.studyCourse = courseId;
	}

	public Learners getLearner() {
		return learner;
	}

	public void setLearner(Learners learner) {
		this.learner = learner;
	}

	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}

	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}

	public Date getVerificationDate() {
		return verificationDate;
	}

	public void setVerificationDate(Date verificationDate) {
		this.verificationDate = verificationDate;
	}

	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public TestAttempts getTestAttempt() {
		return testAttempt;
	}

	public void setTestAttempt(TestAttempts testAttempt) {
		this.testAttempt = testAttempt;
	}

	public PeerReviews getPeerReview() {
		return peerReview;
	}

	public void setPeerReview(PeerReviews peerReview) {
		this.peerReview = peerReview;
	}

	public List<CourseProgress> getCourseProgress() {
		return courseProgress;
	}

	public void setCourseProgress(List<CourseProgress> courseProgress) {
		this.courseProgress = courseProgress;
	}

	public List<InteractiveLearningSessions> getLearningSessions() {
		return learningSessions;
	}

	public void setLearningSessions(List<InteractiveLearningSessions> learningSessions) {
		this.learningSessions = learningSessions;
	}

	@Override
	public String toString() {
		return "CourseRegistrations [Id=" + Id + ", crId=" + crId + ", courseId=" + studyCourse + ", learner=" + learner
				+ ", dateOfRegistration=" + dateOfRegistration + ", verificationDate=" + verificationDate
				+ ", verifiedBy=" + verifiedBy + ", testAttempt=" + testAttempt + ", peerReview=" + peerReview
				+ ", courseProgress=" + courseProgress + ", learningSessions=" + learningSessions + "]";
	}
	
	
}
