package icehs.science.chapter06;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.balance = 10000;
		account.accountNumber = "123-456789";
		account.name = "ȫ�浿";
		account.accountInfo();
		account.showBalance();
		account.depositMoney(-5000);
		account.showBalance();
		account.withdrawMoney(45000);
		account.showBalance();
		
	}
}
