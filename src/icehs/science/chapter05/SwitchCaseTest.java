package icehs.science.chapter05;

public class SwitchCaseTest {
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
		int intscore = (int)score;
		
		System.out.println("평가 점수 : " + intscore);
		
		switch(intscore/10) {
		case 10 :
		case 9 : System.out.println("Special Class");break;
		case 8 : System.out.println("Gold Class");break;
		case 7 : System.out.println("Silver Class");break;
		case 6 : System.out.println("Bronze Class");break;
		case 5 : System.out.println("Member");break;
		case 4 : System.out.println("Member");break;
		case 3 : System.out.println("Member");break;
		case 2 : System.out.println("Member");break;
		case 1 : System.out.println("Member");break;
		}
		
		
	}
}
