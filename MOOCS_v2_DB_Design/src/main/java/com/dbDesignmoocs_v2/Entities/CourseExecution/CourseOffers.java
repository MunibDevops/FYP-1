package com.dbDesignmoocs_v2.Entities.CourseExecution;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.springframework.lang.Nullable;

import com.dbDesignmoocs_v2.Entities.CourseRecordManagement.StudyCourses;
import com.dbDesignmoocs_v2.Entities.LearnerRecordManagement.CourseRegistrations;

@Entity
@Table
public class CourseOffers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long courseOfferId;
	@Column(nullable=true)
	private Date offeredDate;
	@Column(nullable=true)
	private Date endDate;
	@Column(nullable=true)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	StudyCourses studycourse;

	public CourseOffers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseOffers(long courseOfferId, Date offeredDate, Date endDate, String status, StudyCourses studycourse) {
		super();
		this.courseOfferId = courseOfferId;
		this.offeredDate = offeredDate;
		this.endDate = endDate;
		this.status = status;
		this.studycourse = studycourse;
	}

	public long getCourseOfferId() {
		return courseOfferId;
	}

	public void setCourseOfferId(long courseOfferId) {
		this.courseOfferId = courseOfferId;
	}

	public Date getOfferedDate() {
		return offeredDate;
	}

	public void setOfferedDate(Date offeredDate) {
		this.offeredDate = offeredDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public StudyCourses getStudycourse() {
		return studycourse;
	}

	public void setStudycourse(StudyCourses studycourse) {
		this.studycourse = studycourse;
	}

	@Override
	public String toString() {
		return "CourseOffers [courseOfferId=" + courseOfferId + ", offeredDate=" + offeredDate + ", endDate=" + endDate
				+ ", status=" + status + ", studycourse=" + studycourse + "]";
	}
	
	
	

}
