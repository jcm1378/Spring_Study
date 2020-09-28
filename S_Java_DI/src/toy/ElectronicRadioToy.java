package toy;

import battery.Battery;

public class ElectronicRadioToy {
	
	private Battery battery;
	
	public ElectronicRadioToy(Battery battery) {
		this.battery = battery; //초기에 배터리를 사용자가 넣어 주도록
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

}
