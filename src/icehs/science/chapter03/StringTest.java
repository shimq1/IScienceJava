package icehs.science.chapter03;

public class StringTest {
	public static void main(String[] args) {
		String name="¼¼Á¾´ë¿Õ";
		String king="10000";
		int year=2017;
		
		System.out.println(name + " : " + king);
		System.out.println(year + "³â");
		System.out.println(king + year);
		
		int intking=Integer.parseInt(king);
		System.out.println(intking + year);
	}
}
