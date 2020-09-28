package ems.member.service;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentRegisterService {
	
	private StudentDao studentDao;
	
	  	public StudentRegisterService(StudentDao studentDao){
	 
		this.studentDao = studentDao;
	}
	
	
	public void register(Student student) {
		String sNum = student.getsNum();
		if(verify(sNum)) {
			studentDao.insert(student);
		}else{
			System.out.println("The student has alrady registered");
		}
	}

	private boolean verify(String sNum) {
		
		Student student = studentDao.select(sNum);
		return student == null ? true : false;
	}
	

}
