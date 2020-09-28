package ems.member.assembler;

import ems.member.dao.StudentDao;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

public class StudentAssembler {

	private StudentDao studentDao;
	private StudentRegisterService registerService;
	private StudentModifyService modifyService;
	private StudentSelectService selectService;
	private StudentAllSelectService allSelectService;
	
	public StudentAllSelectService getAllSelectService() {
		return allSelectService;
	}


	public void setAllSelectService(StudentAllSelectService allSelectService) {
		this.allSelectService = allSelectService;
	}


	public StudentAssembler() {
		studentDao = new StudentDao();
		registerService = new StudentRegisterService(studentDao);
		modifyService = new StudentModifyService(studentDao);
		selectService = new StudentSelectService(studentDao);
		allSelectService = new StudentAllSelectService(studentDao);
	}


	public StudentSelectService getSelectService() {
		return selectService;
	}


	public void setSelectService(StudentSelectService selectService) {
		this.selectService = selectService;
	}


	public StudentModifyService getModifyService() {
		return modifyService;
	}


	public void setModifyService(StudentModifyService modifyService) {
		this.modifyService = modifyService;
	}


	public StudentDao getStudentDao() {
		return studentDao;
	}


	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}


	public StudentRegisterService getRegisterService() {
		return registerService;
	}


	public void setRegisterService(StudentRegisterService registerservice) {
		this.registerService = registerservice;
	}
	
}
