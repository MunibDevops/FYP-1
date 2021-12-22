package com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dbDesignmoocs_v2.Entities.CourseExecution.CourseProgress;
import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.Rukuhaat;
import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.PeerReviews;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.InteractiveLearningSessions;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.Result;

@Entity
@Table(name = "TestItems")
public class TestItems {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long testItemId;
@Column(nullable=true)
private long crId;
@Column(nullable=true)
private String learnerName;
@Column(nullable=true)
private String courseName;
@Column(nullable=true)
private String testItemType;
@Column(nullable=true)
private int totalQuestions;
@Column(nullable=true)
private int weight;
@Column(nullable=true)
private boolean compulsory;
@Column(nullable=true)
private boolean graded;
@Column(nullable=true)
private String definedBy;
@Column(nullable=true)
private Date definationDate;
@Column(nullable=true)
private int version;


@ManyToOne
@JoinColumn(name="sessionId")
InteractiveLearningSessions interactiveSession;

@ManyToOne
@JoinColumn(name="progressId")
 CourseProgress courseProgress;

@ManyToOne
@JoinColumn(name="rukuhId")
Rukuhaat rukuh;

@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "testItem",orphanRemoval=true)
List<PeerReviews> listofpeerReviews=new ArrayList<>();

@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "testItem",orphanRemoval=true)
List<TestAttempts>listofTestAttempt=new ArrayList<>();

@OneToOne
@JoinColumn(name="resultId")
Result result;

@OneToOne
@JoinColumn(name="scheduleId")
TestScheduled testScheduled;

public TestItems() {
	super();
	// TODO Auto-generated constructor stub
}

public TestItems(long testItemId, long crId, String learnerName, String courseName, String testItemType,
		int totalQuestions, int weight, boolean compulsory, boolean graded, String definedBy, Date definationDate,
		int version, InteractiveLearningSessions interactiveSession, CourseProgress courseProgress, Rukuhaat rukuh,
		List<PeerReviews> listofpeerReviews, List<TestAttempts> listofTestAttempt, Result result,
		TestScheduled testScheduled) {
	super();
	this.testItemId = testItemId;
	this.crId = crId;
	this.learnerName = learnerName;
	this.courseName = courseName;
	this.testItemType = testItemType;
	this.totalQuestions = totalQuestions;
	this.weight = weight;
	this.compulsory = compulsory;
	this.graded = graded;
	this.definedBy = definedBy;
	this.definationDate = definationDate;
	this.version = version;
	this.interactiveSession = interactiveSession;
	this.courseProgress = courseProgress;
	this.rukuh = rukuh;
	this.listofpeerReviews = listofpeerReviews;
	this.listofTestAttempt = listofTestAttempt;
	this.result = result;
	this.testScheduled = testScheduled;
}

public long getTestItemId() {
	return testItemId;
}

public void setTestItemId(long testItemId) {
	this.testItemId = testItemId;
}

public long getCrId() {
	return crId;
}

public void setCrId(long crId) {
	this.crId = crId;
}

public String getLearnerName() {
	return learnerName;
}

public void setLearnerName(String learnerName) {
	this.learnerName = learnerName;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public String getTestItemType() {
	return testItemType;
}

public void setTestItemType(String testItemType) {
	this.testItemType = testItemType;
}

public int getTotalQuestions() {
	return totalQuestions;
}

public void setTotalQuestions(int totalQuestions) {
	this.totalQuestions = totalQuestions;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public boolean isCompulsory() {
	return compulsory;
}

public void setCompulsory(boolean compulsory) {
	this.compulsory = compulsory;
}

public boolean isGraded() {
	return graded;
}

public void setGraded(boolean graded) {
	this.graded = graded;
}

public String getDefinedBy() {
	return definedBy;
}

public void setDefinedBy(String definedBy) {
	this.definedBy = definedBy;
}

public Date getDefinationDate() {
	return definationDate;
}

public void setDefinationDate(Date definationDate) {
	this.definationDate = definationDate;
}

public int getVersion() {
	return version;
}

public void setVersion(int version) {
	this.version = version;
}

public InteractiveLearningSessions getInteractiveSession() {
	return interactiveSession;
}

public void setInteractiveSession(InteractiveLearningSessions interactiveSession) {
	this.interactiveSession = interactiveSession;
}

public CourseProgress getCourseProgress() {
	return courseProgress;
}

public void setCourseProgress(CourseProgress courseProgress) {
	this.courseProgress = courseProgress;
}

public Rukuhaat getRukuh() {
	return rukuh;
}

public void setRukuh(Rukuhaat rukuh) {
	this.rukuh = rukuh;
}

public List<PeerReviews> getListofpeerReviews() {
	return listofpeerReviews;
}

public void setListofpeerReviews(List<PeerReviews> listofpeerReviews) {
	this.listofpeerReviews = listofpeerReviews;
}

public List<TestAttempts> getListofTestAttempt() {
	return listofTestAttempt;
}

public void setListofTestAttempt(List<TestAttempts> listofTestAttempt) {
	this.listofTestAttempt = listofTestAttempt;
}

public Result getResult() {
	return result;
}

public void setResult(Result result) {
	this.result = result;
}

public TestScheduled getTestScheduled() {
	return testScheduled;
}

public void setTestScheduled(TestScheduled testScheduled) {
	this.testScheduled = testScheduled;
}

@Override
public String toString() {
	return "TestItems [testItemId=" + testItemId + ", crId=" + crId + ", learnerName=" + learnerName + ", courseName="
			+ courseName + ", testItemType=" + testItemType + ", totalQuestions=" + totalQuestions + ", weight="
			+ weight + ", compulsory=" + compulsory + ", graded=" + graded + ", definedBy=" + definedBy
			+ ", definationDate=" + definationDate + ", version=" + version + ", interactiveSession="
			+ interactiveSession + ", courseProgress=" + courseProgress + ", rukuh=" + rukuh + ", listofpeerReviews="
			+ listofpeerReviews + ", listofTestAttempt=" + listofTestAttempt + ", result=" + result + ", testScheduled="
			+ testScheduled + "]";
}



}
