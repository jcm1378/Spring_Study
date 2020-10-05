package ems.member.main;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.support.GenericXmlApplicationContext;

import ems.member.Student;
import ems.member.service.EMSInformationService;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

 
public class MainClass {  
	
	public static void main(String[] args) {
		String[] sNums = {"a01","a02","a03","a04","a05","a06","a07"};
		String[] sId = {"rabbit","hippo","raccoon","elephant","tiger","pig","horse"};
		String[] sPw = {"ra01","hi02","ra03","el04","ti05","pi06","ho07"};
		String[] sName = {"ChangMin","MoonTaek","SinMook","hyunGuen","MinUk","DongBin","YeLim"};
		int[] sAge = {26,26,25,24,22,25,23};
		String[] sGender = {"Men","Men","Men","Men","Men","Men","Women"};
		String[] sMajor = {"Mech","Business","Electrical Engineering","MakeUp","Architecture","Conputer","Nursing Department"};
		
		
		
		String[] appContext = {"classpath:appDataBase.xml","classpath:appResource.xml","classpath:appUtill.xml"};
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(appContext);
		
		StudentRegisterService registerService = ctx.getBean("registerService", StudentRegisterService.class);
		
		for(int j = 0; j < sNums.length; j++) {
			Student student = new Student(sNums[j],sId[j],sPw[j],sName[j],sAge[j],sGender[j],sMajor[j]);
			registerService.register(student);
		}
		
		
		StudentModifyService modifyService = ctx.getBean("modifyService",StudentModifyService.class);
		modifyService.modify(new Student("a04","deer","de04","SiHyun",26,"Men","Police"));
		
		StudentSelectService selectService = ctx.getBean("selectService",StudentSelectService.class);
		Student selectedStudent =  selectService.select("a04");
		
		System.out.print("sNums :" + selectedStudent.getsNum() + "\t");
		System.out.print("|sId :" + selectedStudent.getsId() + "\t");
		System.out.print("|sPw :" + selectedStudent.getsPw() + "\t");
		System.out.print("|sName :" + selectedStudent.getsName() + "\t");
		System.out.print("|sAge :" + selectedStudent.getsAge() + "\t");
		System.out.print("|sGender :" + selectedStudent.getsGender() + "\t");
		System.out.print("|sMajor :" + selectedStudent.getsMajor() + "\n\n");
			
		
		StudentAllSelectService allSelectService = ctx.getBean("allSelectService",StudentAllSelectService.class);
		Map<String, Student> allSelectedStudent = allSelectService.allSelect();
		Set<String> keys = allSelectedStudent.keySet(); //keyset = Map에있는 메서드
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			Student student = allSelectedStudent.get(key);
			System.out.print("sNums :" + student.getsNum() + "\t");
			System.out.print("|sId :" + student.getsId() + "\t");
			System.out.print("|sPw :" + student.getsPw() + "\t");
			System.out.print("|sName :" + student.getsName() + "\t");
			System.out.print("|sAge :" + student.getsAge() + "\t");
			System.out.print("|sGender :" + student.getsGender() + "\t");
			System.out.println("|sMajor :" + student.getsMajor() + "\n\n");
		}
		
		while(true) {
			Scanner scanner = new Scanner(System.in);
			String str = "";
			
			System.out.println("\n==================================================================="
					+ "==============================================================================");
			System.out.println("Select number.");
			System.out.println("1. Check student information");
			System.out.println("2. Exit");
			
			str = scanner.next();
			if(str.equals("2")) {
				System.out.println("Bye~~");
				break;
			} else {
				System.out.println("Please input your class number.");
				
				str = scanner.next();
				Student student = selectService.select(str);
				System.out.print("sNum:" + student.getsNum() + "\t");
				System.out.print("|sId:" + student.getsId() + "\t");
				System.out.print("|sPw:" + student.getsPw() + "\t");
				System.out.print("|sName:" + student.getsName() + "\t");
				System.out.print("|sAge:" + student.getsAge() + "\t");
				System.out.print("|sGender:" + student.getsGender() + "\t");
				System.out.println("|sMajor:" + student.getsMajor() + "\t");
			}
		
		}
		
		ctx.close(); //컨테이너 사용 후 꼭 객체를 소멸시킨다 
		
	}
}