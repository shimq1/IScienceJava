package icehs.science.chapter06;

public class Account {
	String name;
	String accountNumber;
	int balance;
	
	void accountInfo() {
		System.out.println("계좌 " + accountNumber + "( 예금주 : " + name + " )");
	}
	
	void showBalance() {
		System.out.println("잔액 : " + balance + " 원");
	}
	
	void depositMoney(int deposit) {
		if(deposit >= 0) {
			System.out.println(deposit + "원 입금합니다.");
			balance += deposit;
		}else {
			System.out.println(deposit + "원 입금합니다.");
			System.out.println("금액은 음수를 입력할 수 없습니다.");
		}
	}
	
	void withdrawMoney(int withdraw) {
		if(withdraw >= 0) {
			System.out.println(withdraw + " 원 출금합니다.");
			balance -= withdraw;
		}else {
			System.out.println(withdraw + " 원 출금합니다.");
			System.out.println("금액은 음수를 입력할 수 없습니다.");
		}
	}
}
