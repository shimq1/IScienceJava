package iches.science.chapter06;

public class ChocolateTest {
	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "�Ƹ�����";
		choco.type = "��ũ";
		choco.price = 2200;
		choco.printChcolateInfo();
		String chocoName = choco.getName();
		int totalPrice = choco.calculateTotalPrice(20);
		System.out.println(chocoName + "���ݸ� 20�� : " + totalPrice);
		choco.changeChcolateInfo("Ű��Ű����", 2500);
		choco.printChcolateInfo();
	}
}
