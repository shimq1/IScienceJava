package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		int monthSalary = 1000000;
		int yeatSalary = monthSalary * 12;
		int bonus = (int)(monthSalary * 0.2) * 4; //int를 소숫점이 있는 것과 계산시 캐스팅 필요
		int incomeAfterTax = (int)(yeatSalary * 0.9);
		int bonusAfterTax = (int)(bonus * 0.945);
		int overallIncome = incomeAfterTax + bonusAfterTax;
		
		System.out.println("연봉 : " + yeatSalary + ", 세후 연봉 : " + incomeAfterTax);
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + bonusAfterTax);
		System.out.println("지급액 : " + overallIncome);
		
	}
}