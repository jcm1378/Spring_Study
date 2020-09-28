package ems.member.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ems.member.DataBaseConnectioninfo;

public class EMSInformationService {

	//application xml파일에서 EMSInfor객체를 생성하고 속성을 주입하였음
	private String info;
	private String copyRight;
	private String ver;
	private int sYear;
	private int sMonth;
	private int sDay;
	private int eYear;
	private int eMonth;
	private int eDay;
	private List<String> developers; 
	private Map<String, String> administerators;
	private Map<String, DataBaseConnectioninfo> dbInfos;
	
	// public EMSInformationService() {}
	
	
	public void outputEMSInformation() {
		System.out.print("\n\n");
		String devPeriod = sYear + "/" + sMonth + "/" +sDay+ "~" +eYear+ "/"+eMonth+"/" + eDay;
		System.out.println(info + "(" + devPeriod + ")" +"\n"+ copyRight + "\n" + ver);
		System.out.println("Developers :" +developers );
		System.out.println("Administerator : " +administerators);
		outputDataBaseInfo();
		System.out.print("\n\n");
	}
	/*
	 Map에 값을 전체 출력하기 위해서는 entrySet(), keySet() 메소드를 사용하면 되는데 
	 entrySet() 메서드는 key와 value의 값이 모두 필요한 경우 사용하고, 
	 keySet() 메서드는 key의 값만 필요한 경우 사용합니다.
	 Iterator 인터페이스를 사용할 수 없는 컬렉션인 Map에서 Iterator 인터페이스를 사용하기 위해서는
 	 Map에 entrySet(), keySet() 메소드를 사용하여 Set 객체를 반환받은 후 Iterator 인터페이스를 사용하시면 됩니다.
 	 */
	
	private void outputDataBaseInfo() {
		Set<String> keys = dbInfos.keySet();
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			DataBaseConnectioninfo info = dbInfos.get(key);
			System.out.println("jdbcUrl :" +info.getJdbcUrl());
			System.out.print("userId :" +info.getUserId());
			System.out.print("userPw :" + info.getUsePw());
		}
	}
	
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCopyRight() {
		return copyRight;
	}

	public void setCopyRight(String copyRight) {
		this.copyRight = copyRight;
	}

	public String getVer() {
		return ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public int getsYear() {
		return sYear;
	}

	public void setsYear(int sYear) {
		this.sYear = sYear;
	}

	public int getsMonth() {
		return sMonth;
	}

	public void setsMonth(int sMonth) {
		this.sMonth = sMonth;
	}

	public int getsDay() {
		return sDay;
	}

	public void setsDay(int sDay) {
		this.sDay = sDay;
	}

	public int geteYear() {
		return eYear;
	}

	public void seteYear(int eYear) {
		this.eYear = eYear;
	}

	public int geteMonth() {
		return eMonth;
	}

	public void seteMonth(int eMonth) {
		this.eMonth = eMonth;
	}

	public int geteDay() {
		return eDay;
	}

	public void seteDay(int eDay) {
		this.eDay = eDay;
	}

	public List<String> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<String> developers) {
		this.developers = developers;
	}

	public Map<String, String> getAdministerators() {
		return administerators;
	}

	public void setAdministerators(Map<String, String> administerators) {
		this.administerators = administerators;
	}

	public Map<String, DataBaseConnectioninfo> getDbInfos() {
		return dbInfos;
	}

	public void setDbInfos(Map<String, DataBaseConnectioninfo> dbInfos) {
		this.dbInfos = dbInfos;
	}


}
