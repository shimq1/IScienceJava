package icehs.science.chapter06;
// �ǹ���, �ּ�, ��ü �� �� �� �Ӽ����� ������,
// "���������͸� �����Ѵ�.", "�ּҸ� �����Ѵ�." ��� �ൿ�� �ϴ� �ǹ� Ŭ������ �ۼ��غ���.

public class Building {
	String name;			// �ǹ���
	String address;			// �ּ�
	int totalFloor;			// ��ü �� ��
	
	public void moveElevator() {
		System.out.println("���������͸� �����մϴ�.");
	}
	
	public void changeAddress(String newAddress) {
		address = newAddress;
	}
}
