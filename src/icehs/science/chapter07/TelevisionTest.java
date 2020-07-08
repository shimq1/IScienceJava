package icehs.science.chapter07;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv1 = new Television("INFINIA", 1500000);
		tv1.printTelevisionInfo();
		
		Television tv2 = new Television("XCANVAS", 1000000, "LCD TV");
		tv2.printTelevisionInfo();
		
		Television tv3 = new Television("CINEMA", 2000000, "3D TV");
		tv3.printTelevisionInfo();
		
		System.out.println("가격의 합 : " + (tv1.price + tv2.price + tv3.price));
	}
}
