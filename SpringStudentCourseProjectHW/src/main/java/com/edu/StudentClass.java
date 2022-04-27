package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentClass {
	public void studentDisplayDetail()
	{
	ArrayList<String> aob=new ArrayList<String>();
	aob.add("latha");
	aob.add("deepa");
	aob.add("kani");
	aob.add("thisha");
	aob.add("thilak");
	
	Iterator<String> iob=aob.iterator();
	System.out.println("Student Names are:");
	while(iob.hasNext())
	{
		
		System.out.println(iob.next());
	}
	}

}
