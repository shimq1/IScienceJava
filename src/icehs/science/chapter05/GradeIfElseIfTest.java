package icehs.science.chapter05;

public class GradeIfElseIfTest {
	public static void main(String[] args) {
		int gildong = 92;
		
		if(gildong >= 90 && gildong <= 100) {
			System.out.println("A�����Դϴ�.");
		}else if(gildong >= 80) {
			System.out.println("B�����Դϴ�.");
		}else if(gildong >= 70) {
			System.out.println("C�����Դϴ�.");
		}else if(gildong >= 60) {
			System.out.println("D�����Դϴ�.");
		}else if(gildong < 60 && gildong >= 0) {
			System.out.println("F�����Դϴ�.");
		}else {
			System.out.println("������ �߸��ԷµǾ� �ֽ��ϴ�."); //������ 100 �̻��̰ų� �����϶�
		}
	}
}
