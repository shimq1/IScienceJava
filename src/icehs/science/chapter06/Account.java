package icehs.science.chapter06;

public class Account {
	String name;
	String accountNumber;
	int balance;
	
	void accountInfo() {
		System.out.println("���� " + accountNumber + "( ������ : " + name + " )");
	}
	
	void showBalance() {
		System.out.println("�ܾ� : " + balance + " ��");
	}
	
	void depositMoney(int deposit) {
		if(deposit >= 0) {
			System.out.println(deposit + "�� �Ա��մϴ�.");
			balance += deposit;
		}else {
			System.out.println(deposit + "�� �Ա��մϴ�.");
			System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.");
		}
	}
	
	void withdrawMoney(int withdraw) {
		if(withdraw >= 0) {
			System.out.println(withdraw + " �� ����մϴ�.");
			balance -= withdraw;
		}else {
			System.out.println(withdraw + " �� ����մϴ�.");
			System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.");
		}
	}
}
