package toy;

import battery.Battery;
import battery.NormalBattery;

public class ElectronicCarToy {

	private Battery battery; //���͸��� �����ϴ� �κ�����
	
	public ElectronicCarToy() { //�����ھȿ� �븻 ���͸� ��ü�� �� ����,
		battery = new NormalBattery();// ��ü�� ���͸��� �Ҹ�
	}
	
	
}
