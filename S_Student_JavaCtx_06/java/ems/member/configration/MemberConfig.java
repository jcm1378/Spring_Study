package ems.member.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ems.member.DataBaseConnectioninfo;
import ems.member.dao.StudentDao;
import ems.member.service.EMSInformationService;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

// 이 클레스가 appCtx를 대체할 것임.

@Configuration
public class MemberConfig { 
	
	//****************Xml파일의 appResource부분****************************
	
	//<bean id = "studentDao" class="ems.member.dao.StudentDao"> appCtx안에있던 bean
	@Bean //bean으로 사용할 것이라는 어노테이션
	public StudentDao studentDao() { //메서드의 타입은 클래스, 메서드의 이름은 id값
		return new StudentDao(); //갹채를 생성해 반환을 해주면 됨.
	}
	@Bean
	public StudentRegisterService registerService() {
		return new StudentRegisterService(studentDao());
	}
	//이전에는 Modify서비스를 appCtx에서 객체를 입력한 후 Autowired로 의존주입을 해서 생성자레 굳이 파라미터로 Studernt를 넣지 않아도 됐지만 지금은 넣어주어야함
	@Bean
	public StudentModifyService modifyService() {
		return new StudentModifyService(studentDao());
	}
	@Bean
	public StudentSelectService selectService() {
		return new StudentSelectService(studentDao());
	}
	@Bean
	public StudentAllSelectService allSelectService() {
		return new StudentAllSelectService(studentDao());
	}
	
	//**************Xml파일의 appDataBase부분*****************************
	
	@Bean
	public DataBaseConnectioninfo dataBaseConnectioninfoDev() {
		DataBaseConnectioninfo infoDev = new DataBaseConnectioninfo();
		infoDev.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		infoDev.setUserId("c##scott");
		infoDev.setUserPw("tiger");
		return infoDev;
	}
	
	@Bean 
	public DataBaseConnectioninfo dataBaseConnectioninfoReal() {
		DataBaseConnectioninfo infoReal = new DataBaseConnectioninfo();
		infoReal.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
		infoReal.setUserId("masterid");
		infoReal.setUserPw("masterpw");
		
		return infoReal;
	}
	
	//**************Xml 파일의 appUtil부분 ***********************
	public EMSInformationService eMSInformationService() {
		EMSInformationService info = new EMSInformationService();
		
		info.setInfo("Education Management");
		info.setCopyRight("COPYRIGHT(C) 2015 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION");
		info.setsYear(2020);
		info.setsMonth(1);
		info.setsDay(1);
		info.seteYear(2015);
		info.seteMonth(2);
		info.seteDay(28);
		
		
		return info;
	}
	
	
	
	
}
