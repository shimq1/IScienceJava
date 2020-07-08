package icehs.science.chapter03;

public class MyString {
	public static void main(String[] args) {
		String name="홍길동"; //s가 대문자 → 객체형
		String lee="이순신";
		String we=name+lee; //문자열의 연산
		String strAge="23";
		
		System.out.println("구병국과 근무를 같이 한 사람들 :"+name+","+lee);
		System.out.println("합체한 사람 :"+we);
		int age=Integer.parseInt(strAge); //문자열을 int로 전환
		System.out.println("내년의 나의 나이 :"+(age+1));
	}
}