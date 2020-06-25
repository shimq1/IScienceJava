package icehs.science.chapter05;

public class VariousSumTest {
	public static void main(String[] args) {
		int sum = 0;
		int oddsum = 0;
		int evensum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			sum += i;
			if(i % 2 == 0) {
				evensum += i;
			}else {
				oddsum += i;
			}
		}
		
		System.out.println("1 to 1000 : " + sum);
		System.out.println("1 to 1000 even : " + evensum);
		System.out.println("1 to 1000 odd : " + oddsum);
	}
}
