package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		int monthSalary = 1000000;
		int yeatSalary = monthSalary * 12;
		int bonus = (int)(monthSalary * 0.2) * 4; //int�� �Ҽ����� �ִ� �Ͱ� ���� ĳ���� �ʿ�
		int incomeAfterTax = (int)(yeatSalary * 0.9);
		int bonusAfterTax = (int)(bonus * 0.945);
		int overallIncome = incomeAfterTax + bonusAfterTax;
		
		System.out.println("���� : " + yeatSalary + ", ���� ���� : " + incomeAfterTax);
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + bonusAfterTax);
		System.out.println("���޾� : " + overallIncome);
		
	}
}