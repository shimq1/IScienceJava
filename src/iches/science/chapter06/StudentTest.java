package iches.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student gildong = new Student();
		gildong.studentName = "Ȧ�浿";
		gildong.studentId = "S001";
		gildong.korean = 94;
		gildong.english = 80;
		gildong.math = 89;
		gildong.printStudentInfo();
		int avarage = gildong.calculateAverage();
		System.out.println("��� : " + avarage);
	}
}
