package icehs.science.chapter04;

public class SeperateNumberTest {
	public static void main(String[] args) {
		int number = 456;
		int one = number / 100;
		int two = (number % 100) / 10;
		int three = number % 10;
		
		System.out.println("���� �ڸ� �� : " + one);
		System.out.println("���� �ڸ� �� : " + two);
		System.out.println("���� �ڸ� �� : " + three);
	}
}