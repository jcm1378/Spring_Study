package ems.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentModifyService {
	
	@Autowired  //프로퍼티, 속성에 Autowired적용 => 디폴트 생성자 필수 (메서드도 동일)
	private StudentDao studentDao;
	
	public StudentModifyService() {}
	
	
	public void modify(Student student) {
		if(verify(student.getsNum())) {
			studentDao.update(student);
		}else {
			System.out.println("Student information is not available.");
		}
	}
	
	private boolean verify(String sNum) {
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}

	
	
}
