package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �л� ����? : ");
		int stdNum = stdIn.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= stdNum; i++) {
			System.out.print(i + "�� ���� : ");
			int score = stdIn.nextInt();
			sum += score;
		}
		avg = (double)sum / stdNum;
		
		System.out.println(stdNum + "���� ���� : " + sum);
		System.out.println(stdNum + "���� ��� : " + avg);
	}
}
