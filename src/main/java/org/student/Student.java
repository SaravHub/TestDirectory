package org.student;

import org.department.Department;

public class Student extends Department{
	protected void studentName(String stuname) { // can access inside the package and outside pack subclasses
		// TODO Auto-generated method stub
		System.out.println("Student Name: "+stuname);
	}
	protected void studentDept(String studept) { // can access inside the package 
		// TODO Auto-generated method stub
		System.out.println("Student Department: "+studept);
	}
	private void studentId(long stuID) { //student id should be access only inside the class so i put it as Private
		// TODO Auto-generated method stub
		System.out.println("Student Id: "+stuID);
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.collegeName("Someone College");
		stu.collegeCode(7122);
		stu.collegeRank(100);
		stu.deptName("Astro");
		stu.studentDept("Astrology");
		stu.studentName("SomeOne O");
		stu.studentId(712213205048L);
	}
}
