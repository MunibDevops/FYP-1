package com.dbDesignmoocs_v2.Entities.CourseProgressMonitoring;

import java.util.ArrayList;
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
import com.dbDesignmoocs_v2.Entities.LearnerPerformanceEvaluation.Certificates;
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


}
