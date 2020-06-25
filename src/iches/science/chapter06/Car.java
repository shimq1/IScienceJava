package iches.science.chapter06;

public class Car {
	int oilAmount;
	double allDistance;
	
	void addOil(int oil) {
		System.out.println("�ֹ���" + oil + "L �����մϴ�.");
		oilAmount += oil;
	}
	
	void driveCar(String startPoint, String endPoint, double distance) {
		System.out.println(startPoint + "����" + endPoint + "����" + distance + "�����Ͽ����ϴ�.");
		this.oilAmount -= distance / 20;
		this.allDistance += distance;
	}
	
	void calculateDrivingDist() {
		System.out.println("���డ�� �Ÿ��� �� " + (double)(this.oilAmount * 20) + "km �Դϴ�.");
	}
	
	void printCarInfo(){
		System.out.println("[ICE ī~] ���� �⸧�� : " + this.oilAmount + "L, �� ����Ÿ� : " + this.allDistance + "km");
	}
}
