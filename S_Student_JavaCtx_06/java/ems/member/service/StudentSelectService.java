package ems.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentSelectService {
	
	@Autowired
	@Qualifier("studentDao1") //퀄리파이어 적용 -> 동일한 데이터타입의 Bean들 중에서 특정한 Bean을 선택하여 적용하는 방법 컨테이너에서도 qulifier태그 작성해주어야함
	private StudentDao studentDao;
	
	public StudentSelectService (StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	
	
	public Student select(String sNum) {
		if(verify(sNum)) {
		return studentDao.select(sNum);
		}else {
			System.out.print("Student information is not available.");
			return null;
		}
		
	}

	private boolean verify(String sNum) {
		
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}

}
