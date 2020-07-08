package icehs.science.chapter06;

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
	
	int calculateTotalPrice(int count, double discount) {
		return (int)(count * price * (1-discount));
	}
	
	void changeChcolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		this.printChcolateInfo(); 
	}
	
	void printChcolateInfo() {
		System.out.println("이름 : " + this.name + ", 종류 : " + this.type + ", 가격 : " + this.price);
	}
	
	void changeChcolateInfo(String name, String type, int price) {
		this.name = name;
		this.type =	type;
		this.price = price;
	}
}
