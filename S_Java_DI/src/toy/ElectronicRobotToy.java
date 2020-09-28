package toy;

import battery.Battery;

public class ElectronicRobotToy {
	
	private Battery battery;
	
	public ElectronicRobotToy() { //생성자에는 배터리가 없음, 사용자가 지정해서 만들고 싶은 배터리, 교환가능하게
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery; //셋터로 배터리를 교체 받겠다.
	}
}
