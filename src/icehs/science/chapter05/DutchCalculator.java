package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int allExpense = 0;
		int numOfParticipants = 0;
		System.out.print("������ �������� ����Ǿ�����? : ");
		int cha = stdIn.nextInt();
		System.out.println("===============================");
		for(int i = 1; i <= cha; i++) {
			System.out.print(i + "�� ��� : ");
			int money = stdIn.nextInt();
			allExpense += money;
		}
		
		System.out.println("�� ����� " + allExpense + "�Դϴ�.");
		System.out.println("==============================="); 
		System.out.print("������ �ο����� �Է��ϼ��� : ");
		numOfParticipants = stdIn.nextInt();
		int partMoney = allExpense / numOfParticipants;
		for(int i = 0; i <= numOfParticipants; i++) {
			System.out.println(i + " : " + partMoney);
		}
		
	}
}
