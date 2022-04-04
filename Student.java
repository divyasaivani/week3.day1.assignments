package org.student;

import org.college.College;

public class Student extends College{
public void studentName() {
	System.out.println("Divya Sai Vani");
	
}
public void studentDept() {
	System.out.println("Civil Engineering");
	
}
public void studentId() {
	System.out.println("13B01A0114");
	
}
	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.studentDept();
		obj.studentId();
		obj.studentName();
		
		

	}

}
