package icehs.science.chapter05;

public class GuGuDanTest {
	public static void main(String[] args) {
		for(int dan = 2; dan <= 9; dan++) {
			if(dan == 5) { // 5�� ����
				continue; // �ڿ��ִ°� �����ϰ� �����ܰ�� �Ѿ
			}
			for(int i = 1; i <= 9; i++) {
				System.out.print(dan + " * " + i + " = " + (dan * i) + "\t");
			}
			System.out.println();
		}
	}
}
