package toy;

import battery.Battery;
import battery.NormalBattery;

public class ElectronicCarToy {

	private Battery battery; //배터리에 의존하는 로봇토이
	
	public ElectronicCarToy() { //생성자안에 노말 배터리 객체가 들어가 있음,
		battery = new NormalBattery();// 일체형 배터리란 소리
	}
	
	
}
