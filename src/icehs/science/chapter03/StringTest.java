package icehs.science.chapter03;

public class StringTest {
	public static void main(String[] args) {
		String name="�������";
		String king="10000";
		int year=2017;
		
		System.out.println(name + " : " + king);
		System.out.println(year + "��");
		System.out.println(king + year);
		
		int intking=Integer.parseInt(king);
		System.out.println(intking + year);
	}
}
