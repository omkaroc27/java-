package com.app;

import java.util.TreeSet;

import com.beans.person;

public class personApp01 {

	

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<person> set=new TreeSet<>();
		TreeSet<person> set1=new TreeSet<>();
		//TreeSet<person> set2=new TreeSet<>();
		person p1=new person(1, "omkar", "omkarchararte@gmail.com");
		person p3=new person(1, "omkar", "omkarchararte@gmail.com");
	   person p2=new person(2, "oc", "Omkaroc27@gmail.com");
	   set.add(p1);
	   set.add(p3);
	   set1.add(p2);
	   System.out.println(set);
	  
	   System.out.println(set1);
	  // System.out.println(set2);
	}

}
