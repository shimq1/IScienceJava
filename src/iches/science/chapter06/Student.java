package iches.science.chapter06;

public class Student {
	String studentName;
	String studentId;
	int korean;
	int english;
	int math;
	
	public int calculateAverage() {
		int average = (korean + english + math) / 3;
		return average;
	}
	public void printStudentInfo() {
		System.out.println("�̸� : " + studentName);
		System.out.println("�й� : " + studentId);
		System.out.println("���� ���� : " + korean);
		System.out.println("���� ���� : " + english);
		System.out.println("���� ���� : " + math);
	}
	public void changeStudentId(String newId) {
		studentId = newId;
	}
}
