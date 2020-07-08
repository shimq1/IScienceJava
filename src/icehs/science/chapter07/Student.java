package icehs.science.chapter07;

public class Student {
	private String name;
	private int grade;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGrade(int grade) {
		if(grade > 3 || grade < 0) {
			System.out.println("�г��� �߸� �Է��Ͽ����ϴ�.");
		}else {
			this.grade = grade;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}
}
