package icehs.science.chapter07;

public class ItBookTest {
	public static void main(String[] args) {
		ItBook sql = new ItBook("SQL Plus", 50000, 5.5);
		sql.printBookInfo();
		
		ItBook java = new ItBook("Java 2.0", 28000, 3.2);
		java.printBookInfo();
		
		ItBook jsp = new ItBook("JSP Servlet", 37000, 6.9);
		jsp.printBookInfo();
		
		System.out.println(sql.getTitle() + " ������ �������� �����մϴ�.");
		sql.setPrice(55000);
		sql.setDiscountRate(9.5);
		sql.printBookInfo();
		
		System.out.println(java.getTitle() + " ������ �����մϴ�.");
		java.setPrice(33000);
		java.printBookInfo();
		
		System.out.println(jsp.getTitle() + " ����� �������� �����մϴ�.");
		jsp.setTitle("Servlet & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printBookInfo();
	}
}
