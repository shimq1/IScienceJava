package icehs.science.chapter04;

public class SeperateNumberTest {
	public static void main(String[] args) {
		int number = 456;
		int one = number / 100;
		int two = (number % 100) / 10;
		int three = number % 10;
		
		System.out.println("백의 자리 수 : " + one);
		System.out.println("십의 자리 수 : " + two);
		System.out.println("일의 자리 수 : " + three);
	}
}