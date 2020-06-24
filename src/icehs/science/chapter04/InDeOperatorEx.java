package icehs.science.chapter04;

public class InDeOperatorEx {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 3;
		
		System.out.println(++number1); //++: 1 ´õÇÏ±â
		System.out.println(number2++); //ÁÙ ¹Ù²ï µÚ 1 ´õÇØÁü
		
		int result = --number1 + number2--;
		
		System.out.println(result);
	}
}