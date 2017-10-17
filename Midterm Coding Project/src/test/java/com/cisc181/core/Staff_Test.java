package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Staff_Test {

	
	@BeforeClass
	public static void setup() {

		
	}


	@Test
	public void test1() {

		Calendar t1 = GregorianCalendar.getInstance();
		t1.set(1996,Calendar.SEPTEMBER,17);
		Date date1 = t1.getTime();
		Calendar t2 = GregorianCalendar.getInstance();
		t2.set(2017,Calendar.DECEMBER,1);
		Date date2 = t2.getTime();

		Staff s1 = new Staff("Robert","Michael","Cipolla",date1, "13 Blah Ct.", "777-777-7777","help@gmail.com","TR 2-5", 1, 10000.00, date2,eTitle.MR);
		
		Staff s2 = new Staff("Conor","The Notorious","McGregor",date1, "26 Hoot Ct.", "717-622-1523","gogo@yahoo.com","MW 3-4",1, 20000.00, date2,eTitle.MR);

		Staff s3 = new Staff("Jon","Bones","Jones",date1, "139 Blah Rd.", "746-837-2927","bones@hotmail.com","F 6-7",1, 30000.00, date2,eTitle.MR);

		Staff s4 = new Staff("Ronda","Rowdy","Rousey",date1, "1 Patterson Ct.", "789-298-3838","goodgrade@gmail.com","TR 1-4",1, 40000.00, date2,eTitle.MRS);

		Staff s5 = new Staff("Meisha","Cupcake","Tate",date1, "46 Hollywood Blvd.", "617-384-8237","aplus@gmail.com","R 2-9",1, 50000.00, date2,eTitle.MS);
		
		ArrayList<Staff> StaffList = new ArrayList<Staff>();
		StaffList.add(s1);
		StaffList.add(s2);
		StaffList.add(s3);
		StaffList.add(s4);
		StaffList.add(s5);
		
		double SalTotal = 0;
		
		for (int i = 0; i<StaffList.size(); i++) {
			
			SalTotal = SalTotal + StaffList.get(i).getSalary();
				
		}
		
		double avgSal = SalTotal/StaffList.size();
				
		assertEquals(avgSal,30000.00,0);
	
	}	
	
	@Test (expected = PersonException.class)
	public void test2() throws PersonException {
		
		Calendar t3 = GregorianCalendar.getInstance();
		t3.set(2017,Calendar.SEPTEMBER,1);
		Date date3 = t3.getTime();
		Calendar t4 = GregorianCalendar.getInstance();
		t4.set(2017,Calendar.DECEMBER,1);
		Date date4 = t4.getTime();
		
		Staff s6 = new Staff("Robert","Michael","Cipolla",date3, "13 Blah Ct.", "738373","help@gmail.com","TR 2-5", 1, 10000.00, date4,eTitle.MR);
		
		s6.getPhone(); // exception already written into getPhone() method, throwing exception
		
		Calendar t5 = GregorianCalendar.getInstance();
		t5.set(1900,Calendar.SEPTEMBER,1);
		Date date5 = t5.getTime();
		Calendar t6 = GregorianCalendar.getInstance();
		t6.set(2017,Calendar.DECEMBER,1);
		Date date6 = t6.getTime();
		
		Staff s7 = new Staff("Conor","The Notorious","McGregor",date5, "26 Hoot Ct.", "717-622-1523","gogo@yahoo.com","MW 3-4",1, 20000.00, date6,eTitle.MR);
		
		s7.PrintAge(); // exception already written into getDOB() method, throwing exception

	
	}
	


}
