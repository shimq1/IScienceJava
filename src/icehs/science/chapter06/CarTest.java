package icehs.science.chapter06;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.oilAmount = 5;
		myCar.allDistance = 140;
		myCar.printCarInfo();
		myCar.addOil(10);
		myCar.printCarInfo();
		myCar.driveCar("IT����", "��õ����", 10.17);
		myCar.printCarInfo();
		myCar.driveCar("��õ����", "�����ϸ���Ʈ", 60.21);
		myCar.printCarInfo();
		myCar.calculateDrivingDist();
	}
}
