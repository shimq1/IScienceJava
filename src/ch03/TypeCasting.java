package ch03;

public class TypeCasting {
	public static void main(String[] args) {
		long billWealth=7000000000L;
		System.out.println("Original Value :"+billWealth);
		
		double doubleBillWealth=billWealth;
		System.out.println("double형으로 형변환 :"+doubleBillWealth);
		
		int intBillWealth=(int)billWealth;
		System.out.println("int형으로 강제 형변환 :"+intBillWealth);
	}
}
