package icehs.science.chapter03;

public class MyString {
	public static void main(String[] args) {
		String name="ȫ�浿"; //s�� �빮�� �� ��ü��
		String lee="�̼���";
		String we=name+lee; //���ڿ��� ����
		String strAge="23";
		
		System.out.println("�������� �ٹ��� ���� �� ����� :"+name+","+lee);
		System.out.println("��ü�� ��� :"+we);
		int age=Integer.parseInt(strAge); //���ڿ��� int�� ��ȯ
		System.out.println("������ ���� ���� :"+(age+1));
	}
}