package icehs.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student gildong = new Student();
		gildong.studentName = "홀길동";
		gildong.studentId = "S001";
		gildong.korean = 94;
		gildong.english = 80;
		gildong.math = 89;
		gildong.printStudentInfo();
		int avarage = gildong.calculateAverage();
		System.out.println("평균 : " + avarage);
		System.out.println("* 학번을 변경합니다!!!");
		gildong.changeStudentId("STU0001");
		gildong.printStudentInfo();
	}
}
