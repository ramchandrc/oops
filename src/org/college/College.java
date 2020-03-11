package org.college;

public class College {

	public void collegeName() {
		System.out.println("SaiRam");
		
	}
	public void collegeCode() {
		System.out.println("1234");
		
	}
	public void collegeRank() {
		System.out.println("1");
		
	}
		
	
	
	public static void main(String[] args) {
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
	    Student s=new Student();
	    s.studentName();
	    s.studentDepartment();
	    s.studentId();
	    Hostel h=new Hostel();
	    h.hostelName();
	    Dept d=new Dept();
	    d.deptName();
	    
	}
}
