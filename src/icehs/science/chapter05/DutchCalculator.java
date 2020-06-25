package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int allExpense = 0;
		int numOfParticipants = 0;
		System.out.print("모임이 몇차까지 진행되었나요? : ");
		int cha = stdIn.nextInt();
		System.out.println("===============================");
		for(int i = 1; i <= cha; i++) {
			System.out.print(i + "차 비용 : ");
			int money = stdIn.nextInt();
			allExpense += money;
		}
		
		System.out.println("총 비용은 " + allExpense + "입니다.");
		System.out.println("==============================="); 
		System.out.print("모임의 인원수를 입력하세요 : ");
		numOfParticipants = stdIn.nextInt();
		int partMoney = allExpense / numOfParticipants;
		for(int i = 0; i <= numOfParticipants; i++) {
			System.out.println(i + " : " + partMoney);
		}
		
	}
}
