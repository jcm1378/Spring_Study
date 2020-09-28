package Main;

import battery.ChangeBattery;
import toy.ElectronicCarToy;
import toy.ElectronicRadioToy;
import toy.ElectronicRobotToy;

public class MainClass {
	public static void main(String[] args) {
		
		
		
		// �峭���� ���͸��� ��ü���̱⶧���� �״�� �����ص� �� ����x	
		ElectronicCarToy carToy = new ElectronicCarToy();
		
		//���͸��� ���Ƴ���� ���ؼ� ���͸� ��ü ����
		ChangeBattery changeBattery = new ChangeBattery();
		
		//�ʱ� ���͸��� ���� �ʱ� ������ ���� set���� ���͸��� ����
		ElectronicRobotToy robotToy = new ElectronicRobotToy();
		robotToy.setBattery(changeBattery);
		
		//�ʱ� ���͸��� ���� �� �ֱ� ������ ��ü�� ���͸��� �ְ� ���߿� �� �������� set����
		ElectronicRadioToy radioToy = new ElectronicRadioToy(changeBattery);
		
		
		//�̰͵� DI�� ���� Spring�� ������� �ʰ� ������ ������ ���,
		
	}

}
