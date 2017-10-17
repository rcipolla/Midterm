package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Enrollment {
	
	
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	


	private Enrollment() {
		
	}

	public Enrollment(UUID sectionID, UUID studentID) {
		this.SectionID = sectionID;
		this.StudentID = studentID;
		this.EnrollmentID = EnrollmentID;
	}
	
	
	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public double getGrade() {
		return Grade;
	}
	
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}

	
	public void SetGrade(double grade) {
		this.Grade = grade;
	}

	
}
