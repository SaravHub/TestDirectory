package org.student;

public class Students {
	public void getStudentInfo(int id) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+id);
	}
	public void getStudentInfo(int id, String name) {
		// TODO Auto-generated method stub
		System.out.println("ID: "+id+" & Name: "+name);
	}
	public void getStudentInfo(String email, long ph) {
		// TODO Auto-generated method stub
		System.out.println("Email: "+email+" & Phone:"+ph);
	}
	public void getStudentInfo() {
		// TODO Auto-generated method stub
		System.out.println("No info is given for update/display");
	}
	public static void main(String[] args) {
		Students stuObj=new Students();
		stuObj.getStudentInfo(124);
		stuObj.getStudentInfo(1234, "Sarav");
		stuObj.getStudentInfo("dummy@gmail.com", 7000000004L);
		stuObj.getStudentInfo();
		
	}

}
