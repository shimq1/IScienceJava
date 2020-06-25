package icehs.science.chapter05;

public class GuGuDanTest {
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			if(dan == 5) { // 5단 제거
				continue; // 뒤에있는거 무시하고 다음단계로 넘어감
			}
			for(int i = 1; i <= 9; i++) {
				System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
			}
			System.out.println();
		}
	}
}
