package com.beans;

public class Employee {
		// TODO Auto-generated constructor stub
		int Empid;
		String EmpName;
		String EmpEmailId;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Employee(int empid, String empName, String empEmailId) {
			super();
			Empid = empid;
			EmpName = empName;
			EmpEmailId = empEmailId;
		}
		public int getEmpid() {
			return Empid;
		}
		public void setEmpid(int empid) {
			Empid = empid;
		}
		public String getEmpName() {
			return EmpName;
		}
		public void setEmpName(String empName) {
			EmpName = empName;
		}
		public String getEmpEmailId() {
			return EmpEmailId;
		}
		public void setEmpEmailId(String empEmailId) {
			EmpEmailId = empEmailId;
		}
		@Override
		public String toString() {
			return "Employee [Empid=" + Empid + ", EmpName=" + EmpName + ", EmpEmailId=" + EmpEmailId + "]";
		}
		
		
		
		
	}
	


