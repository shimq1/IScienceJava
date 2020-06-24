package icehs.science.chapter05;

public class GradeIfElseIfTest {
	public static void main(String[] args) {
		int gildong = 92;
		
		if(gildong >= 90 && gildong <= 100) {
			System.out.println("A학점입니다.");
		}else if(gildong >= 80) {
			System.out.println("B학접입니다.");
		}else if(gildong >= 70) {
			System.out.println("C학접입니다.");
		}else if(gildong >= 60) {
			System.out.println("D학접입니다.");
		}else if(gildong < 60 && gildong >= 0) {
			System.out.println("F학점입니다.");
		}else {
			System.out.println("점수가 잘못입력되어 있습니다."); //점수가 100 이상이거나 음수일때
		}
	}
}
