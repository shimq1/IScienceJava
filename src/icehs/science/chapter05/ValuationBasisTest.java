package icehs.science.chapter05;

public class ValuationBasisTest {
	public static void main(String[] args) {
		int one = 10;
		int two = 20;
		int three = 40;
		int four = 50;
		int five = 80;
		
		double score = 0;
		score += one * two / 2 * 0.6;
		score += (three + four) / 2 * 0.13;
		score += five * 0.27;
		
		System.out.println("평가 점수 : " + score);
		
		if(score >= 95 && score <= 100) {
			System.out.println("Special Class");
		}else if(score >= 90) {
			System.out.println("Gold Class");
		}else if(score >= 85) {
			System.out.println("Silver Class");
		}else if(score >= 80) {
			System.out.println("Bronze Class");
		}else {
			System.out.println("Member");
		}
	}
}
