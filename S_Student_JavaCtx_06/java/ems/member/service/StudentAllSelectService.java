package ems.member.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentAllSelectService {
	
	private StudentDao studentDao;
	
	@Autowired
	public StudentAllSelectService(StudentDao studentDao) {
		this.studentDao = studentDao;	
	}
		 

	
	public Map<String, Student> allSelect() { //맵에 있는 모든 정보를 선택 allSelect = Map에서 제공하는 메서드인듯
		return studentDao.getStudentDB(); //Dao의 메서드 DB정보를 반환
	}

}
