package icehs.science.chapter07;

public class PublicationTest {
	public static void main(String[] args) {
		Publication pub1 = new Publication();
		System.out.println("===== ���ǹ� ������ ���� �մϴ�. =====");
		pub1.setPrice(-1000);
		pub1.setPage(-1);
		
		pub1.setTitle("��ȭ �ﱹ��");
		pub1.setPage(300);
		pub1.setPrice(5000);
		
		System.out.println("���ǹ� ���� : " + pub1.getTitle() + " ( " + pub1.getPrice() + " ��, " + pub1.getPage() + " page )");
		
		System.out.println(pub1.numOfInstance);
		Publication pub2 = new Publication();
		System.out.println(pub2.numOfInstance);
		pub2.numOfInstance++;
		System.out.println(pub1.numOfInstance);
		System.out.println(pub2.numOfInstance);
		System.out.println(Publication.numOfInstance);
	}
}