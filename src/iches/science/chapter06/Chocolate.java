package iches.science.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	
	String getName() {
		return name;
	}
	int calculateTotalPrice(int count) {
		return count * price;
	}
	
	void changeChcolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
	}
	
	void printChcolateInfo() {
		System.out.println("�̸� : " + this.name + ", ���� : " + this.type + ", ���� : " + this.price);
	}
}
