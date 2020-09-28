package ems.member.main;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import ems.member.Student;
import ems.member.assembler.StudentAssembler;
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
		
		StudentAssembler assembler = new StudentAssembler();
		
		StudentRegisterService registerService = assembler.getRegisterService();
		for(int j = 0; j < sNums.length; j++) {
			Student student = new Student(sNums[j],sId[j],sPw[j],sName[j],sAge[j],sGender[j],sMajor[j]);
			registerService.register(student);
		}
			
		StudentModifyService modifyService = assembler.getModifyService();
		modifyService.modify(new Student("a04","deer","de04","SiHyun",26,"Men","Police"));
		
		
		//한명을 선택했을때, sNum을 파라미터로 받아 그 학생을 선택하도록 하여 일일이 프린트 함
		StudentSelectService selectService = assembler.getSelectService();
		Student selectedStudent =  selectService.select("a04");
		
		System.out.print("|sNums :" + selectedStudent.getsNum() + "\t");
		System.out.print("|sId :" + selectedStudent.getsId() + "\t");
		System.out.print("|sPw :" + selectedStudent.getsPw() + "\t");
		System.out.print("|sName :" + selectedStudent.getsName() + "\t");
		System.out.print("|sAge :" + selectedStudent.getsAge() + "\t");
		System.out.print("|sGender :" + selectedStudent.getsGender() + "\t");
		System.out.print("|sMajor :" + selectedStudent.getsMajor() + "\n\n");
			
		/*Iterator => 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 
		 요소들을 읽어오는 방법을 표준화한 것 떤 컬렉션이라도 동일한 방식으로
		 접근이 가능하여 그 안에 있는 항목들에 접근할 수 있는 방법을 제공
		 Iterator의 메소드에는 hasNext(), next(), remove()가있다.
		 hasNext() : 읽어올 요소가 남아있는지 확인하는 메소드. 요소가 있다면 true, 없다면 false
		 next() : 다음 데이터를 반환한다.
		 remove() : next()로 읽어온 요소를 삭제한다.
		 메소드의 호출 순서는 hasNext() -> next() -> remove() 이다.
		*/		
		
		//iterater와 Map형태로 저장해 반복문을 사용해 출력하는 방법
		/*List는 중복을 허용하고 순서를 보장하며 데이터를 보관할 때 사용된다.
		 Set는 중복을 허용하지 않고 순서도 보장할 필요 없이 데이터를 보관할 때 사용된다.*/
		StudentAllSelectService allSelectService = assembler.getAllSelectService();
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
	}
}
		
		
			
	
	
	


	
