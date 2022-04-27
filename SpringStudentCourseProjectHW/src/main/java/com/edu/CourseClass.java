package com.edu;

import java.util.Iterator;
import java.util.LinkedList;

class CourseDetail
{
	int courseid;
	String coursename;
	double coursefees;
	
	public CourseDetail(int courseid, String coursename, double coursefees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursefees = coursefees;
	}

	@Override
	public String toString()
	{
		return "CourseDetail [courseid=" + courseid + ", coursename=" + coursename + ", coursefees=" + coursefees + "]";
	}
	
	
}

public class CourseClass
{
	public void courseDisplyDetail()
	{
		CourseDetail cdob=new CourseDetail(1, "Java",40000);
		CourseDetail cdob1=new CourseDetail(2, "Cloud",30000);
		CourseDetail cdob2=new CourseDetail(3, "Mainframe",20000);
		
		
		LinkedList<CourseDetail> llob=new LinkedList<CourseDetail>();
		llob.add(cdob);
		llob.add(cdob1);
		llob.add(cdob2);
		
		Iterator<CourseDetail> iob=llob.iterator();
		System.out.println("Course Details are: ");
		while(iob.hasNext())
		{
			
			System.out.println(iob.next());
		}
		
	}

}
