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

import com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring.TestItems;

@Entity
@Table(name="InteractiveLearningSessions")
public class InteractiveLearningSessions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sessionId;

	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "interactiveSession",orphanRemoval=true)
	List<TestItems> listOftestItems=new ArrayList<>();
	
	@Column(nullable = true)
	private long crId;
	@Column(nullable = true)
	private long rukuhId;
	
	@Column(nullable = true)
	private Date startDate;
	
	@Column(nullable = true)
	private int currentProgress;
	
	@Column(nullable = true)
	private boolean completionStatus;
	
	
	@ManyToOne 
	@JoinColumn(name="Id")
	CourseRegistrations courseRegistrations;
	

	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "interactiveSession",orphanRemoval=true)
	List<InteractiveLearningResources>listofInteractiveResources=new ArrayList<>();
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.LAZY,mappedBy = "responses",orphanRemoval=true)
	List<ResponsesOnLearning>listofresponses=new ArrayList<>();

	public InteractiveLearningSessions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InteractiveLearningSessions(long sessionId, List<TestItems> listOftestItems, long crId, long rukuhId,
			Date startDate, int currentProgress, boolean completionStatus, CourseRegistrations courseRegistration,
			List<InteractiveLearningResources> listofInteractiveResources, List<ResponsesOnLearning> listofresponses) {
		super();
		this.sessionId = sessionId;
		this.listOftestItems = listOftestItems;
		this.crId = crId;
		this.rukuhId = rukuhId;
		this.startDate = startDate;
		this.currentProgress = currentProgress;
		this.completionStatus = completionStatus;
		this.courseRegistrations = courseRegistrations;
		this.listofInteractiveResources = listofInteractiveResources;
		this.listofresponses = listofresponses;
	}

	public long getSessionId() {
		return sessionId;
	}

	public void setSessionId(long sessionId) {
		this.sessionId = sessionId;
	}

	public List<TestItems> getListOftestItems() {
		return listOftestItems;
	}

	public void setListOftestItems(List<TestItems> listOftestItems) {
		this.listOftestItems = listOftestItems;
	}

	public long getCrId() {
		return crId;
	}

	public void setCrId(long crId) {
		this.crId = crId;
	}

	public long getRukuhId() {
		return rukuhId;
	}

	public void setRukuhId(long rukuhId) {
		this.rukuhId = rukuhId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getCurrentProgress() {
		return currentProgress;
	}

	public void setCurrentProgress(int currentProgress) {
		this.currentProgress = currentProgress;
	}

	public boolean isCompletionStatus() {
		return completionStatus;
	}

	public void setCompletionStatus(boolean completionStatus) {
		this.completionStatus = completionStatus;
	}

	public CourseRegistrations getCourseRegistration() {
		return courseRegistrations;
	}

	public void setCourseRegistration(CourseRegistrations courseRegistration) {
		this.courseRegistrations = courseRegistration;
	}

	public List<InteractiveLearningResources> getListofInteractiveResources() {
		return listofInteractiveResources;
	}

	public void setListofInteractiveResources(List<InteractiveLearningResources> listofInteractiveResources) {
		this.listofInteractiveResources = listofInteractiveResources;
	}

	public List<ResponsesOnLearning> getListofresponses() {
		return listofresponses;
	}

	public void setListofresponses(List<ResponsesOnLearning> listofresponses) {
		this.listofresponses = listofresponses;
	}

	@Override
	public String toString() {
		return "InteractiveLearningSessions [sessionId=" + sessionId + ", listOftestItems=" + listOftestItems
				+ ", crId=" + crId + ", rukuhId=" + rukuhId + ", startDate=" + startDate + ", currentProgress="
				+ currentProgress + ", completionStatus=" + completionStatus + ", courseRegistration="
				+ courseRegistrations + ", listofInteractiveResources=" + listofInteractiveResources
				+ ", listofresponses=" + listofresponses + "]";
	}
	
	
	
}
