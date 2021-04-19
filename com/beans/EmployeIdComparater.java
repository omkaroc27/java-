package com.beans;

import java.util.Comparator;

public class EmployeIdComparater implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEmpid()>o2.getEmpid()) {
			return +1;
		}
		else {if(o1.getEmpid()<o2.getEmpid()) {
			return -1;
		}
		else {
			return 0;
		}
		}}}
	


