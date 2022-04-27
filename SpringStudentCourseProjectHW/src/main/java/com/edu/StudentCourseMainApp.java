package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentCourseMainApp {

	public static void main(String[] args) {
		
		ApplicationContext acob=new ClassPathXmlApplicationContext("spring.xml");
		StudentClass stuob=(StudentClass) acob.getBean("scob");
		CourseClass courob=(CourseClass) acob.getBean("ccob");
		
		
		
		stuob.studentDisplayDetail();
		courob.courseDisplyDetail();

	}

}
