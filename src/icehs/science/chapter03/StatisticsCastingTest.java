package icehs.science.chapter03;

public class StatisticsCastingTest {
	public static void main(String[] args) {
		double lottoProbability=0.0000001235;
		long populiation=6973738433L;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� :"+lottoProbability);
		
		int intLottoProbability=(int)lottoProbability;
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ :"+intLottoProbability);
		
		System.out.println("������ �α� �� :"+populiation);
		int intPopulation=(int)populiation;
		
		System.out.println(intPopulation);
		
		
	}
}
