package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	


	@BeforeClass
	public static void setup() {

	}


	@Test
	public void test() {
		
		
		Course c1 = new Course();
		c1.setCourseID(UUID.randomUUID());
		c1.setCourseName("CISC181");
		c1.setGradePoints(3);
		c1.setMajor(eMajor.COMPSI);
		
		Course c2 = new Course();
		c2.setCourseID(UUID.randomUUID());
		c2.setCourseName("CHEM103");
		c2.setGradePoints(3);
		c2.setMajor(eMajor.CHEM);
		
		Course c3 = new Course();
		c3.setCourseID(UUID.randomUUID());
		c3.setCourseName("PHYS207");
		c3.setGradePoints(3);
		c3.setMajor(eMajor.PHYSICS);
		
		ArrayList<Course> CourseList = new ArrayList<Course>();
		CourseList.add(c1);
		CourseList.add(c2);
		CourseList.add(c3);
		
		Semester F = new Semester();
		Calendar t1 = GregorianCalendar.getInstance();
		t1.set(2017,Calendar.SEPTEMBER,1);
		Date date1 = t1.getTime();
		Calendar t2 = GregorianCalendar.getInstance();
		t2.set(2017,Calendar.DECEMBER,1);
		Date date2 = t2.getTime();
		F.setSemesterID(UUID.randomUUID());
		F.setStartDate(date1);
		F.setEndDate(date2);
		
		Semester S = new Semester();
		Calendar t3 = GregorianCalendar.getInstance();
		t3.set(2017,Calendar.SEPTEMBER,1);
		Date date3 = t3.getTime();
		Calendar t4 = GregorianCalendar.getInstance();
		t4.set(2017,Calendar.DECEMBER,1);
		Date date4 = t4.getTime();
		S.setSemesterID(UUID.randomUUID());
		S.setStartDate(date3);
		S.setEndDate(date4);
		
		ArrayList<Semester> SemesterList = new ArrayList<Semester>();
		SemesterList.add(F);
		SemesterList.add(S);
		
		Section c1sec1 = new Section();
		c1sec1.setCourseID(c1.getCourseID());
		c1sec1.setSemesterID(F.getSemesterID());
		c1sec1.setRoomID(233);
		c1sec1.setSectionID(UUID.randomUUID());
		
		Section c1sec2 = new Section();
		c1sec2.setCourseID(c1.getCourseID());
		c1sec2.setSemesterID(S.getSemesterID());
		c1sec2.setRoomID(233);
		c1sec2.setSectionID(UUID.randomUUID());
		
		Section c2sec1 = new Section();
		c2sec1.setCourseID(c2.getCourseID());
		c2sec1.setSemesterID(F.getSemesterID());
		c2sec1.setRoomID(87);
		c2sec1.setSectionID(UUID.randomUUID());
		
		Section c2sec2 = new Section();
		c2sec2.setCourseID(c2.getCourseID());
		c2sec2.setSemesterID(S.getSemesterID());
		c2sec2.setRoomID(87);
		c2sec2.setSectionID(UUID.randomUUID());
		
		Section c3sec1 = new Section();
		c3sec1.setCourseID(c3.getCourseID());
		c3sec1.setSemesterID(F.getSemesterID());
		c3sec1.setRoomID(555);
		c3sec1.setSectionID(UUID.randomUUID());
		
		Section c3sec2 = new Section();
		c3sec2.setCourseID(c3.getCourseID());
		c3sec2.setSemesterID(S.getSemesterID());
		c3sec2.setRoomID(555);
		c3sec2.setSectionID(UUID.randomUUID());
		
		ArrayList<Section> SectionList = new ArrayList<Section>();
		SectionList.add(c1sec1);
		SectionList.add(c1sec2);
		SectionList.add(c2sec1);
		SectionList.add(c2sec2);
		SectionList.add(c3sec1);
		SectionList.add(c3sec2);

		
		Calendar t = GregorianCalendar.getInstance();
		t.set(1996,Calendar.JUNE,21);
		Date date = t.getTime();
		Student s1 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s2 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s3 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s4 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s5 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s6 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s7 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s8 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s9 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		Student s10 = new Student("Robert","Michael","Cipolla",date,eMajor.CHEM,"13 BlahBlah Ct.","484-848-4837","rcipolla@udel.edu");
		
		ArrayList<Student> StudentList = new ArrayList<Student>();
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		StudentList.add(s4);
		StudentList.add(s5);
		StudentList.add(s6);
		StudentList.add(s7);
		StudentList.add(s8);
		StudentList.add(s9);
		StudentList.add(s10);
		
		ArrayList<Enrollment> EnrollmentList = new ArrayList<Enrollment>();

		for (int a = 0; a<StudentList.size();a++){
			for (int b=0; b<SectionList.size(); b++) {
				Enrollment e = new Enrollment(SectionList.get(b).getSectionID(), StudentList.get(a).getStudentID());
				EnrollmentList.add(e);
			}
		}
		
		for (int c = 0; c < EnrollmentList.size(); c++) {
			if (EnrollmentList.get(c).getStudentID() == StudentList.get(0).getStudentID()) {
				double grade = 90;
				EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(1).getStudentID()) {
				double grade = 80;
				EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(2).getStudentID()) {
				double grade = 70;
				EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(3).getStudentID()) {
					double grade = 85;
					EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(4).getStudentID()) {
				double grade = 95;
				EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(5).getStudentID()) {
				double grade = 75;
				EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(6).getStudentID()) {
				double grade = 65;
				EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(7).getStudentID()) {
				double grade = 60;
				EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(8).getStudentID()) {
				double grade = 100;
				EnrollmentList.get(c).SetGrade(grade);
			}else if (EnrollmentList.get(c).getStudentID() == StudentList.get(9).getStudentID()) {
				double grade = 60;
				EnrollmentList.get(c).SetGrade(grade);
			}
			

		}

		
		ArrayList gpapointslist = new ArrayList();
		
		
			for ( int e = 0; e < EnrollmentList.size(); e++) {
				if (EnrollmentList.get(e).getGrade() >= 90) {
					double gpapoints = 4.0;
					gpapointslist.add(gpapoints);
					
				} else if (EnrollmentList.get(e).getGrade() >= 80){
					double gpapoints = 3.0;
					gpapointslist.add(gpapoints);

					
				} else if (EnrollmentList.get(e).getGrade() >= 70) {
					double gpapoints = 2.0;
					gpapointslist.add(gpapoints);

					
				} else if (EnrollmentList.get(e).getGrade() >= 65) {
					double gpapoints = 1.0;
					gpapointslist.add(gpapoints);

					
				} else {
					double gpapoints = 0.0;
					gpapointslist.add(gpapoints);

				}
		
				
			}
			
			int f = 0;
			double gradepointstotal = 0;
			double gradepointstotal2 = 0;
			double gradepointstotal3 = 0;
			double gradepointstotal4 = 0;
			double gradepointstotal5 = 0;
			double gradepointstotal6 = 0;
			double gradepointstotal7 = 0;
			double gradepointstotal8 = 0;
			double gradepointstotal9 = 0;
			double gradepointstotal10 = 0;

				for (int e = 0; e < EnrollmentList.size(); e++) {
					if (EnrollmentList.get(e).getStudentID() == StudentList.get(f).getStudentID()) {
						gradepointstotal = gradepointstotal + ((Double) gpapointslist.get(e) * 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+1).getStudentID()) {
						gradepointstotal2 = gradepointstotal2 + ((Double) gpapointslist.get(e) * 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+2).getStudentID()) {
						gradepointstotal3 = gradepointstotal3 + ((Double) gpapointslist.get(e) * 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+3).getStudentID()) {
						gradepointstotal4 = gradepointstotal4 + ((Double) gpapointslist.get(e) * 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+4).getStudentID()) {
						gradepointstotal5 = gradepointstotal5 + ((Double) gpapointslist.get(e) * 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+5).getStudentID()) {
						gradepointstotal6 = gradepointstotal6 + ((Double) gpapointslist.get(e) * 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+6).getStudentID()) {
						gradepointstotal7 = gradepointstotal7 + ((Double) gpapointslist.get(e)* 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+7).getStudentID()) {
						gradepointstotal8 = gradepointstotal8 + ((Double) gpapointslist.get(e) * 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+8).getStudentID()) {
						gradepointstotal9 = gradepointstotal9 + ((Double) gpapointslist.get(e) * 3);
					} else if (EnrollmentList.get(e).getStudentID() == StudentList.get(f+9).getStudentID()) {
						gradepointstotal10 = gradepointstotal10 + ((Double) gpapointslist.get(e) * 3);
					}
				}
			double gpa1 = gradepointstotal/((EnrollmentList.size()*3)/10);
			double gpa2 = gradepointstotal2/((EnrollmentList.size()*3)/10);
			double gpa3 = gradepointstotal3/((EnrollmentList.size()*3)/10);
			double gpa4 = gradepointstotal4/((EnrollmentList.size()*3)/10);
			double gpa5 = gradepointstotal5/((EnrollmentList.size()*3)/10);
			double gpa6 = gradepointstotal6/((EnrollmentList.size()*3)/10);
			double gpa7 = gradepointstotal7/((EnrollmentList.size()*3)/10);
			double gpa8 = gradepointstotal8/((EnrollmentList.size()*3)/10);
			double gpa9 = gradepointstotal9/((EnrollmentList.size()*3)/10);
			double gpa10 = gradepointstotal10/((EnrollmentList.size()*3)/10);	
			
			
			double totalgrade1 = 0;
			double totalgrade2 = 0;
			double totalgrade3 = 0;
			double totalgrade4 = 0;
			double totalgrade5 = 0;
			double totalgrade6 = 0;
			
			for (int q = 0; q < EnrollmentList.size(); q++) {
				if (EnrollmentList.get(q).getSectionID() == SectionList.get(f).getSectionID()) {
					totalgrade1 = totalgrade1 + EnrollmentList.get(q).getGrade();
				} else if (EnrollmentList.get(q).getSectionID() == SectionList.get(f+1).getSectionID()) {
					totalgrade2 = totalgrade2 + EnrollmentList.get(q).getGrade();
				} else if (EnrollmentList.get(q).getSectionID() == SectionList.get(f+2).getSectionID()) {
					totalgrade3 = totalgrade3 + EnrollmentList.get(q).getGrade();
				} else if (EnrollmentList.get(q).getSectionID() == SectionList.get(f+3).getSectionID()) {
					totalgrade4 = totalgrade4 + EnrollmentList.get(q).getGrade();
				} else if (EnrollmentList.get(q).getSectionID() == SectionList.get(f+4).getSectionID()) {
					totalgrade5 = totalgrade5 + EnrollmentList.get(q).getGrade();
				} else if (EnrollmentList.get(q).getSectionID() == SectionList.get(f+5).getSectionID()) {
					totalgrade6 = totalgrade6 + EnrollmentList.get(q).getGrade();
				} 
			}
			
			
			double avgGradeC1 = (totalgrade1+totalgrade2)/20;
			double avgGradeC2 = (totalgrade3+totalgrade4)/20;
			double avgGradeC3 = (totalgrade5+totalgrade6)/20;
			
		assertEquals(gpa1,4.0,0);
		assertEquals(gpa2,3.0,0);
		assertEquals(gpa3,2.0,0);
		assertEquals(gpa4,3.0,0);
		assertEquals(gpa5,4.0,0);
		assertEquals(gpa6,2.0,0);
		assertEquals(gpa7,1.0,0);
		assertEquals(gpa8,0.0,0);
		assertEquals(gpa9,4.0,0);
		assertEquals(gpa10,0.0,0);
		
		assertEquals(avgGradeC1,78.0,0);
		assertEquals(avgGradeC2,78.0,0);
		assertEquals(avgGradeC3,78.0,0);
		


	}
}