package Main;

import battery.ChangeBattery;
import toy.ElectronicCarToy;
import toy.ElectronicRadioToy;
import toy.ElectronicRobotToy;

public class MainClass {
	public static void main(String[] args) {
		
		
		
		// 장난감은 배터리가 일체형이기때문에 그대로 생성해도 됨 수정x	
		ElectronicCarToy carToy = new ElectronicCarToy();
		
		//배터리를 갈아끼우기 위해서 배터리 객체 생성
		ChangeBattery changeBattery = new ChangeBattery();
		
		//초기 배터리를 넣지 않기 때문에 따로 set으로 배터리를 장착
		ElectronicRobotToy robotToy = new ElectronicRobotToy();
		robotToy.setBattery(changeBattery);
		
		//초기 배터리를 넣을 수 있기 때문에 교체형 배터리를 넣고 나중에 또 수정가능 set으로
		ElectronicRadioToy radioToy = new ElectronicRadioToy(changeBattery);
		
		
		//이것도 DI의 일종 Spring을 사용하지 않고 의존을 주입한 방법,
		
	}

}
