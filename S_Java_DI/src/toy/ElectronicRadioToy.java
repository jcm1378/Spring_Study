package toy;

import battery.Battery;

public class ElectronicRadioToy {
	
	private Battery battery;
	
	public ElectronicRadioToy(Battery battery) {
		this.battery = battery; //�ʱ⿡ ���͸��� ����ڰ� �־� �ֵ���
	}
	
	public void setBattery(Battery battery) {
		this.battery = battery;
	}

}
