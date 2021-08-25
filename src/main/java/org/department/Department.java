package org.department;

import org.college.College;

public class Department extends College{
	protected void deptName(String dptname) {// in future other dept can access Department as parent class so protected 
		// TODO Auto-generated method stub
		System.out.println("Department From:  "+dptname);
	}
}
